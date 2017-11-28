package org.fkit.domain;

import org.hibernate.validator.constraints.NotBlank;

public class StudentDomain {
	
	@NotBlank
	private String uName;
	
	@NotBlank
	private String passWord;

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
}
