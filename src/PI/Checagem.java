/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PI;

import static PI.Layout.layout;

/**
 *
 * @author luis.gpcorrea
 */
public class Checagem {

    static boolean flagValor = false;
    static boolean flagNumero = false;

    public static void main(String[] args) {
        System.out.println("TESTE");

    }

    public static int checarNumero(int numero) {

        try {
            numero = Menu.leia.nextInt();
            flagNumero = true;
        } catch (java.util.InputMismatchException erro) {
            System.out.println("Aviso: Este campo aceita apenas numeros");
            flagNumero = false;
        }

        return numero;
    }

    public static int checarVaga(int vaga) {

        try {
            vaga = Menu.leia.nextInt();

        } catch (java.util.InputMismatchException erro) {
            System.out.println("Aviso: Este campo aceita apenas numeros");

        }
        return vaga;
    }

    public static float checarValor(float valor) {

        try {

            valor = Menu.leia.nextFloat();
            flagValor = true;

        } catch (java.util.InputMismatchException erro) {
            System.out.println("Aviso: Este Campo aceita apenas numeros");
            flagValor = false;

        }

        return valor;

    }

}
