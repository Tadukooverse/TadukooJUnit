package com.github.tadukoo.junit;

import com.github.tadukoo.junit.constant.DefaultTestValues;

public class MappedPojoAssertDoubleGetSetCustomTest extends MappedPojoAssertValueGetSetCustomTest<Double>
		implements DefaultTestValues{
	
	public MappedPojoAssertDoubleGetSetCustomTest(){
		super(MappedPojoTest::assertDoubleGetSetCustom, DEFAULT_TEST_KEY, DEFAULT_WRONG_KEY,
				DEFAULT_TEST_DOUBLE, DEFAULT_TEST_DOUBLE_2, DEFAULT_WRONG_DOUBLE);
	}
}
