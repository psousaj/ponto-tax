package br.com.pontotax.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pessoas")
public class EmployeeController {

	@GetMapping
	public String main() {
		return "index";
	}
}
