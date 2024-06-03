package modelo;

public class Controle extends absPropriedades
{

    public Controle(String numero)
    {
        this.numero = numero;
        this.executar();
    }
    
    private void executar()
    {
        Validacao validacao = new Validacao(this.numero);
        if(validacao.mensagem.equals(""))
        {
            Primo primo = new Primo(validacao.num);
            this.resposta = primo.resposta;
        }
    }
}
