package Models;

import java.util.Date;

public class PhieuNhap {
	private String maPhieuNhap;
	private Date ngayNhap;
	private NhaCungCap nhaCungcap;
	private double tongTienPhieuNhap;
	public String getMaPhieuNhap() {
		return maPhieuNhap;
	}
	public void setMaPhieuNhap(String maPhieuNhap) {
		this.maPhieuNhap = maPhieuNhap;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public NhaCungCap getNhaCungcap() {
		return nhaCungcap;
	}
	public void setNhaCungcap(NhaCungCap nhaCungcap) {
		this.nhaCungcap = nhaCungcap;
	}

	public double getTongTienPhieuNhap() {
		return tongTienPhieuNhap;
	}
	public void setTongTienPhieuNhap(double tongTienPhieuNhap) {
		this.tongTienPhieuNhap = tongTienPhieuNhap;
	}
	public PhieuNhap(String maPhieuNhap, Date ngayNhap, NhaCungCap nhaCungcap, String diaChiNhaSanXuat,
			double tongTienPhieuNhap) {
		super();
		this.maPhieuNhap = maPhieuNhap;
		this.ngayNhap = ngayNhap;
		this.nhaCungcap = nhaCungcap;
		this.tongTienPhieuNhap = tongTienPhieuNhap;
	}
	public PhieuNhap(String maPhieuNhap) {
		super();
		this.maPhieuNhap=maPhieuNhap;
	}
	
}
