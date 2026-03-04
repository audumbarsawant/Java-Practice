package com.operators;

public class Operator1 {

		    public static void main(String[] args) {

		        int a = 10; 
		        a += 5; 
		        a -= 3; 
		        a *= 2; 
		        a /= 4; 
		        System.out.println(a); // 6


		        int a2 = 5, b2 = 10, c2 = 15;
		        System.out.println((a2 < b2) && (b2 < c2)); // true


		        System.out.println((5 > 10) || (10 < 15)); // true
		        System.out.println(!(5 < 15)); // false


		        int x = 10, y = 20;
		        System.out.println(x++ + ++y); // 31


		        int a3 = 5, b3 = 2;
		        System.out.println(a3 % b3); // 1


		        int p = 7, q = 3;
		        System.out.println(p * q + p / q); // 23


		        int n = 5;
		        System.out.println(++n + n++); // 12


		        int x2 = 5, y2 = 10;
		        System.out.println(x2 > y2 ? x2 : y2); // 10


		        int a4 = 10, b4 = 5, c4;
		        c4 = a4++ + --b4 + a4 * b4;
		        System.out.println(c4); // 58


		        int a5 = 4, b5 = 2;
		        System.out.println(a5 << b5); // 16


		        int a6 = 8, b6 = 2;
		        System.out.println(a6 >> b6); // 2


		        int a7 = 10;
		        System.out.println(~a7); // -11


		        int a8 = 5, b8 = 7;
		        System.out.println(a8 & b8); // 5


		        int a9 = 5, b9 = 7;
		        System.out.println(a9 | b9); // 7


		        int a10 = 5, b10 = 7;
		        System.out.println(a10 ^ b10); // 2


		        int a11 = 10;
		        System.out.println(a11++ + ++a11 + a11--); // 32


		        int a12 = 1;
		        a12 += a12++ + ++a12;
		        System.out.println(a12); // 5


		        int a13 = 5, b13 = 10;
		        boolean result = (a13 < b13) ? true : false;
		        System.out.println(result); // true


		        int a14 = 5, b14 = 10;
		        System.out.println(a14 == b14); // false


		        int a15 = 3, b15 = 2;
		        System.out.println(a15 * b15 + a15 / b15); // 7


		        int a16 = 5;
		        a16 = a16++ + ++a16;
		        System.out.println(a16); // 12


		        int a17 = 10, b17 = 5;
		        System.out.println(a17 > b17 && a17 != b17); // true


		        int x3 = 2, y3 = 3;
		        x3 *= y3 + 1;
		        System.out.println(x3); // 8


		        int a18 = 5;
		        a18 += a18 -= a18 *= a18;
		        System.out.println(a18); // -15


		        int a19 = 4, b19 = 3;
		        System.out.println(a19 > b19 ? a19++ : ++b19); // 4


		        int a20 = 5;
		        System.out.println(a20++ + a20++ + ++a20); // 19


		        int a21 = 2, b21 = 3;
		        System.out.println(a21 + b21 * a21 / b21); // 4


		        int a22 = 10, b22 = 20;
		        System.out.println(a22 < b22 && b22 > a22); // true


		        int a23 = 6, b23 = 2;
		        System.out.println((a23 / b23) * (a23 % b23)); // 0


		        int a24 = 5, b24 = 10, c24 = 15;
		        System.out.println((a24 < b24 && b24 > c24) || !(b24 < c24)); // false

		    }
		

	}


