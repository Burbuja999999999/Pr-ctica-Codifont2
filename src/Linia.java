public class Linia {
    private Punt punt1;
    private Punt punto2;

    private int id;

    public Linia(Punt punt1, Punt punto2, int id) {
        this.punt1 = punt1;
        this.punto2 = punto2;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Linia{" +
                "punt1=" + punt1 +
                ", punto2=" + punto2 +
                ", id=" + id +
                '}';
    }
}
