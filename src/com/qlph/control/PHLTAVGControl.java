package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHLTAVGDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHLTAVGOutput;
import com.qlph.utils.PHLTAVGCalculator;

public class PHLTAVGControl {

	// Ô 2 - Fields
	private PHLTAVGDAO phltavgdao;
	private PHLTAVGCalculator phltavgCalculator;
	private PHLTAVGOutput phltavgOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHLTAVGControl() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHLTAVGControl(PHLTAVGDAO phltavgdao, PHLTAVGCalculator phltavgCalculator, PHLTAVGOutput phltavgOutput) {
		super();
		this.phltavgdao = phltavgdao;
		this.phltavgCalculator = phltavgCalculator;
		this.phltavgOutput = phltavgOutput;
	}
	
	public void average() {
		ArrayList<PhongHoc> dSPH;
		double results;
		
		// Phối hợp với các đối tượng
		// Gửi thông điệp đến object PHLTAVGDAO
		// 1. Lấy danh sách phòng học từ CSDL
		dSPH = phltavgdao.getDSPH();
		
		// Gửi thông điệp đến object PHLTAVGCalculator
		// 2. Tính diện tích trung bình phòng học Lý thuyết từ danh sách phòng học
		results = phltavgCalculator.calculatorAVG(dSPH);
		
		// Gửi thông điệp đến object PHLTAVGOutput
		// 3. In ra kết quả sau khi tính
		phltavgOutput.printAVG(results);
	}

	
}
