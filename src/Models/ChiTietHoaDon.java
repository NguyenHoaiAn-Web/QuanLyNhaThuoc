package Models;

public class ChiTietHoaDon {
	private HoaDon hoaD;
	private Thuoc thuoc;
	private int soLuong;
	private double giaThuoc;
	public HoaDon getHoaD() {
		return hoaD;
	}
	public void setHoaD(HoaDon hoaD) {
		this.hoaD = hoaD;
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
	public double getGiaThuoc() {
		return giaThuoc;
	}
	public void setGiaThuoc(double giaThuoc) {
		this.giaThuoc = giaThuoc;
	}
	public ChiTietHoaDon(HoaDon hoaD, Thuoc thuoc, int soLuong, double giaThuoc) {
		super();
		this.hoaD = hoaD;
		this.thuoc = thuoc;
		this.soLuong = soLuong;
		this.giaThuoc = giaThuoc;
	}
	public ChiTietHoaDon() {
		super();
	}
	
	
}
