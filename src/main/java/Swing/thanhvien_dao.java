package Swing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dl.DAO;
import dl.thanhvien;
import kn.ketnoi;

public class thanhvien_dao implements DAO<thanhvien> {

	private String all = "select *from thanhvien";
	private String insert = "insert into thanhvien(id,ma,ten,email,date,dc) values(?,?,?,?,?,?)";
	private String update = "update thanhvien set ma=?,ten=?,email=?,date=?,dc=? where id=?";
	private String delete = "delete from thanhvien where id=?";
	private String all_ma = "select *from thanhvien where ma=?";
	private String all_name = "select *from thanhvien where ten=?";
private  String all_id = "select *from thanhvien where id=?";
	@Override
	public ArrayList<thanhvien> getAll() throws SQLException {
		
		Connection con = ketnoi.getconnection();
		PreparedStatement pr = null;
		ResultSet rs= null;
		ArrayList<thanhvien> tv = new ArrayList<thanhvien>();
		
		if(con!= null) {
			pr= con.prepareStatement(all);
			rs=pr.executeQuery();
		}
		
		while(rs.next()) {
			
			thanhvien tvv= new thanhvien(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			System.out.println(tvv.toString());
			tv.add(tvv);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		return tv;
	}

	@Override
	public void insert(thanhvien t) throws SQLException {
		
		Connection con = ketnoi.getconnection();
		PreparedStatement pr = null;
		
		
		if(con!= null) {
			pr= con.prepareStatement(insert);
			pr.setInt(1, t.getId());
			pr.setString(2, t.getMa());
			pr.setString(3, t.getTen());
			pr.setString(4, t.getEmail());
			pr.setString(5, t.getDate());
			pr.setString(6, t.getDc());
			pr.executeUpdate();
			
		}
	
		pr.close();
		con.close();
		
	
	}

	@Override
	public void update(thanhvien t) throws SQLException {
		Connection con = ketnoi.getconnection();
		PreparedStatement pr = null;
		
		
		if(con!= null) {
			pr= con.prepareStatement(update);
			
			pr.setString(1, t.getMa());
			pr.setString(2, t.getTen());
			pr.setString(3, t.getEmail());
			pr.setString(4, t.getDate());
			pr.setString(5, t.getDc());
			pr.setInt(6, t.getId());
			pr.executeUpdate();
			
		}
	
		pr.close();
		con.close();

	}

	@Override
	public void delete(thanhvien t) throws SQLException {
		Connection con = ketnoi.getconnection();
		PreparedStatement pr = null;
		
		
		if(con!= null) {
			pr= con.prepareStatement(delete);
			pr.setInt(1, t.getId());
		
			pr.executeUpdate();
			
		}
	
		pr.close();
		con.close();
		
	

	}

	@Override
	public ArrayList<thanhvien> get_ma(String ma) throws SQLException {
		Connection con = ketnoi.getconnection();
		PreparedStatement pr = null;
		ResultSet rs= null;
		ArrayList<thanhvien> tv = new ArrayList<thanhvien>();
		
		if(con!= null) {
			pr= con.prepareStatement(all_ma);
			pr.setString(1, ma);
			rs=pr.executeQuery();
		}
		
		while(rs.next()) {
			
			thanhvien tvv= new thanhvien(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			System.out.println(tvv.toString());
			tv.add(tvv);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		return tv;
	}
	

	@Override
	public ArrayList<thanhvien> get_ten(String name) throws SQLException {
		Connection con = ketnoi.getconnection();
		PreparedStatement pr = null;
		ResultSet rs= null;
		ArrayList<thanhvien> tv = new ArrayList<thanhvien>();
		
		if(con!= null) {
			pr= con.prepareStatement(all_name);
			pr.setString(1, name);
			rs=pr.executeQuery();
		}
		
		while(rs.next()) {
			
			thanhvien tvv= new thanhvien(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			System.out.println(tvv.toString());
			tv.add(tvv);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		return tv;
	}

	@Override
	public ArrayList<thanhvien> get_id(int id) throws SQLException {
		Connection con = ketnoi.getconnection();
		PreparedStatement pr = null;
		ResultSet rs= null;
		ArrayList<thanhvien> tv = new ArrayList<thanhvien>();
		
		if(con!= null) {
			pr= con.prepareStatement(all_id);
			pr.setInt(1, id);
			rs=pr.executeQuery();
		}
		
		while(rs.next()) {
			
			thanhvien tvv= new thanhvien(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			System.out.println(tvv.toString());
			tv.add(tvv);
			
		}
		rs.close();
		pr.close();
		con.close();
		
		return tv;
	}
	
	
//	public static void main(String[] args) {
//		thanhvien_dao dao = new thanhvien_dao();
//		
//		thanhvien tv1 = new thanhvien(1,"tyv01","nam","dtc@gmail.com","2023-05-22","thai nguyen");
//		thanhvien tv2 = new thanhvien(2,"tyv02","tuan","dtc@gmail.com","2023-05-20","nam dinh");
//		
//	
//		
//		try {
//			
//			//dao.insert(tv1);
//			//dao.update(tv2);
//			//dao.delete(tv2);
//			//dao.get_ma("tyv01");
//			//dao.getAll();
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		
		
//	}
	
	}



