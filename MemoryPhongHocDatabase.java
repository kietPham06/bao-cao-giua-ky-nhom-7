import java.util.ArrayList;

public class MemoryPhongHocDatabase {
    
    // Ô 2: Thuộc tính - Biến static lưu trữ danh sách phòng học
    static ArrayList<PhongHocLyThuyet> dataBasePhongHocLyThuyet = new ArrayList<>();
    static ArrayList<PhongHocMayTinh> dataBasePhongHocMayTinh = new ArrayList<>();
    static ArrayList<PhongHocThiNghiem> dataBasePhongHocThiNghiem = new ArrayList<>();
    
    // Ô 3: Phương thức
    
    // INSERT - Thêm phòng học vào danh sách
    static void addPhongHocLyThuyet(PhongHocLyThuyet phongHoc) {
        dataBasePhongHocLyThuyet.add(phongHoc);
    }
    static void addPhongHocMayTinh(PhongHocMayTinh phongHoc) {
        dataBasePhongHocMayTinh.add(phongHoc);
    }
    static void addPhongHocThiNghiem(PhongHocThiNghiem phongHoc) {
        dataBasePhongHocThiNghiem.add(phongHoc);
    }
    
    // SELECT - Tìm kiếm phòng học theo mã phòng
    static PhongHocLyThuyet searchPhongHocLyThuyet(String maPhong) {
        for (int i = dataBasePhongHocLyThuyet.size() - 1; i >= 0; i--) {
            if (dataBasePhongHocLyThuyet.get(i).getMaPhong().equals(maPhong)) {
                return dataBasePhongHocLyThuyet.get(i);
            }
        }
        return null;
    }

    static PhongHocMayTinh searchPhongHocMayTinh(String maPhong) {
        for (int i = dataBasePhongHocMayTinh.size() - 1; i >= 0; i--) {
            if (dataBasePhongHocMayTinh.get(i).getMaPhong().equals(maPhong)) {
                return dataBasePhongHocMayTinh.get(i);
            }
        }
        return null;
    }

    static PhongHocThiNghiem searchPhongHocThiNghiem(String maPhong) {
        for (int i = dataBasePhongHocThiNghiem.size() - 1; i >= 0; i--) {
            if (dataBasePhongHocThiNghiem.get(i).getMaPhong().equals(maPhong)) {
                return dataBasePhongHocThiNghiem.get(i);
            }
        }
        return null;
    }
    
    // Lấy danh sách các phòng học
    static ArrayList<PhongHocLyThuyet> getDanhSachPhongHocLyThuyet() {
        return dataBasePhongHocLyThuyet;
    }
    
    static ArrayList<PhongHocMayTinh> getDanhSachPhongHocMayTinh() {
        return dataBasePhongHocMayTinh;
    }
    
    static ArrayList<PhongHocThiNghiem> getDanhSachPhongHocThiNghiem() {
        return dataBasePhongHocThiNghiem;
    }
    
    // UPDATE - Cập nhật thông tin phòng học theo mã phòng
    static void setPhongHocLyThuyet(String maPhong, PhongHocLyThuyet phongHocMoi) {
        PhongHocLyThuyet phongHoc = searchPhongHocLyThuyet(maPhong);
        if (phongHoc != null) {
            phongHoc.setDayNha(phongHocMoi.getDayNha());
            phongHoc.setDienTich(phongHocMoi.getDienTich());
            phongHoc.setSoBongDen(phongHocMoi.getSoBongDen());
            phongHoc.setNgayHoatDong(phongHocMoi.getNgayHoatDong());
            phongHoc.setMayChieu(phongHocMoi.isMayChieu());
        }
    }
    
    static void setPhongHocMayTinh(String maPhong, PhongHocMayTinh phongHocMoi) {
        PhongHocMayTinh phongHoc = searchPhongHocMayTinh(maPhong);
        if (phongHoc != null) {
            phongHoc.setDayNha(phongHocMoi.getDayNha());
            phongHoc.setDienTich(phongHocMoi.getDienTich());
            phongHoc.setSoBongDen(phongHocMoi.getSoBongDen());
            phongHoc.setNgayHoatDong(phongHocMoi.getNgayHoatDong());
            phongHoc.setSoLuongMayTinh(phongHocMoi.getSoLuongMayTinh());
        }
    }

    static void setPhongHocThiNghiem(String maPhong, PhongHocThiNghiem phongHocMoi) {
        PhongHocThiNghiem phongHoc = searchPhongHocThiNghiem(maPhong);
        if (phongHoc != null) {
            phongHoc.setDayNha(phongHocMoi.getDayNha());
            phongHoc.setDienTich(phongHocMoi.getDienTich());
            phongHoc.setSoBongDen(phongHocMoi.getSoBongDen());
            phongHoc.setNgayHoatDong(phongHocMoi.getNgayHoatDong());
            phongHoc.setChuyenNganh(phongHocMoi.getChuyenNganh());
            phongHoc.setSucChua(phongHocMoi.getSucChua());
            phongHoc.setBonRua(phongHocMoi.isBonRua());
        }
    }
    
    // DELETE - Xóa phòng học khỏi danh sách
    static PhongHocLyThuyet removePhongHocLyThuyet(String maPhong) {
        PhongHocLyThuyet phong = searchPhongHocLyThuyet(maPhong);
        if (phong != null) {
            dataBasePhongHocLyThuyet.remove(phong);
        }
        return phong;
    }

    static PhongHocMayTinh removePhongHocMayTinh(String maPhong) {
        PhongHocMayTinh phong = searchPhongHocMayTinh(maPhong);
        if (phong != null) {
            dataBasePhongHocMayTinh.remove(phong);
        }
        return phong;
    }

    static PhongHocThiNghiem removePhongHocThiNghiem(String maPhong) {
        PhongHocThiNghiem phong = searchPhongHocThiNghiem(maPhong);
        if (phong != null) {
            dataBasePhongHocThiNghiem.remove(phong);
        }
        return phong;
    }
}
