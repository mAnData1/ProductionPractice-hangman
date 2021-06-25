package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.HangmanModel;
import com.example.demo.model.IHangmanModel;

@Component
public class HangmanService implements IHangmanService {

	
	@Autowired
	IHangmanModel hangman;
	
	@Override
	public String GetWord() {
		return hangman.GetWord();
	}

	@Override
	public String PrintHiddnework(String word) {
	 String hiddenWord = "_";
		for (int i = 0; i < word.length() - 1; i++) {
			hiddenWord += " _ ";
		}
		return hiddenWord;
	}

	
	
}
