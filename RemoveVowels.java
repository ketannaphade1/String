package com.yash.StringPrograms;

//3.WAP to remove all the vowels from the given string.

public class RemoveVowels {

	public static void main(String[] args) {

		String str = "yashtechnology";

		char[] a = str.toCharArray();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

				continue;

			}

			System.out.print(a[i]+" ");

		}

	}
}
