import java.util.ArrayList;

public class CountPHStorage {
    
    // Ô 2: Thuộc tính - Không có thuộc tính riêng trong lớp này
    
    // Ô 3: Phương thức
    
    // Constructor - Khởi tạo đối tượng CountPhongHocStorage
    CountPHStorage() {
    }
    
    // Lấy danh sách phòng học lý thuyết từ cơ sở dữ liệu
    ArrayList<PhongHocLyThuyet> getDanhSachPhongHocLyThuyet() {
        return MemoryPHDb.getDanhSachPhongHocLyThuyet();
    }
    
    // Lấy danh sách phòng học máy tính từ cơ sở dữ liệu
    ArrayList<PhongHocMayTinh> getDanhSachPhongHocMayTinh() {
        return MemoryPHDb.getDanhSachPhongHocMayTinh();
    }
    
    // Lấy danh sách phòng học thí nghiệm từ cơ sở dữ liệu
    ArrayList<PhongHocThiNghiem> getDanhSachPhongHocThiNghiem() {
        return MemoryPHDb.getDanhSachPhongHocThiNghiem();
    }
}