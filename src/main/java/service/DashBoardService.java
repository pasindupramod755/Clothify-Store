package service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import model.dto.Customer;
import model.dto.Item;
import model.dto.Supplier;
import repository.DashBoardRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DashBoardService {

    DashBoardRepository dashBoardRepository = new DashBoardRepository();
    ObservableList<Item> orderItem = FXCollections.observableArrayList();
    ObservableList<Customer> customers = FXCollections.observableArrayList();
    ObservableList<Supplier> suppliers = FXCollections.observableArrayList();


    //--------------------------------Order--------------------------------------------------------------->

    public ObservableList<Item> getAllItem() {
        try {
            return dashBoardRepository.getAllItem();
        } catch (SQLException e) {
            new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
            throw new RuntimeException(e);
        }
    }

    public ObservableList<Item> addItem(Item selectedItem, int orderQty) {
        if (searchOrderItem(selectedItem, orderQty)) {
            return orderItem;
        }
        selectedItem.setQty(orderQty);
        selectedItem.setTotal((selectedItem.getPrice()) * orderQty);
        orderItem.add(selectedItem);
        return orderItem;
    }

    public boolean searchOrderItem(Item item, int qty) {
        for (Item item1 : orderItem) {
            if ((item1.getId()).equals((item.getId()))) {
                item.setQty((item.getQty()) + qty);
                item.setTotal((item.getPrice()) * (item.getQty()));
                return true;
            }
        }
        return false;
    }

    public void deleteOrder(Item selectedItem) {
        for (Item item : orderItem) {
            if ((item.getId()).equals((selectedItem.getId()))) {
                orderItem.remove(item);
            }
        }
    }

    public void updateOrder(Item selectedItem, int qty) {
        for (Item item : orderItem) {
            if ((item.getId()).equals((selectedItem.getId()))) {
                item.setQty(qty);
                item.setTotal((item.getPrice()) * qty);
            }
        }
    }

    //-----------------------------------------------Customer--------------------------------------------->
    public ObservableList<Customer> getAllCustomer() {
        try {
            customers = dashBoardRepository.getAllCustomer();
        } catch (SQLException e) {
            new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
        }
        return customers;
    }


    public void addCustomer(Customer customer) {
        try {
            dashBoardRepository.addCustomer(customer);
            customers.add(customer);
            new Alert(Alert.AlertType.INFORMATION, "Customer Added successfully!").show();
        } catch (SQLException e) {
            new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
        }
    }

    public void deleteCustomer(Customer customer) {
        try {
            dashBoardRepository.deleteCustomer(customer.getId());
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getId().equals(customer.getId())) {
                    customers.remove(i);
                    break;
                }
            }
            new Alert(Alert.AlertType.INFORMATION, "Customer Deleted successfully!").show();
        } catch (SQLException e) {
            new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
        }
    }

    public void updateCustomer(Customer customer) {
        try {
            dashBoardRepository.updateCustomer(customer);
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getId().equals(customer.getId())) {
                    customers.get(i).setTitle(customer.getTitle());
                    customers.get(i).setName(customer.getName());
                    customers.get(i).setDob(customer.getDob());
                    customers.get(i).setAddress(customer.getAddress());
                    customers.get(i).setCity(customer.getCity());
                    customers.get(i).setProvince(customer.getProvince());
                    customers.get(i).setPostalCode(customer.getPostalCode());
                    break;
                }
            }
            new Alert(Alert.AlertType.INFORMATION, "Customer updated successfully!").show();
        } catch (SQLException e) {
            new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
        }
    }

    //-----------------------------------------------Supplier--------------------------------------------->
    public ObservableList<Supplier> getAllSupplier() {
        try {
            ResultSet allSupplier = dashBoardRepository.getAllSupplier();
            while (allSupplier.next()) {
                suppliers.add(new Supplier(
                        allSupplier.getString("supplier_id"),
                        allSupplier.getString("name"),
                        allSupplier.getString("company_name"),
                        allSupplier.getString("address"),
                        allSupplier.getString("city"),
                        allSupplier.getString("province"),
                        allSupplier.getString("postal_code"),
                        allSupplier.getString("phone"),
                        allSupplier.getString("email")
                ));
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.WARNING, e.getMessage()).show();
        }
        return suppliers;
    }
}
