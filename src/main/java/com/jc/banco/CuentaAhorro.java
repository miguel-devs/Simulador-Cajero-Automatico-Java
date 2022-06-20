package com.jc.banco;

public class CuentaAhorro extends CuentaBancaria{
    private static final double COMISION = 0.12;

    public CuentaAhorro(String titular, TipoDeCuenta tipo ,double saldo) {
        super(titular,tipo,saldo);

    }

    public CuentaAhorro(String titular,double saldo) {
        super(titular,saldo);
    }

    public CuentaAhorro() {
        super();
    }

    @Override
    public void retirarDinero(double cantidad) {
        if(cantidad <=0)return;
        saldo -= cantidad;
        saldo -= COMISION;
    }
    @Override

    public void informarSobreCondicionesLegales(){
        System.out.println("Condiciones legales del banco ***");
        System.out.println("Segun el acuerdo firmado por usted ***");
        System.out.println("Su comision de retiro de dinero sera de "+COMISION+" Ya que es una cuenta de ahorro");

    }
}
