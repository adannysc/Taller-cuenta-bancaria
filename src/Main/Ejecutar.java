
package Main;
import Objetos.Ahorros;
public class Ejecutar {
    public static void main(String[] args) {
        Ahorros cuenta = new Ahorros (100000, 0, 0, 10, 0, true);

        System.out.println(cuenta.toString());
        
        cuenta.calcularInteres();
        cuenta.consignar(50000);
        cuenta.retirar(70000);
        
        System.out.println("Numero de consignaciones = " +
                cuenta.getNo_consignaciones());
        

    }
    
}
