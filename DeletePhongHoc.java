
public class DeletePhongHoc {

	void deletePhongHocLyThuyet(String maPhong) {
		MemoryPhongHocDatabase.removePhongHocLyThuyet(maPhong);;
	}
	
	void deletePhongHocMayTinh(String maPhong) {
		MemoryPhongHocDatabase.removePhongHocMayTinh(maPhong);;
	}
	
	void deletePhongHocThiNghiem(String maPhong) {
		MemoryPhongHocDatabase.removePhongHocThiNghiem(maPhong);
	}
}
