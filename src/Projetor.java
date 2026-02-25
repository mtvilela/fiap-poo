public class Projetor {
    int nivelBrilho;
    boolean estaLigado;
    int volume;


    void ligar(){
        this.estaLigado = true;
        System.out.println("O projetor está ligado!\n");

    }
    void desligar(){
        this.estaLigado = false;
        System.out.println("O projetor está desligado!\n");

    }
    void mudarVolume(int mudar){
        if (estaLigado) {
            this.volume = mudar;
            System.out.printf("Volume alterado para %d\n", volume);
        }
        else {
            System.out.println("Projetor está desligado\n");
        }
    }
    void exibir(){
        String info = (estaLigado) ? "Ligado" : "Desligado";
        System.out.printf("Seu projetor está %s\nCom o Volume de %d porcento\n", info, volume);
    }
}

