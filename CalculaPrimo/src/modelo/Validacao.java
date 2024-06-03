package modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        this.numero = numero;
        this.executar();
    }
    
    private void executar()
    {
        this.mensagem = "";
        try
        {
            this.num = Integer.parseInt(numero);
            if(num <= 1)
            {
                this.resposta = "Não e primo";
            }
        } catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão";
        }
    }
}
