import java.io.PrintWriter;

public class DTTBPhongHocLyThuyet {
    
    // Ô 2: Thuộc tính
    PrintWriter out; // Đối tượng để ghi dữ liệu đầu ra
    DTTBPhongHocLyThuyetStorage storage; // Đối tượng lưu trữ danh sách phòng học lý thuyết
    DTTBPhongHocLyThuyetOutput output; // Đối tượng xuất dữ liệu diện tích trung bình
    
    // Ô 3: Phương thức
    
    // Constructor khởi tạo đối tượng mặc định
    DTTBPhongHocLyThuyet() {
        out = new PrintWriter(System.out);
        storage = new DTTBPhongHocLyThuyetStorage();
        output = new DTTBPhongHocLyThuyetOutput();
    }
    
    // Constructor với tham số truyền vào
    DTTBPhongHocLyThuyet(DTTBPhongHocLyThuyetStorage storage, DTTBPhongHocLyThuyetOutput output) {
        this.storage = storage;
        this.output = output;
        this.out = new PrintWriter(System.out);
    }
    
    // Tính diện tích trung bình của phòng học lý thuyết
    void tinhDTTBPhongHocLyThuyet() {
        int soPhongHoc = storage.getPhongHocLyThuyet().size();
        double tongDienTich = 0;
        double dienTichTrungBinh = 0;
        
        if (soPhongHoc == 0) {
            out.println("Không tìm thấy phòng học lý thuyết");
            out.flush();
        } else {
            for (PhongHocLyThuyet phongHoc : storage.getPhongHocLyThuyet()) {
                tongDienTich += phongHoc.getDienTich();
            }
            dienTichTrungBinh = tongDienTich / soPhongHoc;
            output.output(dienTichTrungBinh);
        }
    }
}
