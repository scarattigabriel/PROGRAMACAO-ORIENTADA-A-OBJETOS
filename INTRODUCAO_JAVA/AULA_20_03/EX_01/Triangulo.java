package AULA_20_03.EX_01;

public class Triangulo {
    double base;
    double altura;


    boolean temDimIguais(Triangulo t)
    {
        return(this.base == t.base && this.altura == t.altura);
    }
    void somaTriangulo(Triangulo t)
    {
        this.base += t.base;
        this.altura += t.altura;
        return;
    }
    void somaTriangulo2(Triangulo t)
    {
        t.base += this.base;
        t.altura += this.altura;
    }
}
