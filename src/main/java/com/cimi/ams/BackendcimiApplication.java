package com.cimi.ams;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class BackendcimiApplication extends SpringBootServletInitializer{

	public static List<Produit> lp=new ArrayList<>();
	static {
		lp.add(new Produit("abc",200));
		lp.add(new Produit("efg",100));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BackendcimiApplication.class, args);
	}
	
	

}
