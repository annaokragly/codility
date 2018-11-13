package com.aok.codility.skylinepaint;

import org.junit.Assert;
import org.junit.Test;

public class SkylinePaintTest {

	@Test
	public void arrayOf1And2ShouldReturn2() {
		Assert.assertEquals(2, SkylinePaint.brushstrokes(new Integer[] { 1, 2 }));
	}

	@Test
	public void exampleArrayShouldReturnCorrectValue() {
		Assert.assertEquals(9, SkylinePaint.brushstrokes(new Integer[] { 1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2 }));
	}

	@Test
	public void whenStrokesExceedsThenShouldReturnMinusOne() {
		Assert.assertEquals(-1, SkylinePaint.brushstrokes(new Integer[] { 1, 200000, 1, 1000000000 }));
	}

	@Test
	public void arrayOf5And8ArrayShouldReturn8() {
		Assert.assertEquals(8, SkylinePaint.brushstrokes(new Integer[] { 5, 8 }));
	}

	@Test
	public void anotherSimpleArrayShouldReturnCorrectValue() {
		Assert.assertEquals(8, SkylinePaint.brushstrokes(new Integer[] { 1, 8, 1 }));
	}

	@Test
	public void arrayOfOnesShouldReturnOne() {
		Assert.assertEquals(1, SkylinePaint.brushstrokes(new Integer[] { 1, 1, 1, 1 }));
	}

	@Test
	public void arrayOfThreesShouldReturnThree() {
		Assert.assertEquals(3, SkylinePaint.brushstrokes(new Integer[] { 3, 3, 3, 3, 3, 3, 3 }));
	}

	@Test
	public void weirdArrayShouldReturnCorrectValue() {
		Assert.assertEquals(223, SkylinePaint.brushstrokes(new Integer[] { 21, 45, 78, 32, 90, 1, 88 }));
	}

	@Test
	public void arrayOfOnesAndTensArrayShouldReturnCorrectValue() {
		Assert.assertEquals(28, SkylinePaint.brushstrokes(new Integer[] { 1, 10, 1, 10, 1, 10, 1 }));
	}

	@Test
	public void arrayOf800ShouldReturnCorrectValue() {
		Assert.assertEquals(800, SkylinePaint.brushstrokes(new Integer[] { 800, 8, 1 }));
	}

	@Test
	public void anotherWeirdArrayShouldReturnCorrectValue() {
		Assert.assertEquals(69556, SkylinePaint.brushstrokes(new Integer[] { 11, 23904, 21, 45673, 4 }));
	}

	@Test
	public void arrayOfHundredsShouldReturnCorrectValue() {
		Assert.assertEquals(1000,
				SkylinePaint.brushstrokes(new Integer[] { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 }));
	}

	@Test
	public void arrayOf9to1to9ShouldReturnCorrectValue() {
		Assert.assertEquals(17,
				SkylinePaint.brushstrokes(new Integer[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
	}

}
