package com.supraja.epamtast8_Supraja1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemovalOfACharTest 
{

	
	/*
	 * emptyString: "" -> "" 
	 * singleA: "A" -> ""    
	 * twoA's: "AA" -> ""  
	 * 3 A's: "AAA"->"A"
	 * A only at position 2: "BA" -> "B"  
	 * A only at position 1: "AB" -> "B"
	 * string starting with 2 A's : "AABECDA" -> "BECDA" 
	 * string without any starting 2 A's: "BCDAAA"->"BCDAAA"
	 */
	static RemovalOfAChar removeA;
	@Test
	public void emptyString() {
		removeA=new RemovalOfAChar();
		assertEquals("",removeA.removalOfAChar(""));
	}
	@Test
	public void singleAOfLength1()
	{
		removeA=new RemovalOfAChar();
		assertEquals("",removeA.removalOfAChar("A"));
	}
	@Test
	public void doubleAAtStartingTwoPositions()
	{
		removeA=new RemovalOfAChar();
		assertEquals("",removeA.removalOfAChar("AA"));
	}
	@Test
	public void stringWith3A()
	{
		removeA=new RemovalOfAChar();
		assertEquals("A",removeA.removalOfAChar("AAA"));
	}
	@Test
	public void stringOfSize2HavingAAtIndex0()
	{
		removeA=new RemovalOfAChar();
		assertEquals("B",removeA.removalOfAChar("AB"));
	}
	@Test
	public void stringOfSize2HavingAAtIndex1()
	{
		removeA=new RemovalOfAChar();
		assertEquals("B",removeA.removalOfAChar("BA"));
	}
	@Test
	public void stringWithStarting2A()
	{
		removeA=new RemovalOfAChar();
		assertEquals("BCDA",removeA.removalOfAChar("AABCDA"));
	}
	@Test
	public void RandomString()
	{
		removeA=new RemovalOfAChar();
		assertEquals("BCDAAA",removeA.removalOfAChar("BCDAAA"));
	}
}
