package br.edu.iftm.pp.command;

public class VentiladorTeto {

    public static final int MAXIMO = 3;
    public static final int MEDIO = 2;
    public static final int BAIXO = 1;
    public static final int OFF = 0;
    String localizacao;
    int velocidade;

    public VentiladorTeto(String localizacao) {
        this.localizacao = localizacao;
    }

    public void maximo(){
        this.velocidade = MAXIMO;
        System.out.println(localizacao + " Ventilador de teto está no maximo");
    }

    public void medio(){
        this.velocidade = MEDIO;
        System.out.println(localizacao + " Ventilador de teto está no medio");

    }

    public void baixo(){
        this.velocidade = BAIXO;
        System.out.println(localizacao + " Ventilador de teto está no baixo");
    }

    public void off(){
        this.velocidade = OFF;
        System.out.println(localizacao + " Ventilador de teto está desligado");
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    
}
