import java.util.ArrayList;

public class CountPhongHocStorage {
    
    // Ô 2: Thuộc tính - Không có thuộc tính riêng trong lớp này
    
    // Ô 3: Phương thức
    
    // Constructor - Khởi tạo đối tượng CountPhongHocStorage
    CountPhongHocStorage() {
    }
    
    // Lấy danh sách phòng học lý thuyết từ cơ sở dữ liệu
    ArrayList<PhongHocLyThuyet> getDanhSachPhongHocLyThuyet() {
        return MemoryPhongHocDatabase.getDanhSachPhongHocLyThuyet();
    }
    
    // Lấy danh sách phòng học máy tính từ cơ sở dữ liệu
    ArrayList<PhongHocMayTinh> getDanhSachPhongHocMayTinh() {
        return MemoryPhongHocDatabase.getDanhSachPhongHocMayTinh();
    }
    
    // Lấy danh sách phòng học thí nghiệm từ cơ sở dữ liệu
    ArrayList<PhongHocThiNghiem> getDanhSachPhongHocThiNghiem() {
        return MemoryPhongHocDatabase.getDanhSachPhongHocThiNghiem();
    }
}