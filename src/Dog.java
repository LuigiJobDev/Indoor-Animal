class Dog extends Animal {
    public Dog(String nome) {
        super(nome);}


    @Override
    public void verso() {
        System.out.println("Il cane si chiama: " + nome);
        System.out.println("Verso: Abbaia (Bau, Bau!)");
    }

    @Override
    public void azione() {
        System.out.println("Azione: Scodinzola felice.");
    }

    @Override
    public void luogo() {
        String habitat = "cuccia";
        System.out.println("Luogo: Si trova nella " + habitat);
        System.out.println("\n");
    }
}
