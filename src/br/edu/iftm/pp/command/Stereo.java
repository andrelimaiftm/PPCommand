package br.edu.iftm.pp.command;

public class Stereo {

    String localizacao;

    public Stereo(String localizacao) {
        this.localizacao = localizacao;
    }

    public void on(){
        System.out.println(this.localizacao + " stereo está ligado");
    }

    public void off(){
        System.out.println(this.localizacao + " stereo está desligado");
    }

    public void setCd(){
        System.out.println(this.localizacao + " stereo está funcionado o CD da entrada");
    }

    public void setDVD(){
        System.out.println(this.localizacao + " stereo está funcionado o DVD da entrada");
    }

    public void setRadio(){
        System.out.println(this.localizacao + " stereo está ligando a radio");
    }

    public void setVolume(int volume){
        System.out.println(this.localizacao + " stereo aumento seu volme para " + volume);
    }
    
}
