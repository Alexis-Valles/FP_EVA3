/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        System.out.println("Mayor de 8 y 7 = " + buscarMayor (8, 7));
        System.out.println("Indique el dia que quiere saber en numero" + determinarbuscarDias(5));
    }
    
  public static int buscarMayor(int num1, int num2){
      if(num1 > num2){
          return num1;
      }else{
          return num2;
      }
  }
  public static String buscarDias(int dia){
        
        
        switch(dia){
            case 1:
                return "lunes";
            case 2:
                return "Martes";
            case 3:
                return "miercoles";
            case 4:
                return "jueves";
            case 5:
                return "Viernes";
            case 6:
               return "Sabado";
            case 7:
                return "Domingo";
            default:
               return "dia no valido";
        }
    
      
  }
 
}