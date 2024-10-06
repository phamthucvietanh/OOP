public class SinhVien extends Person {
    String mssv;

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public SinhVien() {

    }

    public SinhVien(String namsinh, String hoten, String mssv) {
        super(namsinh, hoten);
        this.mssv = mssv;
    }
    
}
