package com.props.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.props.OracleProperties;

@RestController
public class DBController {
	@Autowired
	OracleProperties orclProps;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	public void dbProps() {
		System.out.println(orclProps.toString());
	}

}
