import java.io.PrintWriter;

public class CountPhongHocOutput {
	
	// Ô 2
	PrintWriter out;
	
	// Ô 3
	CountPhongHocOutput() {
		out = new PrintWriter(System.out);
	}
	
    void outputPhongHocLyThuyet(int soLuongPhongHoc) {
	    out.println("============================================");
	    out.flush();
    	out.println("Tổng số lượng phòng học lý thuyết: " + soLuongPhongHoc);
    	out.flush();
	    out.println("============================================");
	    out.flush();
    }
    
    void outputPhongHocMayTinh(int soLuongPhongHoc) {
    	out.println("Tổng số lượng phòng học máy tính: " + soLuongPhongHoc);
    	out.flush();
	    out.println("============================================");
	    out.flush();
    }
    
    void outputPhongHocThiNghiem(int soLuongPhongHoc) {
    	out.println("Tổng số lượng phòng học thí nghiệm: " + soLuongPhongHoc);
    	out.flush();
	    out.println("============================================");
	    out.flush();
    }
}
