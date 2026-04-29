package com.array;

public class EvenOddArr {
    public static void main(String[] args) {
        int nums[] = {34, 56, 35, 89, 76, 88};

        System.out.println("Even and Odd numbers:");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println("Even: " + nums[i]);
            } else {
                System.out.println("Odd: " + nums[i]);
            }
        }
    }
}