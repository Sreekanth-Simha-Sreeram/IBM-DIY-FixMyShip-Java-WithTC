package com.fixMyShip.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import com.fixMyShip.model.User;



public class BoundaryTest {
	
	 @Test
	    public void testpasswordLength()
	    {
	        User user=new User();
	        user.setUserId(1);
	        user.setUserName("john");
	        user.setUserEmail("abc@gmail.com");
	        user.setUserPassword("1234");
	        int passwordLength=10;
	assertNotEquals(passwordLength,user.getUserPassword().length());


	    }
	 @Test
		public void testUserId()
		{
		User user=new User();
		user.setUserId(1);
        user.setUserName("john");
        user.setUserEmail("abc@gmail.com");
        user.setUserPassword("1234");
		double userId=2.5;
		Assert.assertNotSame(userId,user.getUserId());
			
		}
	 @Test
	    public void testEmail()
	    {
	        User user=new User();
	        user.setUserId(1);
	        user.setUserName("john");
	        user.setUserEmail("abc@gmail.com");
	        user.setUserPassword("1234");
	        
	        assertNotNull(user.getUserEmail());


	    }


}
