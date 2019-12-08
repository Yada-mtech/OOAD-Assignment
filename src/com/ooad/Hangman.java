package com.ooad;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
	
    private static int counter = 0;
	private static int successCounter=0;

	public static void main(String[] args) {
        String[] words = null;
        WordReader readFile = new WordReader();
        String filename = "C:/Users/Akshith/git/OOAD-Assignment/words.txt";
        try {
        	words=readFile.readLines(filename);
        }catch(IOException e)
        {
        	System.out.println("Unable to find the file "+ filename+" :" + e.getMessage());
        }
        
        // Pick random index of words array
        int randomWordNumber = (int) (Math.random() * words.length);
        // Create an array to store already entered letters
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        
        boolean wordIsGuessed = false;
        do {
        // infinitely iterate through cycle as long as enterLetter returns true
        // if enterLetter returns false that means user guessed all the letters
        // in the word e. g. no asterisks were printed by printWord
        switch (ConsoleInput.enterLetter(words[randomWordNumber], enteredLetters, counter)) {
            case 0:
                triesCount++;
                counter++;
                break;
            case 1:
                triesCount++;
                successCounter++;
                break;
            case 2:
                break;
            case 3:
                wordIsGuessed = true;
                break;
        }
        } while (! wordIsGuessed);
        System.out.println("\nThe word is " + words[randomWordNumber] +
            " You missed " + (triesCount - successCounter) +
            " time(s)");
    }

}