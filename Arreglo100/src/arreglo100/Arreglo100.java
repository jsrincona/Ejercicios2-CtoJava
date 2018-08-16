/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo100;

/**
 *
 * @author Usuario
 */
public class Arreglo100 {
     public static void main(String[] args){
         int[] a = new int[100];
		int n = 1;

			for (int i = 0;i < 100;i++)
			{
				a[i] = n++;
					if (a[i] % 2 == 0)
					{
						System.out.print(a[i]);
						System.out.print("\n");
					}
			}
	}
         
     
     
}
