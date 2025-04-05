package com.qlph.database;

public class PHDeleteDAO {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public boolean delete(String maPhong, String loaiPhong) {
		return MemoryPHDB.remove(maPhong, loaiPhong);
	}
	
	
	
}
