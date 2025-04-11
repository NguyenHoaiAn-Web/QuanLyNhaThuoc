package Service;

import java.sql.Connection;
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
                    rs.getDate("ngayNhap"),
                    rs.getDate("ngayHetHan"),
                    rs.getDouble("donGia"),
                    rs.getInt("soLuong"),
                    rs.getDouble("hamLuong")
                );
            	dsThuoc.add(thuoc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // In a real application, you might want to throw a custom exception
        }
        return dsThuoc;
	}

}
