package com.projetodb.MultDatasources.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetodb.MultDatasources.entity.mysql.MySQLCliente;
import com.projetodb.MultDatasources.service.MySQLClienteService;
/**
 * 
 * @author Drausio
 * @since 20-09-2019
 * @apiNote nada
 *
 */
@RestController
@RequestMapping(value="/mysql")
public class MySQLController {
	
	@Autowired
	private MySQLClienteService clienteService;
	
	/**
	 * @see Este endpoint mostra todos os clientes
	 * @param null 
	 * @return User
	 */
	@RequestMapping(value="/cliente")
	public ResponseEntity<List<MySQLCliente>> findAll(){
		List<MySQLCliente> personList = clienteService.findAll();
		return ResponseEntity.ok().body(personList);
	}


}
