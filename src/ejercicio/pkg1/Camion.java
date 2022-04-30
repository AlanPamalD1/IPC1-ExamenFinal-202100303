/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author Alan
 */
public class Camion {
    int peso_limite_camion;
    private Vaca[] vacas;
    
    private int peso;
    private int litros;


    public Camion(int peso_limite_camion, int num_vacas) {
        this.peso_limite_camion = peso_limite_camion;
        this.vacas = new Vaca[num_vacas];
        this.peso = 0;
        this.litros = 0;
    }

    public int getPeso_limite_camion() {
        return peso_limite_camion;
    }

    public void setPeso_limite_camion(int peso_limite_camion) {
        this.peso_limite_camion = peso_limite_camion;
    }

    public Vaca[] getVacas() {
        return vacas;
    }

    public void setVacas(Vaca[] vacas) {
        this.vacas = vacas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
    
    public void aniadirVaca(Vaca v){
        for(int i=0; i<this.vacas.length;i++){
            if(this.vacas[i]==null){
                this.vacas[i]= v;
                this.litros+=v.getLitros_producidos();
                this.peso+=v.getPeso_vaca();
                break;
            }
        }
    }
    public void limpiar(){
        this.peso=0;
        this.litros=0;
        for(int i=0; i<this.vacas.length;i++){
            this.vacas[i]= null;
        }
    }
    
    public void eliminarVacas(Vaca v){
        for(int i=0; i<this.vacas.length;i++){
            if(this.vacas[i].equals(v)){
                this.vacas[i]= null;
                this.litros-=v.getLitros_producidos();
                this.peso-=v.getPeso_vaca();
                break;
            }
        }
    }
    public boolean existeVaca(Vaca v){
        for (Vaca vaca : this.vacas) {
            if (vaca != null && vaca.equals(v)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Camion{" + "peso_limite_camion=" + peso_limite_camion + ", vacas=" + vacas + ", peso=" + peso + ", litros=" + litros + '}';
    }
    
    
}
