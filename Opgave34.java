/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave34;

/**
 *
 * @author burhan
 */
import java.util.Random;



public class Opgave34 {



    public static void main(String[] args) {



        // Laver et random objekt af klassen Random.

        Random random = new Random();



        // Gemmer et tal mellem 1 og 12 i randomNumber, bliver pluset med 1 fordi nextInt(12) laver et tal mellem 0 og 11.

        int randomNumber = random.nextInt(12) + 1;



        // Tjekker om tallet bliver 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 eller 12 og skriver måneden.

        if (randomNumber == 1) {

            System.out.println("January");

        }

        if (randomNumber == 2) {

            System.out.println("February");

        }

        if (randomNumber == 3) {

            System.out.println("March");

        }

        if (randomNumber == 4) {

            System.out.println("April");

        }

        if (randomNumber == 5) {

            System.out.println("May");

        }

        if (randomNumber == 6) {

            System.out.println("June");

        }

        if (randomNumber == 7) {

            System.out.println("July");

        }

        if (randomNumber == 8) {

            System.out.println("August");

        }

        if (randomNumber == 9) {

            System.out.println("September");

        }

        if (randomNumber == 10) {

            System.out.println("October");

        }

        if (randomNumber == 11) {

            System.out.println("November");

        }

        if (randomNumber == 12) {

            System.out.println("December");

        }

    }

}
