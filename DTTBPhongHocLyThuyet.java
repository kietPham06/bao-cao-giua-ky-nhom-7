import java.io.PrintWriter;

public class DTTBPhongHocLyThuyet {
	
	// Ô 2
	PrintWriter out;
	DTTBPhongHocLyThuyetStorage storage;
	DTTBPhongHocLyThuyetOutput output;
	
	// Ô 3
	DTTBPhongHocLyThuyet() {
		out = new PrintWriter(System.out);
		storage = new DTTBPhongHocLyThuyetStorage();
		output = new DTTBPhongHocLyThuyetOutput();
	}
	
	DTTBPhongHocLyThuyet(DTTBPhongHocLyThuyetStorage storage, DTTBPhongHocLyThuyetOutput output) {
		
	}
	
	void tinhDTTBPhongHocLyThuyet() {
		int soPhongHoc = storage.getPhongHocLyThuyet().size();
		double tongDienTich = 0;
		double dienTichTrungBinh = 0;
		if (soPhongHoc == 0) {
			out.println("Không tìm thấy phòng học lý thuyết");
		} else {
			for (PhongHocLyThuyet phongHoc : storage.getPhongHocLyThuyet()) {
				tongDienTich += phongHoc.getDienTich();
			}
			dienTichTrungBinh = tongDienTich / soPhongHoc;
			output.output(dienTichTrungBinh);
		}
	}
}
