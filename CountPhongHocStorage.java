import java.util.ArrayList;

public class CountPhongHocStorage {
		
	// Ô 2
	
	// Ô 3
	CountPhongHocStorage() {
		
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
