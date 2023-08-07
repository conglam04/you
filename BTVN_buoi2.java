package bai22;
import java.util.Scanner;
import java.math.*;
public class Byui {
public static void main(String[] args) {
	Scanner gh = new Scanner(System.in);
////	bai 5: tinh tong  so qua toi da 
//	int a, b, c;
//	System.out.println("nhap lan luot cac loai qua : ");
//	do {
//		a = gh.nextInt();
//		b = gh.nextInt();
//		c = gh.nextInt();
//	} while (a <= 0 || b <= 0 || c <= 0);
//	System.out.println("chanh : " + a);
//	System.out.println("tao : " + b);
//	System.out.println("le : " + c);
//	int x = a / 1, y = b / 2, z = c / 4;
//	System.out.print("tong so qua toi da phai dung la : ");
//	if (x < y && x < z) {
//		System.out.println(x * 7);
//	} else if (y < x && y < z) {
//		System.out.println(y * 7);
//	} else {
//		System.out.println(z * 7);
//	}
////	bai 1: ve hinh vuong  
//	System.out.print("nhap canh n : ");
//	int n = gh.nextInt();
//	System.out.println("canh hinh vuong : " + n);
//	System.out.println("hinh vuong canh n : ");
//	for (int i = 1; i <= n; i++) {
//		for (int j = 1; j <= n; j++) {
//			if (i == 1 || i == n || j == 1 || j == n) {
//				System.out.print("*");
//			} else {
//				System.out.print(" ");
//			}
//
//		}
//		System.out.println("");
//	}
////	bai 2 : tinh P,S
//	System.out.print(" nhap n : ");
//	int n = gh.nextInt();
//	System.out.println(" n = " + n);
//	int m = 1, p = 0;
//	float s = 0;
//	for (int i = 1; i <= n; i++) {
//		s += 1.0 / i;
//		m *= i;
//		p += m;
//	}
//	System.out.println("S = " + s);
//	System.out.println("P = " + p);
//// bai 3 : kiem tra so nguyen to 
//	System.out.print("nhap n : ");
//	int n = gh.nextInt();
//	int m = 0;
//	if (n == 2) {
//		System.out.println(n + "khong la so nguyen to ");
//	} else {
//		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
//			if (n % i == 0) {
//				m++;
//			}
//		}
//		if (m == 0) {
//			System.out.println(n + " la so nguyen to  ");
//		} else {
//			System.out.println(n + " khong la so nguyen to  ");
//		}
//	}
//// bai 4 : giai phuong trinh bac 4 trung phuong 
//	System.out.println("nhap lan luot cac so nguyen :");
//	int a, b, c;
//	a = gh.nextInt();
//	b = gh.nextInt();
//	c = gh.nextInt();
//	System.out.println("a = " + a);
//	System.out.println("b = " + b);
//	System.out.println("c = " + c);
//	float dt = b * b - 4 * a * c;
//	float x1, x2;
//	if (a == 0) {
//		System.out.println("khong phai phuong trinh bac 4 !");
//	} else {
//		if (dt < 0) {
//			System.out.println("phuong trinh vo nghiem ! ");
//		} else if (dt == 0) {
//			x1 = x2 = -b / (2 * a);
//			if (x1 >= 0) {
//				System.out.println("x1 = " + x1);
//				System.out.println("x2 = " + (-x1));
//			} else {
//				System.out.println("vo nghiem ! ");
//			}
//		} else {
//			x1 = (-b - (float) Math.sqrt(dt));
//			x2 = (-b + (float) Math.sqrt(dt));
//			if (x1 >= 0 && x2 >= 0) {
//				System.out.println("x1 = " + x1);
//				System.out.println("x2 = " + (-x1));
//				System.out.println("x3 = " + x2);
//				System.out.println("x4 = " + (-x2));
//			} else if (x1 >= 0 && x2 < 0) {
//				System.out.println("x1 = " + x1);
//				System.out.println("x2 = " + (-x1));
//			} else if (x1 < 0 && x2 >= 0) {
//				System.out.println("x1 = " + x2);
//				System.out.println("x2 = " + (-x2));
//			} else {
//				System.out.println("vo nghiem ");
//			}
//
//		}
//	}
//
//}
//}
