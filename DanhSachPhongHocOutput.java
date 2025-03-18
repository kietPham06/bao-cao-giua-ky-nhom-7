

import java.io.PrintWriter;
import java.util.ArrayList;

public class DanhSachPhongHocOutput {
	
	//Ô 2
	PrintWriter out;
    
	// Ô 3
    DanhSachPhongHocOutput() {
    	out = new PrintWriter(System.out);
    }
    
    void output(ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet, ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh, ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem) {
    	
    	for (PhongHocLyThuyet phongHoc : danhSachPhongHocLyThuyet) {
    		out.println("Mã Phòng: " + phongHoc.maPhong);
    		out.flush();
    	}
    	
    	for (PhongHocMayTinh phongHoc : danhSachPhongHocMayTinh) {
    		out.println("Mã Phòng: " + phongHoc.maPhong);
    		out.flush();
    	}
    	
    	for (PhongHocThiNghiem phongHoc : danhSachPhongHocThiNghiem) {
    		out.println("Mã Phòng: " + phongHoc.maPhong);
    		out.flush();
    	}
    }
}
