package myfirstmaven.HelloMaven;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 

{
	
@Test
	public void testApp()
    
{
       
 assertEquals(0,new App().calculateSomething());
 
   }

}
