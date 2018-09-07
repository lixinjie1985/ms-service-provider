package com.sc.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.ms.bean.User;

/**
 * @author lixinjie
 * @since 2018-07-16
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

	@GetMapping("/user")
	public User getUser() {
		User user = new User();
		user.setId(10000L);
		user.setName("李新杰");
		return user;
	}
}
