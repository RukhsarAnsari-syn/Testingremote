package primeFactorsTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import primefactor.primefactorcode;

class primeFactorTest {
	
	private List<Integer> list(Integer...integers){
    	return Arrays.asList(integers);
    }
	
	@Test
	public void testone() {
		assertEquals(list(),primefactorcode.generate(1));
	}
	
	@Test
	public void testtwo() throws Exception {
		assertEquals(list(2),primefactorcode.generate(2));
	}
	
	@Test
	public void testthree() throws Exception {
		assertEquals(list(3),primefactorcode.generate(3));
	}
	
	@Test 
	public void testfour() throws Exception{
		assertEquals(list(2,2),primefactorcode.generate(4));
	}
	
	@Test
	public void testsix() throws Exception{
	    assertEquals(list(2,3),primefactorcode.generate(6));	
	}
	
	@Test
	public void testeight() throws Exception{
		assertEquals(list(2,2,2),primefactorcode.generate(8));
	}
	
	@Test
	public void testnine() throws Exception{
	   assertEquals(list(3,3),primefactorcode.generate(9));
    }
}