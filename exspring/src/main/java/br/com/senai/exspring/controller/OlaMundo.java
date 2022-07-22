package br.com.senai.exspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
	@Controller
public class OlaMundo {
	@RequestMapping("/produtos")
	@ResponseBody
	public String olaaa() {
		return "Olá Mundo Produtos 2022!!";
	}
}
