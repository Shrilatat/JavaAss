package demo.sts.WebServlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet(description = "Simple Login Interface", urlPatterns = { "/loginServlet" })
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		boolean showResult = false, loginResult=false;
		try {
			String uname = request.getParameter("uname");
			String pword = request.getParameter("pword");
			showResult = true;
			if (uname.equals(pword))
				loginResult = true;
		} catch (Exception e) {
			showResult = false;
		}
		// response.getWriter().print(id);
		File template = new File("/HSBC\\Training\\Java\\JavaAss\\web\\WebContent\\loginDemoRes.html");
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder domBuilder;
		Document doc;
		try {
			domBuilder = domFactory.newDocumentBuilder();
			doc = domBuilder.parse(template);
			//doc.getDocumentElement().normalize();
			if (showResult) {
				String outHtml;
				if (loginResult)
					outHtml = "Succesfully Logged in.";
				else
					outHtml = "Sorry! Wrong Login details";
				Element root = doc.getDocumentElement();
				Node outDiv = root.getElementsByTagName("div").item(1);
				outDiv.setTextContent(outHtml);
				root.normalize();
			}
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);
			out.print(writer.toString());

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException a) {
			a.printStackTrace();
		} catch (TransformerException te) {
			te.printStackTrace();
		} finally {
			out.close();
		}
	}

}
