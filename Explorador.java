public class Explorador {
    String nome;
    String nacionalidade;
    Integer energia;        
    Integer saude;
    Boolean vida;
   
    public Explorador(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public void morrer() {
        this.energia = 0;
        this.saude = 0;
        this.vida = false;
    }

    public void Explorar() {
        this.energia -= 10;
        this.saude -= 5;
    }

    public void ColetarRecursos() {
        this.energia += 20;
        this.saude -= 10;

    }

    public void Treinar() {
        this.saude += 15;
        this.energia -= 10;
    }

    public void ExibirInformações() {
        System.out.println("nome");
    }
}
