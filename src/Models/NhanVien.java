package Models;

import java.util.Date;

public class NhanVien {
	private String maNhanVien, tenNhanVien, vaiTro, soDienThoai, maHoaDon, trinhDo, gioiTinh,maTaiKhoan;
	private Date namSinh;
	
	public NhanVien(String maNhanVien) {
		super();
		this.maNhanVien=maNhanVien;
	}
	public NhanVien(String maNhanVien, String tenNhanVien, String vaiTro, String soDienThoai, String maHoaDon, String trinhDo,String gioiTinh,String maTaiKhoan,
			Date namSinh) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.vaiTro = vaiTro;
		this.soDienThoai = soDienThoai;
		this.maHoaDon = maHoaDon;
		this.trinhDo = trinhDo;
		this.gioiTinh = gioiTinh;
		this.maTaiKhoan=maTaiKhoan;
		this.namSinh = namSinh;
	}
	public String getmaNhanVien() {
		return maNhanVien;
	}
	public void setmaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String gettenNhanVien() {
		return tenNhanVien;
	}
	public void settenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	public String getsoDienThoai() {
		return soDienThoai;
	}
	public void setsoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public Date getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	
}
