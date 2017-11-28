package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0 
 * 
 */

public class User implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@NotNull
	@Valid
	private StudentDomain student;
	
	@NotBlank
	private String loginname;
	
	@NotBlank
	@Length(min=6,max=8)
	private String password;
	
	@NotBlank
	private String username;
	
	@Range(min=15, max=60)
	private int age;
	
	@Email
	private String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past
	private Date birthday;
	
	@Pattern(regexp="[1][3,8][3,6,9][0-9]{8}")
	private String phone;
	
	@Digits(integer=3, fraction=2)
	private Double money;
	
	public Double getMoney() {
		return money;
	}


	public void setMoney(Double money) {
		this.money = money;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getLoginname() {
		return loginname;
	}


	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public StudentDomain getStudent() {
		return student;
	}


	public void setStudent(StudentDomain student) {
		this.student = student;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", student=" + student + ", loginname=" + loginname + ", password=" + password
				+ ", username=" + username + ", age=" + age + ", email=" + email + ", birthday=" + birthday + ", phone="
				+ phone + ", money=" + money + "]";
	}


}
