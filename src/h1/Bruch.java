package h1;

public class Bruch {

    public int zaehler;
    public int nenner;

    public Bruch(int zaehler, int nenner) {

        if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
        }

        this.zaehler = zaehler;
        this.nenner = nenner;

    }

    private int ggT(int x, int y) {

        x = Math.abs(x);
        y = Math.abs(y);
        int r = 0;

        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }

        return x;

    }

    public void shorten() {

        int g = ggT(zaehler, nenner);

        zaehler /= g;
        nenner /= g;

    }

    public boolean hasSameValueAs(Bruch b) {

        return (long) this.zaehler * b.nenner == (long) b.zaehler * this.nenner;

    }

}