void main(){
    Projetor projetor1 = new Projetor();

    projetor1.estaLigado = true;
    projetor1.volumeAtual = 50;

    projetor1.exibir();

    projetor1.aumentarVolume();
    projetor1.diminuirVolume();

    projetor1.desligar();

    projetor1.aumentarVolume();

    projetor1.ligar();

    Projetor projetor2 = new Projetor();

    projetor2.estaLigado = false;
    projetor2.volumeAtual = 100;

    projetor2.exibir();









}