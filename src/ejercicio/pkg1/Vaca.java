/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author Alan
 */
public class Vaca {
    int peso_vaca;
    int litros_producidos; 

    public Vaca(int peso_vaca, int litros_producidos) {
        this.peso_vaca = peso_vaca;
        this.litros_producidos = litros_producidos;
    }

    
    public int getPeso_vaca() {
        return peso_vaca;
    }

    public void setPeso_vaca(int peso_vaca) {
        this.peso_vaca = peso_vaca;
    }

    public int getLitros_producidos() {
        return litros_producidos;
    }

    public void setLitros_producidos(int litros_producidos) {
        this.litros_producidos = litros_producidos;
    }

    @Override
    public String toString() {
        return "Vaca{" + "peso_vaca=" + peso_vaca + ", litros_producidos=" + litros_producidos + '}';
    }

    
}
