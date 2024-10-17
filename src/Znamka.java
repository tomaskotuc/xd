import java.time.LocalDate;

public class Znamka {
    private int znamka;
    private LocalDate datum;
    private Zak zak;
    private String tema;

    public int getZnamka() {
        return znamka;
    }

    public void setZnamka(int znamka) {
        this.znamka = znamka;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public Zak getZak() {
        return zak;
    }

    public void setZak(Zak zak) {
        this.zak = zak;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    public boolean musiSeOpravit() {
        if(znamka >= 4) {
            return true;
        }
    return false;
    }

    public Znamka(int znamka, LocalDate datum, Zak zak, String tema) {
        this.znamka = znamka;
        this.datum = datum;
        this.zak = zak;
        this.tema = tema;
    }
}
