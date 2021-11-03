package br.edu.iftm.pp.command;

public class LuzCopaOnCommand implements Command{
    
    Luz luz;    

    public LuzCopaOnCommand(Luz luz) {
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
