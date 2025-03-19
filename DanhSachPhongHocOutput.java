

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
	    out.println("============================================");
	    out.flush();
	
	    for (PhongHocLyThuyet phongHoc : danhSachPhongHocLyThuyet) {
	        LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	        out.println("Mã phòng: " + phongHoc.getMaPhong());
	        out.flush();
	        out.println("Dãy nhà: " + phongHoc.getDayNha());
	        out.flush();
	        out.println("Diện tích: " + phongHoc.getDayNha() + "m2");
	        out.flush();
	        out.println("Số Bóng đèn: " + phongHoc.getSoBongDen());
	        out.flush();
	        out.println("Ngày hoạt động: " + date);
	        out.flush();
	        if (!phongHoc.isMayChieu()) {
	            out.println("Không có máy chiếu");
	            out.flush();
	        } else {
	            out.println("Có máy chiếu");
	            out.flush();
	        }
	        if (!danhSachPhongHocLyThuyet.isEmpty()) { 	
	        	out.println("============================================");
	     	    out.flush();
	        }
	    }
	
	    for (PhongHocMayTinh phongHoc : danhSachPhongHocMayTinh) {
	        LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	        out.println("Mã phòng: " + phongHoc.getMaPhong());
	        out.flush();
	        out.println("Dãy nhà: " + phongHoc.getDayNha());
	        out.flush();
	        out.println("Diện tích: " + phongHoc.getDayNha() + "m2");
	        out.flush();
	        out.println("Số Bóng đèn: " + phongHoc.getSoBongDen());
	        out.flush();
	        out.println("Ngày hoạt động: " + date);
	        out.flush();
	        out.println("Số Lượng máy tính: " + phongHoc.getSoLuongMayTinh());
	        out.flush();
	        if (!danhSachPhongHocMayTinh.isEmpty()) { 	
	        	out.println("============================================");
	     	    out.flush();
	        }
	    }
	
	    for (PhongHocThiNghiem phongHoc : danhSachPhongHocThiNghiem) {
	        LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	        out.println("Mã phòng: " + phongHoc.getMaPhong());
	        out.flush();
	        out.println("Dãy nhà: " + phongHoc.getDayNha());
	        out.flush();
	        out.println("Diện tích: " + phongHoc.getDayNha() + "m2");
	        out.flush();
	        out.println("Số Bóng đèn: " + phongHoc.getSoBongDen());
	        out.flush();
	        out.println("Ngày hoạt động: " + date);
	        out.flush();
	        out.println("Chuyên Ngành: " + phongHoc.getChuyenNganh());
	        out.flush();
	        out.println("Sức chứa: " + phongHoc.getSucChua());
	        out.flush();
	        if (!phongHoc.isBonRua()) {
	            out.println("Không có bồn rửa");
	            out.flush();
	        } else {
	            out.println("Có bồn rửa");
	            out.flush();
	        }
	        out.println("============================================");
	        out.flush();
	    }
    }


}
