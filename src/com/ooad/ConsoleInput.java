package com.ooad;

import java.awt.Toolkit;
import java.util.Scanner;

public class ConsoleInput {
	

    public static int enterLetter(String word, char[] enteredLetters, int triesCount)    {
        System.out.print("(Guess) Enter a letter in word ");
        // If-clause is true if no asterisks were printed so
        // word is successfully guessed
        if (! printWord(word, enteredLetters))
            return 3;
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = findEmptyPosition(enteredLetters);
        char userInput = input.nextLine().charAt(0);
        if (inEnteredLetters(userInput, enteredLetters)) {
            System.out.println(userInput + " is already in the word");
            return 2;
        }
        else if (word.contains(String.valueOf(userInput))) {
            enteredLetters[emptyPosition] = userInput;
            return 1;
        }
        else {
        	if (triesCount == 0) {
            System.out.println(userInput + " is not in the word");
            System.out.println("============= H ==============");
        	}
        	if (triesCount == 1) {
                System.out.println(userInput + " is not in the word");
                System.out.println("============= HA ==============");
            	}
        	if (triesCount == 2) {
                System.out.println(userInput + " is not in the word");
                System.out.println("============= HAN ==============");
            	}
        	if (triesCount == 3) {
                System.out.println(userInput + " is not in the word");
                System.out.println("============= HANG ==============");
            	}
        	if (triesCount == 4) {
                System.out.println(userInput + " is not in the word");
                System.out.println("============= HANGM ==============");
            	}
        	if (triesCount == 5) {
                System.out.println(userInput + " is not in the word");
                System.out.println("============= HANGMA ==============");
            	}
        	if (triesCount == 6) {
                System.out.println(userInput + " is not in the word");
                System.out.println("============= HANGMAN ==============");
                System.out.println("============= GAME END ==============");
                System.exit(0);
            	}
        	Toolkit.getDefaultToolkit().beep();
            return 0;
            }
    }

    /* Print word with asterisks for hidden letters, returns true if
    asterisks were printed, otherwise return false */
    public static boolean printWord(String word, char[] enteredLetters) {
        // Iterate through all letters in word
        boolean asteriskPrinted = false;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            // Check if letter already have been entered bu user before
            if (inEnteredLetters(letter, enteredLetters))
                System.out.print(letter); // If yes - print it
            else {
                System.out.print('*');
                asteriskPrinted = true;
            }
        }
        return asteriskPrinted;
    }

    /* Check if letter is in enteredLetters array */
    public static boolean inEnteredLetters(char letter, char[] enteredLetters) {
        return new String(enteredLetters).contains(String.valueOf(letter));
    }

    /* Find first empty position in array of entered letters (one with code \u0000) */
    public static int findEmptyPosition(char[] enteredLetters) {
        int i = 0;
        while (enteredLetters[i] != '\u0000') i++;
        return i;
    }


}
