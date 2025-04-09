package Models;

public class TaiKhoan {
	private String maTaiKhoan;
	private String tenTaiKhoan;
	private String passWord;
	private String maNV;
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

	
	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	public TaiKhoan(String tenTaiKhoan, String passWord, String maNV, Boolean trangThai) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.passWord = passWord;
		this.maNV = maNV;
		
	}
	public TaiKhoan(String maTaiKhoan) {
		super();
		this.maTaiKhoan=maTaiKhoan;
	}
	
	
}
