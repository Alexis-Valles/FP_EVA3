/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_return;

/**
 *
 * @author alexi
 */
public class EVA3_2_RETURN {

    public static void main(String[] args) {
        //Guardarlo y usarlo varias veces
        //Para usarlo una vez solo utilizamos el nombre sumarEnteros por ejm
        int valor;
        valor = sumarNumeros(100, 50);
        System.out.println("Resultado = " + valor);
    }
    
    //Sumar dos enteros
    public static int sumarNumeros(int num1, int num2){
        int resu;
        resu = num1 + num2;
        return resu;
        
    }
}
