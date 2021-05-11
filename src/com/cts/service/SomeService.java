package com.cts.service;

import com.cts.model.Model;

public class SomeService {
	public String saySomething() {
		Model model=new Model();
		model.setSender("AJ013");
		model.setMessage("Good Afternoon!!!");
		return model.toString();
	}

}
