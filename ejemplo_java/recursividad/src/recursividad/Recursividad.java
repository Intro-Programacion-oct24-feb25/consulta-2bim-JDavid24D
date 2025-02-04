/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author jorge
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 7;
        countDown(100); 
        countDownRecursive(100); 
    }
    public static void countDown(int n) { 
        /*en este ejemplo no se usa recursividad
         por eso tenemos el ciclo repetitivo for para que realize la operacion*/
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Terminó la cuenta regresiva");
    }

    public static void countDownRecursive(int n) {
        /*En este ejemplo usamos recursividad y solo usamos un condicional para detener el proceso*/
        if (n < 0) {
            System.out.println("Terminó la cuenta regresiva");
            return;
        }
        System.out.println("Cuenta " + n);
        countDownRecursive(--n);
    }
}
  
    

