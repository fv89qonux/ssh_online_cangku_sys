package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	private String url = "jdbc:mysql://127.0.0.1:3306/ssh_online_cangku_sys?useSSL=false&serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8";
	private String user = "ssh_online_cangku_sys";
	private String password = "ssh_online_cangku_sys";
	private String jdbcName = "com.mysql.cj.jdbc.Driver";
	
	public Connection getCon() throws Exception {
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	public void closeCon(Connection con) throws Exception {
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
