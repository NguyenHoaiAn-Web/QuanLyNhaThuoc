package Service;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import ConnectDB.ConnectDB;
import Models.Thuoc;

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
	
	/*public boolean themThuocService(Thuoc thuoc) {
		String sql = "INSERT INTO Thuoc (maThuoc, tenThuoc, hinhAnh, ngayNhap, ngayHetHan, soLuong, donViTinh, donGia, phanLoai, hamLuong)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		ConnectDB connectDB = ConnectDB.getInstance();
		
		try(Connection con = connectDB.getConnection();
	             PreparedStatement stmt = con.prepareStatement(sql)) {
			
			SimpleDateFormat  formatter = new SimpleDateFormat("yyyy-MM-dd");
			String ngayNhap = formatter.format(thuoc.getNgayNhap());
			String ngayHetHan = formatter.format(thuoc.getNgayHetHan());
			
            stmt.setString(1, thuoc.getMaThuoc());
            stmt.setString(2, thuoc.getTenThuoc());
            stmt.setString(3, thuoc.getHinhAnh());
            stmt.setDate(4, Date.valueOf(ngayNhap));
            stmt.setDate(5, Date.valueOf(ngayHetHan));
            stmt.setInt(6, thuoc.getSoLuong());
            stmt.setString(7, thuoc.getDonViTinh());
            stmt.setDouble(8, thuoc.getdonGia());
            stmt.setString(9, thuoc.getPhanLoai());
            stmt.setDouble(10, thuoc.getHamLuong());
            
            int rowAffected = stmt.executeUpdate();
            return rowAffected >0;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}*/

}
