package model;

import java.text.DecimalFormat;

public class POBean {
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
	
	DecimalFormat df = new DecimalFormat("###.##");
	
	public String getB_companyName() {
		return b_companyName;
	}
	public void setB_companyName(String b_companyName) {
		this.b_companyName = b_companyName;
	}
	public String getB_subdiv() {
		return b_subdiv;
	}
	public void setB_subdiv(String b_subdiv) {
		this.b_subdiv = b_subdiv;
	}
	public String getB_no() {
		return b_no;
	}
	public void setB_no(String b_no) {
		this.b_no = b_no;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getB_brgy() {
		return b_brgy;
	}
	public void setB_brgy(String b_brgy) {
		this.b_brgy = b_brgy;
	}
	public String getB_courier() {
		return b_courier;
	}
	public void setB_courier(String b_courier) {
		this.b_courier = b_courier;
	}
	public String getB_city() {
		return b_city;
	}
	public void setB_city(String b_city) {
		this.b_city = b_city;
	}
	public String getB_fob() {
		return b_fob;
	}
	public void setB_fob(String b_fob) {
		this.b_fob = b_fob;
	}
	public int getB_zip() {
		return b_zip;
	}
	public void setB_zip(int b_zip) {
		this.b_zip = b_zip;
	}
	public String getB_paymentMethod() {
		return b_paymentMethod;
	}
	public void setB_paymentMethod(String b_paymentMethod) {
		this.b_paymentMethod = b_paymentMethod;
	}
	public String getB_phoneNum() {
		return b_phoneNum;
	}
	public void setB_phoneNum(String b_phoneNum) {
		this.b_phoneNum = b_phoneNum;
	}
	public String getB_province() {
		return b_province;
	}
	public void setB_province(String b_province) {
		this.b_province = b_province;
	}
	public String getI_1() {
		return i_1;
	}
	public void setI_1(String i_1) {
		this.i_1 = i_1;
	}
	public String getD_1() {
		return d_1;
	}
	public void setD_1(String d_1) {
		this.d_1 = d_1;
	}
	public double getU_1() {
		return u_1;
	}
	public void setU_1(double u_1) {
		this.u_1 = u_1;
	}
	public int getQ_1() {
		return q_1;
	}
	public void setQ_1(int q_1) {
		this.q_1 = q_1;
	}
	public String getI_2() {
		return i_2;
	}
	public void setI_2(String i_2) {
		this.i_2 = i_2;
	}
	public String getD_2() {
		return d_2;
	}
	public void setD_2(String d_2) {
		this.d_2 = d_2;
	}
	public String getU_2() {
		return u_2;
	}
	public void setU_2(String u_2) {
		this.u_2 = u_2;
	}
	public String getQ_2() {
		return q_2;
	}
	public void setQ_2(String q_2) {
		this.q_2 = q_2;
	}
	public String getI_3() {
		return i_3;
	}
	public void setI_3(String i_3) {
		this.i_3 = i_3;
	}
	public String getD_3() {
		return d_3;
	}
	public void setD_3(String d_3) {
		this.d_3 = d_3;
	}
	public String getU_3() {
		return u_3;
	}
	public void setU_3(String u_3) {
		this.u_3 = u_3;
	}
	public String getQ_3() {
		return q_3;
	}
	public void setQ_3(String q_3) {
		this.q_3 = q_3;
	}
	public String getI_4() {
		return i_4;
	}
	public void setI_4(String i_4) {
		this.i_4 = i_4;
	}
	public String getD_4() {
		return d_4;
	}
	public void setD_4(String d_4) {
		this.d_4 = d_4;
	}
	public String getU_4() {
		return u_4;
	}
	public void setU_4(String u_4) {
		this.u_4 = u_4;
	}
	public String getQ_4() {
		return q_4;
	}
	public void setQ_4(String q_4) {
		this.q_4 = q_4;
	}
	public String getI_5() {
		return i_5;
	}
	public void setI_5(String i_5) {
		this.i_5 = i_5;
	}
	public String getD_5() {
		return d_5;
	}
	public void setD_5(String d_5) {
		this.d_5 = d_5;
	}
	public String getU_5() {
		return u_5;
	}
	public void setU_5(String u_5) {
		this.u_5 = u_5;
	}
	public String getQ_5() {
		return q_5;
	}
	public void setQ_5(String q_5) {
		this.q_5 = q_5;
	}
	public String getAuthorizer() {
		return authorizer;
	}
	public void setAuthorizer(String authorizer) {
		this.authorizer = authorizer;
	}
	/*methods*/
	public double getTotalRow1(){
		double total = 0.0;
		if(getU_1() != 0.0 && getQ_1() != 0){
			total = u_1 * q_1;
		}
		return total;
	}
	public double getTotalRow2(){
		double total = 0.0;
		String a = getU_2();
		String b = getQ_2();
		if(!a.equals("") && !b.equals("") && !a.equals("0.0") && !b.equals("0")){
			double x = toDouble(a);
			int y = toInt(b);
			total = x*y;
		}
		return total;
	}
	public double getTotalRow3(){
		double total = 0.0;
		String a = getU_3();
		String b = getQ_3();
		if(!a.equals("") && !b.equals("") && !a.equals("0.0") && !b.equals("0")){
			double x = toDouble(a);
			int y = toInt(b);
			total = x*y;
		}
		return total;
	}
	public double getTotalRow4(){
		double total = 0.0;
		String a = getU_4();
		String b = getQ_4();
		if(!a.equals("") && !b.equals("") && !a.equals("0.0") && !b.equals("0")){
			double x = toDouble(a);
			int y = toInt(b);
			total = x*y;
		}
		return total;
	}
	public double getTotalRow5(){
		double total = 0.0;
		String a = getU_5();
		String b = getQ_5();
		if(!a.equals("") && !b.equals("") && !a.equals("0.0") && !b.equals("0")){
			double x = toDouble(a);
			int y = toInt(b);
			total = x*y;
		}
		return total;
	}
	public String printTotalR1(){
		double total = getTotalRow1();
		String result = "";
		if(total != 0){
			result = total + "";
		}
		else{
			result = "";
		}
		return result;
	}
	public String printTotalR2(){
		double total = getTotalRow2();
		String result = "";
		if(total != 0){
			result = total + "";
		}
		else{
			result = "";
		}
		return result;
	}
	public String printTotalR3(){
		double total = getTotalRow3();
		String result = "";
		if(total != 0){
			result = total + "";
		}
		else{
			result = "";
		}
		return result;
	}
	public String printTotalR4(){
		double total = getTotalRow4();
		String result = "";
		if(total != 0){
			result = total + "";
		}
		else{
			result = "";
		}
		return result;
	}
	public String printTotalR5(){
		double total = getTotalRow5();
		String result = "";
		if(total != 0){
			result = total + "";
		}
		else{
			result = "";
		}
		return result;
	}
	public double getGrandTotal(){
		double total = 0.0;
		total = getTotalRow1() + getTotalRow2() + getTotalRow3() + getTotalRow4() +
				getTotalRow5();
		total = total + shippingFee();
		return total;
	}
	public double Tax(){
		double tax = 0.00;
		double t1 = getGrandTotal()-(getGrandTotal() / 1.12);
		tax = Double.parseDouble(df.format(t1));
		return tax;
	}
	public double Taxable(){
		double tax = 0.00;
		double t1 = getGrandTotal() / 1.12;
		tax = Double.parseDouble(df.format(t1));
		return tax;
	}
	public double shippingFee(){
		double ship = 0.00;
		switch(getB_fob()){
			case "Shipping Address":
				switch(getB_courier()){
					case "LBC":
						ship = 1000.0 + 2500.0;
						break;
					case "ABest":
						ship = 1000.0 + 2400.0;
						break;
					case "Air21":
						ship = 1000.0 + 3500.0;
						break;
					case "FedEx":
						ship = 1000.0 + 4500.0;
						break;
				}
			case "Pick-up":
				switch(getB_courier()){
					case "LBC":
						ship = 1200.0 + 2500.0;
						break;
					case "ABest":
						ship = 1200.0 + 2400.0;
						break;
					case "Air21":
						ship = 1200.0 + 3500.0;
						break;
					case "FedEx":
						ship = 1200.0 + 4500.0;
						break;
				}
		}
		return Double.parseDouble(df.format(ship));
	}
	public double toDouble(String x){
		double con = 0.0;
		if(!x.equals("")){
			con = Double.parseDouble(x);
		}
		return con;
	}
	public Integer toInt(String x){
		int con = 0;
		if(!x.equals("")){
			con = Integer.parseInt(x);
		}
		return con;
	}
	
}