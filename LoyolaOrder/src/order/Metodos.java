/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

import java.util.Arrays;

/**
 *
 * @author MARIA
 */
public class Metodos {

    public static void main(String[] args){
        
        int arreglo[] = {2,6,9,24,27,69,4,7,14};
        System.out.print("El vector es: "+Arrays.toString(arreglo) +"\n");
        
        System.out.println("Método de Burbuja");        
        Burbuja burbuja = new Burbuja();
        burbuja.organizar(arreglo);
        
        System.out.println("\n\n Método QuickSort");
        Quicksort quick = new Quicksort();
        quick.organizarquicksort(arreglo);        
        for(int i=0; i<arreglo.length; i++)
        {
             System.out.println(arreglo[i]);
        }
        
        System.out.println("\n\n Método Shell Sort");
        ShellSort shell = new ShellSort();
        shell.organizar(arreglo);
    }
}
