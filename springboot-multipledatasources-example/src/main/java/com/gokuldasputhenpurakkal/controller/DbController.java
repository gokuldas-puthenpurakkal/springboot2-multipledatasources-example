package com.gokuldasputhenpurakkal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.gokuldasputhenpurakkal.db1.model.Db1Entity;
import com.gokuldasputhenpurakkal.db1.repository.Db1EntityRepository;
import com.gokuldasputhenpurakkal.db2.model.Db2Entity;
import com.gokuldasputhenpurakkal.db2.repository.Db2EntityRepository;

@RestController
public class DbController {
	
	@Autowired
	Db1EntityRepository db1EntityRepository;
	
	@Autowired
	Db2EntityRepository db2EntityRepository;
	
	@GetMapping(value = "/api/db1", produces = MediaType.APPLICATION_JSON_VALUE)
	public Db1Entity testDatabase1(@RequestHeader(required = true, value = HttpHeaders.ACCEPT_LANGUAGE) final String languageCode) {
		return db1EntityRepository.getDb2Entity();
	}
	
	@GetMapping(value = "/api/db2", produces = MediaType.APPLICATION_JSON_VALUE)
	public Db2Entity testDatabase2(@RequestHeader(required = true, value = HttpHeaders.ACCEPT_LANGUAGE) final String languageCode) {
		return db2EntityRepository.getDb2Entity();
	}


}
