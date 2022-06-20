package  com.jc.mock;
import java.util.ArrayList;

public class GenerarMovimiento {
    private static final String INGRESO = "Ingreso de " ;
    private static final String RETIRO = "Retiro de ";
    private static final String TRANSFERENCIA = "Transferencia de ";

    public ArrayList<String> arrayMovimientos = new ArrayList<String>();

    public GenerarMovimiento (ArrayList<String> array){
        this.arrayMovimientos = array;
    }



    public void guardarMovimiento(int typoDeMovimiento,double cantidad,String moneda) {
        switch (typoDeMovimiento) {
            case 1:
                arrayMovimientos.add(INGRESO+moneda+cantidad);
                break;
            case 2:
                arrayMovimientos.add(RETIRO+moneda+cantidad);

                break;
            case 3:
                arrayMovimientos.add(TRANSFERENCIA+moneda+cantidad);
                break;
        }
    }

    public void mostrarMovimientos(){

        if(this.arrayMovimientos.isEmpty()){
            System.out.println("No hay movimientos registrados");
            return;
        }

        for(String movimimento : this.arrayMovimientos){
            System.out.println(movimimento);
        }

    }


}
