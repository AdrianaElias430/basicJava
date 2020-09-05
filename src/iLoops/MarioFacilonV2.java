package iLoops;

import libs.Input;

public class MarioFacilon {


    public static void main(String[] args) {
        System.out.println("Cuantos renglones tiene la piramide: ");

        int altura = 5;
        int renglon = 1;
        while(renglon <= altura) {
            int numGatos = renglon + 1;
            //dibujar espacios
            int numEspacios = altura + 1 - numGatos;
            int numEspaciosActual = 0;
            while(numEspaciosActual < numEspacios) {
                Input.print(" ");
                numEspaciosActual++;
            }
            //dibujar gatos
            int numeroActualGatos = 0;
            while(numeroActualGatos < numGatos) {
                Input.print("#");
                numeroActualGatos++;
            }
            //dar enter
            System.out.println();
            renglon++;
        }

    }
}