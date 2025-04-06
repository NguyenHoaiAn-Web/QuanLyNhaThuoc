package Models;

public class NhaCungCap {
	private String maNhaSX;
	private String tenNhaSanXuat;
	private String diaChi;
	private String sdt;
	public String getMaNhaSX() {
		return maNhaSX;
	}
	public void setMaNhaSX(String maNhaSX) {
		this.maNhaSX = maNhaSX;
	}
	public String getTenNhaSanXuat() {
		return tenNhaSanXuat;
	}
	public void setTenNhaSanXuat(String tenNhaSanXuat) {
		this.tenNhaSanXuat = tenNhaSanXuat;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public NhaCungCap(String maNhaSX, String tenNhaSanXuat, String diaChi, String sdt) {
		super();
		this.maNhaSX = maNhaSX;
		this.tenNhaSanXuat = tenNhaSanXuat;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}
	public NhaCungCap() {
		super();
	}
	
}
