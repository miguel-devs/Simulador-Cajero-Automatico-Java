package com.jc.cajero;
import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido");
            System.out.println("Ingrese su usuario");
            String usuario = scanner.next();
            System.out.println("Ingrese su contraseña");
            String contrasena = scanner.next();
            CajeroAutomatico cajero = new CajeroAutomatico(usuario,contrasena);
            cajero.Bienvenida();
            int opcionSeleccionada;
            do {
                System.out.println("Elija una de las siguientes opciones");
                System.out.println("1.- Consultar saldo");
                System.out.println("2.- Ingresar dinero");
                System.out.println("3.- Retirar dinero");
                System.out.println("4.- Consultar Movimientos");
                System.out.println("5.- Mostrar Terminos Legales");
                System.out.println("6.- Salir");
                opcionSeleccionada = scanner.nextInt();
                switch (opcionSeleccionada) {
                    case 1:
                        cajero.mostrarSaldo();
                        break;
                    case 2:
                        cajero.ingresarDinero();
                        break;
                    case 3:
                        cajero.retirarDinero();
                        break;
                    case 4:
                        cajero.consultarUltimosMovimientos();
                        break;
                    case 5:
                        cajero.mostrarCondicionesLegales();
                        break;
                    case 6:
                        cajero.salir();
                        break;
                    default:
                        System.out.println("Su opción no es valida");
                        break;
                }
            } while (opcionSeleccionada != 6);
    }
}
