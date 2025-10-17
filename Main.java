public class Main {
    public static void main(String[] args) {

        Procesor procesor = new Procesor("Intel i9");
        Memorie memorie = new Memorie(25);
        Program program = new Program("EditorText", procesor, memorie);

        procesor.executa("Inițializare sistem");
        program.ruleaza();
        program.opreste();
    }
}
