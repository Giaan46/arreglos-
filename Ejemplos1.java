package sentencias;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejemplos1 {
    public static void main(String[]args){
        String[] dictionary = new  String[]{"casa","clase","lenguaje","java","cocinero","tomate"};
        Scanner keyboard = new Scanner(System.in);
        int tries = 5;
        String[] characterTries = new String[tries];



        //EL programa se piensa la palabra
        Random generator = new Random();
        int position = generator.nextInt(dictionary.length);
        String computerWord = dictionary[position];
        char[] computerArray = new char[computerWord.length()];
        Arrays.fill(computerArray, '_');
        System.out.println("ya tengo pensada una palabra, comienza el juego\n");

        //El programa inicia el juego
        //boolean noMoreTries = false;
        boolean userWin = false;
        //tambien se puede declarar asi

        while(tries > 0 && !userWin){
            //El usuario introduce su intento (un caracter)
            System.out.println("te quedan: " + tries + " intentos");
            // El programa pinta los huevos de la palabra
            for(char character : computerArray){
                System.out.println(character + " ");


            }
            System.out.println("\nTu intento: ");
            String userWord = keyboard.nextLine();
            if(Arrays.binarySearch(characterTries, userWord) != -1){
                System.out.println("El caracter esta repetido");
                continue;
            }
            //podemos aniadir comprobaciones mil
            int characterPosition = computerWord.indexOf(userWord);
            if(characterPosition == -1){
                // El caracter no esta en la palabra del programa
                tries--;

            }else{
                // El caracter esta en la palabra del programa
                computerArray[characterPosition] = userWord.charAt(0);
            }


        }




        //Se comprueba si el caracter forma parte de la cadena (extra: y si aparece varias veces?)

        //Comprobando los intentos, se sigue o no el juego (a oartir de qui hay que mostrar la parte de la cadena

    }
}
