package com.fixMyShip.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fixMyShip.model.Answer;
import com.fixMyShip.model.Question;
import com.fixMyShip.model.User;

@Component
@Service ("guestService")
public class guestServiceImpl implements guestService {

	public boolean postQuestion(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean postAnswer(Answer answer) {
		// TODO Auto-generated method stub
		return false;
	}

	public User viewUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Question viewQuestion(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	public Answer viewAnswer(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
