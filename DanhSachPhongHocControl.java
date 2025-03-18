import java.util.ArrayList;

public class DanhSachPhongHocControl {
	
	// Ô 2
	DanhSachPhongHocStorage danhSachPhongHocStorage;
	DanhSachPhongHocOutput danhSachPhongHocOutput;
	
	// Ô 3
	DanhSachPhongHocControl() {
		danhSachPhongHocStorage = new DanhSachPhongHocStorage();
		danhSachPhongHocOutput = new DanhSachPhongHocOutput();
	}
	DanhSachPhongHocControl(MemoryPhongHocDatabase storage, DanhSachPhongHocOutput output) {
        
    }
    
    void printDanhSachPhongHoc() {
    	ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet;
    	ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh;
    	ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem;
        
    	// Lấy dữ liệu
    	danhSachPhongHocLyThuyet = danhSachPhongHocStorage.getDanhSachPhongHocLyThuyet();
    	danhSachPhongHocMayTinh = danhSachPhongHocStorage.getDanhSachPhongHocMayTinh();
    	danhSachPhongHocThiNghiem = danhSachPhongHocStorage.getDanhSachPhongHocThiNghiem();
    	
    	// In dữ liệu
    	danhSachPhongHocOutput.output(danhSachPhongHocLyThuyet, danhSachPhongHocMayTinh, danhSachPhongHocThiNghiem);
    }
}