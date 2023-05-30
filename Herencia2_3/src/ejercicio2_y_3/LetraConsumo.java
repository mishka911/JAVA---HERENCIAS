/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio2_y_3;

/**
 *
 * @author Vane Proaño
 */
public enum LetraConsumo {
    
    A('A', 1000),
    B('B', 800),
    C('C', 600),
    D('D', 500),
    E('E', 300),
    F('F', 100);
    
    private final char letra;
    private  final int preciol;
    
      private LetraConsumo(char letra, int preciol) {
        this.letra = letra;
        this.preciol = preciol;
    }

    public char getLetra() {
        return letra;
    }
    


    public int getPreciol() {
        return preciol;
    }

   
    
}
