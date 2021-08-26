package com.dunaevi.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//import de.dunaev.dao.DaoException;
//import de.dunaev.dao.DaoFactory;
//import de.dunaev.dao.WindelSchichtDao;

@Path("/windel")
public class WindelSchichtResource {

	
//		public WindelSchichtResource() throws DaoException {
//			dao = DaoFactory.getWindelSchichtDao();
//		}
		@GET
		public String getAll() throws Exception {
			
			return "HELLOO";
		}

}
