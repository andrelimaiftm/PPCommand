package br.edu.iftm.pp.command;

public class TV {

    String localizacao;
    int canal;

    public TV(String localizacao) {
        this.localizacao = localizacao;
    }

    public void on(){
        System.out.println(localizacao + " TV está ligada");
    }

    public void off(){
        System.out.println(localizacao + " TV está desligada");
    }

    public void setInputChannel(){
        this.canal = 3;
        System.out.println(this.localizacao + " Canal da TV está habilitado para o DVD");
    }
    
}
