import java.io.PrintWriter;
import java.util.Scanner;

public class PhongHocInput {
    
    Scanner keyboard;
    PrintWriter out;
    PhongHocStorage storage;
    PhongHocOutput phongHocOutput;
    
    PhongHocInput() {
        keyboard = new Scanner(System.in);
        out = new PrintWriter(System.out);
        storage = new PhongHocStorage();
        phongHocOutput = new PhongHocOutput();
    }
    
    PhongHocInput(Scanner keyboard, PrintWriter out) {
        this.keyboard = keyboard;
        this.out = out;    
    }
    
    PhongHocInput(Scanner keyboard, PrintWriter out, PhongHocStorage storage) {
        this(keyboard, out);
        this.storage = storage;
    }
    
    PhongHocInput(Scanner keyboard, PrintWriter out, PhongHocStorage storage, PhongHocOutput phongHocOutput) {
        this(keyboard, out, storage);
        this.phongHocOutput = phongHocOutput;
    }
    
    void input() {
        String maPhong;
        String dayNha;
        double dienTich;
        int soBongDen;
        String ngayHoatDong;
        int loaiPhongHoc;
        
        boolean mayChieu;
        
        int soLuongMayTinh;
        
        String chuyenNganh;
        int sucChua;
        boolean bonRua;

        PhongHocLyThuyet phongHocLyThuyet;
        PhongHocMayTinh phongHocMayTinh;
        PhongHocThiNghiem phongHocThiNghiem;

        out.println("============================================");
        out.flush();
        
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

        switch (loaiPhongHoc) {
            case 1:
                out.print("Có máy chiếu không (true/false): ");
                out.flush();
                mayChieu = keyboard.nextBoolean();
                keyboard.nextLine();

                phongHocLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, mayChieu);
                storage.insertPhongHocLyThuyet(phongHocLyThuyet);
                phongHocOutput.output(phongHocLyThuyet);
                break;
                
            case 2:
                out.print("Số lượng máy tính: ");
                out.flush();
                soLuongMayTinh = keyboard.nextInt();
                keyboard.nextLine();

                phongHocMayTinh = new PhongHocMayTinh(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, soLuongMayTinh);
                storage.insertPhongHocLyMayTinh(phongHocMayTinh);
                phongHocOutput.output(phongHocMayTinh);
                break;

            case 3:
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

                phongHocThiNghiem = new PhongHocThiNghiem(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong, chuyenNganh, sucChua, bonRua);
                storage.insertPhongHocLyThiNghiem(phongHocThiNghiem);
                phongHocOutput.output(phongHocThiNghiem);
                break;

            default:
                out.println("Lựa chọn không hợp lệ!");
                out.flush();
        }
    }
}
