package com.cg.feb22.oop.ex;

public class ExDemo6 {

	static void checkEligibility(int age) throws VoterNotEligibleException {
		if (age >= 18)
			System.out.println("You may vote");
		else
			throw new VoterNotEligibleException("You may not vote!");
	}

	public static void main(String[] args) {
		System.out.println("Start");

//		ExDemo6.checkEligibility(17);

		try {
			ExDemo6.checkEligibility(17);
		} catch (VoterNotEligibleException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("End");
	}
}
