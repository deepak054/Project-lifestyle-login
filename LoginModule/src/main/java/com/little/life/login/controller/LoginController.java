package com.little.life.login.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.little.life.login.vo.LoginRequest;
import com.little.life.login.vo.LoginResponse;

@RestController
@RequestMapping(path="/login")
public class LoginController {

	
	@RequestMapping(value="/dologin",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LoginResponse login(@Valid @RequestBody LoginRequest loginRequest) {
		return null;
	}
	
	@RequestMapping(value="/retrievUserName",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LoginResponse getUserName(@Valid @RequestBody LoginRequest loginRequest) {
		return null;
	}
	
	@RequestMapping(value="/resetPassword",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LoginResponse resetPassword(@Valid @RequestBody LoginRequest loginRequest) {
		return null;
	}
	
	
	
	
	
}
