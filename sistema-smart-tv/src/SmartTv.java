public class SmartTv {
    boolean ligado=false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public boolean isligado() {
        return ligado;
    }

    public void aumentarVolume(){
        // volume = volume + 1;
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    
    public void ligar(){
        ligado=true;
    }

    public void desligar(){
        ligado=false;
    }    
 
}