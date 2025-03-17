package QuanLyTruongDaiHoc;

public class DanhSachPhongHocStorage {
	MemoryPhongHocDatabase danhSachStorage;
    
    public DanhSachPhongHocStorage(MemoryPhongHocDatabase storage) {
        this.danhSachStorage = storage;
    }
    
    public MemoryPhongHocDatabase getStorage() {
        return danhSachStorage;
    }
}