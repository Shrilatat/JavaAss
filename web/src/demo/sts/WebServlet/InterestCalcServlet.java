package demo.sts.WebServlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 * Servlet implementation class InterestCalcServlet
 */
@WebServlet(description = "Calculate Simple Interest", urlPatterns = { "/InterestCalcServlet" })
public class InterestCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		boolean showResult = false;
		float totalInterest = 0F;
		try {
			float principal = Float.parseFloat(request.getParameter("pAmount"));
			float rateInterest = Float.parseFloat(request.getParameter("rateInterest"));
			float years = Integer.parseInt(request.getParameter("numYears"));
			totalInterest = principal*rateInterest*years/100;
			showResult = true;
		} catch (NullPointerException npe) {
			showResult = false;
		} catch (Exception e) {
			showResult = false;
		}
		// response.getWriter().print(id);
		File template = new File("/HSBC\\Training\\Java\\JavaAss\\web\\WebContent\\simpleInterestRes.html");
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder domBuilder;
		Document doc;
		try {
			domBuilder = domFactory.newDocumentBuilder();
			doc = domBuilder.parse(template);
			//doc.getDocumentElement().normalize();
			if (showResult) {
				String outHtml = "The Total Interest generated is = " + totalInterest + "";
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
