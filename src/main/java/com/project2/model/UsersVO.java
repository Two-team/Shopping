package com.project2.model;

import java.util.Date;

public class UsersVO {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private Date regDate;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UsersVO [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName + ", regDate=" + regDate + "]";
	}
}
