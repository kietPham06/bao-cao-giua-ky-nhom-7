import java.io.PrintWriter;

public class CountPhongHocOutput {
    
    // Ô 2: Thuộc tính - Đối tượng PrintWriter để in ra màn hình
    PrintWriter out;
    
    // Ô 3: Phương thức
    
    // Constructor - Khởi tạo đối tượng PrintWriter
    CountPhongHocOutput() {
        out = new PrintWriter(System.out);
    }
    
    // Phương thức xuất tổng số lượng phòng học lý thuyết
    void outputPhongHocLyThuyet(int soLuongPhongHoc) {
        out.println("============================================");
        out.flush();
        out.println("Tổng số lượng phòng học lý thuyết: " + soLuongPhongHoc);
        out.flush();
        out.println("============================================");
        out.flush();
    }
    
    // Phương thức xuất tổng số lượng phòng học máy tính
    void outputPhongHocMayTinh(int soLuongPhongHoc) {
        out.println("Tổng số lượng phòng học máy tính: " + soLuongPhongHoc);
        out.flush();
        out.println("============================================");
        out.flush();
    }
    
    // Phương thức xuất tổng số lượng phòng học thí nghiệm
    void outputPhongHocThiNghiem(int soLuongPhongHoc) {
        out.println("Tổng số lượng phòng học thí nghiệm: " + soLuongPhongHoc);
        out.flush();
        out.println("============================================");
        out.flush();
    }
}
