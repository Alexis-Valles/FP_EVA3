/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tik_tak_tou;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class TIK_TAK_TOU {

    public static int[][] matriz = new int[3][3];

public static int winer;

public static void main(String[] args) {
    int jugada, jgs;
    int computadora, seguir;
    Scanner captu = new Scanner(System.in);
    winer = 1;

    System.out.println("¿Quieres jugar? Pulsa 2 para iniciar y 1 para salir");
    seguir = captu.nextInt();

    if (seguir >= 2) {
        // Mostrar tablero inicial solo una vez
        System.out.println("Los números que se muestran son las posiciones que puedes elegir:");
        System.out.println("0|1|2");
        System.out.println("-----");
        System.out.println("3|4|5");
        System.out.println("-----");
        System.out.println("6|7|8");
    }

    do {
        if (seguir >= 2 || seguir < 1) {
            do {
                System.out.println("Ingresa tu elección:");
                jugada = captu.nextInt();
                jgs = jugador(jugada);
            } while (jgs == -1);

            do {
                computadora = elegirjugada();
            } while (computadora == 0);

            // Mostrar el estado del tablero después de cada jugada
            imprimirTablero();
        }
        winer = gana();
        if (winer != 1) {
            seguir = 1;
        }
    } while (seguir != 1);

    System.out.println("");
    switch (winer) {
        case 2:
            System.out.println("YOU LOSE");
            break;
        case 3:
            System.out.println("YOU WIN");
            break;
        default:
            System.out.println("Miedo o qué?");
    }
}

// Método para imprimir el tablero
public static void imprimirTablero() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (matriz[i][j] == 1) {
                System.out.print("[O]");
            } else if (matriz[i][j] == 4) {
                System.out.print("[X]");
            } else {
                System.out.print("[" + (i * 3 + j) + "]");
            }
        }
        System.out.println("");
    }
}

public static int elegirjugada() {
    int jugada;
    double valor = Math.random();
    if (valor >= 0 && valor < .1 && matriz[0][0] == 0) {
        jugada = (matriz[0][0] = 1);
    } else if (valor >= .1 && valor < .2 && matriz[0][1] == 0) {
        jugada = (matriz[0][1] = 1);
    } else if (valor >= .2 && valor < .3 && matriz[0][2] == 0) {
        jugada = (matriz[0][2] = 1);
    } else if (valor >= .3 && valor < .4 && matriz[1][0] == 0) {
        jugada = (matriz[1][0] = 1);
    } else if (valor >= .4 && valor < .5 && matriz[1][1] == 0) {
        jugada = (matriz[1][1] = 1);
    } else if (valor >= .5 && valor < .6 && matriz[1][2] == 0) {
        jugada = (matriz[1][2] = 1);
    } else if (valor >= .6 && valor < .7 && matriz[2][0] == 0) {
        jugada = (matriz[2][0] = 1);
    } else if (valor >= .7 && valor < .8 && matriz[2][1] == 0) {
        jugada = (matriz[2][1] = 1);
    } else if (valor >= .8 && valor < 1 && matriz[2][2] == 0) {
        jugada = (matriz[2][2] = 1);
    } else {
        jugada = 0;
    }
    return jugada;
}

public static int jugador(int jugadas) {
    int play = jugadas;
    if (play == 0 && matriz[0][0] == 0) {
        matriz[0][0] = 4;
    } else if (play == 1 && matriz[0][1] == 0) {
        matriz[0][1] = 4;
    } else if (play == 2 && matriz[0][2] == 0) {
        matriz[0][2] = 4;
    } else if (play == 3 && matriz[1][0] == 0) {
        matriz[1][0] = 4;
    } else if (play == 4 && matriz[1][1] == 0) {
        matriz[1][1] = 4;
    } else if (play == 5 && matriz[1][2] == 0) {
        matriz[1][2] = 4;
    } else if (play == 6 && matriz[2][0] == 0) {
        matriz[2][0] = 4;
    } else if (play == 7 && matriz[2][1] == 0) {
        matriz[2][1] = 4;
    } else if (play == 8 && matriz[2][2] == 0) {
        matriz[2][2] = 4;
    } else {
        play = -1;
    }
    return play;
}

public static int gana() {
    int ganar;
    if (
        (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1) ||
        (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1) ||
        (matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1) ||
        (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1) ||
        (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1) ||
        (matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1) ||
        (matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1) ||
        (matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1)
    ) {
        ganar = 2;
    } else if (
        (matriz[0][0] == 4 && matriz[0][1] == 4 && matriz[0][2] == 4) ||
        (matriz[1][0] == 4 && matriz[1][1] == 4 && matriz[1][2] == 4) ||
        (matriz[2][0] == 4 && matriz[2][1] == 4 && matriz[2][2] == 4) ||
        (matriz[0][0] == 4 && matriz[1][0] == 4 && matriz[2][0] == 4) ||
        (matriz[0][1] == 4 && matriz[1][1] == 4 && matriz[2][1] == 4) ||
        (matriz[0][2] == 4 && matriz[1][2] == 4 && matriz[2][2] == 4) ||
        (matriz[0][0] == 4 && matriz[1][1] == 4 && matriz[2][2] == 4) ||
        (matriz[0][2] == 4 && matriz[1][1] == 4 && matriz[2][0] == 4)
    ) {
        ganar = 3;
    } else {
        ganar = 1;
    }
    return ganar;
}
}


