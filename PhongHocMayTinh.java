
public class PhongHocMayTinh extends PhongHoc {
	// Ô 2
	int soLuongMayTinh;
	
	// Ô 3
	// Constructor mặc định
	PhongHocMayTinh() {
		// Không cần code vì các giá trị mặc định là 0 hoặc null
	}
	
	PhongHocMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, String ngayHoatDong, int soLuongMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong); //super dùng để gọi constructor tham số của lớp cha đẻ gán lại các tham số cho thuộc tính
		this.soLuongMayTinh = soLuongMayTinh; // this dùng để phần biệt giữa thuộc tính và tham số
	}

	// Getter & Setter
    // Getter dùng để lấy ra giá trị của một thuộc tính tại thời điểm nhất định
    // Setter dùng để thay đổi giá trị thuộc tính, tức trạng thái của một đối tượng sẽ thay đổi
	int getSoLuongMayTinh() {
		return soLuongMayTinh;
	}

	void setSoLuongMayTinh(int soLuongMayTinh) {
		this.soLuongMayTinh = soLuongMayTinh;
	}
	
	@Override // Kiểm tra ghi đè
	boolean datChuan() { // Cài đặt lại thân method (body of method)
		int soBongDenCanThiet = (int) Math.ceil(dienTich / 10); // Làm tròn lên và ép về kiểu int
		int soLuongMayTinhCanThiet = (int) Math.ceil(dienTich / 1.5); // Làm tròn lên và ép về kiểu int
        return soBongDen >= soBongDenCanThiet && soLuongMayTinh >= soLuongMayTinhCanThiet;
	}

}
