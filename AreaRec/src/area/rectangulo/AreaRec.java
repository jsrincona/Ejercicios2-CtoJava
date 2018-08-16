/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.rectangulo;

import java.util.Scanner;


public class AreaRec {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        float n1,n2,area;
        
        System.out.println("Ingrese el lado 1 y después el lado 2");
        n1= entrada.nextInt();
        n2= entrada.nextInt();
        
        area= n1 * n2;
        
        System.out.println("\n El area es: "+ area);
        
    }   
}
