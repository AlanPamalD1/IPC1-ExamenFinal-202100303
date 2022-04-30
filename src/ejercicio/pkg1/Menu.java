/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opciones="""
                        *********************************
                        1. Encontrar número mayor
                        2. Generar Piramide
                        3. Ejercicio 3
                        4. Salir
                        *********************************
                        """; 
        
        int opcion_elegida;
        boolean en_proceso=true;
        
        while(en_proceso){
            System.out.println("");
            System.out.println(opciones);
            System.out.println("Seleccione el ejercicio a realizar");
            
            
            opcion_elegida=scanner.nextInt();
            switch(opcion_elegida){
                case 1 -> {
                    Ejercicio1();

                    ;
                }
                case 2 -> {
                    Ejercicio2();
                    ;
                }
                case 3 -> {
                    Ejercicio3();
                    ;
                }
                case 4 -> {
                    en_proceso=false;
                    ;
                }
                default -> {
                    System.out.println("Ingrese una opción válida");
                    ;
                }
            }
                
        }
    }
    
    private static void Ejercicio1 (){
        int x=0;
        int y=0;
        int mayor=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        x=scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        y=scanner.nextInt();
        
        if(x<y){
            mayor=y;
        }else{
            mayor=x;
        }
        
        System.out.println("El número mayor es: "+mayor);
    }
    
    private static void Ejercicio2(){
        int base=0;
        int altura=0;
        boolean numero_impar=false;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese la base para la píramide (número impar)");
            base=scanner.nextInt();
 
            if(base%2 != 0){
                numero_impar=true;
            }else{
                System.out.println("Dato no válido, debe de ser un número impar");
            }
        }while(!numero_impar);
        
        //Altura depende de la base//
        altura = (base+1)/2;
        char matriz [][] = new char[altura][base];
        
        int mitad = matriz[0].length/2;
        
        //Al sumar las posiciones si da más que la mitad se debe de poner un espacio en blanco, y al restar si da más que la mitad se pone un asterisco//
        for (int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz[0].length;j++){
                if((i+j) >= mitad && (j-i) <= mitad){
                    matriz[i][j] = '*';
                }else{
                    matriz[i][j] = ' ';
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void Ejercicio3(){
        
        Vaca[] vacas = {
         new Vaca (223,30),
         new Vaca (243,34),
         new Vaca (100,28),
         new Vaca (200,45),
         new Vaca (200,31),
         new Vaca (255,50),
         new Vaca (2300,29),
         new Vaca (223,1),
            
        };
        
        Camion camion_base = new Camion(15, vacas.length);
        Camion camion_optima = new Camion(15, vacas.length);
 
        
        System.out.println("");
    }

    
}
