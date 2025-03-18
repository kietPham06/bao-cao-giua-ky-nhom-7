import java.util.ArrayList;

public class DanhSachPhongHocStorage {
	
	//Ô 2
	
	
	// Ô 3
    DanhSachPhongHocStorage() {
		
	}
    
    ArrayList<PhongHocLyThuyet> getDanhSachPhongHocLyThuyet() {
    	return MemoryPhongHocDatabase.getDanhSachPhongHocLyThuyet();
    }
    
    ArrayList<PhongHocMayTinh> getDanhSachPhongHocMayTinh() {
    	return MemoryPhongHocDatabase.getDanhSachPhongHocMayTinh();
    }
    
    ArrayList<PhongHocThiNghiem> getDanhSachPhongHocThiNghiem() {
    	return MemoryPhongHocDatabase.getDanhSachPhongHocThiNghiem();
    }
    
}