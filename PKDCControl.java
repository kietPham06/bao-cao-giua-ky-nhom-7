import java.io.PrintWriter;
import java.util.ArrayList;

public class PKDCControl {
	// Ô 2: Thuộc tính
	PrintWriter out; // Đối tượng dùng để in dữ liệu ra màn hình
	PKDCStorage storage; // Đối tượng quản lý dữ liệu phòng học
	PKDCOutput output; // Đối tượng xử lý xuất dữ liệu
	
	// Ô 3: Phương thức
	
	// Constructor mặc định, khởi tạo các đối tượng cần thiết
	PKDCControl() {
		storage = new PKDCStorage();
		output = new PKDCOutput();
		out = new PrintWriter(System.out);
	}
	
	// Constructor có tham số để tùy chỉnh đối tượng
	PKDCControl(PKDCStorage storage, PKDCOutput output, PrintWriter out) {
        this.storage = storage;
        this.output = output;
        this.out = out;
    }
    
    // In danh sách phòng không đạt chuẩn
    void printDanhSachPKDC() {
    	ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet;
    	ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh;
    	ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem;
        
    	// Lấy dữ liệu từ storage
    	danhSachPhongHocLyThuyet = storage.getDanhSachPhongHocLyThuyet();
    	danhSachPhongHocMayTinh = storage.getDanhSachPhongHocMayTinh();
    	danhSachPhongHocThiNghiem = storage.getDanhSachPhongHocThiNghiem();
    	
    	// In dữ liệu
        out.println("============================================");
        out.flush();
    	out.println("Danh sách phòng không đạt chuẩn: ");
    	out.flush();
    	
    	for (PhongHocLyThuyet phongHocLyThuyet : danhSachPhongHocLyThuyet) {
    		if (phongHocLyThuyet.datChuan() == false) {
    			output.output(phongHocLyThuyet);
    		}
    	}
    	
    	for (PhongHocMayTinh phongHocMayTinh : danhSachPhongHocMayTinh) {
    		if (phongHocMayTinh.datChuan() == false) {
    			output.output(phongHocMayTinh);
    		}
    	}
    	
    	for (PhongHocThiNghiem phongHocThiNghiem : danhSachPhongHocThiNghiem) {
    		if (phongHocThiNghiem.datChuan() == false) {
    			output.output(phongHocThiNghiem);
    		}
    	}
    }
}
