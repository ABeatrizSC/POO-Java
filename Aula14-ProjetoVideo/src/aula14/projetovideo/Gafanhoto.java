package aula14.projetovideo;
public class Gafanhoto extends Pessoa { //FILHO DE "PESSOA"
    private String login;
    private int totAssistido;
    
    //CONSTRUTOR
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); //SUPER: PESSOA
        this.login = login;
        this.totAssistido = 0; //sempre que criar gafanhoto ele nao vai ter assistido nenhum video
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    //METODO ABSTRATO DE PESSOA (CLASSE MÃE DESTA)
    @Override
    public void ganharExp() {
        
    }
   
    
    
}
