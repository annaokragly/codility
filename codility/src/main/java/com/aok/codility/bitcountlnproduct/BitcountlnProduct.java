package com.aok.codility.bitcountlnproduct;

public class BitcountlnProduct {

	public static int countOnes(Integer A, Integer B) {
		return Long.toBinaryString(Long.valueOf(A) * Long.valueOf(B)).replaceAll("0", "").length();
	}
}
