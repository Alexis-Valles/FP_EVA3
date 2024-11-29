/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;
import java.util.Scanner;


/**
 *
 * @author alexi
 */
public class EVA3_3_CAPTURA {

  
    
    public static void main(String[] args) {
        String nombre = capturarTexto("Introducir tu nombre");
        String apellido = capturarTexto("Introducir tu apellido");
        int edad = capturarEdad ("Introducir la edad");
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        
    }
    public static String capturarTexto(String mensaje){
        String texto;
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        texto = captu.nextLine();
        return texto;
        
    }
    public static int apturarEntero(String mensaje){
        Scanner captu = new Scanner(System.in);
        double num;
        System.out.println(mensaje);
        num = captu.nextDouble();
        return num;
    }
}
