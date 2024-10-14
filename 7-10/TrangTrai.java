import java.util.ArrayList;
import java.util.List;

public class TrangTrai {
    private List<DongVat> dsdongvat;

    public TrangTrai() {
        dsdongvat = new ArrayList<>();
    }

    public void themdvat(DongVat con) {
        dsdongvat.add(con);
    }

    public void in() {
        System.out.println("Danh sach cac dong vat co the boi hoac di bo: ");
        for(DongVat it: dsdongvat) {
            System.out.println(it.getName() + "-" + it.getMovement() );
        }
    }

    public static void main(String[] args) {
        
    }
}
