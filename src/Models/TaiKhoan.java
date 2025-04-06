package Models;

public class TaiKhoan {
	private String tenTaiKhoan;
	private String passWord;
	private String maNV;
	private Boolean trangThai;
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public Boolean getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}
	public TaiKhoan(String tenTaiKhoan, String passWord, String maNV, Boolean trangThai) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.passWord = passWord;
		this.maNV = maNV;
		this.trangThai = trangThai;
	}
	public TaiKhoan() {
		super();
	}
	
	
}
