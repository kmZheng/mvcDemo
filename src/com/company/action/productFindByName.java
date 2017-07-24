package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.pojo.Product;
import com.company.service.factory.ServiceFactory;

@WebServlet("/productFindByName")
public class productFindByName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("pname");
		List<Product> p = ServiceFactory.getProductInstance().findByName(pname);
		if(p.size() > 0 && p != null) {
			request.setAttribute("productListFromServer", p);
			request.getRequestDispatcher("/product_findAll.jsp").forward(request, response);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("errMsg", "NO Product!");
			response.sendRedirect(request.getContextPath()+"/Error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
