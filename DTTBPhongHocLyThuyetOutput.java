import java.io.PrintWriter;

public class DTTBPhongHocLyThuyetOutput {
	
	// Ô 2
	PrintWriter out;
	
	// Ô 3
	DTTBPhongHocLyThuyetOutput() {
		out = new PrintWriter(System.out);
	}
	
	void output(double dienTichTrungBinh) {
		out.println("============================================");
	    out.flush();
	    out.println("Diện tích trung bình phòng lý thuyết: " + dienTichTrungBinh);
		out.flush();
		out.println("============================================");
		out.flush();
	    
	}
}
