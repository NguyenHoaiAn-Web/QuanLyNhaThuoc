package Models;

import java.util.Date;

public class HoaDon {
	private String maHoaDon;
	private String maNV;
	private String tenNhanVien;
	private String tenKhachHang;
	private String maKhachHang;
	private String maChiTiet;
	private String diaChiNhaThuoc;
	private Date ngayLapHoaDon;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getMaChiTiet() {
		return maChiTiet;
	}
	public void setMaChiTiet(String maChiTiet) {
		this.maChiTiet = maChiTiet;
	}
	public String getDiaChiNhaThuoc() {
		return diaChiNhaThuoc;
	}
	public void setDiaChiNhaThuoc(String diaChiNhaThuoc) {
		this.diaChiNhaThuoc = diaChiNhaThuoc;
	}
	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public HoaDon(String maHoaDon, String maNV, String tenNhanVien, String tenKhachHang, String maKhachHang,
			String maChiTiet, String diaChiNhaThuoc, Date ngayLapHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.maNV = maNV;
		this.tenNhanVien = tenNhanVien;
		this.tenKhachHang = tenKhachHang;
		this.maKhachHang = maKhachHang;
		this.maChiTiet = maChiTiet;
		this.diaChiNhaThuoc = diaChiNhaThuoc;
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public HoaDon() {
		super();
	}
	
}
