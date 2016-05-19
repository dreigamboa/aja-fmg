package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

import model.POBean;
import factory.FactoryBean;
import model.MyPDFCreator;

@WebServlet("/process.html")
public class process extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String b_companyName;
		String b_subdiv;
		String b_no;
		String b_date;
		String b_brgy;
		String b_courier;
		String b_city;
		String b_fob;
		int b_zip;
		String b_paymentMethod;
		String b_phoneNum;
		String b_province;
		String v_companyName;
		String b_companyName2;
		String v_address;
		String b_address;
		String v_prov;
		String b_prov;
		int v_phone;
		int b_phone;
		String i_1;
		String d_1;
		double u_1;
		int q_1;
		String i_2;
		String d_2;
		String u_2;
		String q_2;
		String i_3;
		String d_3;
		String u_3;
		String q_3;
		String i_4;
		String d_4;
		String u_4;
		String q_4;
		String i_5;
		String d_5;
		String u_5;
		String q_5;
		String authorizer;
		POBean po = null;

		
		try{
			b_companyName = request.getParameter("b_companyName");
			b_subdiv = request.getParameter("b_subdiv");
			b_no = request.getParameter("b_no");
			b_date = request.getParameter("b_date");
			b_brgy = request.getParameter("b_brgy");
			b_courier = request.getParameter("b_courier");
			b_city = request.getParameter("b_city");
			b_fob = request.getParameter("b_fob");
			b_zip = Integer.parseInt(request.getParameter("b_zip"));
			b_paymentMethod = request.getParameter("b_paymentMethod");
			b_phoneNum = request.getParameter("b_phoneNum");
			b_province = request.getParameter("b_province");
			//v_companyName = request.getParameter("v_companyName");
			//b_companyName2 = request.getParameter("b_companyName2");
			//v_address = request.getParameter("v_address");
			//b_address = request.getParameter("b_address");
			//v_prov = request.getParameter("v_prov");
			//b_prov = request.getParameter("b_prov");
			//v_phone = Integer.parseInt(request.getParameter("v_phone"));
			//b_phone = Integer.parseInt(request.getParameter("b_phone"));
			i_1 = request.getParameter("i_1");
			d_1 = request.getParameter("d_1");
			u_1 = Double.parseDouble(request.getParameter("u_1"));
			q_1 = Integer.parseInt(request.getParameter("q_1"));
			i_2 = request.getParameter("i_2");
			d_2 = request.getParameter("d_2");
			i_3 = request.getParameter("i_3");
			d_3 = request.getParameter("d_3");
			i_4 = request.getParameter("i_4");
			d_4 = request.getParameter("d_4");
			i_5 = request.getParameter("i_5");
			d_5 = request.getParameter("d_5");
			u_2 = request.getParameter("u_2");
			q_2 = request.getParameter("q_2");
			u_3 = request.getParameter("u_3");
			q_3 = request.getParameter("q_3");
			u_4 = request.getParameter("u_4");
			q_4 = request.getParameter("q_4");
			u_5 = request.getParameter("u_5");
			q_5 = request.getParameter("q_5");
			authorizer = request.getParameter("authorizer");

			if (b_companyName !=null && b_subdiv != null && b_no != null && b_date != null && b_brgy != null && b_courier !=null && b_city !=null && b_fob !=null && b_zip != 0 &&
				b_paymentMethod !=null && b_phoneNum !=null && i_1 != null && d_1 != null && u_1 != 0.0 && q_1 != 0){
				
				po = FactoryBean.getInstance(b_companyName, b_subdiv, b_no, b_date, b_brgy, b_courier, b_city, b_fob, b_zip, b_paymentMethod, b_phoneNum, b_province, 
											i_1, d_1, u_1, q_1, i_2, d_2, u_2, q_2, i_3, d_3, 
											 u_3, q_3, i_4, d_4, u_4, q_4, i_5, d_5, u_5, q_5, authorizer);
				
					
				ByteArrayOutputStream mypdf = MyPDFCreator.generatePDF(po);
				response.setContentType("application/pdf");
				response.setHeader(
						"Content-disposition",
						"inline; filename=MyPdf.pdf" );
				response.setContentLength(mypdf.size());
				ServletOutputStream sos = response.getOutputStream();
				mypdf.writeTo(sos);
				sos.flush();
				response.sendRedirect("success.html");
				
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}

}
