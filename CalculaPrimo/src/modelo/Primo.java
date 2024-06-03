package modelo;

public class Primo extends absPropriedades
{

    public Primo(int num)
    {
        this.num = num;
        this.executar();
    }

    private void executar()
    {
        int divisores = 0;
        for (var contador = num; contador >= 1; contador--)
        {
            if (num % contador == 0)
            {
                divisores ++;
            }
        }
        
       if (divisores == 2)
       {
           this.resposta = "É primo";
       }
       else
       {
           this.resposta = "Não é primo";
       }
    }
}
