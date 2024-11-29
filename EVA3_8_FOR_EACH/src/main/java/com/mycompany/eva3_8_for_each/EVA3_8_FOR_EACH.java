/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_for_each;

/**
 *
 * @author alexi
 */
public class EVA3_8_FOR_EACH {

    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for(String cade: dias){
            System.out.println(cade);
            
            int[] billetes = {20, 50, 100, 200, 500, 1000};
            for (int billete: billetes){
                System.out.println(billete);
            }
                
        }
        
    }
   
}
