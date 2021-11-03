package br.edu.iftm.pp.command;

public class LuzOnCommand implements Command{
    Luz luz;

    

    public LuzOnCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        this.luz.on();
        
    }

    @Override
    public void undo() {
        this.luz.off();
        
    }
    
}
