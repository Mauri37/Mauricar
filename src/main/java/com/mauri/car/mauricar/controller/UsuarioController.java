package com.mauri.car.mauricar.controller;

import javax.annotation.Resource;

import org.springframework.data.web.JsonPath;

import com.mauri.car.mauricar.produto.model.Produto;

@Resource
public class UsuarioController {

	@JsonPath("/")
	public void  index() {
		new Produto().lista();
	}

}

