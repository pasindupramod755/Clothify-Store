package contraller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.dto.Customer;
import model.dto.Item;
import service.DashBoardService;

import java.lang.reflect.Array;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class DashBoardFromContraller implements Initializable {

    DashBoardService dashBoardService = new DashBoardService();
    ObservableList<Item> itemObservableList= dashBoardService.getAllItem();
    ObservableList<Customer> customerObservableList= dashBoardService.getAllCustomer();
    String[] titleArray = {"Mr","Mrs","Miss","Ms"};

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
    private TableColumn<?, ?> colCustomerAddress;

    @FXML
    private TableColumn<?, ?> colCustomerCity;

    @FXML
    private TableColumn<?, ?> colCustomerDOB;

    @FXML
    private TableColumn<?, ?> colCustomerId;

    @FXML
    private TableColumn<?, ?> colCustomerName;

    @FXML
    private TableColumn<?, ?> colCustomerPostalCode;

    @FXML
    private TableColumn<?, ?> colCustomerProvince;

    @FXML
    private TableColumn<?, ?> colCustomerTitle;

    @FXML
    private TableColumn<?, ?> colEmployeeAddress;

    @FXML
    private TableColumn<?, ?> colEmployeeDOB;

    @FXML
    private TableColumn<?, ?> colEmployeeId;

    @FXML
    private TableColumn<?, ?> colEmployeeJoinedDate;

    @FXML
    private TableColumn<?, ?> colEmployeeNIC;

    @FXML
    private TableColumn<?, ?> colEmployeeName;

    @FXML
    private TableColumn<?, ?> colEmployeePhone;

    @FXML
    private TableColumn<?, ?> colEmployeePosition;

    @FXML
    private TableColumn<?, ?> colEmployeeSalary;

    @FXML
    private TableColumn<?, ?> colEmployeeStatus;

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
    private TableColumn<?, ?> colSupplierAddress;

    @FXML
    private TableColumn<?, ?> colSupplierCity;

    @FXML
    private TableColumn<?, ?> colSupplierCompanyName;

    @FXML
    private TableColumn<?, ?> colSupplierEmail;

    @FXML
    private TableColumn<?, ?> colSupplierId;

    @FXML
    private TableColumn<?, ?> colSupplierName;

    @FXML
    private TableColumn<?, ?> colSupplierPhone;

    @FXML
    private TableColumn<?, ?> colSupplierPostalCode;

    @FXML
    private TableColumn<?, ?> colSupplierProvince;

    @FXML
    private AnchorPane customerPane;

    @FXML
    private AnchorPane employeePane;

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
    private AnchorPane supplierPane;

    @FXML
    private TableView<Customer> tblCustomer;

    @FXML
    private TableView<?> tblEmployee;

    @FXML
    private TableView<Item> tblOrder;

    @FXML
    private TableView<Item> tblOrder1;

    @FXML
    private TableView<?> tblSupplier;

    @FXML
    private TextField txtCustomerAddress;

    @FXML
    private TextField txtCustomerCity;

    @FXML
    private TextField txtCustomerId;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtCustomerPostalCode;

    @FXML
    private TextField txtCustomerProvince;

    @FXML
    private TextField txtEmployeeAddress;

    @FXML
    private TextField txtEmployeeId;

    @FXML
    private TextField txtEmployeeName;

    @FXML
    private TextField txtEmployeeNic;

    @FXML
    private TextField txtEmployeePhone;

    @FXML
    private TextField txtEmployeePosition;

    @FXML
    private TextField txtEmployeeSalary;

    @FXML
    private TextField txtEmployeeStatus;

    @FXML
    private TextField txtOrderName;

    @FXML
    private TextField txtOrderPrice;

    @FXML
    private TextField txtOrderQty;

    @FXML
    private TextField txtOrderSearch;

    @FXML
    private TextField txtSupplierAddress;

    @FXML
    private TextField txtSupplierCity;

    @FXML
    private TextField txtSupplierCompanyName;

    @FXML
    private TextField txtSupplierEmail;

    @FXML
    private TextField txtSupplierId;

    @FXML
    private TextField txtSupplierName;

    @FXML
    private TextField txtSupplierPhone;

    @FXML
    private TextField txtSupplierPostalCode;

    @FXML
    private TextField txtSupplierProvince;

    @FXML
    private ChoiceBox<String> txtCustomerTitle;

    @FXML
    private DatePicker txtCustomerDate;

    @FXML
    void btnCustomerAddAction(ActionEvent event) {

    }

    @FXML
    void btnCustomerDeleteAction(ActionEvent event) {

    }

    @FXML
    void btnCustomerResetAction(ActionEvent event) {

    }

    @FXML
    void btnCustomerUpdateAction(ActionEvent event) {

    }

    @FXML
    void btnEmployeeAddAction(ActionEvent event) {

    }

    @FXML
    void btnEmployeeDeleteAction(ActionEvent event) {

    }

    @FXML
    void btnEmployeeResetAction(ActionEvent event) {

    }

    @FXML
    void btnEmployeeUpdateAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierAddAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierDeleteAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierResetAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierUpdateAction(ActionEvent event) {

    }

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
    void btnResetOrderAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //-------------------------------------Order---------------------------------------------->
        colOrderId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colOrderName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colOrderSize.setCellValueFactory(new PropertyValueFactory<>("size"));
        colOrderPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colOrderQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tblOrder.setItems(itemObservableList);
        tblOrder.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue) ->{
            txtOrderName.setText(newValue.getName());
            txtOrderPrice.setText(String.valueOf(newValue.getPrice()));
            txtOrderQty.setText("1");
        });

        tblOrder1.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue) ->{
            txtOrderName.setText(newValue.getName());
            txtOrderPrice.setText(String.valueOf(newValue.getPrice()));
            txtOrderQty.setText(String.valueOf(newValue.getQty()));
        });

        //-------------------------------------------------customer--------------------------------------------->

        txtCustomerTitle.getItems().addAll(titleArray);
        colCustomerId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colCustomerTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colCustomerName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCustomerDOB.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colCustomerAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCustomerCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colCustomerProvince.setCellValueFactory(new PropertyValueFactory<>("province"));
        colCustomerPostalCode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));
        tblCustomer.setItems(customerObservableList);

        tblCustomer.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue) ->{
            txtCustomerId.setText(newValue.getId());
            txtCustomerName.setText(newValue.getName());
            txtCustomerAddress.setText(newValue.getAddress());
            txtCustomerProvince.setText(newValue.getProvince());
            txtCustomerPostalCode.setText(newValue.getPostalCode());
            txtCustomerCity.setText(newValue.getCity());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(newValue.getDob(), formatter);
            txtCustomerDate.setValue(localDate);
            if (newValue.getTitle().equals("Mr")){
                txtCustomerTitle.setValue(txtCustomerTitle.getItems().get(0));
            } else if (newValue.getTitle().equals("Mrs")) {
                txtCustomerTitle.setValue(txtCustomerTitle.getItems().get(1));
            }else if (newValue.getTitle().equals("Miss")){
                txtCustomerTitle.setValue(txtCustomerTitle.getItems().get(2));
            }else if (newValue.getTitle().equals("Ms")){
                txtCustomerTitle.setValue(txtCustomerTitle.getItems().get(3));
            }
        });



    }

    //------------------------------------Update Total Summary------------------------------------------>
    public void updateTotalSummary(){
        lblOrderItem.setText((tblOrder1.getItems().size())+" Items");
        double subTotal = 0.0;
        for(Item item : tblOrder1.getItems()){
            subTotal += item.getTotal();
        }
        lblOrderSubTotal.setText("Rs."+String.format("%.2f",subTotal));

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
        updateTotalSummary();
        tblOrder1.refresh();
    }

    //--------------------------------------------Delete Order-------------------------------------------->
    @FXML
    void btnDeleteOrderAction(ActionEvent event) {
        dashBoardService.deleteOrder(tblOrder1.getSelectionModel().getSelectedItem());
        tblOrder1.refresh();
        updateTotalSummary();
    }

    //------------------------------------------update Order---------------------------------------------->
    @FXML
    void btnUpdateOrderAction(ActionEvent event) {
        int qty = Integer.parseInt(txtOrderQty.getText());
        dashBoardService.updateOrder(tblOrder1.getSelectionModel().getSelectedItem(),qty);
        tblOrder1.refresh();
        updateTotalSummary();
    }

    //-------------------------------------------Customer--------------------------------------------------->
    //----------------------------------------
}