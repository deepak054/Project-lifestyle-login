package com.little.life.login.vo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BaseVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String responseId;
	
	private String responseDesc;
	
	

	
	
	
	
}
