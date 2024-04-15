public class Mecz {
    private Druzyna druzynaA;
    private Druzyna druzynaB;
    private int wynik;

    public Mecz(Druzyna druzynaA, Druzyna druzynaB, int wynik) {
        this.druzynaA = druzynaA;
        this.druzynaB = druzynaB;
        this.wynik = wynik;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    @Override
    public String toString() {
        return "Mecz{" +
                "druzynaA=" + druzynaA +
                ", druzynaB=" + druzynaB +
                ", wynik=" + wynik +
                '}';
    }

}
