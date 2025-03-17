import java.util.ArrayList;

public class PKDCControl {
    // Ô 2
    PKDCStorage pKDCStorage;
    PKDCOutput pKDCOutput;

    // Ô 3
    public PKDCControl() {
        pKDCStorage = new PKDCStorage();
        pKDCOutput = new PKDCOutput();
    }

    PKDCControl(PKDCStorage _pKDCStorage, PKDCOutput _pKDCOutput) {
        pKDCStorage = _pKDCStorage;
        pKDCOutput = _pKDCOutput;
    }
    void printPKDC() {
        ArrayList<PhongHoc>dsPKDC;
        dsPKDC = pKDCStorage.getPKDC();
        pKDCOutput.output(dsPKDC);
        ArrayList<PhongHoc> dsKhongDatChuan = new ArrayList<>();

        // Kiểm tra phòng không đạt chuẩn
        for (PhongHoc phong : dsPKDC) {
            if (!phong.datChuan()) {
                dsKhongDatChuan.add(phong);
            }
        }

        // Xuất danh sách phòng không đạt chuẩn
        pKDCOutput.output(dsKhongDatChuan);
 

    }
}