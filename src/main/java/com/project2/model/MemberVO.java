package com.project2.model;

import java.sql.Date;

public class MemberVO {
	
	private String memberId;        // 회원 이메일
    private String memberPw;          // 회원 비밀번호
    private String memberName;        // 회원 이름
    private String memberPhone;		//회원 전화번호
    private int adminCk;              // 관리자 확인 (0 or 1, 1은 관리자)
    private Date regDate;             // 회원가입 날짜
    private double money;             // 금액
    private double point;             // 포인트
	
    public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public int getAdminCk() {
		return adminCk;
	}
	public void setAdminCk(int adminCk) {
		this.adminCk = adminCk;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", memberPhone=" + memberPhone + ", adminCk=" + adminCk + ", regDate=" + regDate + ", money=" + money
				+ ", point=" + point + "]";
	}
	
	
    
    
}
