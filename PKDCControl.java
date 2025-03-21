import java.io.PrintWriter;
import java.util.ArrayList;

public class PKDCControl {
	// Ô 2
	PrintWriter out;
	PKDCStorage storage;
	PKDCOutput output;
	
	// Ô 3
	PKDCControl() {
		storage = new PKDCStorage();
		output = new PKDCOutput();
		out = new PrintWriter(System.out);
	}
	PKDCControl(PKDCStorage storage, PKDCOutput output, PrintWriter out) {
        
    }
    
    void printDanhSachPKDC() {
    	ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet;
    	ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh;
    	ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem;
        
    	// Lấy dữ liệu
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