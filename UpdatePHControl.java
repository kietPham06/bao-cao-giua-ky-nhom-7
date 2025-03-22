import java.io.PrintWriter;
import java.util.Scanner;

public class UpdatePHControl {
    // Ô 2: Thuộc tính
    Scanner keyboard; // Đối tượng để nhập dữ liệu từ bàn phím
    PrintWriter out; // Đối tượng để xuất dữ liệu ra màn hình
    UpdatePHStorage storage; // Lưu trữ thông tin phòng học
    UpdatePHOutput output; // Hiển thị thông tin phòng học

    // Ô 3: Phương thức
    UpdatePHControl() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		storage = new UpdatePHStorage();
		output = new UpdatePHOutput();
	}
	
	// Constructor cho phép sử dụng Scanner và PrintWriter bên ngoài
    UpdatePHControl(Scanner keyboard, PrintWriter out) {
		this.keyboard = keyboard;
		this.out = out;
	}
	
	// Constructor thêm đối tượng lưu trữ dữ liệu phòng học
    UpdatePHControl(Scanner keyboard, PrintWriter out, UpdatePHStorage storage) {
		this(keyboard, out);
		this.storage = storage;
	}
	
	// Constructor đầy đủ với cả đầu ra kết quả tìm kiếm
    UpdatePHControl(Scanner keyboard, PrintWriter out, UpdatePHStorage storage, UpdatePHOutput output) {
		this(keyboard, out, storage);
		this.output = output;
	}

    void update() { // Phương thức chỉnh sửa thông tin phòng học
        String maPhong;
        String dayNha;
        String ngayHoatDong;
        double dienTich;
        int soBongDen;
        int loaiPhongHoc;
        boolean mayChieu;
        int soLuongMayTinh;
        String chuyenNganh;
        int sucChua;
        boolean bonRua;

        PhongHocLyThuyet phongHocLyThuyet;
        PhongHocMayTinh phongHocMayTinh;
        PhongHocThiNghiem phongHocThiNghiem;
        
		out.println("===============================================");
		out.flush();

        out.print("Nhập mã phòng cần sửa: ");
        out.flush();
        maPhong = keyboard.nextLine();

        out.println("Chọn loại phòng học:");
        out.flush();
        out.println("1 - Lý thuyết | 2 - Máy tính | 3 - Thí nghiệm");
        out.flush();
        out.print("Chọn: ");
        out.flush();
        loaiPhongHoc = keyboard.nextInt();
        keyboard.nextLine(); // Xử lý dòng trống

        switch (loaiPhongHoc) {
            case 1: // Cập nhật phòng lý thuyết
                phongHocLyThuyet = storage.selectPhongHocLyThuyet(maPhong);
                if (phongHocLyThuyet == null) {
            		out.println("===============================================");
            		out.flush();
                    out.println("Không tìm thấy phòng lý thuyết có mã: " + maPhong);
                    out.flush();
            		out.println("===============================================");
            		out.flush();
                } else {
                    out.println("Vui lòng nhập thông tin phòng cần cập nhật");
                    out.flush();

                    out.print("Dãy Nhà: ");
                    out.flush();
                    dayNha = keyboard.nextLine();

                    out.print("Diện Tích: ");
                    out.flush();
                    dienTich = keyboard.nextDouble();
                    keyboard.nextLine();

                    out.print("Số bóng đèn: ");
                    out.flush();
                    soBongDen = keyboard.nextInt();
                    keyboard.nextLine();

                    out.print("Ngày hoạt động (yyyy-MM-dd): ");
                    out.flush();
                    ngayHoatDong = keyboard.nextLine();

                    out.print("Có máy chiếu không (true/false): ");
                    out.flush();
                    mayChieu = keyboard.nextBoolean();
                    keyboard.nextLine();
            		out.println("===============================================");
            		out.flush();

                    phongHocLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, mayChieu);
                    storage.updatePhongHocLyThuyet(maPhong, phongHocLyThuyet);
                    output.output(phongHocLyThuyet);
                }
                break;

            case 2: // Cập nhật phòng máy tính
                phongHocMayTinh = storage.selectPhongHocMayTinh(maPhong);
                if (phongHocMayTinh == null) {
            		out.println("===============================================");
            		out.flush();
                    out.println("Không tìm thấy phòng học máy tính có mã: " + maPhong);
                    out.flush();
            		out.println("===============================================");
            		out.flush();
                } else {
                    out.println("Vui lòng nhập thông tin phòng cần cập nhật");
                    out.flush();

                    out.print("Dãy Nhà: ");
                    out.flush();
                    dayNha = keyboard.nextLine();

                    out.print("Diện Tích: ");
                    out.flush();
                    dienTich = keyboard.nextDouble();
                    keyboard.nextLine();

                    out.print("Số bóng đèn: ");
                    out.flush();
                    soBongDen = keyboard.nextInt();
                    keyboard.nextLine();

                    out.print("Ngày hoạt động (yyyy-MM-dd): ");
                    out.flush();
                    ngayHoatDong = keyboard.nextLine();

                    out.print("Số lượng máy tính: ");
                    out.flush();
                    soLuongMayTinh = keyboard.nextInt();
                    keyboard.nextLine();
            		out.println("===============================================");
            		out.flush();

                    phongHocMayTinh = new PhongHocMayTinh(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, soLuongMayTinh);
                    storage.updatePhongHocMayTinh(maPhong, phongHocMayTinh);
                    output.output(phongHocMayTinh);
                }
                break;

            case 3: // Cập nhật phòng thí nghiệm
                phongHocThiNghiem = storage.selectPhongHocThiNghiem(maPhong);
                if (phongHocThiNghiem == null) {
            		out.println("===============================================");
            		out.flush();
                    out.println("Không tìm thấy phòng học thí nghiệm có mã: " + maPhong);
                    out.flush();
            		out.println("===============================================");
            		out.flush();
                } else {
                    out.println("Vui lòng nhập thông tin phòng cần cập nhật");
                    out.flush();

                    out.print("Dãy Nhà: ");
                    out.flush();
                    dayNha = keyboard.nextLine();

                    out.print("Diện Tích: ");
                    out.flush();
                    dienTich = keyboard.nextDouble();
                    keyboard.nextLine();

                    out.print("Số bóng đèn: ");
                    out.flush();
                    soBongDen = keyboard.nextInt();
                    keyboard.nextLine();

                    out.print("Ngày hoạt động (yyyy-MM-dd): ");
                    out.flush();
                    ngayHoatDong = keyboard.nextLine();

                    out.print("Chuyên ngành: ");
                    out.flush();
                    chuyenNganh = keyboard.nextLine();

                    out.print("Sức chứa: ");
                    out.flush();
                    sucChua = keyboard.nextInt();
                    keyboard.nextLine();

                    out.print("Có bồn rửa không (true/false): ");
                    out.flush();
                    bonRua = keyboard.nextBoolean();
                    keyboard.nextLine();
            		out.println("===============================================");
            		out.flush();
                    
                    phongHocThiNghiem = new PhongHocThiNghiem(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, chuyenNganh, sucChua, bonRua);
                    storage.updatePhongHocThiNghiem(maPhong, phongHocThiNghiem);
                    output.output(phongHocThiNghiem);
                }
                break;
            default:
                out.println("Loại phòng không hợp lệ.");
                out.flush();
        }
    }
}
