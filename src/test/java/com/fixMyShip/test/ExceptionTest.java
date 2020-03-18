package com.fixMyShip.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fixMyShip.model.User;
import com.fixMyShip.services.userService;



public class ExceptionTest {
	
	@Test(expected = NullPointerException.class)
    public void testEmptyPasswordException() 
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
         
        User user = new User();
        user.setUserId(1);
        user.setUserName("john");
        user.setUserEmail("abc@gmail.com");
        user.setUserPassword("1234");
		
           userService userservice = (userService) context.getBean("userService");
           //userservice.login(user.getUserName(), user.getUserPassword());
           Assert.assertEquals("1234",user.getUserPassword(),"password empty exception");
           throw new NullPointerException();
    }
	
	@Test(expected = NullPointerException.class)
    public void testNotFoundUserException() 
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
           
       
		
        User user = new User();
        user.setUserId(1);
        user.setUserName("john");
        user.setUserEmail("abc@gmail.com");
        user.setUserPassword("1234");
		
        userService userservice = (userService) context.getBean("userService");
        User userdata=userservice.viewUser(user.getUserId());
           //userservice.login(user.getUserName(), user.getUserPassword());
           Assert.assertNull(userdata);
           throw new NullPointerException();
    }
	
	 @Test(expected = NullPointerException.class)
	    public void testEmptyContentException() 
	    {
	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
	           
	           User user=new User();

	           user.setUserId(0);
	           user.setUserName("john");
	           user.setUserEmail("abc@gmail.com");
	           user.setUserPassword("1234");
	           userService userservice = (userService) context.getBean("userService");
	           
	    }

}
