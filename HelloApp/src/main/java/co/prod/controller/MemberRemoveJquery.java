package co.prod.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.prod.common.Control;
import co.prod.vo.MembersVO;

public class MemberRemoveJquery implements Control {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String[] members = request.getParameterValues("memberId");
		for (String member : members)
			System.out.println(member);
		return null;
	}

}
