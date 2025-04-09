package Models;

public class ChiTietPhieuDat {
	
	private PhieuDat phieuDat;
	private Thuoc thuoc;
	private int soLuong;
	private Float donGia;
	public PhieuDat getPhieuDat() {
		return phieuDat;
	}
	public void setPhieuDat(PhieuDat phieuDat) {
		this.phieuDat = phieuDat;
	}
	public Thuoc getThuoc() {
		return thuoc;
	}
	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Float getDonGia() {
		return donGia;
	}
	public void setDonGia(Float donGia) {
		this.donGia = donGia;
	}
	public ChiTietPhieuDat(PhieuDat phieuDat, Thuoc thuoc, int soLuong, Float donGia) {
		super();
		this.phieuDat = phieuDat;
		this.thuoc = thuoc;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	public ChiTietPhieuDat() {
		super();
	}
	
	
}
