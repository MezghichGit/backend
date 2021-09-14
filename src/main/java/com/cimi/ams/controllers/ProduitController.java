package com.cimi.ams.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cimi.ams.BackendcimiApplication;
import com.cimi.ams.Produit;
@RestController
public class ProduitController {
	@RequestMapping("/list")
	public List<Produit> listProduit()
	{
		return BackendcimiApplication.lp;
	}
}
