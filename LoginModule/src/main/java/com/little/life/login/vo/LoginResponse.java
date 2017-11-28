package com.little.life.login.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class LoginResponse extends BaseVo {

	private String userName;
	
}
