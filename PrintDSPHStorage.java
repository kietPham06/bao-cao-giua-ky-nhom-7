import java.util.ArrayList;

public class PrintDSPHStorage {
    
    // Ô 2: Thuộc tính (Không có thuộc tính trong lớp này)
    
    
    // Ô 3: Phương thức
    
    // Constructor mặc định
    PrintDSPHStorage() {
    }
    
    // Lấy danh sách phòng học lý thuyết từ bộ nhớ
    ArrayList<PhongHocLyThuyet> getDanhSachPhongHocLyThuyet() {
        return MemoryPHDb.getDanhSachPhongHocLyThuyet();
    }
    
    // Lấy danh sách phòng học máy tính từ bộ nhớ
    ArrayList<PhongHocMayTinh> getDanhSachPhongHocMayTinh() {
        return MemoryPHDb.getDanhSachPhongHocMayTinh();
    }
    
    // Lấy danh sách phòng học thí nghiệm từ bộ nhớ
    ArrayList<PhongHocThiNghiem> getDanhSachPhongHocThiNghiem() {
        return MemoryPHDb.getDanhSachPhongHocThiNghiem();
    }
    
}
