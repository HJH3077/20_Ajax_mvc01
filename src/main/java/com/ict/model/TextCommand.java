package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TextCommand {
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		StringBuffer sb = new StringBuffer(); // 스트링을 추가시킬 때 buffer로 메모리 관리 효율 up

		// 원래는 계산 및 DB 처리
		sb.append("1, 홍길동, 24, 서울 /");
		sb.append("2, 둘리, 14, 경기도 /");
		sb.append("3, 도우너, 64, 강원도 /");
		sb.append("4, 또치, 34, 제주도");

		return sb.toString();
	}
}
