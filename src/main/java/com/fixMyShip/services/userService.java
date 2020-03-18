package com.fixMyShip.services;

import com.fixMyShip.model.Answer;
import com.fixMyShip.model.Question;
import com.fixMyShip.model.User;

public interface userService {
	
	public boolean signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public boolean signOut(int userId);
    boolean postQuestion(Question question);
    boolean postAnswer(Question question);
    Question viewQuestion(Question question);
    Answer viewAnswer(Question question);
    boolean deleteQuestion(int questionId);
    User viewUser(int userId);
    
    
}
