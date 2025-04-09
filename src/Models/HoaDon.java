package Models;

import java.time.LocalDateTime;
import java.util.Date;

public class HoaDon {
	private String maHoaDon;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private String diaChiNhaThuoc;
	private LocalDateTime ngayLapHoaDon;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public String getDiaChiNhaThuoc() {
		return diaChiNhaThuoc;
	}
	public void setDiaChiNhaThuoc(String diaChiNhaThuoc) {
		this.diaChiNhaThuoc = diaChiNhaThuoc;
	}
	public LocalDateTime getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(LocalDateTime ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public HoaDon(String maHoaDon, NhanVien nhanVien, KhachHang khachHang, String diaChiNhaThuoc,
			LocalDateTime ngayLapHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.diaChiNhaThuoc = diaChiNhaThuoc;
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public HoaDon(String maHoaDon) {
		super();
		this.maHoaDon=maHoaDon;
	}
	
	
	
	
}
