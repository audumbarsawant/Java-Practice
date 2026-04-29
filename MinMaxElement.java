package com.array;

public class MinMaxElement 
{

	public static void main(String[] args) 
		{
			int num[]= {12,45,263,55,10,34};
			
			int min=num[0];
			int max=num[0];
	        for(int i=0;i<num.length;i++) 
	        	{
		        	if(min>num[i]) 
		        		{
		        			min=num[i];
		        		}
		        	if(max<num[i]) 
		        		{
		        			max=num[i];
		        		}
	        	}
	        System.out.println("Minimum Element from Array:"+min);
	        System.out.println("Maximum Element from Array:"+max);
		}

}
