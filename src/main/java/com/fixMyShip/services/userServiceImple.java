package com.fixMyShip.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fixMyShip.model.Answer;
import com.fixMyShip.model.Question;
import com.fixMyShip.model.User;
@Component
@Service ("userService")
public class userServiceImple implements userService {

	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signIn(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signOut(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean postQuestion(Question question) {
		return false;
		// TODO Auto-generated method stub
		
	}

	public boolean postAnswer(Question question) {
		return false;
		// TODO Auto-generated method stub
		
	}

	public Question viewQuestion(Question question) {
		return question;
		// TODO Auto-generated method stub
		
	}

	public Answer viewAnswer(Question question) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public void deleteQuestion(int questionId) {
		// TODO Auto-generated method stub
		
	}

	public User viewUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
