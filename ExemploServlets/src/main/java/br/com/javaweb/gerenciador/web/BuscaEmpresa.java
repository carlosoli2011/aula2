package br.com.javaweb.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Empresa;
import br.com.javaweb.gerenciador.dao.EmpresaDAO;

/**
 * Servlet implementation class BuscaEmpresa
 */
@WebServlet("/busca")
public class BuscaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//String filtro;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscaEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String filtro = request.getParameter("filtro");
		//filtro = request.getParameter("filtro");
		
		/*
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			//TODO 
			e.printStackTrace();
		}*/
		
		Collection<Empresa> empresas = 
				new EmpresaDAO().buscaPorSimilaridade(filtro);
		request.setAttribute("empresas", empresas);
		request.getRequestDispatcher
		("/WEB-INF/paginas/buscaEmpresa.jsp").
		forward(request, response);
		
		
		

		/*
		StringBuffer html = new StringBuffer();
		
		html.append("<html>\n");
		html.append("<head><title>Busca por Empresas</title></head>\n");
		html.append("<body>\n<Resultado da Busca: >\n");
		
		html.append("<url>");

		for (Empresa empresa : empresas) {
			
			html.append("<li>" + empresa.getId() + ":" + empresa.getNome() + "<li>");
		}
		
		html.append("</body>");
		html.append("</html>");
		
		PrintWriter out = response.getWriter();
		
		out.println(html);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Inicializando a Servlet "+ this);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Inicializando a Servlet "+ this);
	}

}
