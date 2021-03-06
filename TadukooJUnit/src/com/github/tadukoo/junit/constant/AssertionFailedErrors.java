package com.github.tadukoo.junit.constant;

import com.github.tadukoo.util.StringUtil;

/**
 * Assertion Failed Errors contains helper methods for creating Assertion Failed Error messages as well as
 * several common error messages.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public enum AssertionFailedErrors{
	
	/** The error you get when an assertTrue fails - {@code expected: <true> but was: <false>} */
	ASSERT_TRUE_ERROR(buildAssertError(true, false)),
	/** The error you get when an assertFalse fails - {@code expected: <false> but was: <true>} */
	ASSERT_FALSE_ERROR(buildAssertError(false, true)),
	/** The error you get when an assertNotNull fails - {@code expected: not <null>} */
	ASSERT_NOT_NULL_ERROR(buildAssertErrorNot(null));
	
	/** The error string */
	private final String error;
	
	/**
	 * Creates a new Assertion Failed Error with the given error string
	 *
	 * @param error The error string
	 */
	AssertionFailedErrors(String error){
		this.error = error;
	}
	
	/**
	 * Builds an Assertion Failed Error string of the form: {@code expected: not <value>}
	 *
	 * @param expectedNot The value we're expecting to be false
	 * @return A string representing an Assertion Failed Error string
	 */
	public static String buildAssertErrorNot(Object expectedNot){
		return "expected: not <" + StringUtil.convertToString(expectedNot) + ">";
	}
	
	/**
	 * Builds an Assertion Failed Error string of the form: {@code expected: <expected> but was: <actual>}
	 *
	 * @param expected The value we're expecting
	 * @param actual The actual value
	 * @return A string representing an Assertion Failed Error string
	 */
	public static String buildAssertError(Object expected, Object actual){
		return "expected: <" + StringUtil.convertToString(expected) + "> but was: " +
				"<" + StringUtil.convertToString(actual) + ">";
	}
	
	/**
	 * @return The error string
	 */
	@Override
	public String toString(){
		return error;
	}
}
