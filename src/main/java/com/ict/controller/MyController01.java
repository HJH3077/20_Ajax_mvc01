package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.TextCommand;

@WebServlet("/MyController01")
public class MyController01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// 해당 문서의 타입 설정 : text일 경우
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 정보를 여기서 출력
		// ajax에게 정보를 전달하는 페이지
		
		// 자바에서 처리하고 보낸 결과를 받는다
		// out.println("1, 홍길동, 24, 서울 / 2, 둘리, 14, 경기도 / 3, 도우너, 64, 강원도/ 4, 또치, 34, 제주도");
		TextCommand tc = new TextCommand();
		String msg = tc.exec(request, response);
		out.println(msg); // 여기서 멈춤, 이 페이지에 정보가 받아진 상태(다른 곳에 보낸 정보 X)
		
		// 핵심은 MyController가 항상 돌아가고 있음, index를 실행해도 MyController가야 작동하는게 아니라 
		// 작동은 이미하고있고 index에서 MyController가서 정보를 가져오는 방식이 됨
		// *** out.println()으로 현재 페이지에 정보를 뿌려야 가져올 수 있음 
		 
		
		
	}
}
