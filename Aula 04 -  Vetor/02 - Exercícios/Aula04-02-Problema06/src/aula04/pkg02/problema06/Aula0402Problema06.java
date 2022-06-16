
package aula04.pkg02.problema06;
import java.util.*;

public class Aula0402Problema06 {

    public static void main(String[] args) {
        double numero1;
        double numero2; 
        double resultado = 0;
        char operador;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in); 
       
        // entrada de dados 
        System.out.println("Digite o 1o numero: ");
        numero1 = entrada.nextDouble(); 
        System.out.println("Digite o 2o numero");
        numero2 = entrada.nextDouble();
        System.out.println("Digite o operador");
        operador = entradaString.nextLine().charAt(0);
        
        //verifica operador 
        if (operador =='+') {
            resultado = numero1 + numero2; 
        }
        else {
            if(operador == '-') {
                resultado = numero1 - numero2; 
            }
            else { 
                if(operador == '*'){
                    resultado = numero1 * numero2;
                }
                else {
                    if (operador == '/') {
                        resultado = numero1 / numero2; 
                    }
                    else { 
                        if (operador == '%'){
                            resultado = numero1 % numero2; 
                        }
                    }
                }
            }
        }
        
        //resultado 
        System.out.println("Resultado = " + resultado);
    }
    
}
