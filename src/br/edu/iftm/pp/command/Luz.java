package br.edu.iftm.pp.command;

public class Luz {
    String localizacao;
    int level;

    public Luz(String localizacao){
        this.localizacao = localizacao;
    }

    public void on(){
        this.level = 100;
        System.out.println(" Luz está ligada");
    }

    public void off(){
        this.level = 0;
        System.out.println(" Luz está desligada");
    }

    public void escurecer(int level){
        this.level = level;
        if(level == 0){
            off();
        }else{
            System.out.println(" A luminosidade diminuiu para "+ level+"%" );
        }
    }

    public int getLevel() {
        return level;
    }   
    
}
