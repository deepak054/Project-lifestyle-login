package com.little.life.login.vo;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class LoginRequest implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String userName;
	
	private String password;
	
	private String emailId;

	private String phoneNo;
	
	private String fullName;
	
	private List<SecurityQuestion> seurityQuestionVo;
	
	private String newPassword;
	
	private String confirmPassword;
	
	
	
	
	
	
}
