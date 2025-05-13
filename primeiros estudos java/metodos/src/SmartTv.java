public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    //definido o estado inicial da TV

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void passarCanal(){
        canal++ ;
    }

    public void voltarCanal(){
        canal-- ;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++ ;
    }

    public void abaixarVolume(){
        volume--;
    }

    }
