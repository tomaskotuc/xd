import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Zak zak1 = new Zak("Negr Negroidni", 9);
        Zak zak2 = new Zak("Adolf Cumtler", 8);
        Znamka znamka = new Znamka(1, LocalDate.of(2021,1,1), zak1, "Matematika");
        Znamka znamka1 = new Znamka(5, LocalDate.now(), zak1, "Programování");
        Znamka znamka2 = new Znamka(3, LocalDate.now(), zak2, "Tělocvik");
        System.out.println(znamka2.getZak().getJmenoAPrijmeni() + " ; " + znamka2.getTema() + " ; Musí se opravit: " + znamka2.musiSeOpravit());
        znamka1.setZnamka(1);
        znamka1.musiSeOpravit();
        System.out.println(znamka1.musiSeOpravit());
    }
}