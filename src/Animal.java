public abstract class Animal {
    /*Attributo comune a tutti gli animali*/
    String nome;

    /*Costruttore*/
    public Animal(String nome){
        this.nome=nome;
  }

  /*Metodo abstract*/
    public abstract void verso();
    public abstract void azione();
    public abstract void luogo();

    /*Metodo getNome*/
    public String getNome(){
        return nome;
    }

}
