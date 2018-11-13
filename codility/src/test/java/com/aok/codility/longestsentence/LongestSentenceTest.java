package com.aok.codility.longestsentence;

import org.junit.Assert;
import org.junit.Test;

public class LongestSentenceTest {

	@Test
	public void emptyStringShouldReturnZero() {
		Assert.assertEquals(0, LongestSentence.calculate(""));
	}
	
	@Test
	public void nullShouldReturnZero() {
		Assert.assertEquals(0, LongestSentence.calculate(null));
	}

	@Test
	public void normalTextShouldReturnCorrectValue() {
		Assert.assertEquals(4, LongestSentence.calculate("We test coders. Give us a try?"));
	}

	@Test
	public void multipleDotsShouldReturnCorrectValue() {
		Assert.assertEquals(2, LongestSentence.calculate("Forget CSs...Save time . x x"));
	}
	
	@Test
	public void emptySentencesShouldReturnCorrectValue() {
		Assert.assertEquals(0, LongestSentence.calculate("        .      ?    !  "));
	}
	
	@Test
	public void multipleSpacesInsideSentenceShouldReturnCorrectValue() {
		Assert.assertEquals(8, LongestSentence.calculate("Lorem     ipsum dolor    sit amet, consectetuer  adipiscing elit. Aenean   commodo ligula eget dolor. Aenean massa. ."));
	}
	
	@Test
	public void multipleCommasShouldReturnCorrectValue() {
		Assert.assertEquals(7, LongestSentence.calculate("Nullam dictum, felis eu pede, mollis pretium. Integer tincidunt. Cras dapibus. "));
	}
	
	@Test
	public void mixedPunctuationMarksShouldReturnCorrectValue() {
		Assert.assertEquals(6, LongestSentence.calculate("You bought a new car???!!! Are you out of your mind?!"));
	}
	
	@Test
	public void multiplePunctuationMarksShouldReturnCorrectValue() {
		Assert.assertEquals(5, LongestSentence.calculate("I am sick!!! I cannot go to school..."));
	}
	
	@Test
	public void weirdMarksShouldReturnCorrectValue() {
		Assert.assertEquals(6, LongestSentence.calculate("@#$tft5 4^$%^356 5#$%?  354 %#$^!#$ 4$%#$%  grrt #$%;' # >$%^"));
	}
	
}