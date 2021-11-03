package br.edu.iftm.pp.command;

public class LuzCopaOffCommand implements Command {
    
    Luz luz;    

    public LuzCopaOffCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        this.luz.off();
        
    }

    @Override
    public void undo() {
        this.luz.on();
        
    }
    
}
