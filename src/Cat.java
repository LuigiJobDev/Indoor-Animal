class Cat extends Animal {
    public Cat(String nome) {
        super(nome);}


    @Override
    public void verso() {
        System.out.println("Il gatto si chiama: "+ nome);
        System.out.println("Verso: Miagola (Miao, Miao)");
    }

    @Override
    public void azione() {
        System.out.println("Azione: Graffia il divano.");
    }

    @Override
    public void luogo() {
        String habitat = "casa";
        System.out.println("Luogo: Si trova in " + habitat);
        System.out.println("\n");
    }
}
