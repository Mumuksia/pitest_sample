/**
 * Copyright Flexpay AB
 */
package com.mutant.kata;

public class Calculator {

	public static int add(final String input){
		if (input.isEmpty())
			return 0;

		if (input.contains("//[")){
			Integer tokens = parseDelimitedValues(input.substring(input.lastIndexOf("]")+1), String.valueOf(input.substring(3, input.lastIndexOf("]"))));
			if (tokens != null)
				return tokens;
		}

		if (input.contains("//")){
			Integer tokens = parseDelimitedValues(input.substring(3), String.valueOf(input.charAt(2)));
			if (tokens != null)
				return tokens;
		}

		Integer tokens = parseDelimitedValues(input, ",");
		if (tokens != null)
			return tokens;

		tokens = parseDelimitedValues(input, "#");
		if (tokens != null)
			return tokens;


		return toInt(input);
	}

	private static Integer parseDelimitedValues(final String input, final String delimiter) {
		if (input.contains(delimiter)){
			int sum = 0;
			for (String token : input.split(delimiter)){
				int number = toInt(token);
				if (number < 0)
					throw new IllegalArgumentException();
				sum += number>1000?0:number;
			}

			return sum;
		}
		return null;
	}

	private static int toInt(final String input) {
		return Integer.parseInt(input);
	}
}
