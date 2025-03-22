import java.io.PrintWriter;
import java.util.ArrayList;

public class PKDCControl {
	// Ô 2: Thuộc tính
	PrintWriter out; // Đối tượng dùng để in dữ liệu ra màn hình
	PKDCStorage storage; // Đối tượng quản lý dữ liệu phòng học
	PKDCOutput output; // Đối tượng xử lý xuất dữ liệu
	
	// Ô 3: Phương thức
	
	// Constructor mặc định, khởi tạo các đối tượng cần thiết
	PKDCControl() {
		out = new PrintWriter(System.out);
		storage = new PKDCStorage();
		output = new PKDCOutput();
	}
	
	// Constructor có tham số để tùy chỉnh đối tượng
	PKDCControl(PrintWriter out,PKDCStorage storage, PKDCOutput output) {
		this.out = out;
		this.storage = storage;
        this.output = output;
    }
    
    // In danh sách phòng không đạt chuẩn
    void pkdc() {
    	ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet;
    	ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh;
    	ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem;
        
    	// Lấy dữ liệu từ storage
    	danhSachPhongHocLyThuyet = storage.getDanhSachPhongHocLyThuyet();
    	danhSachPhongHocMayTinh = storage.getDanhSachPhongHocMayTinh();
    	danhSachPhongHocThiNghiem = storage.getDanhSachPhongHocThiNghiem();
    	
    	// In dữ liệu
		out.println("===============================================");
		out.flush();
    	out.println("Danh sách phòng không đạt chuẩn: ");
    	out.flush();
    	out.println("===============================================");
		out.flush();
    	if (danhSachPhongHocLyThuyet.isEmpty()) {
        	out.println("Danh sách phòng học lý thuyết rỗng");
        	out.flush();
        	out.println("===============================================");
    		out.flush();
    	} else {
	    	for (PhongHocLyThuyet phongHocLyThuyet : danhSachPhongHocLyThuyet) {
	    		if (!phongHocLyThuyet.datChuan()) {
	    			output.output(phongHocLyThuyet);
	    		} else {
	    			out.println("Không có phòng lý thuyết nào không đạt chuẩn");
	            	out.flush();
	            	out.println("===============================================");
	        		out.flush();
	    		}
	    	}
    	}
        
    	if (danhSachPhongHocMayTinh.isEmpty()) {
        	out.println("Danh sách phòng học máy tính rỗng");
        	out.flush();
        	out.println("===============================================");
    		out.flush();
    	} else {
	    	for (PhongHocMayTinh phongHocMayTinh : danhSachPhongHocMayTinh) {
	    		if (!phongHocMayTinh.datChuan()) {
	    			output.output(phongHocMayTinh);
	    		} else {
	    			out.println("Không có phòng máy tính nào không đạt chuẩn");
	            	out.flush();
	            	out.println("===============================================");
	        		out.flush();
	    		}
	    	}
    	}
        
    	if (danhSachPhongHocThiNghiem.isEmpty()) {
        	out.println("Danh sách phòng học thí nghiệm rỗng");
        	out.flush();
        	out.println("===============================================");
    		out.flush();
    	} else {
	    	for (PhongHocThiNghiem phongHocThiNghiem : danhSachPhongHocThiNghiem) {
	    		if (!phongHocThiNghiem.datChuan()) {
	    			output.output(phongHocThiNghiem);
	    		} else {
	    			out.println("Không có phòng thí nghiệm nào không đạt chuẩn");
	            	out.flush();
	            	out.println("===============================================");
	        		out.flush();
	    		}
	    	}
    	}
    }
}
