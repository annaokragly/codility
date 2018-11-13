package com.aok.codility.bitcountlnproduct;

import org.junit.Assert;
import org.junit.Test;

public class BitcountlnProductTest {

	@Test
	public void productOfZerosShouldReturnZero() {
		Assert.assertEquals(0, BitcountlnProduct.countOnes(0, 0));
	}
	
	@Test
	public void productOf3And7ShouldReturnCorrectValue() {
		Assert.assertEquals(3, BitcountlnProduct.countOnes(3, 7));
	}
	
	@Test
	public void productOfOnesShouldReturnCorrectValue() {
		Assert.assertEquals(1, BitcountlnProduct.countOnes(1, 1));
	}
	
	@Test
	public void productOf3and5ShouldReturnCorrectValue() {
		Assert.assertEquals(4, BitcountlnProduct.countOnes(3, 5));
	}
	
	@Test
	public void maxShouldReturnCorrectValue() {
		Assert.assertEquals(20, BitcountlnProduct.countOnes(100000000, 100000000));
	}
	
	@Test
	public void productOf319and53ShouldReturnCorrectValue() {
		Assert.assertEquals(5, BitcountlnProduct.countOnes(319, 53));
	}
	
	@Test
	public void borderShouldReturnCorrectValue() {
		Assert.assertEquals(0, BitcountlnProduct.countOnes(0, 100000000));
	}
	
	@Test
	public void productOfRandomNumbersShouldReturnCorrectValue() {
		Assert.assertEquals(13, BitcountlnProduct.countOnes(34589, 98237));
	}
	
	@Test
	public void productOfAnotherRandomNumbersShouldReturnCorrectValue() {
		Assert.assertEquals(12, BitcountlnProduct.countOnes(19078, 7350));
	}
	
	@Test
	public void productOf12And8ShouldReturnCorrectValue() {
		Assert.assertEquals(2, BitcountlnProduct.countOnes(12, 8));
	}
	
	@Test
	public void productOf34And7ShouldReturnCorrectValue() {
		Assert.assertEquals(6, BitcountlnProduct.countOnes(34, 7));
	}
	
	@Test
	public void productOf13And23ShouldReturnCorrectValue() {
		Assert.assertEquals(5, BitcountlnProduct.countOnes(13, 23));
	}
	
	@Test
	public void productOf93And117ShouldReturnCorrectValue() {
		Assert.assertEquals(8, BitcountlnProduct.countOnes(97, 73));
	}
}