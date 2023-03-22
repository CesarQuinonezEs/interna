package uabc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GettingController {

	@GetMapping("/")
	public String main() {
		return "index";
	}
}
