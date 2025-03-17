package QuanLyTruongDaiHoc;

import java.io.PrintWriter;
import java.util.ArrayList;

public class DanhSachPhongHocOutput {
	PrintWriter out;
    
    public void output(ArrayList<PhongHocLyThuyet> lyThuyet, ArrayList<PhongHocMayTinh> mayTinh, ArrayList<PhongHocThiNghiem> thiNghiem) {
        System.out.println("Danh sách phòng học lý thuyết: " + lyThuyet.size());
        System.out.println("Danh sách phòng học máy tính: " + mayTinh.size());
        System.out.println("Danh sách phòng học thí nghiệm: " + thiNghiem.size());
    }
}
