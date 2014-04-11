/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OchoReinas;

/**
 *
 * @author MonniAzcunaga
 */
import java.util.ArrayList;
 
public class Solucion {
 
    public static void main(String[] args) {
        Reinas8 reinas= new Reinas8(8);
        
        //Para realizar una sola busqueda de solucion.
        reinas.buscarUnaSolucion();
        
        //Para buscar muchas osibles soluciones. 
        reinas.buscarSoluciones();
        
        ArrayList soluciones = reinas.getSoluciones();
        for (int i = 0; i<soluciones.size();i++){
            int[] aux  = (int[]) soluciones.get(i);
            System.out.println("Solucion " + (i+1) + ":");
            for (int j = 0; j<aux.length;j++){
                System.out.print("(" + (j+1) + "," + (aux[j]+1) + ")");
            }
            System.out.println("");
        }
 
    }
}