package com.test;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.ooad.WordReader;

public class WordReaderTest {

  @Test
  public void readLines() throws IOException {
     WordReader wr = new WordReader();
	  String[] testwords = null;
	  String filename ="C:/Users/Akshith/eclipse-workspace/ooad-assignment/words.txt ";
	  testwords[1]="apple";
	  testwords[1]="mango";
	  testwords[1]="green";
	  testwords[1]="cat";
	  testwords[1]="read";
	  AssertJUnit.assertEquals(testwords[1], wr.readLines(filename));
	  
	  
	  
  }
}
