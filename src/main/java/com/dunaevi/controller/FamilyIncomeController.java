package com.dunaevi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dunaevi.service.FamilyIncomeService;

//import de.dunaev.dao.DaoException;
//import de.dunaev.dao.DaoFactory;
//import de.dunaev.dao.WindelSchichtDao;

//@Path("/windel")
@RestController
public class FamilyIncomeController {

	@Autowired
	private FamilyIncomeService familyIncomeService;
//		public WindelSchichtResource() throws DaoException {
//			dao = DaoFactory.getWindelSchichtDao();
//		}
	
	
//		@GET
//		public String getAll() throws Exception {
//			
//			return "HELLOO";
//		}

	
	@GetMapping("/hello")
	public String listCustomers(Model theModel) {
		
		return "HELLLO " + familyIncomeService.getFamilyIncome(0).getIncome();
	}
}
