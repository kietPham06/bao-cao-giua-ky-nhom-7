import java.util.ArrayList;

public class PrintDSPHControl {
    
    // Ô 2: Thuộc tính - Quản lý dữ liệu và đầu ra danh sách phòng học
    PrintDSPHStorage storage; // Đối tượng lưu trữ danh sách phòng học
    PrintDSPHOutput output;   // Đối tượng xuất danh sách phòng học
    
    // Ô 3: Phương thức
    
    // Constructor - Khởi tạo đối tượng với đối tượng lưu trữ và xuất dữ liệu mặc định
    PrintDSPHControl() {
        storage = new PrintDSPHStorage();
        output = new PrintDSPHOutput();
    }
    
    // Constructor - Khởi tạo với đối tượng lưu trữ và xuất dữ liệu tùy chỉnh
    PrintDSPHControl(PrintDSPHStorage storage, PrintDSPHOutput output) {
        this.storage = storage;
        this.output = output;
    }
    
    // Phương thức printDanhSachPhongHoc - Lấy danh sách phòng học từ storage và xuất ra màn hình
    void print() {
        ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet;
        ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh;
        ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem;
        
        // Lấy dữ liệu từ storage
        danhSachPhongHocLyThuyet = storage.getDanhSachPhongHocLyThuyet();
        danhSachPhongHocMayTinh = storage.getDanhSachPhongHocMayTinh();
        danhSachPhongHocThiNghiem = storage.getDanhSachPhongHocThiNghiem();
        
        // Xuất danh sách phòng học
        output.output(danhSachPhongHocLyThuyet, danhSachPhongHocMayTinh, danhSachPhongHocThiNghiem);
    }
}
