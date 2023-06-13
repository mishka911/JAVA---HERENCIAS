/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

/**
 *
 * @author Vane Proaño
 */
public class Hotel4estrella extends Hotel{

    protected String gym, nombrestaurante;
    protected int caprestaurante;

    public Hotel4estrella(String gym, String nombrestaurante, int caprestaurante, int canthabitaciones, int numcamas, int cantpisos, double precio, String nombre, String direccion, String localidad, String gerente) {
        super(canthabitaciones, numcamas, cantpisos, precio, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nombrestaurante = nombrestaurante;
        this.caprestaurante = caprestaurante;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getNombrestaurante() {
        return nombrestaurante;
    }

    public void setNombrestaurante(String nombrestaurante) {
        this.nombrestaurante = nombrestaurante;
    }

    public int getCaprestaurante() {
        return caprestaurante;
    }

    public void setCaprestaurante(int caprestaurante) {
        this.caprestaurante = caprestaurante;
    }

    public int getCanthabitaciones() {
        return canthabitaciones;
    }

    public void setCanthabitaciones(int canthabitaciones) {
        this.canthabitaciones = canthabitaciones;
    }

    public int getNumcamas() {
        return numcamas;
    }

    public void setNumcamas(int numcamas) {
        this.numcamas = numcamas;
    }

    public int getCantpisos() {
        return cantpisos;
    }

    public void setCantpisos(int cantpisos) {
        this.cantpisos = cantpisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    public double calcularPrecioH() {
        
       double valorrestau = 0;
        int valorhabitaciones = canthabitaciones;
        if (caprestaurante <30) {
            valorrestau = 10;
        } else if (caprestaurante >=30 && caprestaurante <50) {
            valorrestau = 30;
        } else if (caprestaurante >=50) {
            valorrestau = 50;
        }
        double valorgym = 0;
        
        if (gym.equalsIgnoreCase("A")) {
            valorgym = 50;
        } else if (gym.equalsIgnoreCase("B")) {
            valorgym = 30;
        }
            
     
        return super.calcularPrecioH()+  valorhabitaciones+ valorrestau+ valorgym;
        
    } 

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel4estrella{");
        sb.append("\ngym=").append(gym);
        sb.append("\nnombrestaurante=").append(nombrestaurante);
        sb.append("\ncaprestaurante=").append(caprestaurante);
        sb.append('}');
        return super.toString()+sb.toString();
    }
    
    
    
}
