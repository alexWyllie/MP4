package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaseSensitiveTest {

	@Test
	public void test1() {
		String test = "$abcd";
		IdStrategy.CaseSensitive object = new IdStrategy.CaseSensitive();
		String value = object.idFromFilename(test);
		String expected = "ꯍ";
		assertEquals(value, expected);
	}
	
	@Test
	public void test2() {
		String test = "$abcde";
		IdStrategy.CaseSensitive object = new IdStrategy.CaseSensitive();
		String value = object.idFromFilename(test);
		String expected = "ꯍe";
		assertEquals(value, expected);
	}

}
