/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

/**
 *
 * @author Vane Proaño
 */
public class AlojamientoExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected double metroscuadrados;

 
    public AlojamientoExtraHotelero(boolean privado, double metroscuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metroscuadrados = metroscuadrados;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(double metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }
    
    public boolean esPrivado(){
        return privado;
    }
    
    public double cuantosMetros(){
        return metroscuadrados;
    }
    

    
}
