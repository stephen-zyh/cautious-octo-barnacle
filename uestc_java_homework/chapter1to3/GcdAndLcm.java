package chapter1to3;

import java.util.Scanner;

public class GcdAndLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input two numbers: ");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		GcdAndLcm gal = new GcdAndLcm(m, n);
		System.out.println("gcd: " + gal.gcd(m, n));
		System.out.println("lcm: " + gal.lcm(m, n));
		scanner.close();
	}
	
	public int m;
	public int n;
	public GcdAndLcm(int m, int n) {
		super();
		this.m = m;
		this.n = n;
	}
	//欧几里得算法（辗转相除法）
	public int gcd(int a, int b) {
		int r;
		if(a >= b) {
			while(b != 0) {
				r = a % b;
				a = b;
				b = r; 
			}
			return a;
		}else {
			while(a != 0) {
				r = b % a;
				b = a;
				a = r;
			}
			return b;
		}
		
	}
	public int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
