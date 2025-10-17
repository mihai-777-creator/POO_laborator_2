public class Program {
    public String nume;
    public Procesor procesor;
    public Memorie memorie;
    public boolean ruleaza;

    // constructorul clasei Program
    public Program(String nume, Procesor procesor, Memorie memorie) {
        this.nume = nume;
        this.procesor = procesor;
        this.memorie = memorie;
        this.ruleaza = false;
    }

    public void ruleaza() {
        if (procesor.esteActiv()) {
            procesor.executa("Procesare date...");
            memorie.incarcaDate("Date programului " + nume);
            ruleaza = true;
            System.out.println("Programul " + nume + " a început să ruleze.");
        } else {
            System.out.println("Procesorul nu este activ. Programul " + nume + " nu poate fi rulat.");
        }
    }

    public void opreste() {
        procesor.opreste();
        memorie.elibereazaDate();
        ruleaza = false;
        System.out.println("Programul " + nume + " s-a oprit.");
    }
}
