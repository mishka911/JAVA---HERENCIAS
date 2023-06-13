/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Residencia extends AlojamientoExtraHotelero{
    
    protected int canthabitaciones;
    protected boolean descuentosgremios;
    protected boolean campodeportivo;
    
    Scanner leer = new Scanner (System.in);


    public Residencia(int canthabitaciones, boolean descuentosgremios, boolean campodeportivo, boolean privado, double metroscuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metroscuadrados, nombre, direccion, localidad, gerente);
        this.canthabitaciones = canthabitaciones;
        this.descuentosgremios = descuentosgremios;
        this.campodeportivo = campodeportivo;
    }

    public int getCanthabitaciones() {
        return canthabitaciones;
    }

    public void setCanthabitaciones(int canthabitaciones) {
        this.canthabitaciones = canthabitaciones;
    }

    public boolean isDescuentosgremios() {
        return descuentosgremios;
    }

    public void setDescuentosgremios(boolean descuentosgremios) {
        this.descuentosgremios = descuentosgremios;
    }

    public boolean isCampodeportivo() {
        return campodeportivo;
    }

    public void setCampodeportivo(boolean campodeportivo) {
        this.campodeportivo = campodeportivo;
    }
    
        public double calcularPrecio(){
        return 0;
    }
    
    public boolean descuentosGremios(){
    
        return descuentosgremios;
    }
    
    public boolean tienecampos(){
        return campodeportivo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nResidencia{");
        sb.append("\ncanthabitaciones=").append(canthabitaciones);
        sb.append("\ndescuentosgremios=").append(descuentosgremios);
        sb.append("\ncampodeportivo=").append(campodeportivo);
      
        sb.append('}');
        return sb.toString();
    }


    }
    
    
    

