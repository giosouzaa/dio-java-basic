public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        
        smartTv.desligar ();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.passarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
        
        smartTv.voltarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.escolherCanal(8);
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);
        
        smartTv.abaixarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        System.out.println("Status atual (Tv Ligada, Canal, volume): " + smartTv.ligada + ", " + smartTv.canal + ", " + smartTv.volume );
    }
}
