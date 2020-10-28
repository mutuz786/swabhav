package com.techlabs.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.BeerExpert;

//@WebServlet("/SelectBeer.do")
public class BeerSelect extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String color = request.getParameter("color");
		BeerExpert bExpert = new BeerExpert();
		List<String> beers = bExpert.getBrands(color);

		request.setAttribute("beers", beers);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		try {
			view.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
