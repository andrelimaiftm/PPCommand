package br.edu.iftm.pp.command;

public class BanheiraHidromassagem {

    boolean on;
    int temperatura;

    public BanheiraHidromassagem() {
    }

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    public void circular(){
        if(on){
            System.out.println(" Banheira de hidromassagem está borbulhando!");
        }
    }

    public void jatosOn(){
        if(on){
            System.out.println(" Os jatos da banheira estão ligados!");
        }
    }

    public void jatosOff(){
        if(on){
            System.out.println(" Os jatos da banheira estão desligados");
        }
    }

    public void setTemperatura(int temperatura){
        if(temperatura > this.temperatura){
            System.out.println(" A temperatura da banheira está aumentando"
            +" para " + temperatura + " graus");
        }else{
            System.out.println(" A temperatura da banheira está diminuindo"
            +" para " + temperatura + " graus");
        }
        this.temperatura = temperatura;
    }
    
}
