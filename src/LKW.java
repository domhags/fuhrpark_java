public class LKW extends MotorisiertesFahrzeug {
    private float ladegewicht;
    private int achsen;

    public LKW(int kilometerstand, float tankinhalt, int baujahr, String farbe, float ladegewicht, int achsen) {
        super(kilometerstand, tankinhalt, baujahr, farbe);
        this.ladegewicht = ladegewicht;
        this.achsen = achsen;
    }

    public float getLadegewicht() {
        return ladegewicht;
    }

    public void setLadegewicht(float ladegewicht) {
        this.ladegewicht = ladegewicht;
    }

    public int getAchsen() {
        return achsen;
    }

    public void setAchsen(int achsen) {
        this.achsen = achsen;
    }
}
