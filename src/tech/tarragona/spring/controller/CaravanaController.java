package tech.tarragona.spring.controller;

import java.sql.Time;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.model.Caravana;
import tech.tarragona.spring.service.Caravanaservice;



@Controller
@RequestMapping(value = "/caravana")
public class CaravanaController {

	@Autowired
	Caravanaservice caravanaService;
	
	@GetMapping("/caravana")
	public String addCaravana(Model model) {
		
		model.addAttribute("caravana", new Caravana());
		return "5.1";
	}
	@PostMapping("/caravana")
	public String addCaravana(@Valid @ModelAttribute("caravana") Caravana caravana, BindingResult result, Model model){
		
		
		caravanaService.addCaravana(caravana);
		return "paginaDePruebas";
	}
	
	
}