package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ac2 {


		@RequestMapping(value = "/divisao/{valor1}/{valor2}", method = RequestMethod.GET)
		public double dividir(@PathVariable double valor1, @PathVariable double valor2 ) {

		double resultado;
		resultado = valor1 / valor2;
		
		return resultado;

		}
}
		
