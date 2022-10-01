import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[]Args){
        int i, maior = 0, menor = 0;
        Scanner input = new Scanner (System.in);

        for(i = 0; i < 4; i++){
            System.out.println("Digite um valor Teste: ");
            int numero = input.nextInt();

            if(numero > maior || i == 0){
                maior = numero;
            }
            if(numero < menor || i == 0){
                menor = numero;
            }
        }

        System.out.println("O maior numero e: "+ maior);

        System.out.println("O menor numero e: "+ menor);
    }
}
