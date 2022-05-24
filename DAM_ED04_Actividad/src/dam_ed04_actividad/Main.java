/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        operacion_cuenta(0);
    }

    public static void operacion_cuenta(float importe) {
        CCuenta cuentaBeatriz;
        double saldoActual;
        
        cuentaBeatriz = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaBeatriz.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaBeatriz.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaBeatriz.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
