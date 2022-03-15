package com.te.javabasic.oops;

public class Duplicate {

	public static void main(String[] args) {
		int a[] = { 2, 6, 7, 6, 6, 2, 19, 1, 19 };
		for (int j = 0; j < a.length; j++) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[j] && i != j) {
					count++;
					a[i] = '\n';
				}
			}
			if (a[j] != '\n' && count > 0) {
				System.out.println(a[j] + "");
			}
		}
	}
}
