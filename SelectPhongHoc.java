
public class SelectPhongHoc {

	
	void selectPhongHocLyThuyet(String maPhong) {
		MemoryPhongHocDatabase.searchPhongHocLyThuyet(maPhong);
	}
	
	void selectPhongHocMayTinh(String maPhong) {
		MemoryPhongHocDatabase.searchPhongHocMayTinh(maPhong);
	}
	
	void selectPhongHocThiNghiem(String maPhong) {
		MemoryPhongHocDatabase.searchPhongHocThiNghiem(maPhong);
	}
}
