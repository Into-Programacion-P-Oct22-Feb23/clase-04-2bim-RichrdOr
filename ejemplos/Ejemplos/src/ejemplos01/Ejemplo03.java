/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;
import java.
/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // 
        int valor = obtenerSuma(10, 30); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        return suma;
        // return a + b;
    }
     public static int obtenerSuma2(){
         int suma; 
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese el nuevo valor de a:");
         int a = entrada.nextInt();
         System.out.println("Ingrese el nuevo valor de b:");
         int b = entrada.nextInt();
         suma = a + b;
         return suma;
     }
    
    
}
