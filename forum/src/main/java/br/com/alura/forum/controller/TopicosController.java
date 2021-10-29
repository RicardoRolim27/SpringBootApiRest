package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> listaTopicos(){
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("programação", "Spring"));
		
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
	}

}
