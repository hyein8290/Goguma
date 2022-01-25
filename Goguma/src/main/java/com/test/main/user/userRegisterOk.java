package com.test.main.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.main.user.UserDAO;
import com.test.main.user.UserDTO;

@WebServlet("/user/userregisterok.do")
public class userRegisterOk extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		//1.
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String lv = req.getParameter("lv");
		
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String birth = req.getParameter("birth");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		
		//2.
		UserDAO dao = new UserDAO();
		
		UserDTO dto = new UserDTO();
		
		dto.setId(id);
		dto.setPw(pw);
		dto.setLv(lv);
		
		int result = dao.userregisterok(dto);
		
		UserDTO dto1 = new UserDTO();
		
		dto1.setId(id);
		dto1.setName(name);
		dto1.setAddress(address);
		dto1.setTel(tel);
		dto1.setEmail(email);
		dto1.setBirth(birth);
		dto1.setGender(gender);

		
		int result1 = dao.userinforegisterok(dto1);
		
		if (result == -1 || result1 == -1) {
			
			PrintWriter script = resp.getWriter();
			script.println("<script>");
			script.println("alert('이미 존재하는 아이디입니다.')");
			script.println("history.back();");
			script.println("</script>");
		
		} else {
			PrintWriter script = resp.getWriter();
			script.println("<script>");
			script.println("location.href = 'userregisterok.jsp'");
			script.println("</script>");
			
		}

	}
	
}
