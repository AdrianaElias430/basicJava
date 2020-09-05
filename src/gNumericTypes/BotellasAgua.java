package gNumericTypes;

import libs.Input;

public class BotellasAgua {
    static int numMinutos;
    static int numBotellas;

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de minutos:");
        numMinutos = Input.get_int();

        if (numMinutos >= 0) {
            numBotellas = numMinutos * 12;
            System.out.println("El numero de botellas es: " + numBotellas);
        }
        else {
            System.out.println("El numero ingresado no es valido");
        }
    }
}
