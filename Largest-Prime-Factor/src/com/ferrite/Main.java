package com.ferrite;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start...");
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);

		System.out.println("Iteration method.");

		long beginTime = System.nanoTime();
		long limit = 600_851_475_143L;

		long factor = 1L;

		List<Long> primes = new ArrayList<>();

		for (long i = 2L; limit != 1L; ++i) {
			boolean notAdded = true;
			while (limit % i == 0) {
				limit /= i;
				if (notAdded) {
					primes.add(i);
					notAdded = false;
				}
			}
		}

		for (Long prime : primes) {
			factor *= prime;
		}

		System.out.println(String.format("Time: %.3f [ms]", (System.nanoTime() - beginTime) / 1000.));
		System.out.println("Largest prime factor: " + factor);

	}

}
