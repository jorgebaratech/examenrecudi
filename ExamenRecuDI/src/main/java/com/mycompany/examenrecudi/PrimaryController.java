package com.mycompany.examenrecudi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Alumno;

public class PrimaryController implements Initializable {

    // Define los campos de la vista
    @FXML
    private TableView<Alumno> tablaAlumnos;
    @FXML
    private TableColumn<Alumno, String> nombreColumn;
    @FXML
    private TableColumn<Alumno, String> apellidoColumn;
    @FXML
    private TableColumn<Alumno, Integer> adcColumn;
    @FXML
    private TableColumn<Alumno, Integer> sgeColumn;
    @FXML
    private TableColumn<Alumno, Integer> diColumn;
    @FXML
    private TableColumn<Alumno, Integer> pmdmColumn;
    @FXML
    private TableColumn<Alumno, Integer> pspColumn;
    @FXML
    private TableColumn<Alumno, Integer> eieColumn;
    @FXML
    private TableColumn<Alumno, Integer> hclColumn;
    @FXML
    private Button añadirAlumnoButton;
    @FXML
    private TextField nombreField;
    @FXML
    private TextField apellidoField;
    @FXML
    private TextField adcField;
    @FXML
    private TextField sgeField;
    @FXML
    private TextField diField;
    @FXML
    private TextField pmdmField;
    @FXML
    private TextField pspField;
    @FXML
    private TextField eieField;
    @FXML
    private TextField hclField;

    // Lista observable de alumnos
    private ObservableList<Alumno> listaAlumnos = FXCollections.observableArrayList();

    /**
     * Inicializa la tabla y añade 3 alumnos de prueba.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Define las propiedades de cada columna en la tabla
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        apellidoColumn.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        adcColumn.setCellValueFactory(new PropertyValueFactory<>("adc"));
        sgeColumn.setCellValueFactory(new PropertyValueFactory<>("sge"));
        diColumn.setCellValueFactory(new PropertyValueFactory<>("di"));
        pmdmColumn.setCellValueFactory(new PropertyValueFactory<>("pmdm"));
        pspColumn.setCellValueFactory(new PropertyValueFactory<>("psp"));
        eieColumn.setCellValueFactory(new PropertyValueFactory<>("eie"));
        hclColumn.setCellValueFactory(new PropertyValueFactory<>("hcl"));

        // Añade 3 alumnos de prueba a la lista de alumnos
        listaAlumnos.add(new Alumno("Juan", "Pérez", 8, 7, 9, 6, 5, 10, 8));
        listaAlumnos.add(new Alumno("María", "García", 10, 9, 8, 7, 10, 9, 9));
        listaAlumnos.add(new Alumno("Pedro", "Sánchez", 6, 5, 7, 4, 6, 5, 7));

        // Configura la tabla para mostrar la lista de alumnos
        tablaAlumnos.setItems(listaAlumnos);
    }
    
    
    
}