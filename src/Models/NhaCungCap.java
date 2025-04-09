package Models;

public class NhaCungCap {
	private String maNhaCungCap;
	private String tenNhaCungCap;
	private String diaChi;
	private String sdt;
	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}
	public void setmaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	public String gettenNhaCungCap() {
		return tenNhaCungCap;
	}
	public void settenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
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
	public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChi, String sdt) {
		super();
		this.maNhaCungCap = maNhaCungCap;
		this.tenNhaCungCap = tenNhaCungCap;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}
	public NhaCungCap(String maNhaCungCap) {
		super();
		this.maNhaCungCap=maNhaCungCap;
	}
	
}
