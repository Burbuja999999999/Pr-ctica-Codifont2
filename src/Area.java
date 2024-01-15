public class Area {
    private Punt punto3;
    private Punt punto4;

    private Punt punto5;
    private int id;

    public Area(Punt punto3, Punt punto4, Punt punto5, int id) {
        this.punto3 = punto3;
        this.punto4 = punto4;
        this.punto5 = punto5;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Area{" +
                "punto3=" + punto3 +
                ", punto4=" + punto4 +
                ", punto5=" + punto5 +
                ", id=" + id +
                '}';
    }
}
