package interfaz.controllers;

import java.io.IOException;

import interfaz.App;
import interfaz.Concesionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MenuPrincipalController {

    @FXML
    private Label usuarioLabel;

    @FXML
    private Label rolLabel;

    @FXML
    private Button comprarButton;

    @FXML
    private Button cerrar;

    @FXML
    private Button venderButton;

    @FXML
    private Button alquilarButton;

    @FXML
    private Button mostrarButton;

    // Este método se ejecuta al cargar la vista
    public void initialize() {
        try {
            // Verificar si el usuario está correctamente cargado
            if (Concesionario.getInstance().getUser() != null) {
                // Obtener los datos del usuario desde Concesionario.getInstance().getUser()
                String usuario = Concesionario.getInstance().getUser().getNombre();
                String rol = Concesionario.getInstance().getUser().getCedula();

                // Actualiza las etiquetas con los datos del usuario
                usuarioLabel.setText("Usuario: " + usuario);
                rolLabel.setText("Rol: " + rol);
            } else {
                usuarioLabel.setText("Usuario: No disponible");
                rolLabel.setText("Rol: No disponible");
            }
        } catch (Exception e) {
            System.err.println("Error al inicializar el usuario: " + e.getMessage());
            usuarioLabel.setText("Usuario: Error");
            rolLabel.setText("Rol: Error");
        }
    }

    // Métodos para manejar los clics de los botones
    @FXML
    private void handleComprar() {
        System.out.println("Botón Comprar presionado");
        // Lógica para el botón de comprar
    }

    @FXML
    private void handleVender() {
        System.out.println("Botón Vender presionado");
        // Lógica para el botón de vender
    }

    @FXML
    private void handleAlquilar() {
        System.out.println("Botón Alquilar presionado");
        // Lógica para el botón de alquilar
    }

    @FXML
    private void handleMostrar() {
        System.out.println("Botón Mostrar Vehículo presionado");
        // Lógica para el botón de mostrar vehículo
    }

      @FXML
    void cerrar(ActionEvent event) throws IOException {
        App.setRoot("inicio_sesion");
        Concesionario.getInstance().setUser(null);
    }
}
