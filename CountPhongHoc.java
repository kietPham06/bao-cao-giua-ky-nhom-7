public class CountPhongHoc {
    
    // Ô 2: Thuộc tính - Lưu trữ và xuất dữ liệu số lượng phòng học
    CountPhongHocStorage storage;
    CountPhongHocOutput output;
    
    // Ô 3: Phương thức
    
    // Constructor - Khởi tạo đối tượng với storage và output mặc định
    CountPhongHoc() {
        storage = new CountPhongHocStorage();
        output = new CountPhongHocOutput();
    }
    
    // Constructor - Khởi tạo đối tượng với storage và output được truyền vào
    CountPhongHoc(CountPhongHocStorage storage, CountPhongHocOutput output) {
        this.storage = storage;
        this.output = output;
    }
    
    // Phương thức countPhongHoc - Đếm số lượng phòng học theo từng loại
    void countPhongHoc() {
        int soLuongPhongLyThuyet;
        int soLuongPhongMayTinh;
        int soLuongPhongThiNghiem;
        
        // Lấy danh sách phòng học từ storage và đếm số lượng
        soLuongPhongLyThuyet = storage.getDanhSachPhongHocLyThuyet().size();
        soLuongPhongMayTinh = storage.getDanhSachPhongHocMayTinh().size();
        soLuongPhongThiNghiem = storage.getDanhSachPhongHocThiNghiem().size();
        
        // Xuất kết quả đếm ra màn hình
        output.outputPhongHocLyThuyet(soLuongPhongLyThuyet);
        output.outputPhongHocMayTinh(soLuongPhongMayTinh);
        output.outputPhongHocThiNghiem(soLuongPhongThiNghiem);
    }
}
