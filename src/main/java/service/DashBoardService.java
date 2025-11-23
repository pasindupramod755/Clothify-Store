package service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import model.dto.Item;
import repository.DashBoardRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class DashBoardService {

    DashBoardRepository dashBoardRepository = new DashBoardRepository();
    ObservableList<Item> OrderItem = FXCollections.observableArrayList();


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
            return OrderItem;
        }
        selectedItem.setQty(orderQty);
        selectedItem.setTotal((selectedItem.getPrice())*orderQty);
        OrderItem.add(selectedItem);
        return OrderItem;
    }

    public boolean searchOrderItem(Item item,int qty){
        for(Item item1 :OrderItem){
            if ((item1.getId()).equals((item.getId()))){
                item.setQty((item.getQty())+qty);
                item.setTotal((item.getPrice())*(item.getQty()));
                return true;
            }
        }
        return false;
    }
}
