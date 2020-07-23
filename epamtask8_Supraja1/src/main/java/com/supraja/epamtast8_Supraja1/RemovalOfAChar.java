package com.supraja.epamtast8_Supraja1;

public class RemovalOfAChar 
{
	boolean isThere(Character Char,Integer index)
    {
    	return (Char!='A')||(Char=='A' && index>1);
    }
	
	String removalOfAChar(String input)
	{
		String output="";
		for(int position=0;position<input.length();position++)
    	{
    		if((isThere(input.charAt(position),position)))
    		{
    			output+=input.charAt(position);
    		}
    	}
		return output;
	}
}
