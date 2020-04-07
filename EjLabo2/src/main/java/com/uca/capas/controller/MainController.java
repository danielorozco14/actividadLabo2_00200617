package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.*;

@Controller
public class MainController {

	@GetMapping("/agregarUsuario")
	public String enviarFormulario(Usuario usuario) {
		return "agregarUsuario";
	}
	
	@PostMapping("/agregarUsuario")
	public String procesarFormulario(Usuario usuario) {
		return "mostrarMensaje";
	}	
	
	
}
