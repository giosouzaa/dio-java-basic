/*
Escreva um código onde o usuária insere sua altura e peso e seja calculado o seu IMC 
com base na equação IMC = peso/(altura*altura) e seja exibida uma mensagem de acordo com o resultado:
- "Abaixo do peso" (IMC<=18,5)
- "Peso ideal" (18,6<IMC<24,9)
- "Levemente acima do peso" (25<IMC<29,9)
- "Obesidade Grau I" (30<IMC<34,9)
- "Obesidade Grau II (Severa)" (35<IMC<39,9)
- "Obesidade Grau III (Mórbida)" (IMC>=40)
*/
import java.util.Scanner;
public class IMC {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        float peso, altura, IMC;

        System.out.println("Insira seu peso em quilogramas:");
        peso = scanner.nextFloat();
        System.out.println("Insira sua altura em metros:");
        altura = scanner.nextFloat();

        IMC = peso/(altura*altura);

        if(IMC<=18.5){
            System.out.printf("Seu IMC é de %.1f e você está abaixo do peso \n", IMC);
        } else if (18.5<IMC && IMC<=24.9){
                System.out.printf("Seu IMC é de %.1f e você está com o peso ideal\n", IMC);
            }else if (24.9<IMC && IMC<=29.9){
                     System.out.printf("Seu IMC é de %.1f e você está levemente acima do peso\n", IMC);
                } else if (29.9<IMC && IMC<=34.9){
                        System.out.printf("Seu IMC é de %.1f e você está com obesidade de grau I\n", IMC);
                    } else if (34.9<IMC && IMC<=39.9){
                             System.out.printf("Seu IMC é de %.1f e você está com obesidade de grau II (Severa)\n", IMC);
                        } else if (IMC>=39.9){
                                System.out.printf("Seu IMC é de %.1f e você está com obesidade de grau III (Mórbida)\n", IMC);
                            }

    }
    
}