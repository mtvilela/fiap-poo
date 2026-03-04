public class Projetor {
    int nivelBrilho;
    boolean estaLigado;
    int volumeAtual;


    void ligar(){
        if (this.estaLigado) {
            System.out.println("\nO seu projetor já está ligado!\n");
            return;
        }
        this.estaLigado = true;
        System.out.println("\nLigando Projetor!");
    }
    void desligar(){
        if (!this.estaLigado){
            System.out.println("\n Seu projetor já está desligado");
            return;
        }
        this.estaLigado = false;
        System.out.println("\nDesligando Projetor!");

    }
    void aumentarVolume(){
        if (!this.estaLigado){
            System.out.println("\nSeu projetor está desligado, não é possível alterar o volume.");
            return;
        }
        this.volumeAtual += 5;
        System.out.printf("\nSeu volume atual é %d,", this.volumeAtual);
    }

    void diminuirVolume(){
        if (!this.estaLigado){
            System.out.println("\nSeu projetor está desligado, não é possível alterar o volume.");
            return;
        }
        this.volumeAtual -= 5;
        System.out.printf("\nSeu volume atual é %d,", this.volumeAtual);
    }

    void exibir(){
        String info = (this.estaLigado) ? "Ligado" : "Desligado";
        System.out.printf("Seu projetor está %s\nCom o Volume de %d porcento\n", info, volumeAtual);
    }
}

