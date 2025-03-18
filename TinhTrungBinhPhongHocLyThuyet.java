
public class TinhTrungBinhPhongHocLyThuyet {
	
	float tinhTrungBinhPhongHocLyThuyet() 
	{
	    float tongDienTich = 0; 
	    int soPhongLyThuyet = 0;
	    
	for (PhongHoc phong : MemoryPhongHocDatabase.dataBasePhongHocLyThuyet) 
	{
        if (phong instanceof PhongHocLyThuyet) // Kiểm tra phòng lý thuyết có phải là lớp con của phong ko
        { 
            tongDienTich += phong.getDienTich();
            soPhongLyThuyet++;
        }
    }

    return soPhongLyThuyet > 0 ? tongDienTich / soPhongLyThuyet : 0; // Tính trung bình hoặc trả về 0 nếu không có phòng
	}
}
