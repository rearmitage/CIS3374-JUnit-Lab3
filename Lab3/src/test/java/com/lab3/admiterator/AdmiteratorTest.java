package com.lab3.admiterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdmiteratorTest {

	@Test
	@Parameters(method = "method for params")
	public void test(Type paramter1 Type parameter2) {
		fail("Not yet implemented");
	}
	
	private object method_for_params()
	{
		return new Object[][]{{arg1_for_run1, arg2_for_run1, etc...},
				{arg1_for_run2, arg2_for_run2, etc...} };
		}
	}

}
