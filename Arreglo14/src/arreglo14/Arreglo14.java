/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo14;

/**
 *
 * @author Usuario
 */
public class Arreglo14 {

    
    public static void main(String[] args) {
         int[] a = new int[11];
		int n = 4;

			for (int i = 0;i < 11;i++)
			{
				a[i] = n++;
				System.out.print(a[i]);
				System.out.print("\n");
			}
    }
    
}
