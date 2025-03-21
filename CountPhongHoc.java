import java.io.PrintWriter;

public class CountPhongHoc {
	
	// Ô 2
	CountPhongHocStorage storage;
	CountPhongHocOutput output;
	
	// Ô 3
	CountPhongHoc() {
		storage = new CountPhongHocStorage();
		output = new CountPhongHocOutput();
	}
	
	CountPhongHoc(CountPhongHocStorage storage, CountPhongHocOutput output) {
		
	}
	
	void countPhongHoc() {
		int soLuongPhongLyThuyet;
		int soLuongPhongMayTinh;
		int soLuongPhongThiNghiem;
		
		soLuongPhongLyThuyet = storage.getDanhSachPhongHocLyThuyet().size();
		soLuongPhongMayTinh = storage.getDanhSachPhongHocMayTinh().size();
		soLuongPhongThiNghiem = storage.getDanhSachPhongHocThiNghiem().size();
		
		output.outputPhongHocLyThuyet(soLuongPhongLyThuyet);
		output.outputPhongHocMayTinh(soLuongPhongMayTinh);
		output.outputPhongHocThiNghiem(soLuongPhongThiNghiem);
	}
}
