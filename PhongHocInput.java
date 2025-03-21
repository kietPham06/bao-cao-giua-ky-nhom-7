import java.io.PrintWriter;
import java.util.Scanner;

public class PhongHocInput {
    
    // Ô 2: Thuộc tính
    // Công cụ nhập/xuất dữ liệu và lưu trữ phòng học
    Scanner keyboard;
    PrintWriter out;
    PhongHocStorage storage;
    PhongHocOutput output;
    
    // Ô 3: Phương thức
    // Khởi tạo đối tượng với các giá trị mặc định
    PhongHocInput() {
        keyboard = new Scanner(System.in);
        out = new PrintWriter(System.out);
        storage = new PhongHocStorage();
        output = new PhongHocOutput();
    }
    
    // Khởi tạo với Scanner và PrintWriter
    PhongHocInput(Scanner keyboard, PrintWriter out) {
        this.keyboard = keyboard;
        this.out = out;    
    }
    
    // Khởi tạo với Scanner, PrintWriter và Storage
    PhongHocInput(Scanner keyboard, PrintWriter out, PhongHocStorage storage) {
        this(keyboard, out);
        this.storage = storage;
    }
    
    // Khởi tạo với Scanner, PrintWriter, Storage và Output
    PhongHocInput(Scanner keyboard, PrintWriter out, PhongHocStorage storage, PhongHocOutput output) {
        this(keyboard, out, storage);
        this.output = output;
    }
    
    // Phương thức nhập dữ liệu phòng học
    void input() {
        // Khai báo biến để lưu thông tin phòng học
        String maPhong;
        String dayNha;
        double dienTich;
        int soBongDen;
        String ngayHoatDong;
        int loaiPhongHoc;
        
        // Biến bổ sung theo loại phòng học
        boolean mayChieu; // Cho phòng lý thuyết
        int soLuongMayTinh; // Cho phòng máy tính
        String chuyenNganh;
        int sucChua;
        boolean bonRua; // Cho phòng thí nghiệm

        // Đối tượng phòng học
        PhongHocLyThuyet phongHocLyThuyet;
        PhongHocMayTinh phongHocMayTinh;
        PhongHocThiNghiem phongHocThiNghiem;

        // Hiển thị tiêu đề nhập liệu
        out.println("============================================");
        out.flush();
        
        // Nhập thông tin chung của phòng học
        out.print("Mã phòng: ");
        out.flush();
        maPhong = keyboard.nextLine();

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
        
        // Chọn loại phòng học
        out.println("Chọn loại phòng học:");
        out.flush();
        out.println("1 - Lý thuyết | 2 - Máy tính | 3 - Thí nghiệm");
        out.flush();
        out.print("Chọn: ");
        out.flush();
        loaiPhongHoc = keyboard.nextInt();
        keyboard.nextLine();
        
        out.println("============================================");
        out.flush();

        // Xử lý theo loại phòng học
        switch (loaiPhongHoc) {
            case 1:
                // Nhập dữ liệu phòng lý thuyết
                out.print("Có máy chiếu không (true/false): ");
                out.flush();
                mayChieu = keyboard.nextBoolean();
                keyboard.nextLine();

                // Tạo và lưu phòng học lý thuyết
                phongHocLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, mayChieu);
                storage.insertPhongHocLyThuyet(phongHocLyThuyet);
                output.output(phongHocLyThuyet);
                break;
                
            case 2:
                // Nhập dữ liệu phòng máy tính
                out.print("Số lượng máy tính: ");
                out.flush();
                soLuongMayTinh = keyboard.nextInt();
                keyboard.nextLine();

                // Tạo và lưu phòng học máy tính
                phongHocMayTinh = new PhongHocMayTinh(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, soLuongMayTinh);
                storage.insertPhongHocLyMayTinh(phongHocMayTinh);
                output.output(phongHocMayTinh);
                break;

            case 3:
                // Nhập dữ liệu phòng thí nghiệm
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

                // Tạo và lưu phòng học thí nghiệm
                phongHocThiNghiem = new PhongHocThiNghiem(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, chuyenNganh, sucChua, bonRua);
                storage.insertPhongHocLyThiNghiem(phongHocThiNghiem);
                output.output(phongHocThiNghiem);
                break;

            default:
                // Xử lý trường hợp nhập sai loại phòng học
                out.println("Lựa chọn không hợp lệ!");
                out.flush();
        }
    }
}
