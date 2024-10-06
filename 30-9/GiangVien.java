public class GiangVien extends Person {
    String khoa;

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public GiangVien(String namsinh, String hoten, String khoa) {
        super(namsinh, hoten);
        this.khoa = khoa;
    }

    public GiangVien() {
        khoa = "chua co khoa";
    }
}
