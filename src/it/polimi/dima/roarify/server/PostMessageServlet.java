package it.polimi.dima.roarify.server;
import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.http.*;

import it.polimi.dima.roarify.server.dao.MessageDAO;
import it.polimi.dima.roarify.server.dao.MessageDAOImpl;
import it.polimi.dima.roarify.server.model.Message;

public class PostMessageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L; //Serializes objects through HTTP.
	
	public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException{ // Uploads the content of a Post-It
		
				
		String title = checkNull(req.getParameter("title")); // Checks if the parameters are or not empty.
		String text = checkNull(req.getParameter ("text"));
		String lat = checkNull(req.getParameter("lat"));
		String lon  = checkNull(req.getParameter("long"));
		String userId  = checkNull(req.getParameter("userId"));
		
		MessageDAO dao = MessageDAOImpl.getInstance();
		dao.add(title,text,Double.parseDouble(lat),Double.parseDouble(lon),userId);
		
		
	}
	
	private String checkNull (String s){ 
		if (s == null){ 
			return "This field should not be empty";
		}
		return s;
	}
	
}