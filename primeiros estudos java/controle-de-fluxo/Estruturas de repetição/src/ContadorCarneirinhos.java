public class ContadorCarneirinhos {

    //Exemplo de controle de repetição com for
    //Joãozinho deve contar até 20 carneirinhos para pegar no sono

    public static void main(String[] args) throws Exception {
        
        for(int i=1;i<=20;i++){ //onde i = ao número de carneirinhos
            if(i<2){
                System.out.println(i + " carneirinho...");
            }else
            System.out.println(i + " carneirinhos...");
        }
        System.out.println("Zzz...");
    }
}
