package com.jc.banco;
public abstract class CuentaBancaria {
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    protected double saldo;


    public CuentaBancaria(String titular, TipoDeCuenta tipo ,double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular,double saldo) {
        this(
                titular,
                TipoDeCuenta.AHORRO,
                saldo
        );
    }

    public CuentaBancaria() {
        this("",TipoDeCuenta.AHORRO,0);
    }

    public void ingresarDinero(double cantidad) {
        if(cantidad <=0)return;
        this.saldo += cantidad;
    }

    public void retirarDinero(double cantidad) {
        if(cantidad <=0)return;
        this.saldo -= cantidad;
    }

    public String obtenerTitular() {
        return this.titular;
    }

    public double obtenerSaldo() {
        return this.saldo;
    }

    public abstract void informarSobreCondicionesLegales();



}