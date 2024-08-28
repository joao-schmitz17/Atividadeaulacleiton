import java.util.Scanner;

public class ExemploComdicao2 {

    //quero adicionar um desconto gradativo
    // valor maior que 1000-10%
    // valor maior que 2000-20%
    // valor maior que 3000-30%
    // valor menor igual a 1000-0%

    public static void main(String[] args) {

        double valorBruto = 3000;
        double desconto = 0d;

        // operadores logicos
        // && e
        // || ou

        Scanner scanner = new Scanner(System.in);
        System.out.println( "informe o valor bruto : ");
         valorBruto = scanner.nextDouble();

        if (valorBruto > 1000 && valorBruto < 2000) {
             desconto = valorBruto * 0.10;
        }  else if (valorBruto > 2000 && valorBruto < 3000) {}
        if (valorBruto > 2000) {
             desconto = valorBruto * (20. / 100);
        } else if (valorBruto > 2000) {}
        if (valorBruto >= 3000) {
             desconto = valorBruto * (30. / 100);
        } else if (valorBruto >= 3000) {

        }

    System.out.println("valorBruto é:" + valorBruto);
        System.out.println("valor do desconto é "+ desconto);
        System.out.println("valor liquido é :" + (valorBruto - desconto) );




    }




}
