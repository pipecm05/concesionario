package clases.Personas;

import clases.Vehiculos.abstractas.AutoMotor;

public class Cliente extends Persona {
    private int ID_vehiculo;

    public Cliente(String nombre, String apellido, String cedula, int id_vehiculo) {
        super(nombre, apellido, cedula);
        this.ID_vehiculo = id_vehiculo;
    }

    public int getID_vehiculo() {
        return ID_vehiculo;
    }

    
    

}
