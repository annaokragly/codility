package com.aok.codility.skylinepaint;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SkylinePaint {

	public static int brushstrokes(Integer[] A) {
		List<Integer> list = Arrays.asList(A);
		Integer height = Collections.max(list);
		Integer brushstrokes = 0;

		for (int i = 1; i <= height; i++) {
			Boolean isPainting = false;
			for (int j = 0; j < A.length; j++) {
				if (A[j] >= i) {
					if (isPainting == false) {
						brushstrokes++;
						isPainting = true;
						if (brushstrokes > 1000000000)
							return -1;
					}
				} else
					isPainting = false;
			}
		}
		return brushstrokes;
	}
}