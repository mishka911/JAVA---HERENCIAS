/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

/**
 *
 * @author Vane Proaño
 */
public  class Hotel extends Alojamiento{
    
    protected int canthabitaciones;
    protected int numcamas;
    protected int cantpisos;
    protected double precio=50;

    public Hotel(int canthabitaciones, int numcamas, int cantpisos, double precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.canthabitaciones = canthabitaciones;
        this.numcamas = numcamas;
        this.cantpisos = cantpisos;
        this.precio = precio;
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


   
    
   public double calcularPrecioH(){
        
       return this.precio;
    
 
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel{");
        sb.append("canthabitaciones=").append(canthabitaciones);
        sb.append(", numcamas=").append(numcamas);
        sb.append(", cantpisos=").append(cantpisos);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}