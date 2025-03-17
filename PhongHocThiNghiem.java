
public class PhongHocThiNghiem extends PhongHoc {
	// ô 2
	String chuyenNganh;
	int sucChua;
	boolean bonRua;
	
	// ô 3
	// Constructor mặc định
	PhongHocThiNghiem() {
		// Không cần code vì các giá trị mặc định là 0 hoặc null
	}
	
	PhongHocThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, int nam, int thang, int ngay, String chuyenNganh, int sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen, nam, thang, ngay); //super dùng để gọi constructor tham số của lớp cha đẻ gán lại các tham số cho thuộc tính
		this.chuyenNganh = chuyenNganh; // this dùng để phần biệt giữa thuộc tính và tham số
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}

	// Getter & Setter
    // Getter dùng để lấy ra giá trị của một thuộc tính tại thời điểm nhất định
    // Setter dùng để thay đổi giá trị thuộc tính, tức trạng thái của một đối tượng sẽ thay đổi
	String getChuyenNganh() {
		return chuyenNganh;
	}

	void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	int getSucChua() {
		return sucChua;
	}

	void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	boolean isBonRua() {
		return bonRua;
	}

	void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	
	boolean datChuan() {
		int soBongDenCanThiet = (int) Math.ceil(dienTich / 10); // làm tròn và ép về kiểu int
        return soBongDen >= soBongDenCanThiet && bonRua;
	}
	
	
	
}
