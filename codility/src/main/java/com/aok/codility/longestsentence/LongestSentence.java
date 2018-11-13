package com.aok.codility.longestsentence;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestSentence {
	public static int calculate(String S) {
		if (S == null) return 0;
		String[] sentences = Arrays.stream(S.split("\\?|\\.|\\!")).map(String::trim).toArray(String[]::new);

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < sentences.length; i++) {

			String[] words = sentences[i].split(" ");
			words = Arrays.stream(words).filter(value -> value.length() > 0).toArray(size -> new String[size]);

			result.add(words.length);
		}

		return Collections.max(result);
	}
}
