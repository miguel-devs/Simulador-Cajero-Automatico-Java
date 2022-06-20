package com.jc.banco;

public class CuentaNomina extends CuentaBancaria{

    private static final double COMISION = 0.16;

    public CuentaNomina(String titular, TipoDeCuenta tipo ,double saldo) {
        super(titular,tipo,saldo);
    }
    public CuentaNomina(String titular,double saldo) {
        super(titular,saldo);
    }
    public CuentaNomina() {
        super();
    }

    @Override

    public void retirarDinero(double cantidad){
        if(cantidad <=0)return;
        saldo -= cantidad;
        saldo -= COMISION;
    }

    @Override

    public void informarSobreCondicionesLegales(){
        System.out.println("Condiciones legales del banco ***");
        System.out.println("Segun el acuerdo firmado por usted ***");
        System.out.println("Su comision de retiro de dinero sera de "+COMISION+" Ya que es una cuenta de nomina");

    }


}
