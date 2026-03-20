package AULA_20_03.EX_01;

public class Main {
    public static void main(String[] args)
    {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        t1.base = 2;
        t1.altura = 3;
        t2.base = 9;
        t2.altura = 6;
        System.out.println(t1.temDimIguais(t2));
        //t1.somaTriangulo(t2);
        //System.out.println(t1.base + "\n" +  t1.altura);
        t1.somaTriangulo2(t2);
        System.out.println(t2.base + "\n" +  t2.altura);
    }
}
