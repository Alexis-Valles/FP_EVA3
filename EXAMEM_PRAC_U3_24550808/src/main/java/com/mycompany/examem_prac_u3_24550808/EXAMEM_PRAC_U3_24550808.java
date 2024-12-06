/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examem_prac_u3_24550808;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EXAMEM_PRAC_U3_24550808 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = captu.nextInt();

        
        while (numeroEstudiantes <= 0) {
            System.out.println("El número de estudiantes debe ser mayor a 0.");
            System.out.print("Ingrese nuevamente el número de estudiantes: ");
            numeroEstudiantes = captu.nextInt();
        }

        
        double[] calificaciones = new double[numeroEstudiantes];

        
        for (int i = 0; i < numeroEstudiantes; i++) {
            double calificacion;
            do {
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
                calificacion = captu.nextDouble();
                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("La calificación debe estar entre 0 y 100.");
                }
            } while (calificacion < 0 || calificacion > 100);
            calificaciones[i] = calificacion;
        }

       
        double promedio = calcularPromedio(calificaciones);
        int mayoresOIguales = contarCalificacionesMayores(calificaciones, promedio);
        double mayor = obtenerCalificacionMayor(calificaciones);
        double menor = obtenerCalificacionMenor(calificaciones);

        System.out.println("=====Resultados:=====");
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + mayoresOIguales);
        System.out.println("Calificación más alta: " + mayor);
        System.out.println("Calificación más baja: " + menor);

        captu.close(); // este sirve para cerrar la entrada de datos
    }

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        return suma / calificaciones.length; // esta es una divison para calcular el promedio
    }

   
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= promedio) {
                contador++;
            }
        }
        return contador;
    }

   
    public static double obtenerCalificacionMayor(double[] calificaciones) {
        double mayor = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > mayor) {
                mayor = calificaciones[i];
            }
        }
        return mayor;
    }

  
    public static double obtenerCalificacionMenor(double[] calificaciones) {
        double menor = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] < menor) {
                menor = calificaciones[i];
            }
        }
        return menor;
    }
}
            
            
    

    



            
    
    
            
        
    


