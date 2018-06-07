package com.tms.backend;

import org.junit.Assert;
import org.junit.Test;

import com.tns.backend.Suma;

public class SumaTest {

	@Test
	public void deberiaSumarCorrectamente(){
		Suma suma = new Suma();
		Assert.assertEquals(9,suma.sume(5, 4));
	}
}
