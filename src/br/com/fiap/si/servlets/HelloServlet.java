package br.com.fiap.si.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.models.Pessoa;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public HelloServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			String nome = request.getParameter("txtNome");
			String time = request.getParameter("cboTime");
			Date dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("txtDataNasc"));
			pessoas.add(new Pessoa(nome, dataNasc, time));
			for (Pessoa p : pessoas) {
				response.getWriter()
						.println("<p>" + p.getNome() + " - "
								+ new SimpleDateFormat("EEE, d MMM yyyy").format(p.getDataNasc()) + " - " + p.getTime()
								+ "</p>");
			}
			response.getWriter().println("<p><a href='entrada.html'>Voltar</a></p>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
