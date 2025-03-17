import java.util.ArrayList;

public class TongSoLuongTungLoaiPhong {
	
	ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet;
	ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh;
	ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem;
	
	TongSoLuongTungLoaiPhong() {
		danhSachPhongHocLyThuyet = new ArrayList<PhongHocLyThuyet>();
		danhSachPhongHocMayTinh = new ArrayList<PhongHocMayTinh>();
		danhSachPhongHocThiNghiem = new ArrayList<PhongHocThiNghiem>();
	}
	
	int tongSoLuongPhongHocLyThuyet() {
		return danhSachPhongHocLyThuyet.size();
	}
	
	int tongSoLuongPhongHocMayTinh() {
		return danhSachPhongHocThiNghiem.size();
	}
	
	int tongSoLuongPhongHocThiNghiem() {
		return danhSachPhongHocThiNghiem.size();
	}
}
