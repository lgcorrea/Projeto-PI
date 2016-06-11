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

    }

    public static int checar(String numero) {
        boolean flag = false;
        int aux = 0;

        while (flag == false) {

            try {
                numero = Menu.leia.next();
                aux = Integer.parseInt(numero);
                flag = true;

            } catch (Exception y) {
                System.out.println("Tente novamente");

            }

        }
            return aux;

    }
}
