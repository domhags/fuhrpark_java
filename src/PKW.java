public class PKW extends MotorisiertesFahrzeug {
    private int sitze;
    private int kofferraumvolumen;

    public PKW(int kilometerstand, float tankinhalt, int baujahr, String farbe, int sitze, int kofferraumvolumen) {
        super(kilometerstand, tankinhalt, baujahr, farbe);
        this.sitze = sitze;
        this.kofferraumvolumen = kofferraumvolumen;
    }

    public int getSitze() {
        return sitze;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public int getKofferraumvolumen() {
        return kofferraumvolumen;
    }

    public void setKofferraumvolumen(int kofferraumvolumen) {
        this.kofferraumvolumen = kofferraumvolumen;
    }
}
