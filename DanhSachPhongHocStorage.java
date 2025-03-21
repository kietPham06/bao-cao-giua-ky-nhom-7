import java.util.ArrayList;

public class DanhSachPhongHocStorage {
    
    // Ô 2: Thuộc tính (Không có thuộc tính trong lớp này)
    
    
    // Ô 3: Phương thức
    
    // Constructor mặc định
    DanhSachPhongHocStorage() {
    }
    
    // Lấy danh sách phòng học lý thuyết từ bộ nhớ
    ArrayList<PhongHocLyThuyet> getDanhSachPhongHocLyThuyet() {
        return MemoryPhongHocDatabase.getDanhSachPhongHocLyThuyet();
    }
    
    // Lấy danh sách phòng học máy tính từ bộ nhớ
    ArrayList<PhongHocMayTinh> getDanhSachPhongHocMayTinh() {
        return MemoryPhongHocDatabase.getDanhSachPhongHocMayTinh();
    }
    
    // Lấy danh sách phòng học thí nghiệm từ bộ nhớ
    ArrayList<PhongHocThiNghiem> getDanhSachPhongHocThiNghiem() {
        return MemoryPhongHocDatabase.getDanhSachPhongHocThiNghiem();
    }
    
}
