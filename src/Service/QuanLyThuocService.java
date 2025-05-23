package Service;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

import ConnectDB.ConnectDB;
import Models.Thuoc;


// Quản lý thuốc cần xử lý nhập và tải hình ảnh từ database

public class QuanLyThuocService {
	
	public List<Thuoc> getDanhSachThuoc(){
        List<Thuoc> dsThuoc = new ArrayList<>();
        String sql = "SELECT * FROM Thuoc";
        
		ConnectDB connectDB = ConnectDB.getInstance();
        
        // Connect to the database
        connectDB.connect();
        
        try (Connection con = connectDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
            	Thuoc thuoc = new Thuoc(
                    rs.getString("maThuoc"),
                    rs.getString("tenThuoc"),
                    rs.getString("donViTinh"),
                    rs.getString("phanLoai"),
                    rs.getString("hinhAnh"),
                    rs.getDate("ngayNhap").toLocalDate(),
                    rs.getDate("ngayHetHan").toLocalDate(),
                    rs.getDouble("donGia"),
                    rs.getInt("soLuong"),
                    rs.getDouble("hamLuong")
                );
            	dsThuoc.add(thuoc);
            	
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // In a real application, you might want to throw a custom exception
        }finally {
        	ConnectDB.disconnect();
        }
        return dsThuoc;
        
	}
	
	public boolean themThuocService(Thuoc thuoc) {
		String sql = "INSERT INTO Thuoc (maThuoc, tenThuoc, hinhAnh, ngayNhap, ngayHetHan, soLuong, donViTinh, donGia, phanLoai, hamLuong)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		ConnectDB connectDB = ConnectDB.getInstance();
		connectDB.connect();
		try(Connection con = connectDB.getConnection();
	             PreparedStatement stmt = con.prepareStatement(sql)) {
			
			/*SimpleDateFormat  formatter = new SimpleDateFormat("yyyy-MM-dd");
			String ngayNhap = formatter.format(thuoc.getNgayNhap());
			String ngayHetHan = formatter.format(thuoc.getNgayHetHan());*/
			
	        byte[] imageData = null;
	        if (thuoc.getHinhAnh() != null && !thuoc.getHinhAnh().isEmpty()) {
	            Path path = Paths.get(thuoc.getHinhAnh());
	            imageData = Files.readAllBytes(path);
	        }
			
            stmt.setString(1, thuoc.getMaThuoc());
            stmt.setString(2, thuoc.getTenThuoc());
            stmt.setString(3, thuoc.getHinhAnh());
            stmt.setDate(4, Date.valueOf(thuoc.getNgayNhap()));
            stmt.setDate(5, Date.valueOf(thuoc.getNgayHetHan()));
            stmt.setInt(6, thuoc.getSoLuong());
            stmt.setString(7, thuoc.getDonViTinh());
            stmt.setDouble(8, thuoc.getdonGia());
            stmt.setString(9, thuoc.getPhanLoai());
            stmt.setDouble(10, thuoc.getHamLuong());
            
            int rowAffected = stmt.executeUpdate();
            return rowAffected >0;
			
			
			
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}finally{
			connectDB.disconnect();
		}
		
	}
	
	
	public List<Thuoc> getListThuocbyField(String tenColDB, String value) {
		List<Thuoc> listThuoc = new ArrayList<Thuoc>();
		
		String sql = "SELECT * FROM Thuoc WHERE "+ tenColDB + "=?";
		
		ConnectDB  connectDB = ConnectDB.getInstance();
		connectDB.connect();
		
		try (Connection con = connectDB.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)) {
			
			
			stmt.setString(1,  value);
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {
				Thuoc thuoc = new Thuoc();
						thuoc.setMaThuoc(rs.getString("maThuoc"));
						thuoc.setTenThuoc(rs.getString("tenThuoc"));
						thuoc.setDonViTinh(rs.getString("donViTinh"));
						thuoc.setPhanLoai(rs.getString("phanLoai"));
						thuoc.setHinhAnh(rs.getString("hinhAnh"));
						thuoc.setNgayNhap(rs.getDate("ngayNhap").toLocalDate());
						thuoc.setNgayHetHan(rs.getDate("ngayHetHan").toLocalDate());
						thuoc.setdonGia(rs.getDouble("donGia"));
						thuoc.setSoLuong(rs.getInt("soLuong"));
						thuoc.setHamLuong((float)rs.getDouble("hamLuong"));
						
						listThuoc.add(thuoc);
							
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Collections.emptyList();
		}finally {
			connectDB.disconnect();
		}
		return listThuoc;
	}
	
	
	public Thuoc getThuocbyField(String tenColDB, String value) {
		//List<Thuoc> listThuoc = new ArrayList<Thuoc>();
		
		String sql = "SELECT * FROM Thuoc WHERE "+ tenColDB + "=?";
		
		ConnectDB  connectDB = ConnectDB.getInstance();
		connectDB.connect();
		
		try (Connection con = connectDB.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)) {
			
			
			stmt.setString(1,  value);
			ResultSet rs = stmt.executeQuery();
			
			Thuoc thuoc = new Thuoc();
			if(rs.next()) {
				
						thuoc.setMaThuoc(rs.getString("maThuoc"));
						thuoc.setTenThuoc(rs.getString("tenThuoc"));
						thuoc.setDonViTinh(rs.getString("donViTinh"));
						thuoc.setPhanLoai(rs.getString("phanLoai"));
						thuoc.setHinhAnh(rs.getString("hinhAnh"));
						thuoc.setNgayNhap(rs.getDate("ngayNhap").toLocalDate());
						thuoc.setNgayHetHan(rs.getDate("ngayHetHan").toLocalDate());
						thuoc.setdonGia(rs.getDouble("donGia"));
						thuoc.setSoLuong(rs.getInt("soLuong"));
						thuoc.setHamLuong((float)rs.getDouble("hamLuong"));
						
						
							
			}
			return thuoc;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			connectDB.disconnect();
		}
		
	}
	
	
	

}
