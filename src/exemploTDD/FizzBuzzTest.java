package exemploTDD;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void test_1(){	
		FizzBuzz fb = new FizzBuzz();	
		//da 1 como entrada e da um como resposta
		Assert.assertEquals(1,fb.fizzBuzz(1));	
	}
	
	@Test
	public void test_2(){	
		FizzBuzz fb2 = new FizzBuzz();
		Assert.assertEquals(2,fb2.fizzBuzz2(2));	
	}
	
	@Test
	public void test_3(){	
		FizzBuzz fb3 = new FizzBuzz();
		Assert.assertEquals("fizz",fb3.fizzBuzz3(3));	
	}
	
	@Test
	public void test_5(){	
		FizzBuzz fb = new FizzBuzz();
		//5 como entrada e a resposta esperada é buzz
		Assert.assertEquals("buzz",fb.fizzBuzz4(5));	
	}
	
	@Test
	public void test_9(){	
		FizzBuzz fb3 = new FizzBuzz();
		Assert.assertEquals("fizz",fb3.fizzBuzz3(9));	
	}
	
	@Test
	public void test_10(){	
		FizzBuzz fb3 = new FizzBuzz();
		Assert.assertEquals("fizz",fb3.fizzBuzz3(9));	
	}
	
	@Test
	public void test_15(){	
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("vizzbuzz",fb.fizzBuzz4(15));	
	}
	
	@Test
	public void test_30(){	
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("vizzbuzz",fb.fizzBuzz4(30));	
	}
	
	



}
