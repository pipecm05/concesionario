package clases.Vehiculos;
import clases.Vehiculos.abstractas.Vehiculo;
import clases.Alimentacion.IAlimentacion;
import clases.Personas.IPersona;
import clases.Vehiculos.abstractas.TipoCaja;

public class Camion extends Vehiculo {
    private int capacidadCargaMaxima;
    private boolean frenosAire;
    private int numeroEjes;

   public Camion(int ID ,IAlimentacion alimentacion, TipoCaja tipoCaja, String marca, String nuevo_usado, int cambios, int velocidadMaxima, int cilindrada, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, int cantidadBolsasAire, boolean ABS, int capacidadCargaMaxima, boolean frenosAire, int numeroEjes, IPersona usuarioCompro, double precioVehiculo, double precioRenta) {
        super(ID,alimentacion, tipoCaja, marca, nuevo_usado, cambios, velocidadMaxima, cilindrada, numeroPasajeros, numeroPuertas, aireAcondicionado, cantidadBolsasAire, ABS, usuarioCompro, precioVehiculo, precioRenta);
        this.capacidadCargaMaxima = capacidadCargaMaxima;
        this.frenosAire = frenosAire;
        this.numeroEjes = numeroEjes;
    }

    public int getCapacidadCargaMaxima() {
        return capacidadCargaMaxima;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
    
}
