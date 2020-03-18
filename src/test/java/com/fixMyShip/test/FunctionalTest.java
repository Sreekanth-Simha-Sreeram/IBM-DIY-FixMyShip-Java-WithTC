package com.fixMyShip.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fixMyShip.model.Answer;
import com.fixMyShip.model.Question;
import com.fixMyShip.model.User;
import com.fixMyShip.services.guestService;
import com.fixMyShip.services.userService;
import com.mentor.hibernate.model.Mentor;
import com.mentor.hibernate.service.MentorService;

import junit.framework.Assert;




public class FunctionalTest {
	
	@Test
	public void testSignUp()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");

		User user = new User();
		userService userservice=(userService) context.getBean("userService");
		userservice.signUp(user);
		boolean userfromdb =userservice.signUp(user);
		assertSame(user,userfromdb);
	}

	@Test
	public void testSignIn()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");

		User user = new User();
		
		
		userService userservice=(userService) context.getBean("userService");
		userservice.signIn(user.getUserName(),user.getUserPassword());
		boolean userfromdb =userservice.signIn(user.getUserName(),user.getUserPassword());
		assertSame(true,userfromdb);
	}
	
	public void testViewUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		User user = new User();
        user.setUserId(1);
        user.setUserName("john");
        user.setUserEmail("abc@gmail.com");
        user.setUserPassword("1234");
		
		userService userservice=(userService) context.getBean("userService");
		User Userfromdb =userservice.viewUser(user.getUserId());
		assertEquals("1",Userfromdb);
	}
	
	public void testViewQuestions() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		Question question = new Question();
		question.setQuestionId(1);
		question.setQuestionDescription("what is a relationship");
		
		userService userservice=(userService) context.getBean("userService");
		Question Questionfromdb =userservice.viewQuestion(question);
		assertEquals("1",Questionfromdb);
	}
	
	public void testViewAnswer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		Question question = new Question();
		Answer answer = new Answer();
		answer.setAnswerId(1);
		answer.setAnswerDetails("abcdef");
		
		userService userservice=(userService) context.getBean("userService");
	Answer answerfromdb =userservice.viewAnswer(question);
		assertEquals("1",answerfromdb);
	}
	
	@Test
	public void testPostQuestion()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
		Question question = new Question();
		User user = new User();
		
		question.setQuestionId(1);
		question.setQuestionDescription("what is a relationship");
		
		userService userservice=(userService) context.getBean("userService");
		boolean isPosted =userservice.postQuestion(question);
		assertEquals("1",isPosted,"Should be posted");

	
	}
	@Test
	public void testPostAnswer()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
		Answer answer = new Answer();
		Question question = new Question();
		User user = new User();
		
		answer.setAnswerId(1);
		answer.setAnswerDetails("abcdef");
		
		userService userservice=(userService) context.getBean("userService");
		boolean isPosted =userservice.postAnswer(question);
		assertEquals("1",isPosted,"Should be posted");

	
	}
	
	@Test
	public void testPostGuestAnswer()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
		Answer answer = new Answer();
		User user = new User();
		
		answer.setAnswerId(1);
		answer.setAnswerDetails("abcdef");
		
		guestService guestservice=(guestService) context.getBean("guestService");
		boolean isPosted =guestservice.postAnswer(answer);
		assertEquals("1",isPosted,"Should be posted");

	
	}
	
	@Test
	public void testPostGuestQuestion()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
		Question question = new Question();
		User user = new User();
		
		question.setQuestionId(1);
		question.setQuestionDescription("what is a relationship");
		
		guestService guestservice=(guestService) context.getBean("guestService");
		boolean isPosted =guestservice.postQuestion(question);
		assertEquals("1",isPosted,"Should be posted");

	
	}
	
	public void testGuestViewUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		User user = new User();
        user.setUserId(1);
        user.setUserName("john");
        user.setUserEmail("abc@gmail.com");
        user.setUserPassword("1234");
		
		guestService guestservice=(guestService) context.getBean("guestService");
		User Userfromdb =guestservice.viewUser(user.getUserId());
		assertEquals("1",Userfromdb);
	}
	
	@Test
	public void testDeleteQuestion() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		Question question = new Question();
		question.setQuestionId(1);
		question.setQuestionDescription("what is a relationship");
		
		userService userservice=(userService) context.getBean("userService");
		boolean isdeleted = userservice.deleteQuestion(question.getQuestionId());
		assertEquals("12",isdeleted,"should deactivated from db");
	}
	
	
}
