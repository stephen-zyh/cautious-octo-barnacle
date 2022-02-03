package chapter1to3;

import java.util.Scanner;

public class Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please input a string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		char[] c = str.toCharArray();
		int[][] a = new int[str.length()][2];
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < a.length; j++) {
				//该字符未出现，将字符添加到a数组中
				if(a[j][0] ==0 && a[j][1] == 0) {
					a[j][0] = c[i];
					a[j][1] = 1;
					break;
				}else if(c[i] == a[j][0]) {
					a[j][1] += 1;
					break;
				}
			}
		}
		System.out.println("Occurrences: ");
		for(int i =0; i < a.length; i++) {
			if(a[i][1] > 0) {
				System.out.print((char)a[i][0] + ": " + a[i][1] + '\t');
			}
		}
	}

}
