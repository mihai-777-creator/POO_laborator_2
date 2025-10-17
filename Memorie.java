public class Memorie {
    public int capacitate;
    public String date;

    // constructorul clasei Memorie
    public Memorie(int capacitate) {
        this.capacitate = capacitate;
        this.date = "";
    }

    // metoda care încarcă datele în memorie
    public void incarcaDate(String date) {
        if (date.length() > capacitate) {
            System.out.println("Eroare: datele depășesc capacitatea memoriei!");
        } else {
            this.date = date;
            System.out.println("Datele au fost încărcate în memorie: " + date);
        }
    }

    // metoda care eliberează datele din memorie
    public void elibereazaDate() {
        this.date = "";
        System.out.println("Memoria a fost eliberată.");
    }
}
