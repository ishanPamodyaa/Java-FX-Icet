package controller;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.*;


public class CustomerController implements  {

    @FXML
    private TextField addressID;

    @FXML
    private TableColumn colAddress;

    @FXML
    private TableColumn colDOB;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colSalary;

    @FXML
    private TextField custID;

    @FXML
    private DatePicker dateID;

    @FXML
    private TextField nameID;

    @FXML
    private TextField salaryID;

    @FXML
    private TableView<?> tableView;

    @FXML
    private ComboBox<?> titleID;

    List<Customer> customerLists = new ArrayList<>();

    @FXML
    void onAction(ActionEvent event) {

        String id = colId.getText();
        String name = nameID.getText();
        String title = titleID.getValue().toString();
        LocalDate date = dateID.getValue();
        String address = addressID.getText();
        Double salary = Double.parseDouble(salaryID.toString());

        System.out.println("Id :" +id);
        System.out.println("Name :" +name);
        System.out.println("Title :" +title);
        System.out.println("Date OF Birth :" +date);
        System.out.println("Address :" +address);
        System.out.println("Salary :" +salary);

    }

    private void  loadTable(){

        ObservableList<Customer> observableList = new
            }


}
