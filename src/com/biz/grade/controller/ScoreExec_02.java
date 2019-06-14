package com.biz.grade.controller;

import java.io.FileNotFoundException;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp_04;

public class ScoreExec_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String scoreFile = "src/com/biz/grade/data/score.txt";

		/*
		 * try문으로 묶여야되는 명령문이 있을 경우
		 * try문 안에서 객체나 변수를 생성하면
		 * try가 문 안에 모든 코드를 집중시켜야 한다.
		 * 
		 * 그래서 선언문과 생성문을 별도로 분리하는것이 좋다.
		 */
		ScoreService sService = null;//선언문
		try {
			sService = new ScoreServiceImp_04(10, scoreFile);//생성문
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sService.inputScore(0);
		sService.viewList();
	
		
	}

}
