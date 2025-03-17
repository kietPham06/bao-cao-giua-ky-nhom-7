
public class UpdatePhongHoc {

	
	void updatePhongHocLyThuyet(String maPhong, PhongHocLyThuyet phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocLyThuyet(maPhong, phongHocMoi);;
	}
	
	void updatePhongHocMayTinh(String maPhong, PhongHocMayTinh phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocMayTinh(maPhong, phongHocMoi);;
	}
	
	void updatePhongHocThiNghiem(String maPhong, PhongHocThiNghiem phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocThiNghiem(maPhong, phongHocMoi);
	}
}
