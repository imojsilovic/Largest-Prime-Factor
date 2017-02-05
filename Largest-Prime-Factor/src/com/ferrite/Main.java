package com.ferrite;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start...");
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);

		System.out.println("Iteration method.");

		long beginTime = System.nanoTime();
		long limit = 357_600_851_475_143L;

		long factor = 2L;

		for (; limit != 1L; ++factor) {
			while (limit % factor == 0) {
				limit /= factor;
			}
		}

		System.out.println(String.format("Time: %.3f [ms]", (System.nanoTime() - beginTime) / 1_000_000.));
		System.out.println("Largest prime factor: " + --factor);

		System.out.println("End.");

	}

}
