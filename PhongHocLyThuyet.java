
public class PhongHocLyThuyet extends PhongHoc {
	// Ô 2
	boolean mayChieu;
	
	// Ô 3
	// Constructor mặc định
	PhongHocLyThuyet() {
		 // Không cần code vì các giá trị mặc định là 0 hoặc null
	}
	
	PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen,  String ngayHoatDong, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong); //super dùng để gọi constructor tham số của lớp cha đẻ gán lại các tham số cho thuộc tính
		this.mayChieu = mayChieu; // this dùng để phần biệt giữa thuộc tính và tham số
	}

	// Getter & Setter
    // Getter dùng để lấy ra giá trị của một thuộc tính tại thời điểm nhất định
    // Setter dùng để thay đổi giá trị thuộc tính, tức trạng thái của một đối tượng sẽ thay đổi
	boolean isMayChieu() { //getter
		return mayChieu;
	}

	void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	
	@Override // Kiểm tra ghi đè 
	boolean datChuan() { // Cài đặt lại thân method (body of method)
		int soBongDenCanThiet = (int) Math.ceil(dienTich / 10); // Làm tròn và ép về kiểu int
        return soBongDen >= soBongDenCanThiet && mayChieu;
	}

	@Override
	public String toString() {
		return "Mã phòng: " + maPhong + "\n" +
		           "Dãy nhà: " + dayNha + "\n" +
		           "Số bóng đèn: " + soBongDen + "\n" +
		           "Máy chiếu: " + mayChieu + "\n";
	}
	
	
	
}
