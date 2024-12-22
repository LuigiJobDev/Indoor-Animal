/*Classe principale per testare le sottoclassi*/
public class Main {
    public static void main(String[] args) {
        /*Istanza di Animal*/
        Animal cane = new Dog("Fido");
        Animal gatto = new Cat("Whiskers");
        Animal pesce = new Fish("Nemo");

        /*Chiamata al metodo Verso e Azione per ogni animale*/
        cane.verso();
        cane.azione();
        cane.luogo();

        gatto.verso();
        gatto.azione();
        gatto.luogo();

        pesce.verso();
        pesce.azione();
        pesce.luogo();

    }

}