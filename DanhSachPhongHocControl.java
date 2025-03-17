package QuanLyTruongDaiHoc;

public class DanhSachPhongHocControl {
	MemoryPhongHocDatabase danhSachPhongHocStorage;
	DanhSachPhongHocOutput danhSachPhongHocOutput;
	
	public DanhSachPhongHocControl(MemoryPhongHocDatabase storage, DanhSachPhongHocOutput output) {
        danhSachPhongHocStorage = storage;
        danhSachPhongHocOutput = output;
    }
    
    public void printDanhSachPhongHoc() {
        danhSachPhongHocOutput.output(
            danhSachPhongHocStorage.getDanhSachPhongHocLyThuyet(),
            danhSachPhongHocStorage.getDanhSachPhongHocMayTinh(),
            danhSachPhongHocStorage.getDanhSachPhongHocThiNghiem()
        );
    }
}