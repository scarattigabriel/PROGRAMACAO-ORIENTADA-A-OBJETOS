/*4.​ Faça um programa em Java que imprima a tabuada do número 5 no seguinte formato:
1 x 5 =
5
2 x 5 = 10
3 x 5 = 15
4 x 5 = 20
5 x 5 = 25
6 x 5 = 30
7 x 5 = 35
8 x 5 = 40
9 x 5 = 45
10 x 5 = 50​ */
public class Exercicio4 {
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i + " x 5 = " + (i * 5));
        }


    }
    
}
