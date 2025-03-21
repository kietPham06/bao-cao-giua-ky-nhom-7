import java.io.PrintWriter;

public class DTTBPhongHocLyThuyetOutput {
    
    // Ô 2: Thuộc tính
    PrintWriter out; // Đối tượng để ghi dữ liệu đầu ra
    
    // Ô 3: Phương thức
    
    // Constructor khởi tạo đối tượng PrintWriter
    DTTBPhongHocLyThuyetOutput() {
        out = new PrintWriter(System.out);
    }
    
    // Xuất diện tích trung bình của phòng học lý thuyết
    void output(double dienTichTrungBinh) {
        out.println("============================================");
        out.flush();
        out.println("Diện tích trung bình phòng lý thuyết: " + dienTichTrungBinh);
        out.flush();
        out.println("============================================");
        out.flush();
    }
}