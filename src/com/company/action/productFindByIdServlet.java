package com.company.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.dao.pojo.Product;
import com.company.service.factory.ServiceFactory;

@WebServlet("/productFindByIdServlet")
public class productFindByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		String option = request.getParameter("option");
		Product p = ServiceFactory.getProductInstance().findById(pid);
		if(p != null) {
			if("update".equals(option)) {
				request.setAttribute("productFromServer", p);
				request.getRequestDispatcher("/product_update.jsp").forward(request, response);
			}else {
				List<Product> productList = new ArrayList<>();
				productList.add(p);
				request.setAttribute("productListFromsServer", productList);
				request.getRequestDispatcher("/product_findAll.jsp").forward(request, response);
			}
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("errMsg", "Didn't find this product!");
			request.getAttribute(request.getContextPath() + "/Error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
