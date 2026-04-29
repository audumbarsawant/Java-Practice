package com.array;

public class SumOfArray {

	public static void main(String[] args) {
    
		 int numbers[]= {100,200,300,400};
		 int sum=0;
		 for(int i=0;i<numbers.length;i++) {
			 sum=sum+numbers[i];
		 }
   System.out.println("Sum:"+sum);
	}

}
