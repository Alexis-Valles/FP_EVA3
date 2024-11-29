/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_matriz;

/**
 *
 * @author alexi
 */
public class EVA3_6_MATRIZ {

    public static void main(String[] args) {
        int[] valores = new int[5];//ARREGLO UNIDEMENSIONAL
        //AREGLO DE DOS DIMENSIONES --> MATRIZ: HPJA DE EXCEL
        int[][]matriz = new int [3][3];
        matriz[0][0] = 100;//PRIMER POSICION
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;//ULTIMA POSICION
        //IMPRMIR MATRIZ:
        for(int i = 0; i < 3; i++){//PRIER DIMENSION : FILAS
            for(int j = 0; j < 3; j++){// SEGUNDA DIMENSION: COLUMNAS
                    System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
