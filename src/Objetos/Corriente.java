
package Objetos;

public class Corriente {
    protected float saldo;
    protected Integer no_consignaciones;
    protected Integer no_retiros;
    protected float tasa_anual;
    protected float comision_m;

    public Corriente(float saldo, Integer no_consignaciones, Integer no_retiros, float tasa_anual, float comision_m) {
        this.saldo = saldo;
        this.no_consignaciones = no_consignaciones;
        this.no_retiros = no_retiros;
        this.tasa_anual = tasa_anual;
        this.comision_m = comision_m;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Integer getNo_consignaciones() {
        return no_consignaciones;
    }

    public void setNo_consignaciones(Integer no_consignaciones) {
        this.no_consignaciones = no_consignaciones;
    }

    public Integer getNo_retiros() {
        return no_retiros;
    }

    public void setNo_retiros(Integer no_retiros) {
        this.no_retiros = no_retiros;
    }

    public float getTasa_anual() {
        return tasa_anual;
    }

    public void setTasa_anual(float tasa_anual) {
        this.tasa_anual = tasa_anual;
    }

    public float getComision_m() {
        return comision_m;
    }

    public void setComision_m(float comision_m) {
        this.comision_m = comision_m;
    }


    public void consignar(float cantidad){
        System.out.println("Cantidad consignada = " + cantidad);
        saldo = saldo + cantidad;
        no_consignaciones = no_consignaciones + 1;
    }
     
    public void retirar(float cantidad){
        System.out.println("Cantidad retirada = " + cantidad);
        saldo = saldo - cantidad;
        no_retiros = no_retiros + 1;
    }
    
    public void calcularInteres(){
        float interes = (saldo * tasa_anual) * 1;
        saldo = saldo + interes;
    }
    
    public void extratoMensual(String nombre, Integer cuenta, String fecha){
        System.out.println(
                "Nombre del titular = " + nombre +
                "\nNumero de cuenta = " + cuenta +
                "\nFecha de emisión = " + fecha );
    }

}
