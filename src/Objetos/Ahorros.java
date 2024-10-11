
package Objetos;

public class Ahorros extends Corriente{
    private Boolean activa;

    public Ahorros (float saldo, Integer no_consignaciones, Integer no_retiros,
        float tasa_anual, float comision_m, Boolean activa){
        super(saldo, no_consignaciones, no_retiros, tasa_anual, comision_m);
        this.activa = activa;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSaldo = $").append(saldo);
        sb.append("\nTasa de interes = = ").append(tasa_anual).append("%");
        sb.append("\nComision mensual = $").append(comision_m);
        sb.append("\nActiva = ").append(activa);
        return sb.toString();
    } 
    
}
