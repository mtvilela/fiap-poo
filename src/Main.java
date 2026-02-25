void main(){
    Projetor projetor1 = new Projetor();

    projetor1.estaLigado = true;
    projetor1.volume = 50;

    projetor1.exibir();

    projetor1.mudarVolume(86);

    projetor1.desligar();

    projetor1.ligar();

    Projetor projetor2 = new Projetor();

    projetor2.estaLigado = false;
    projetor2.volume = 100;

    projetor2.exibir();









}