import java.util.ArrayList;

public class DanhSachPhongHocControl {
	
	// Ô 2
	DanhSachPhongHocStorage storage;
	DanhSachPhongHocOutput output;
	
	// Ô 3
	DanhSachPhongHocControl() {
		storage = new DanhSachPhongHocStorage();
		output = new DanhSachPhongHocOutput();
	}
	DanhSachPhongHocControl(DanhSachPhongHocStorage storage, DanhSachPhongHocOutput output) {
        
    }
    
    void printDanhSachPhongHoc() {
    	ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet;
    	ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh;
    	ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem;
        
    	// Lấy dữ liệu
    	danhSachPhongHocLyThuyet = storage.getDanhSachPhongHocLyThuyet();
    	danhSachPhongHocMayTinh = storage.getDanhSachPhongHocMayTinh();
    	danhSachPhongHocThiNghiem = storage.getDanhSachPhongHocThiNghiem();
    	
    	// In dữ liệu
    	output.output(danhSachPhongHocLyThuyet, danhSachPhongHocMayTinh, danhSachPhongHocThiNghiem);
    }
}