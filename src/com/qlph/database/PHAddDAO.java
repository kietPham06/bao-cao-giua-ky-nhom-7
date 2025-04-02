package com.qlph.database;

import com.qlph.model.PhongHoc;

public class PHAddDAO {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public void insert(PhongHoc ph) {
		MemoryPHDB.insert(ph);
	}
	
	
}
