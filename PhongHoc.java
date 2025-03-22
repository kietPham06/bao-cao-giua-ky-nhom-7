
public class PhongHoc {
    // Ô 2
    String maPhong; // Thuộc tính
    String dayNha;
    double dienTich;
    int soBongDen;
    String ngayHoatDong; // Kiểu ngày java
    
    // Ô 3
    // Constructor mặc định
   PhongHoc() {
        // Không cần code vì các giá trị mặc định là 0 hoặc null
    }
    // Constructor có tham số
    // Dùng để truyền giá trị từ bên ngoài vào thuộc tính tạo nên trạng thái của đối tượng
   	// Trạng thái là tập hợp các giá trị thuộc tính tại thời điểm nhất định
    PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen, String ngayHoatDong) {
    	// Gán tham số có giá trị cho thuộc tính
        this.maPhong = maPhong; // this dùng để phần biệt giữa thuộc tính và tham số
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
        this.ngayHoatDong = ngayHoatDong;
    }

    // Getter & Setter
    // Getter dùng để lấy ra giá trị của một thuộc tính tại thời điểm nhất định
    // Setter dùng để thay đổi giá trị thuộc tính, tức trạng thái của một đối tượng sẽ thay đổi
    String getMaPhong() {
        return maPhong;
    }
  
	String getDayNha() {
		return dayNha;
	}
	void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	double getDienTich() {
		return dienTich;
	}
	void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	int getSoBongDen() {
		return soBongDen;
	}
	void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	String getNgayHoatDong() {
		return ngayHoatDong;
	}
	void setNgayHoatDong(String ngayHoatDong) {
		this.ngayHoatDong = ngayHoatDong;
	}
	void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	
	boolean datChuan() {
    	int soBongDenCanThiet = (int) Math.ceil(dienTich / 10); // Làm tròn lên và ép về kiểu int
        return soBongDen >= soBongDenCanThiet;
    } 
    
}
