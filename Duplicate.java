package com.array;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) 
	{
		int vals[]= {23,45,34,67,23,45};
		System.out.println("Duplicate elements from array are :");
		for(int i=0;i<vals.length-1;i++) 
		{
			Arrays.sort(vals);
			if(vals[i]==vals[i+1]) 
			{
				System.out.println(vals[i]);
			}
		}

	}

}
