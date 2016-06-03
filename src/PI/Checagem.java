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

    public static void main(String[] args) {
        checar();
    }

    public static void checar() {
        Scanner leia = new Scanner(System.in);

        int x = 0;
        boolean flag = false;

        do {
            System.out.println("digite um caracter ");
        } while (flag != false);
        {

            try {
                x = leia.nextInt();

            } 
            
            catch (Exception y) {
                System.out.println("é letra");
                checar();

            }
                flag = false;
        }
        System.out.print("");
        System.out.println("teste");
    }
}
