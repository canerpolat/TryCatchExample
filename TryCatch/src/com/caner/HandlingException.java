package com.caner;

public class HandlingException {

	public static void main(String[] args) {
		
		try {
		String name = null;
		name = name.toUpperCase();
		System.out.println(name);
		}
		catch ( Exception e)
		{
			System.out.println(e.toString());
		}
		finally 
		{
			System.out.println("final blo�u �al��t�.");
		}
	}
}
