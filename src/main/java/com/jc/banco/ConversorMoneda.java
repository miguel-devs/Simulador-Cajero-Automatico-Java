package com.jc.banco;
import java.util.Scanner;


public class ConversorMoneda{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa la cantidad a convertir");
            double pesos = scanner.nextDouble();
            double dolares = pesos * 21.3;
             System.out.println("Los Pesos "+pesos+" Mexicanos equivalen a US dolares "+dolares);
        }


    }
}