/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_extra3;

/**
 *
 * @author Vane Proaño
 */
public class Hotel5estrella extends Hotel {
    
    protected String gym, nomrestaunte;
    protected int caprestaurante;
    protected int salonesconfer;
    protected int cantsuites;
    protected int cantlimosinas;

    public Hotel5estrella(String gym, String nomrestaunte, int caprestaurante, int salonesconfer, int cantsuites, int cantlimosinas, int canthabitaciones, int numcamas, int cantpisos, double precio, String nombre, String direccion, String localidad, String gerente) {
        super(canthabitaciones, numcamas, cantpisos, precio, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nomrestaunte = nomrestaunte;
        this.caprestaurante = caprestaurante;
        this.salonesconfer = salonesconfer;
        this.cantsuites = cantsuites;
        this.cantlimosinas = cantlimosinas;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getNomrestaunte() {
        return nomrestaunte;
    }

    public void setNomrestaunte(String nomrestaunte) {
        this.nomrestaunte = nomrestaunte;
    }

    public int getCaprestaurante() {
        return caprestaurante;
    }

    public void setCaprestaurante(int caprestaurante) {
        this.caprestaurante = caprestaurante;
    }

    public int getSalonesconfer() {
        return salonesconfer;
    }

    public void setSalonesconfer(int salonesconfer) {
        this.salonesconfer = salonesconfer;
    }

    public int getCantsuites() {
        return cantsuites;
    }

    public void setCantsuites(int cantsuites) {
        this.cantsuites = cantsuites;
    }

    public int getCantlimosinas() {
        return cantlimosinas;
    }

    public void setCantlimosinas(int cantlimosinas) {
        this.cantlimosinas = cantlimosinas;
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
        
        double valorlimosinas = 15* cantlimosinas;
        
     
        return super.calcularPrecioH() + valorhabitaciones+ valorrestau+ valorgym + valorlimosinas;
        } 



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel5estrella{");
        sb.append("\ncaprestaurante=").append(caprestaurante);
        sb.append("\nsalonesconfer=").append(salonesconfer);
        sb.append("\ncantsuites=").append(cantsuites);
        sb.append("\ncantlimosinas=").append(cantlimosinas);
        sb.append("\ngym=").append(gym);
        sb.append("\nnomrestaunte=").append(nomrestaunte);
        sb.append('}');
        return super.toString()+sb.toString();
    }
    
    
    
}
