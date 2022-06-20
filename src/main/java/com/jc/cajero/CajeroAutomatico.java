package com.jc.cajero;

import com.jc.banco.CuentaAhorro;
import com.jc.banco.CuentaBancaria;
import com.jc.banco.TipoDeCuenta;
import com.jc.mock.GenerarMovimiento;
import  com.jc.mock.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CajeroAutomatico {
    private CuentaBancaria CuentaBancariaActual;
    private GenerarMovimiento GenerarMovimiento;

    private String identificador;
    private String contrasena;

    protected CajeroAutomatico(String identificador, String contrasena) {
        this.identificador = identificador;
        this.contrasena = contrasena;
        String usuario = "Juan Perez Jarcia";
        double saldo = 53_035;
        CuentaBancariaActual = new CuentaAhorro(usuario, saldo);
        
        ArrayList<String> arrayMovimientos = new ArrayList<String>();
        GenerarMovimiento = new GenerarMovimiento(arrayMovimientos);
    }

    protected void Bienvenida() {
        System.out.println("Bienvenido " + CuentaBancariaActual.obtenerTitular());
    }

    protected void mostrarSaldo() {
        System.out.println("Su saldo actual es de: " + CuentaBancariaActual.obtenerSaldo());

    }

    protected void ingresarDinero() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cuando efectivo desea ingresar?");
            double cantidad = scanner.nextDouble();
            CuentaBancariaActual.ingresarDinero(cantidad);
            GenerarMovimiento.guardarMovimiento(1,cantidad,"$");
            this.mostrarSaldo();


    }

    protected void retirarDinero() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cuando efectivo desea retirar?");
            double cantidad = scanner.nextDouble();
            CuentaBancariaActual.retirarDinero(cantidad);
            GenerarMovimiento.guardarMovimiento(2,cantidad,"$");

            this.mostrarSaldo();
    }

    protected void consultarUltimosMovimientos() {
        GenerarMovimiento.mostrarMovimientos();
    }

    protected void mostrarCondicionesLegales(){
        CuentaBancariaActual.informarSobreCondicionesLegales();
    }
    protected void salir() {
        System.out.println("Gracias por usar nuestros servicios");
    }

}