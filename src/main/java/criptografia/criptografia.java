/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class criptografia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean repetir = true; // Variable booleana para repetir el programa
        String cifrar = "Cifrar"; // Variable string para entrar en el modo de cifrar
        String descifrar = "Descifrar"; // Variable string para entrar en el modo de descifrar
        String salir = "Salir"; // Variable string para salir del programa
        String transposicion = ""; // String creada para guardar la palabra despues de la transposición
        int caracterAleatorio1; // int el cual será el caracter delante de la palabra cifrada
        int caracterAleatorio2; // int el cual será el caracter detrás de la palabra cifrada

        // Bucle para repetir el programa.
        do {
            // Preguntaos cual de las dos opociones queremos realizar.
            System.out.println("\n¿Qué desea hacer?"
                    + "\nCifrar - Descifrar - Salir"
                    + "\nTu selección: ");
            String cifrarDescrifrar = teclado.nextLine();

            // Creamos un bucle de control en la cual se repite hasta que una de las condiciones es verdadera
            while (!cifrarDescrifrar.equals(cifrar) && !cifrarDescrifrar.equals(descifrar)
                    && !cifrarDescrifrar.equals(salir)) {
                System.out.println("¿Qué desea hacer?"
                        + "\nCifrar - Descifrar - Salir"
                        + "\nTu selección: ");
                cifrarDescrifrar = teclado.nextLine();
            }

            // Creamos el switch con ambas opciones.
            switch (cifrarDescrifrar) {
                case "Cifrar":
                    System.out.print("Introduce la palabra a cifrar: ");
                    String palabraCifrar = teclado.nextLine();

                    // Pasamos el string a mayusculas.
                    palabraCifrar = palabraCifrar.toUpperCase();

                    // Creamos un bucle inverso en el cual añadirá a la variable transposicion las el nuevo orden.
                    // Esto sería la transposición al estar todas las letras en otro orden.
                    for (int i = palabraCifrar.length() - 1; i >= 0; i--) {
                        transposicion = transposicion + palabraCifrar.charAt(i);
                    }
                    // Comprobamos que modificase bien la palabra.
                    System.out.print("\nCadena cifrada: " + transposicion);

                    // Creamos el array que contendra todas las letras una vez ya realizado la transposicion
                    char[] arrayPalabra = transposicion.toCharArray();

                    System.out.print("\nSustitución de vocales: ");

                    // Creamos un bucle en el cual recorra todo el array en busca de las vocales para cambiar lo que aparecen al 
                    // estar ellas
                    for (int i = 0; i < arrayPalabra.length; i++) {
                        // A
                        switch (arrayPalabra[i]) {
                            case 65:
                                System.out.print(5);
                                // E
                                break;
                            case 69:
                                System.out.print(4);
                                // I
                                break;
                            case 73:
                                //                        arrayPalabra[i] = 3;
                                System.out.print(3);
                                // O
                                break;
                            case 79:
                                System.out.print(2);
                                // U
                                break;
                            case 85:
                                System.out.print(1);
                                // Las demás leras las muestre tal cual son
                                break;
                            default:
                                System.out.print(arrayPalabra[i]);
                                break;
                        }

                    }

                    System.out.print("\nCadena cifrada: ");
                    // Creamos el primer valor aleatorio el cual estará escrito delante de la palabra ya transposicionada
                    // y controlamos sus posibles caracteres.
                    caracterAleatorio1 = (char) aleatorio.nextInt(90 - 65) + 65;
                    switch (caracterAleatorio1) {
                        case 65:
                            System.out.print(5);
                            // E
                            break;
                        case 69:
                            System.out.print(4);
                            // I
                            break;
                        case 73:
                            //                        arrayPalabra[i] = 3;
                            System.out.print(3);
                            // O
                            break;
                        case 79:
                            System.out.print(2);
                            // U
                            break;
                        case 85:
                            System.out.print(1);
                            // Las demás leras las muestre tal cual son
                            break;
                        default:
                            System.out.print((char) caracterAleatorio1);
                            break;
                    }

                    // Creamos un bucle en el cual recorra todo el array en busca de las vocales para cambiar lo que aparecen al 
                    // estar ellas
                    for (int i = 0; i < arrayPalabra.length; i++) {
                        // A
                        switch (arrayPalabra[i]) {
                            case 65:
                                System.out.print(5);
                                // E
                                break;
                            case 69:
                                System.out.print(4);
                                // I
                                break;
                            case 73:
                                //                        arrayPalabra[i] = 3;
                                System.out.print(3);
                                // O
                                break;
                            case 79:
                                System.out.print(2);
                                // U
                                break;
                            case 85:
                                System.out.print(1);
                                // Las demás leras las muestre tal cual son
                                break;
                            default:
                                System.out.print(arrayPalabra[i]);
                                break;
                        }

                    }

                    // Creamos el valor aleatorio el cual estará escrito detrás de la palabra ya transposicionada
                    // y controlamos sus posibles caracteres.
                    caracterAleatorio2 = (char) aleatorio.nextInt(90 - 65) + 65;
                    switch (caracterAleatorio2) {
                        case 65:
                            System.out.print(5);
                            break;
                        case 69:
                            System.out.print(4);
                            // I
                            break;
                        case 73:
                            //                        arrayPalabra[i] = 3;
                            System.out.print(3);
                            // O
                            break;
                        case 79:
                            System.out.print(2);
                            // U
                            break;
                        case 85:
                            System.out.print(1);
                            // Las demás leras las muestre tal cual son
                            break;
                        default:
                            System.out.print((char) caracterAleatorio2);
                            break;
                    }

                    break;

                case "Descifrar":
//                    // Descifrado
                    // solicitamos por teclado la palabra a descifrar
                    System.out.print("Introduce la palabra a descifrar: ");
                    String palabraDescifrar = teclado.nextLine();
                    // Cambiamos la palabra a mayuscular por si hubiera alguna minuscula.
                    palabraDescifrar = palabraDescifrar.toUpperCase();

                    // Creamos un nuevo string el cual esta sin la primera ni la ultima letra.
                    String palabraFin = palabraDescifrar.substring(1, palabraDescifrar.length() - 1);
                    System.out.println("");
                    System.out.println("Quitamos el primer y último carácter: " + palabraFin);
                    System.out.println("");

                    // Creamos un bucle inverso en el cual añadirá a la variable transposicion las el nuevo orden.
                    // Esto sería la transposición al estar todas las letras en otro orden.
                    String transposicion2 = "";
                    for (int i = palabraFin.length() - 1; i >= 0; i--) {
                        transposicion2 = transposicion2 + palabraFin.charAt(i);
                    }
                    System.out.println("Palabra ordenada: " + transposicion2);
                    System.out.println("");

                    System.out.print("Sustitucion de vocales:");
                    char[] arrayPalabra2 = transposicion2.toCharArray();
                    for (int i = 0; i < arrayPalabra2.length; i++) {
                        switch (arrayPalabra2[i]) {
                            case 5:
                                System.out.print("A");
                                break;
                            case 4:
                                System.out.print("E");
                                break;
                            case 3:
                                System.out.print("I");
                                break;
                            case 2:
                                System.out.print("O");
                                break;
                            case 1:
                                System.out.print("U");
                                break;
                            default:
                                System.out.print(arrayPalabra2[i]);
                                break;
                        }
                    }
                    System.out.println("");

                    break;

                case "Salir":
                    // Fin del programa
                    System.out.println("Saliendo del programa....");
                    repetir = false;
            }

        } while (repetir);
    }

}
