package Models;

import java.util.Date;

public class ChiTietPhieuNhap {
	private String maChiTiet;
	private String maThuoc;
	private String tenThuoc;
	private int soLuong;
	private double donGiaNhap;
	private double thanhTien;
	private Date hanSuDung;
	private int soLo;
	private double giaNhapThuoc;
	public String getMaChiTiet() {
		return maChiTiet;
	}
	public void setMaChiTiet(String maChiTiet) {
		this.maChiTiet = maChiTiet;
	}
	public String getMaThuoc() {
		return maThuoc;
	}
	public void setMaThuoc(String maThuoc) {
		this.maThuoc = maThuoc;
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
	public double getDonGiaNhap() {
		return donGiaNhap;
	}
	public void setDonGiaNhap(double donGiaNhap) {
		this.donGiaNhap = donGiaNhap;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	public Date getHanSuDung() {
		return hanSuDung;
	}
	public void setHanSuDung(Date hanSuDung) {
		this.hanSuDung = hanSuDung;
	}
	public int getSoLo() {
		return soLo;
	}
	public void setSoLo(int soLo) {
		this.soLo = soLo;
	}
	public double getGiaNhapThuoc() {
		return giaNhapThuoc;
	}
	public void setGiaNhapThuoc(double giaNhapThuoc) {
		this.giaNhapThuoc = giaNhapThuoc;
	}
	public ChiTietPhieuNhap(String maChiTiet, String maThuoc, String tenThuoc, int soLuong, double donGiaNhap,
			double thanhTien, Date hanSuDung, int soLo, double giaNhapThuoc) {
		super();
		this.maChiTiet = maChiTiet;
		this.maThuoc = maThuoc;
		this.tenThuoc = tenThuoc;
		this.soLuong = soLuong;
		this.donGiaNhap = donGiaNhap;
		this.thanhTien = thanhTien;
		this.hanSuDung = hanSuDung;
		this.soLo = soLo;
		this.giaNhapThuoc = giaNhapThuoc;
	}
	public ChiTietPhieuNhap() {
		super();
	}
	
}
