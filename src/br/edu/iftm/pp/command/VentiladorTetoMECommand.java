package br.edu.iftm.pp.command;

public class VentiladorTetoMECommand implements Command{
    
    VentiladorTeto ventiladorTeto;
    int velocidadeAnterior;

    public VentiladorTetoMECommand(VentiladorTeto ventiladorTeto) {
        this.ventiladorTeto = ventiladorTeto;
    }

    @Override
    public void execute() {
        this.velocidadeAnterior = ventiladorTeto.getVelocidade();
        ventiladorTeto.medio();
    }

    @Override
    public void undo() {
        switch(this.velocidadeAnterior){
            case VentiladorTeto.MAXIMO: ventiladorTeto.maximo();
                break;
            case VentiladorTeto.MEDIO: ventiladorTeto.medio();
                break;
            case VentiladorTeto.BAIXO: ventiladorTeto.baixo();
                break;
            default: ventiladorTeto.off();
                break;
        }
        
    }

    
    
}
