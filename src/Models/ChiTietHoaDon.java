package Models;

public class ChiTietHoaDon {
	private String maChiTiet;
	private String tenThuoc;
	private int soLuong;
	private double giaThuoc;
	public String getMaChiTiet() {
		return maChiTiet;
	}
	public void setMaChiTiet(String maChiTiet) {
		this.maChiTiet = maChiTiet;
	}
	public String getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getGiaThuoc() {
		return giaThuoc;
	}
	public void setGiaThuoc(double giaThuoc) {
		this.giaThuoc = giaThuoc;
	}
	public ChiTietHoaDon(String maChiTiet, String tenThuoc, int soLuong, double giaThuoc) {
		super();
		this.maChiTiet = maChiTiet;
		this.tenThuoc = tenThuoc;
		this.soLuong = soLuong;
		this.giaThuoc = giaThuoc;
	}
	public ChiTietHoaDon() {
		super();
	}
	
}
