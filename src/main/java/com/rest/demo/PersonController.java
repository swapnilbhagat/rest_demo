package com.rest.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

	@RequestMapping("/uid")
	public Person greeting(@RequestParam(value = "uid") String uid) {
		return Person.newInstance(uid, "John", "Cena");
	}
}
