package model;
import com.itextpdf.text.*;
import java.io.*;
import com.itextpdf.text.pdf.PdfWriter;

import model.GeneratePRF;
import model.POBean;

public class MyPDFCreator{
	public static ByteArrayOutputStream generatePDF(POBean pob){
		try{
			System.out.println("ok");
			return GeneratePRF.PRF(pob);
			
		}
		
		catch(Exception de){
			de.printStackTrace();
			return null;
		}
	}
}
