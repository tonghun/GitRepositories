package ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ajax.CityMap;

/**
 * Servlet implementation class ZoneServlet
 */
@WebServlet("/ZoneServlet")
public class ZoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ZoneServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		String action = request.getParameter("action");
		if (action.equals("getProvince"))
			getProvince(request, response);
		else if (action.equals("getCity")) {
			getCity(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void getProvince(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.setContentType("text/html;charset=UTF-8");
		String provinces = "";
		Map<String, String[]> map = CityMap.model;
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			provinces += it.next() + ",";
		}
		provinces = provinces.substring(0, provinces.length() - 1);
		PrintWriter out = response.getWriter();
		out.println(provinces);
		System.out.println(provinces);
		out.flush();
		out.close();
	}

	protected void getCity(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String selPro = request.getParameter("param");
		System.out.println("Ç°selPro----" + selPro);

		selPro = new String(selPro.getBytes("ISO-8859-1"), "GBK");
		System.out.println("ºóselPro----" + selPro);
		String cities = "";
		// CityMap cityMap = new CityMap();
		Map<String, String[]> map = CityMap.model;
		String[] cityArr = map.get(selPro);
		System.out.println("length----" + cityArr.length);
		for (int i = 0; i < cityArr.length; i++) {
			cities += cityArr[i] + ",";
		}
		cities = cities.substring(0, cities.length() - 1);
		PrintWriter out = response.getWriter();
		System.out.println(cities);
		out.println(cities);
		out.flush();
		out.close();
	}
}
