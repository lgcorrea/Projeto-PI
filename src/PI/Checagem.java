/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PI;

import java.util.Scanner;
 
/**
 *
 * @author luis.gpcorrea
 */
public class Checagem {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void checar(int numero) {
        boolean flag = false;
        
        while (flag == false) {

            try {
                numero = ler.nextInt();
               //flag = true;

            } catch (Exception y) {
                System.out.println("Tente novamente");
                numero = 0;
               // checar(numero);
            }
                
        }
        
    }
}
