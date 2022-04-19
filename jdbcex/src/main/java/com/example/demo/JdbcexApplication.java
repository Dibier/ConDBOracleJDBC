package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.model.Cliente;

@SpringBootApplication
public class JdbcexApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbc;

	public static void main(String[] args) {
		SpringApplication.run(JdbcexApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM cliente";
		List<Cliente> clientes = jdbc.query(sql,
				BeanPropertyRowMapper.newInstance(Cliente.class));
		clientes.forEach(System.out :: println);
	}

}
