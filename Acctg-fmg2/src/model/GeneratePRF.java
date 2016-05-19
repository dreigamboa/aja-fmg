package model;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

import model.POBean;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePRF {
	
	static ByteArrayOutputStream PRF(POBean bean){
		try{
			Document document = new Document();
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			PdfWriter writer = PdfWriter.getInstance(document, baos);
			
			document.open();
			// date
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			
			int month = cal.get(Calendar.MONTH) + 1;
			int day = cal.get(Calendar.DATE);
			int year = cal.get(Calendar.YEAR);
			
			String asOF = month + "/" + day + "/" + year;
			
			// fonts
			BaseFont c_b = BaseFont.createFont(BaseFont.COURIER_BOLD, BaseFont.WINANSI,BaseFont.EMBEDDED);
			BaseFont c_n = BaseFont.createFont(BaseFont.COURIER, BaseFont.WINANSI,BaseFont.EMBEDDED);
			BaseFont c_i = BaseFont.createFont(BaseFont.COURIER_OBLIQUE,BaseFont.WINANSI,BaseFont.EMBEDDED);
			
			Font _cn = null;
			Font _cb = null;
			Font _ci = null;
			
			// PARAGRAPH
			Paragraph p = new Paragraph();
			_cb = new Font(c_b, 24);
			_ci = new Font(c_i, 15);
			p.add(new Phrase("\n\nAPPJAM COMPUTER SHOP\n", _cb));
			_cb = new Font(c_b, 20);
			p.add(new Phrase("PURCHASE REQUISITION FORM\n", _cb));
			p.add(new Phrase("PRINTED " + asOF +"\n\n", _ci));
			p.setAlignment(Element.ALIGN_CENTER);
			
			// authorize part 
			_cb = new Font(c_b, 12);
			_cn = new Font(c_n, 12);
			Paragraph p5 = new Paragraph();
			p5.add(new Phrase("REQUESTED BY: ",_cb));
			p5.add(new Phrase(bean.getAuthorizer().toUpperCase() + "\n\n", _cn));
			
			// whitespace
			Paragraph ws = new Paragraph();
			ws.add("\n");
			
			// tables
			_cb = new Font(c_b, 11);
			_cn = new Font(c_n, 11);
			PdfPTable table = createTable1(_cb, _cn, bean);
			PdfPTable table2 = createTable2(_cn, _cb, bean);
			PdfPTable table3 = createTable3(_cb,_cn, bean);
			PdfPTable table4 = createTable4(_cb,_cn, bean);
			
			// add contents
			document.add(p);
			document.add(p5);
	      	document.add(table);
	      	document.add(ws);
	      	document.add(table2);
	    	document.add(ws);
	      	document.add(table3);
	      	document.add(ws);
	      	document.add(table4);
	      	
	      	document.close();
	      	baos.close();
	      	return baos;
		}
		catch(Exception x){
			x.printStackTrace();
			return null;
		}
	}
	
	static void populateItemTable(Font _cn, PdfPTable table3, String i[], String d[], String u[], String q[], String t[]){
		// gawan ng method
		for(int k = 0; k < 5; k++){
			// set cells
			PdfPCell item = new PdfPCell(new Paragraph(i[k], _cn));
			PdfPCell descr = new PdfPCell(new Paragraph(d[k], _cn));
			PdfPCell unit = new PdfPCell(new Paragraph(u[k], _cn));
			PdfPCell quant = new PdfPCell(new Paragraph(q[k], _cn));
			PdfPCell total = new PdfPCell(new Paragraph(t[k], _cn));
					
			table3.addCell(item);
			table3.addCell(descr);
			table3.addCell(unit);
			table3.addCell(quant);
			table3.addCell(total);
		}
	}
	
	static PdfPTable createTable1(Font _cb, Font _cn, POBean pb) throws DocumentException{
			
			// create table
			PdfPTable table = new PdfPTable(4); 
			table.setWidthPercentage(100);
						
			// set col width
			float[] colWidth = {2f,2f,1f,2f};
			table.setWidths(colWidth);
				        
			// set cells - brute force huhuuuhuhuhuhuhuhuhuhuhu
			PdfPCell c1 = new PdfPCell(new Paragraph("COMPANY NAME", _cb));
			PdfPCell c2 = new PdfPCell(new Paragraph(pb.getB_companyName(),_cn));
			PdfPCell c3 = new PdfPCell(new Paragraph("ZIP", _cb));
			PdfPCell c4 = new PdfPCell(new Paragraph(pb.getB_zip() + "", _cn));
			PdfPCell c5 = new PdfPCell(new Paragraph("UNIT/BLDG/HOUSE #",_cb));
			PdfPCell c6 = new PdfPCell(new Paragraph(pb.getB_no(), _cn));
			PdfPCell c7 = new PdfPCell(new Paragraph("DATE", _cb));
			PdfPCell c8 = new PdfPCell(new Paragraph(pb.getB_date(), _cn));
			PdfPCell c9 = new PdfPCell(new Paragraph("SUBDIVISION/STREET",_cb));
			PdfPCell c10 = new PdfPCell(new Paragraph(pb.getB_subdiv(),_cn));
			PdfPCell c11 = new PdfPCell(new Paragraph("COURIER", _cb));
			PdfPCell c12 = new PdfPCell(new Paragraph(pb.getB_courier(),_cn));
			PdfPCell c13 = new PdfPCell(new Paragraph("BARANGAY", _cb));
			PdfPCell c14 = new PdfPCell(new Paragraph(pb.getB_brgy(), _cn));
			PdfPCell c15 = new PdfPCell(new Paragraph("FOB POINT", _cb));
			PdfPCell c16 = new PdfPCell(new Paragraph(pb.getB_fob(),_cn));
			PdfPCell c17 = new PdfPCell(new Paragraph("TOWN/CITY",_cb));
			PdfPCell c18 = new PdfPCell(new Paragraph(pb.getB_city() + "",_cn));
			PdfPCell c19 = new PdfPCell(new Paragraph("PAYMENT METHOD",_cb));
			PdfPCell c20 = new PdfPCell(new Paragraph(pb.getB_paymentMethod(),_cn));
			PdfPCell c21 = new PdfPCell(new Paragraph("PROVINCE", _cb));
			PdfPCell c22 = new PdfPCell(new Paragraph(pb.getB_province() + "", _cn));
			PdfPCell c23 = new PdfPCell(new Paragraph("CONTACT NUMBER", _cb));
			PdfPCell c24 = new PdfPCell(new Paragraph(pb.getB_phoneNum()+"", _cn));
				        
			table.addCell(c1);
			table.addCell(c2);
			table.addCell(c3);
			table.addCell(c4);
			table.addCell(c5);
			table.addCell(c6);
			table.addCell(c7);
			table.addCell(c8);
			table.addCell(c9);
			table.addCell(c10);
			table.addCell(c11);
			table.addCell(c12);
			table.addCell(c13);
			table.addCell(c14);
			table.addCell(c15);
			table.addCell(c16);
			table.addCell(c17);
			table.addCell(c18);
			table.addCell(c19);
			table.addCell(c20);
			table.addCell(c21);
			table.addCell(c22);
			table.addCell(c23);
			table.addCell(c24);
	
		return table; 
	}
	
	static PdfPTable createTable2(Font _cn, Font _cb, POBean pb) throws DocumentException{
		// create table 2
		PdfPTable table2 = new PdfPTable(2);
		table2.setWidthPercentage(100);
					
		// set column width
		float[] colWidth2 = {1f,1f};
		table2.setWidths(colWidth2);
					
		// create the paragraph para dun sa shipping info
		Paragraph p3 = new Paragraph();
		p3.add(new Phrase("COMPANY NAME:\n",_cb));
		p3.add(new Phrase("APPJAM COMPUTER SHOP" + "\n\n", _cn));
		p3.add(new Phrase("ADDRESS: \n",_cb));
		p3.add(new Phrase("ROOM 53, ROQUE RUANO BUILDING, \nESPANA, MANILA" + "\n\n", _cn));
		p3.add(new Phrase("PHONE NUMBER: \n",_cb));
		p3.add(new Phrase("0912 345 6789" + "\n\n",_cn));
					
		Paragraph p4 = new Paragraph();
		p4.add(new Phrase("COMPANY NAME: \n",_cb));
		p4.add(new Phrase(pb.getB_companyName().toUpperCase()+ "\n\n", _cn));
		p4.add(new Phrase("ADDRESS: \n",_cb));
		p4.add(new Phrase(pb.getB_no().toUpperCase() + " " + pb.getB_subdiv().toUpperCase() + ", " + pb.getB_brgy().toUpperCase() + ",\n" + pb.getB_city().toUpperCase() + " " + pb.getB_province().toUpperCase() + " " + pb.getB_zip()+"".toUpperCase() + "\n\n", _cn));
		p4.add(new Phrase("PHONE NUMBER: \n",_cb));
		p4.add(new Phrase(pb.getB_phoneNum()+"".toUpperCase() + "\n\n",_cn));
					
		// set cells 
		PdfPCell vendor = new PdfPCell(new Paragraph("VENDOR INFORMATION",_cb));
		PdfPCell shipTo = new PdfPCell(new Paragraph("BUYER INFORMATION",_cb));
		PdfPCell vendor_info = new PdfPCell(p3);
		PdfPCell shipTo_info = new PdfPCell(p4);
			        
		table2.addCell(vendor);
		table2.addCell(shipTo);
		table2.addCell(vendor_info);
		table2.addCell(shipTo_info);
		
		return table2;
	}
	
	static PdfPTable createTable3(Font _cb, Font _cn, POBean pb) throws DocumentException{
		PdfPTable table3 = new PdfPTable(5);
		table3.setWidthPercentage(100);
		
		// set width
		float [] colWidth3 = {2f,4f,2f,2f,2f};
		table3.setWidths(colWidth3);
		
		// set cells
		PdfPCell c1_ = new PdfPCell(new Paragraph("ITEM CATEGORY", _cb));
		PdfPCell c2_ = new PdfPCell(new Paragraph("SPECIFICATIONS", _cb));
		PdfPCell c3_ = new PdfPCell(new Paragraph("UNIT PRICE", _cb));
		PdfPCell c4_ = new PdfPCell(new Paragraph("QUANTITY", _cb));
		PdfPCell c5_ = new PdfPCell(new Paragraph("TOTAL", _cb));
		
		table3.addCell(c1_);
		table3.addCell(c2_);
		table3.addCell(c3_);
		table3.addCell(c4_);
		table3.addCell(c5_);
		
		String item[] = new String[5];
		String descr[] = new String[5];
		String unit[] = new String[5];
		String quant[] = new String[5];
		String total[] = new String[5];
		
		item[0] = pb.getI_1(); descr[0] = pb.getD_1(); unit[0] = pb.getU_1() + ""; quant[0] = pb.getQ_1() + ""; total[0] = pb.printTotalR1();
		item[1] = pb.getI_2(); descr[1] = pb.getD_2(); unit[1] = pb.getU_2() + ""; quant[1] = pb.getQ_2() + ""; total[1] = pb.printTotalR2();
		item[2] = pb.getI_3(); descr[2] = pb.getD_3(); unit[2] = pb.getU_3() + ""; quant[2] = pb.getQ_3() + ""; total[2] = pb.printTotalR3();
		item[3] = pb.getI_4(); descr[3] = pb.getD_4(); unit[3] = pb.getU_4() + ""; quant[3] = pb.getQ_4() + ""; total[3] = pb.printTotalR4();
		item[4] = pb.getI_5(); descr[4] = pb.getD_5(); unit[4] = pb.getU_5() + ""; quant[4] = pb.getQ_5() + ""; total[4] = pb.printTotalR5();
		
		populateItemTable(_cn, table3, item, descr, unit, quant, total);
		
		return table3;
	}
	
	static PdfPTable createTable4(Font _cb, Font _cn, POBean pb) throws DocumentException{
		// create mini table for tax, tax rate, etc.
		PdfPTable table4 = new PdfPTable(2);
		table4.setWidthPercentage(33);
		table4.setHorizontalAlignment(Element.ALIGN_RIGHT);
					
		// set cell width
		float[] colWidth4 = {1f,1f};
		table4.setWidths(colWidth4);
		
		PdfPCell _c0 = new PdfPCell(new Paragraph("SHIPPING FEE", _cb));
		PdfPCell _c0A = new PdfPCell(new Paragraph(pb.shippingFee()+"", _cn));
		PdfPCell _c1 = new PdfPCell(new Paragraph("TAX RATE", _cb));
		PdfPCell _c2 = new PdfPCell(new Paragraph(12 +"%", _cn));
		PdfPCell _c3 = new PdfPCell(new Paragraph("TAX", _cb));
		PdfPCell _c4 = new PdfPCell(new Paragraph(pb.Tax()+"", _cn));
		PdfPCell _c5 = new PdfPCell(new Paragraph("TAXABLE", _cb));
		PdfPCell _c6 = new PdfPCell(new Paragraph(pb.Taxable()+"", _cn));
		PdfPCell _c7 = new PdfPCell(new Paragraph("TOTAL", _cb));
		PdfPCell _c8 = new PdfPCell(new Paragraph(pb.getGrandTotal()+"", _cn));						
		
		table4.addCell(_c0);
		table4.addCell(_c0A);
		table4.addCell(_c1);
		table4.addCell(_c2);
		table4.addCell(_c3);
		table4.addCell(_c4);
		table4.addCell(_c5);
		table4.addCell(_c6);
		table4.addCell(_c7);
		table4.addCell(_c8);
		
		return table4;
	}
}
