public class Person {
    String namsinh;
    String hoten;

    public String getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Person() {
        namsinh = "chua co nam sinh";
        hoten = "chua co ho ten";
    }

    public Person(String namsinh, String hoten) {
        this.namsinh = namsinh;
        this.hoten = hoten;
    }
    
    
}