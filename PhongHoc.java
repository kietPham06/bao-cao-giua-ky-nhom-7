
public class PhongHoc {
    // ô 2
    String maPhong; // thuộc tính
    String dayNha;
    double dienTich;
    int soBongDen;
    int nam;
    int thang;
    int ngay;
    
    // ô 3
    // Constructor mặc định
   PhongHoc() {
        // Không cần code vì các giá trị mặc định là 0 hoặc null
    }
    // Constructor có tham số
    // dùng để truyền giá trị từ bên ngoài vào thuộc tính tạo nên trạng thái của đối tượng
   	// trạng thái là tập hợp các giá trị thuộc tính tại thời điểm nhất định
    PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen, int nam, int thang, int ngay) {
    	// Gán tham số có giá trị cho thuộc tính
        this.maPhong = maPhong; // this dùng để phần biệt giữa thuộc tính và tham số
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
        this.nam = nam;
        this.thang = thang;
        this.ngay = ngay;
    }

    // Getter & Setter
    // Getter dùng để lấy ra giá trị của một thuộc tính tại thời điểm nhất định
    // Setter dùng để thay đổi giá trị thuộc tính, tức trạng thái của một đối tượng sẽ thay đổi
    String getMaPhong() {
        return maPhong;
    }

    void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
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

    int getNam() {
        return nam;
    }

    void setNam(int nam) {
        this.nam = nam;
    }

    int getThang() {
        return thang;
    }

    void setThang(int thang) {
        this.thang = thang;
    }

    int getNgay() {
        return ngay;
    }

    void setNgay(int ngay) {
        this.ngay = ngay;
    }
    
    boolean datChuan() {
    	int soBongDenCanThiet = (int) Math.ceil(dienTich / 10); // làm tròn lên và ép về kiểu int
        return soBongDen >= soBongDenCanThiet;
    }
    
}
