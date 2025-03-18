import java.util.ArrayList;
import java.util.List;

public class MemoryPhongHocDatabase {
	
	// Ô 2 - Biến static
	static ArrayList<PhongHocLyThuyet> dataBasePhongHocLyThuyet = new ArrayList<PhongHocLyThuyet>();
	static ArrayList<PhongHocMayTinh> dataBasePhongHocMayTinh = new ArrayList<PhongHocMayTinh>();
	static ArrayList<PhongHocThiNghiem> dataBasePhongHocThiNghiem = new ArrayList<PhongHocThiNghiem>();
	static ArrayList<PhongHoc> dataBasePKDC = new ArrayList<>();
	
	// Ô 3
	//INSERT
	static void addPhongHocLyThuyet(PhongHocLyThuyet phongHoc) {
		dataBasePhongHocLyThuyet.add(phongHoc);
	}
	static void addPhongHocMayTinh(PhongHocMayTinh phongHoc) {
		dataBasePhongHocMayTinh.add(phongHoc);
	}
	static void addPhongHocThiNghiem(PhongHocThiNghiem phongHoc) {
		dataBasePhongHocThiNghiem.add(phongHoc);
	}
	
	//SELECT
	static PhongHocLyThuyet searchPhongHocLyThuyet(String maPhong) {
	    for (int i = 0; i < dataBasePhongHocLyThuyet.size(); i++) {
	        if (dataBasePhongHocLyThuyet.get(i).getMaPhong().equals(maPhong)) {
	            return dataBasePhongHocLyThuyet.get(i); // Trả về phòng học tìm thấy
	        }
	    }
	    return null; // Trả về null nếu không tìm thấy
	}
	
	static PhongHocMayTinh searchPhongHocMayTinh(String maPhong) {
	    for (int i = 0; i < dataBasePhongHocMayTinh.size(); i++) {
	        if (dataBasePhongHocMayTinh.get(i).getMaPhong().equals(maPhong)) {
	            return dataBasePhongHocMayTinh.get(i); // Trả về phòng học tìm thấy
	        }
	    }
	    return null; // Trả về null nếu không tìm thấy
	}
	static PhongHocThiNghiem searchPhongHocThiNghiem(String maPhong) {
	    for (int i = 0; i < dataBasePhongHocThiNghiem.size(); i++) {
	        if (dataBasePhongHocThiNghiem.get(i).getMaPhong().equals(maPhong)) {
	            return dataBasePhongHocThiNghiem.get(i); // Trả về phòng học tìm thấy
	        }
	    }
	    return null; // Trả về null nếu không tìm thấy
	}
	
	static ArrayList<PhongHocLyThuyet> getDanhSachPhongHocLyThuyet() {
        return dataBasePhongHocLyThuyet;
    }
    
    static ArrayList<PhongHocMayTinh> getDanhSachPhongHocMayTinh() {
        return dataBasePhongHocMayTinh;
    }
    
    static ArrayList<PhongHocThiNghiem> getDanhSachPhongHocThiNghiem() {
        return dataBasePhongHocThiNghiem;
    }
	
	//UPDATE
    static void setPhongHocLyThuyet(String maPhong, PhongHocLyThuyet phongHocMoi) {
        PhongHocLyThuyet phongHoc = searchPhongHocLyThuyet(maPhong); // Tìm phòng trước
        if (phongHoc != null) {
            phongHoc.setDayNha(phongHocMoi.getDayNha());
            phongHoc.setDienTich(phongHocMoi.getDienTich());
            phongHoc.setSoBongDen(phongHocMoi.getSoBongDen());
            phongHoc.setNam(phongHocMoi.getNam());
            phongHoc.setThang(phongHocMoi.getThang());
            phongHoc.setNgay(phongHocMoi.getNgay());
            phongHoc.setMayChieu(phongHocMoi.isMayChieu());
        }
    }
    
    static void setPhongHocMayTinh(String maPhong, PhongHocMayTinh phongHocMoi) {
        PhongHocMayTinh phongHoc = searchPhongHocMayTinh(maPhong);
        if (phongHoc != null) {
            phongHoc.setDayNha(phongHocMoi.getDayNha());
            phongHoc.setDienTich(phongHocMoi.getDienTich());
            phongHoc.setSoBongDen(phongHocMoi.getSoBongDen());
            phongHoc.setNam(phongHocMoi.getNam());
            phongHoc.setThang(phongHocMoi.getThang());
            phongHoc.setNgay(phongHocMoi.getNgay());
            phongHoc.setSoLuongMayTinh(phongHocMoi.getSoLuongMayTinh());
        }
    }

    static void setPhongHocThiNghiem(String maPhong, PhongHocThiNghiem phongHocMoi) {
        PhongHocThiNghiem phongHoc = searchPhongHocThiNghiem(maPhong);
        if (phongHoc != null) {
            phongHoc.setDayNha(phongHocMoi.getDayNha());
            phongHoc.setDienTich(phongHocMoi.getDienTich());
            phongHoc.setSoBongDen(phongHocMoi.getSoBongDen());
            phongHoc.setNam(phongHocMoi.getNam());
            phongHoc.setThang(phongHocMoi.getThang());
            phongHoc.setNgay(phongHocMoi.getNgay());
            phongHoc.setChuyenNganh(phongHocMoi.getChuyenNganh());
            phongHoc.setSucChua(phongHocMoi.getSucChua());
            phongHoc.setBonRua(phongHocMoi.isBonRua());
        }
    }
	
	//DELETE
	static void removePhongHocLyThuyet(String maPhong) {
		// duyệt từ cuối lên đầu
		for (int i = dataBasePhongHocLyThuyet.size() - 1; i >= 0; i--) {
	        if (dataBasePhongHocLyThuyet.get(i).getMaPhong().equals(maPhong)) {
	            dataBasePhongHocLyThuyet.remove(i);
	            break; // Thoát vòng lặp sau khi tìm thấy phòng cần xóa
	        }
	    }
	}
	static void removePhongHocMayTinh(String maPhong) {
		// duyệt từ cuối lên đầu
		for (int i = dataBasePhongHocMayTinh.size() - 1; i >= 0; i--) {
	        if (dataBasePhongHocMayTinh.get(i).getMaPhong().equals(maPhong)) {
	            dataBasePhongHocMayTinh.remove(i);
	            break; // Thoát vòng lặp sau khi tìm thấy phòng cần xóa
	        }
	    }		
	}
	static void removePhongHocThiNghiem(String maPhong) {
		// duyệt từ cuối lên đầu
		for (int i = dataBasePhongHocThiNghiem.size() - 1; i >= 0; i--) {
	        if (dataBasePhongHocThiNghiem.get(i).getMaPhong().equals(maPhong)) {
	            dataBasePhongHocThiNghiem.remove(i);
	            break; // Thoát vòng lặp sau khi tìm thấy phòng cần xóa
	        }
	    }
	}
}