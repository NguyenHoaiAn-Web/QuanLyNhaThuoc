package Models;

import java.util.Date;

public class NhanVien {
	private String maNV, tenNV, vaiTro, sdt, maHoaDon, trinhDo;
	private Date namSinh;
	
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String tenNV, String vaiTro, String sdt, String maHoaDon, String trinhDo,
			Date namSinh) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.vaiTro = vaiTro;
		this.sdt = sdt;
		this.maHoaDon = maHoaDon;
		this.trinhDo = trinhDo;
		this.namSinh = namSinh;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
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

}
