package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.ooad.*;

public class ConsoleInputTest {
  
  @Test
  public void enterLetter() {
	  char[] carray = new char[5];
	  carray[0]='m';
	  carray[1]='a';
	  carray[2]='n';
	  carray[3]='g';
	  carray[4]='o';
	  
	  String cword="apple";
	  int result=3;
	  System.out.println(" enterLetter the result is +++++" + ConsoleInput.enterLetter(cword,carray,1));
	  
	  AssertJUnit.assertEquals(result, ConsoleInput.enterLetter(cword,carray,1));
	  
  }

  @Test
  public void findEmptyPosition() {
	  char[] carray1 = new char[6];
	  carray1[0]='m';
	  carray1[1]='a';
	  carray1[2]='*';
	  carray1[3]='g';
	  carray1[4]='o';
	  System.out.println(" findEmptyPosition the result is +++++" + ConsoleInput.findEmptyPosition(carray1));
	  AssertJUnit.assertEquals(5, ConsoleInput.findEmptyPosition(carray1));
  }

  @Test
  public void inEnteredLetters() {
	  char[] carray1 = new char[5];
	  carray1[0]='m';
	  carray1[1]='a';
	  carray1[2]='n';
	  carray1[3]='g';
	  carray1[4]='o';
	  char c = 'm';
	  System.out.println("inEnteredLetters the result is +++++" + ConsoleInput.inEnteredLetters(c, carray1));
	  AssertJUnit.assertTrue(ConsoleInput.inEnteredLetters(c, carray1));  }

  @Test
  public void printWord() {
	  char[] carray1 = new char[5];
	  carray1[0]='m';
	  carray1[1]='a';
	  carray1[2]='n';
	  carray1[3]='*';
	  carray1[4]='o';
	  char c = 'm';
	  System.out.println(" printWord the result is +++++" + ConsoleInput.printWord("mango", carray1));
	  AssertJUnit.assertTrue(ConsoleInput.printWord("mango", carray1));  }

  }

