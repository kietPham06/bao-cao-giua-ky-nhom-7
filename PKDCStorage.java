import java.util.ArrayList;

public class PKDCStorage {
    // Ô 2
    
    // Ô 3
    public PKDCStorage() {
    }

    ArrayList<PhongHoc> getPKDC() {
        ArrayList<PhongHoc> dsPKDC;
        dsPKDC = MemoryPhongHocDatabase.dsPKDC;
        return dsPKDC;
    }
}
