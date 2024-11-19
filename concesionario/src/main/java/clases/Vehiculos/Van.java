package clases.Vehiculos;
import clases.Vehiculos.abstractas.Vehiculo;
import clases.Alimentacion.IAlimentacion;    
import clases.Vehiculos.abstractas.TipoCaja;
import clases.Personas.IPersona;


public class Van extends Vehiculo {
    private int capacidadMaletero;
    private boolean camaraReversa;

    public Van(int ID,IAlimentacion alimentacion, TipoCaja tipoCaja, String marca, String nuevo_usado, int cambios, int velocidadMaxima, int cilindrada, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, int cantidadBolsasAire, boolean ABS, int capacidadMaletero, boolean camaraReversa, IPersona usuarioCompro, double precioVehiculo, double precioRenta) {
        super(ID,alimentacion, tipoCaja, marca, nuevo_usado, cambios, velocidadMaxima, cilindrada, numeroPasajeros, numeroPuertas, aireAcondicionado, cantidadBolsasAire, ABS, usuarioCompro, precioVehiculo, precioRenta);
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }
}
