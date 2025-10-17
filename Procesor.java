public class Procesor {
    public String model;   // modelul procesorului
    public boolean ruleaza; // stare: dacă procesorul rulează sau nu

    // constructorul clasei Procesor
    public Procesor(String model) {
        this.model = model;
        this.ruleaza = false;
    }

    // metoda care execută o instrucțiune
    public void executa(String instructiune) {
        ruleaza = true;
        System.out.println("Procesorul " + model + " execută instrucțiunea: " + instructiune);
    }

    // metoda care oprește procesorul
    public void opreste() {
        ruleaza = false;
        System.out.println("Procesorul " + model + " a fost oprit.");
    }

    public boolean esteActiv() {
        return ruleaza;
    }
}

