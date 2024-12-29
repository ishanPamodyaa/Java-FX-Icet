package Controller;

import Model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CustomerControllerForm {
    public TextField txtId;
    public TextField txtName;
    public ComboBox cmbTitle;
    public TextField txtSalary;
    public TextField txtAddress;
    public TextField txtEmail;
    public TableView tblCustomer;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colEmail;
    public TableColumn colSalary;

    ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {

            String id = txtId.getText();
            String name = txtName.getText();
            Double salary = Double.parseDouble(txtSalary.getText());
            String address = txtAddress.getText();
            String email = txtEmail.getText();

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(address);
        System.out.println(email);

        Customer customer= new Customer(id,name,salary,address,email);

        System.out.println("customer :" + customer);

        customerArrayList.add(customer);
        System.out.println("Array List : " + customerArrayList);

        loadTable();

    }
private void loadTable(){

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
    colName.setCellValueFactory(new PropertyValueFactory<>("name"));
    colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
    colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
    colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));


 ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
 customerArrayList.forEach(obj -> {
     customerObservableList.add(obj);
 });
 tblCustomer.setItems(customerObservableList);

}




}
