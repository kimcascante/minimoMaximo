package Semana10;

/**
 * Nombre del programa: 
 * Descripcion: Haga una función que retorne el máximo entre dos números y otra que retorne el mínimo
    entre dos números. Pruébelas en un main.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class ej0w10 {

public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{ 

        int num1, num2;

        out.println("Digite el primer numero:");
        num1 = Integer.parseInt(in.readLine());

        out.println("Digite el segundo numero:");
        num2 = Integer.parseInt(in.readLine());

        calculoNumMaximo(num1, num2);
        calculoNumMinimo(num1, num2);
    }

    public static void calculoNumMaximo(int pNum, int pNum2){
        String numMaximo = "";

        if(pNum > pNum2){
            numMaximo = "El numero maximo es: " + pNum;
        }

        out.println(numMaximo);
    }

    public static String calculoNumMinimo(int pNum, int pNum2){
        String numMinimo="";

        if(pNum2 < pNum){
            numMinimo = "El numero minimo es: " +pNum2;
        }

        out.println(numMinimo);

        return numMinimo;
    }
}