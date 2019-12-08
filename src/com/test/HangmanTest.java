package com.test;

import org.testng.annotations.Test;

import com.ooad.Hangman;

public class HangmanTest {

  @Test
  public void main() {
	  String[] sarray = new String[5];
	  sarray[0]="m";
	  sarray[1]="a";
	  sarray[2]="n";
	  sarray[3]="g";
	  sarray[4]="o";
	  Hangman.main(new String[] {"apple", "mango", "green", "cat", "read"});
	    
  }
}
