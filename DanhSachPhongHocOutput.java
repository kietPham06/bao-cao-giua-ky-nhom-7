

import java.io.PrintWriter;
import java.time.LocalDate;
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
    		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
    		out.println("Mã Phòng: " + phongHoc.maPhong);
    		out.flush();
    		out.println("Ngày hoạt động: " + date);
    		out.flush();
    	}
    	
    	for (PhongHocMayTinh phongHoc : danhSachPhongHocMayTinh) {
    		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
    		out.println("Mã Phòng: " + phongHoc.maPhong);
    		out.flush();
    		out.println("Ngày hoạt động: " + date);
    		out.flush();
    	}
    	
    	for (PhongHocThiNghiem phongHoc : danhSachPhongHocThiNghiem) {
    		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
    		out.println("Mã Phòng: " + phongHoc.maPhong);
    		out.flush();
    		out.println("Ngày hoạt động: " + date);
    		out.flush();
    	}
    }
}
