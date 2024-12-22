class Fish extends Animal {
    public Fish(String nome) {
        super(nome);}


    @Override
    public void verso() {
        System.out.println("Il pesce si chiama: " + nome);
        System.out.println("Verso: Stride (Blup, Blup!)");
    }

    @Override
    public void azione() {
        System.out.println("Azione: Nuota spensiarato.");
    }

    @Override
    public void luogo() {
        String habitat = "acquario";
        System.out.println("Luogo: Si trova nell'" + habitat);
    }
}
