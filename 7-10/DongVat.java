public abstract class DongVat {
    protected String name;

    public DongVat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getMovement();
}
