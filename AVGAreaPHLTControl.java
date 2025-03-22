import java.io.PrintWriter;

public class AVGAreaPHLTControl {
    
    // Ô 2: Thuộc tính
    PrintWriter out; // Đối tượng để ghi dữ liệu đầu ra
    AVGAreaPHLTStorage storage; // Đối tượng lưu trữ danh sách phòng học lý thuyết
    AVGAreaPHLTOutput output; // Đối tượng xuất dữ liệu diện tích trung bình
    
    // Ô 3: Phương thức
    
    // Constructor khởi tạo đối tượng mặc định
    AVGAreaPHLTControl() {
        out = new PrintWriter(System.out);
        storage = new AVGAreaPHLTStorage();
        output = new AVGAreaPHLTOutput();
    }
    
    // Constructor với tham số truyền vào
    AVGAreaPHLTControl(AVGAreaPHLTStorage storage, AVGAreaPHLTOutput output) {
        this.storage = storage;
        this.output = output;
        this.out = new PrintWriter(System.out);
    }
    
    // Tính diện tích trung bình của phòng học lý thuyết
    void avgArea() {
        int soPhongHoc = storage.getDanhSachPhongHocLyThuyet().size();
        double tongDienTich = 0;
        double dienTichTrungBinh = 0;
        
        if (soPhongHoc == 0) {
            out.println("Không tìm thấy phòng học lý thuyết");
            out.flush();
        } else {
            for (PhongHocLyThuyet phongHoc : storage.getDanhSachPhongHocLyThuyet()) {
                tongDienTich += phongHoc.getDienTich();
            }
            dienTichTrungBinh = tongDienTich / soPhongHoc;
            output.output(dienTichTrungBinh);
        }
    }
}
