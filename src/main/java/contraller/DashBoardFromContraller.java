package contraller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.dto.Item;
import service.DashBoardService;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardFromContraller implements Initializable {

    DashBoardService dashBoardService = new DashBoardService();

    @FXML
    private Button btnCustomer;

    @FXML
    private Button btnHistory;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnItem;

    @FXML
    private Button btnOrder;

    @FXML
    private Button btnReport;

    @FXML
    private Button btnSetting;

    @FXML
    private Button btnSupplier;

    @FXML
    private TableColumn<?, ?> colOrderId;

    @FXML
    private TableColumn<?, ?> colOrderName;

    @FXML
    private TableColumn<?, ?> colOrderName1;

    @FXML
    private TableColumn<?, ?> colOrderPrice;

    @FXML
    private TableColumn<?, ?> colOrderPrice1;

    @FXML
    private TableColumn<?, ?> colOrderQty;

    @FXML
    private TableColumn<?, ?> colOrderQty1;

    @FXML
    private TableColumn<?, ?> colOrderSize;

    @FXML
    private TableColumn<?, ?> colOrderSize1;

    @FXML
    private TableColumn<?, ?> colOrderTotalPrice1;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblOrderDiscount;

    @FXML
    private Label lblOrderItem;

    @FXML
    private Label lblOrderSubTotal;

    @FXML
    private Label lblOrderTotal;

    @FXML
    private Label lblTime;

    @FXML
    private AnchorPane orderPane;

    @FXML
    private TableView<Item> tblOrder;

    @FXML
    private TableView<Item> tblOrder1;

    @FXML
    private TextField txtOrderName;

    @FXML
    private TextField txtOrderPrice;

    @FXML
    private TextField txtOrderQty;

    @FXML
    private TextField txtOrderSearch;

    @FXML
    void bthHistoryAction(ActionEvent event) {

    }

    @FXML
    void btnCancelOrder(ActionEvent event) {

    }

    @FXML
    void btnCustomerAction(ActionEvent event) {

    }

    @FXML
    void btnHomeAction(ActionEvent event) {

    }

    @FXML
    void btnItemAction(ActionEvent event) {

    }

    @FXML
    void btnOrderAction(ActionEvent event) {

    }

    @FXML
    void btnOrderSearchAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrder(ActionEvent event) {

    }

    @FXML
    void btnReportAction(ActionEvent event) {

    }

    @FXML
    void btnSettingAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierAction(ActionEvent event) {

    }

    @FXML
    void txtOrderSearchAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOrderAction(ActionEvent event) {

    }

    @FXML
    void btnResetOrderAction(ActionEvent event) {

    }


    @FXML
    void btnUpdateOrderAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Item> item= dashBoardService.getAllItem();
        colOrderId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colOrderName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colOrderSize.setCellValueFactory(new PropertyValueFactory<>("size"));
        colOrderPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colOrderQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tblOrder.setItems(item);
        tblOrder.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue) ->{
            txtOrderName.setText(newValue.getName());
            txtOrderPrice.setText(String.valueOf(newValue.getPrice()));
            txtOrderQty.setText("1");
        });
    }

    //------------------------------------------OrderPane----------------------------------------------->
    //------------------------------------------Add Order----------------------------------------------->
    @FXML
    void btnAddOrderAction(ActionEvent event) {
        Item selectedItem = tblOrder.getSelectionModel().getSelectedItem();
        int OrderQty = Integer.parseInt(txtOrderQty.getText());
        ObservableList<Item> item = dashBoardService.addItem(selectedItem , OrderQty);
        colOrderName1.setCellValueFactory(new PropertyValueFactory<>("name"));
        colOrderSize1.setCellValueFactory(new PropertyValueFactory<>("size"));
        colOrderQty1.setCellValueFactory(new PropertyValueFactory<>("qty"));
        colOrderPrice1.setCellValueFactory(new PropertyValueFactory<>("price"));
        colOrderTotalPrice1.setCellValueFactory(new PropertyValueFactory<>("total"));
        tblOrder1.setItems(item);
        tblOrder1.refresh();
    }
}
