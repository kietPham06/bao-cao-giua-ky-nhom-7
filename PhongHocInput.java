import java.io.PrintWriter;
import java.util.Scanner;

public class PhongHocInput {
	// ô 2
	Scanner keyboard;
	PrintWriter out;
	InsertPhongHoc add;
	PhongHocOutput phongHocOutput;
	
	// ô 3
	PhongHocInput() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		add = new InsertPhongHoc();
		phongHocOutput = new PhongHocOutput();
	}
	
	PhongHocInput(Scanner keyboard, PrintWriter out) {
		this.keyboard = keyboard;
		this.out = out;	
	}
	
	PhongHocInput(Scanner keyboard, PrintWriter out, InsertPhongHoc add) {
		this(keyboard, out);
		this.add = add;
	}
	
	PhongHocInput(Scanner keyboard, PrintWriter out, InsertPhongHoc add, PhongHocOutput phongHocOutput) {
		this(keyboard, out, add);
		this.phongHocOutput = phongHocOutput;
	}
	
	void input() {
		String maPhong;
		String dayNha;
		double dienTich;
		int soBongDen;
		int nam;
		int thang;
		int ngay;
		
		boolean mayChieu;
		
		int soLuongMayTinh;
		
		String chuyenNganh;
		int sucChua;
		boolean bonRua;
		
		int loaiPhongHoc;
		
		PhongHocLyThuyet phongHocLyThuyet;
		PhongHocMayTinh phongHocMayTinh;
		PhongHocThiNghiem phongHocThiNghiem;
		
		out.print("Mã phòng: ");
		out.flush();
		maPhong = keyboard.nextLine();
		keyboard.nextLine();
		
		out.print("Dãy Nhà: ");
		out.flush();
		dayNha = keyboard.nextLine();
		keyboard.nextLine();
		
		out.print("Diện Tích: ");
		out.flush();
		dienTich = keyboard.nextDouble();
		
		out.print("Số bóng đèn: ");
		out.flush();
		soBongDen = keyboard.nextInt();
		
		out.print("Ngày: ");
		out.flush();
		ngay = keyboard.nextInt();
		
		out.print("Tháng: ");
		out.flush();
		thang = keyboard.nextInt();
		
		out.print("Năm: ");
		out.flush();
		nam = keyboard.nextInt();
		
		out.print("Chọn loại phòng học \n1 - Lý thuyết\n2 - Máy tính\n3 - Thí nghiệm\n");
		out.flush();
		out.print("Chọn: ");
		loaiPhongHoc = keyboard.nextInt();
		
		if (loaiPhongHoc == 1) {
			out.print("Có máy chiếu không: ");
			out.flush();
			mayChieu = keyboard.nextBoolean();
			
			phongHocLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, nam, thang, ngay, mayChieu);
			add.insertPhongHocLyThuyet(phongHocLyThuyet);
			phongHocOutput.output(phongHocLyThuyet);
		}
		if (loaiPhongHoc == 2) {
			out.print("Số lượng máy tính: ");
			out.flush();
			soLuongMayTinh = keyboard.nextInt();
			phongHocMayTinh = new PhongHocMayTinh(maPhong, dayNha, dienTich, soBongDen, nam, thang, ngay, soLuongMayTinh);
			add.insertPhongHocMayTinh(phongHocMayTinh);
			phongHocOutput.output(phongHocMayTinh);
		}
		if (loaiPhongHoc == 3) {
			out.print("Chuyên ngành: ");
			out.flush();
			chuyenNganh = keyboard.nextLine();
			out.print("Sức chứa: ");
			out.flush();
			sucChua = keyboard.nextInt();
			out.print("Có bồn rửa không: ");
			out.flush();
			bonRua = keyboard.nextBoolean();
			phongHocThiNghiem = new PhongHocThiNghiem(maPhong, dayNha, dienTich, soBongDen, nam, thang, ngay, chuyenNganh, sucChua, bonRua);
			add.insertPhongHocThiNghiem(phongHocThiNghiem);
			phongHocOutput.output(phongHocThiNghiem);
		}
	}
	
}
