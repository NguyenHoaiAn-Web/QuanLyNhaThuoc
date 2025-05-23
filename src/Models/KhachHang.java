package Models;

public class KhachHang {
	private String maKhachHang, tenKhachHang,soDienThoai,diaChi;
	private String maHoaDon;
	private boolean gioiTinh;
	private int diemTichLuy;
	public KhachHang(String maKhachHang, String tenKhachHang, String soDienThoai, String diaChi, String maHoaDon,
			boolean gioiTinh, int diemTichLuy) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.maHoaDon = maHoaDon;
		this.gioiTinh = gioiTinh;
		this.diemTichLuy = diemTichLuy;
	}
	public KhachHang(String maKhachHang) {
		super();
		this.maKhachHang=maKhachHang;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getsoDienThoai() {
		return soDienThoai;
	}
	public void setsoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getDiemTichLuy() {
		return diemTichLuy;
	}
	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}
	
}
