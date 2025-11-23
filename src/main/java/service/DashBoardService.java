package service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import model.dto.Item;
import repository.DashBoardRepository;

import java.sql.SQLException;

public class DashBoardService {

    DashBoardRepository dashBoardRepository = new DashBoardRepository();
    ObservableList<Item> orderItem = FXCollections.observableArrayList();


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
        if (searchOrderItem(selectedItem,orderQty)){
            return orderItem;
        }
        selectedItem.setQty(orderQty);
        selectedItem.setTotal((selectedItem.getPrice())*orderQty);
        orderItem.add(selectedItem);
        return orderItem;
    }

    public boolean searchOrderItem(Item item,int qty){
        for(Item item1 : orderItem){
            if ((item1.getId()).equals((item.getId()))){
                item.setQty((item.getQty())+qty);
                item.setTotal((item.getPrice())*(item.getQty()));
                return true;
            }
        }
        return false;
    }

    public void deleteOrder(Item selectedItem) {
        for(Item item : orderItem){
            if ((item.getId()).equals((selectedItem.getId()))){
                orderItem.remove(item);
            }
        }
    }
}
