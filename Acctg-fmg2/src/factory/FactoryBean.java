package factory;

import model.POBean;

public class FactoryBean {
	public static POBean getInstance(
			String b_companyName,
			String b_subdiv,
			String b_no,
			String b_date,
			String b_brgy,
			String b_courier,
			String b_city,
			String b_fob,
			int b_zip,
			String b_paymentMethod,
			String b_phoneNum,
			String b_province,
			String i_1,
			String d_1,
			double u_1,
			int q_1,
			String i_2,
			String d_2,
			String u_2,
			String q_2,
			String i_3,
			String d_3,
			String u_3,
			String q_3,
			String i_4,
			String d_4,
			String u_4,
			String q_4,
			String i_5,
			String d_5,
			String u_5,
			String q_5,
			String authorizer)
	{
		POBean po = new POBean();
		
		po.setB_brgy(b_brgy);
		po.setB_city(b_city);
		po.setB_companyName(b_companyName);
		po.setB_courier(b_courier);
		po.setB_date(b_date);
		po.setB_fob(b_fob);
		po.setB_paymentMethod(b_paymentMethod);
		po.setB_phoneNum(b_phoneNum);
		po.setB_zip(b_zip);
		po.setD_1(d_1);
		po.setD_2(d_2);
		po.setD_3(d_3);
		po.setD_4(d_4);
		po.setD_5(d_5);
		po.setI_1(i_1);
		po.setI_2(i_2);
		po.setI_3(i_3);
		po.setI_4(i_4);
		po.setI_5(i_5);
		po.setQ_1(q_1);
		po.setQ_2(q_2);
		po.setQ_3(q_3);
		po.setQ_4(q_4);
		po.setQ_5(q_5);
		po.setU_1(u_1);
		po.setU_2(u_2);
		po.setU_3(u_3);
		po.setU_4(u_4);
		po.setU_5(u_5);
		po.setAuthorizer(authorizer);
		po.setB_no(b_no);
		po.setB_province(b_province);
		po.setB_subdiv(b_subdiv);
				
		return po;
	
	}
}

