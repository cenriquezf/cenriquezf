/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
   static int acum=0;
  static int max, min, m1, m2;
      
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Para calcular es nesesario un rango \n Ingrese el minimo valor a considerar");
        min=Integer.parseInt(scan.nextLine());
        System.out.println("Ingrese el maximo valor a considerar");
        max=Integer.parseInt(scan.nextLine());
        System.out.println("Ingrese 2 multiplos a considerar para el calculo \n 1er multiplo");
        m1=Integer.parseInt(scan.nextLine());
        System.out.println("2do multiplo");
        m2=Integer.parseInt(scan.nextLine());
        System.out.println("Numeros considerados");
        for(int i=min; i<max; i++){
            if((i%m1==0)||(i%m2==0)){
                acum=acum+i;
                System.out.println(""+i);
            }
            
        }
        System.out.println("Respuesta acumulada "+acum);
        
    }
    
}
