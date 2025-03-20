
public class SetPhongHocStorage {
	
	// Ô 2
	
	// Ô 3
	
	SetPhongHocStorage() {
		
	}
	
	void setPhongHocLyThuyet(String maPhong, PhongHocLyThuyet phongHocMoi) {
		 MemoryPhongHocDatabase.setPhongHocLyThuyet(maPhong, phongHocMoi);
	}
	
	void setPhongHocMayTinh(String maPhong, PhongHocMayTinh phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocMayTinh(maPhong, phongHocMoi);
	}
	
	void setPhongHocThiNghiem(String maPhong, PhongHocThiNghiem phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocThiNghiem(maPhong, phongHocMoi);
	}
}
