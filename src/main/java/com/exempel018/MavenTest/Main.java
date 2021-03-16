package com.exempel018.MavenTest;

public class Main {

	public static void main(String[] args) {
		MyRandomMethods mrm = new MyRandomMethods();
		
		
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBetween1and10() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBetween11and20() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBetween21and30() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBetween31and40() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.print(mrm.randomBetween41and50() +", ");
		}
		System.out.println("");

	}

}
