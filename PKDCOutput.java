import java.io.PrintWriter;
import java.util.ArrayList;

public class PKDCOutput {
    // Ô 2
    PrintWriter out;

    // Ô 3
    public PKDCOutput() {
        out = new PrintWriter(System.out, true);
    }

    public PKDCOutput(PrintWriter _out) {
        out = _out;
    }

    public void output(ArrayList<PhongHoc> dsPKDC) {
        out.println("Danh sách phòng không đạt chuẩn:");
        for (PhongHoc phong : dsPKDC) {
            out.println("Mã phòng: " + phong.getMaPhong());
        }
        out.flush();
    }
}