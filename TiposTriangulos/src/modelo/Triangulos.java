package modelo;

public class Triangulos extends absPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
    }

    

    @Override
    public void verificar()
    {
        this.resposta = "escaleno";
        if(this.l1.equals(this.l2) || this.l2.equals(this.l3) || this.l1.equals(this.l3))
        {
            this.resposta = "isosceles";
            if(this.l2.equals(this.l3) && this.l3.equals(this.l1))
            {
                this.resposta = "equilatero";
            }
        }
    }

}
