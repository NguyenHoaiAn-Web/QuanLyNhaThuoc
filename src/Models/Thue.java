package Models;

public class Thue {
	private String maThue;
	private String tenThue;
	private float phanTramThue;
	public String getMaThue() {
		return maThue;
	}
	public void setMaThue(String maThue) {
		this.maThue = maThue;
	}
	public String getTenThue() {
		return tenThue;
	}
	public void setTenThue(String tenThue) {
		this.tenThue = tenThue;
	}
	public float getPhanTramThue() {
		return phanTramThue;
	}
	public void setPhanTramThue(float phanTramThue) {
		this.phanTramThue = phanTramThue;
	}
	public Thue(String maThue, String tenThue, float phanTramThue) {
		super();
		this.maThue = maThue;
		this.tenThue = tenThue;
		this.phanTramThue = phanTramThue;
	}
	public Thue(String maThue) {
		super();
		this.maThue=maThue;
	}
	
}
