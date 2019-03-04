package com.pojo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	private ArrayList<String> answers;
	private Set<String> answersSet;
	
	private Map<Integer,String> answersMap;
	
	
	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}
	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}
	public Set<String> getAnswersSet() {
		return answersSet;
	}
	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers
				+ ", answersSet=" + answersSet + ", answersMap=" + answersMap + "]";
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public ArrayList<String> getAnswers() {
		return answers;
	}
	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}
	
	

}
