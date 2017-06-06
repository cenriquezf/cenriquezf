/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author Cristian
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
   static int acum=0;
    public static void main(String[] args) {
        for(int i=10; i<100; i++){
            if((i%3==0)||(i%5==0)){
                acum=acum+i;
                System.out.println(""+i);
            }
        }
        System.out.println("Respuesta acumulada "+acum);
    }
}
