/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

/**
 *
 * @author Vane Proaño
 */
public class Camping extends AlojamientoExtraHotelero{
    
    protected int capmaxcarpas, cantbanos;
    protected boolean tienerestaurante;


    public Camping(int capmaxcarpas, int cantbanos, boolean tienerestaurante, boolean privado, double metroscuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metroscuadrados, nombre, direccion, localidad, gerente);
        this.capmaxcarpas = capmaxcarpas;
        this.cantbanos = cantbanos;
        this.tienerestaurante = tienerestaurante;
    }

    public int getCapmaxcarpas() {
        return capmaxcarpas;
    }

    public void setCapmaxcarpas(int capmaxcarpas) {
        this.capmaxcarpas = capmaxcarpas;
    }

    public int getCantbanos() {
        return cantbanos;
    }

    public void setCantbanos(int cantbanos) {
        this.cantbanos = cantbanos;
    }

    public boolean isTienerestaurante() {
        return tienerestaurante;
    }

    public void setTienerestaurante(boolean tienerestaurante) {
        this.tienerestaurante = tienerestaurante;
    }
    
    public double calcularPrecio(){
        return 0;
    }
    
       public String trueToDisp(){
        
        if (isTienerestaurante()) {
            return "Disponible";
        }else{
            return "No disponible";
        }
        

  
    
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCamping{");
        sb.append("\ncapmaxcarpas=").append(capmaxcarpas);
        sb.append("\ncantbanos=").append(cantbanos);
        sb.append("\ntienerestaurante=").append(tienerestaurante);
        sb.append('}');
        return super.toString()+sb.toString();
    }
}
