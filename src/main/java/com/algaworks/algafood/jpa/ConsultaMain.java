package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class ConsultaMain {

	public static void main(String[] args) {
		
		ApplicationContext ap = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		CadastroCozinha cc = ap.getBean(CadastroCozinha.class);
		
		Cozinha c1 = new Cozinha();
		c1.setNome("Brasilerira");
		
		Cozinha c2 = new Cozinha();
		c2.setNome("Japonesa");
		
		Cozinha c1a = cc.adicionar(c1);
		Cozinha c2a = cc.adicionar(c2);
		
		System.out.printf("%d - %s\n", c1a.getId(),  c1a.getNome());
		System.out.printf("%d - %s\n", c2a.getId(),  c2a.getNome());
		
	}
	
}
