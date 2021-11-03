package br.edu.iftm.pp.command;

public class LuzOffCommand implements Command{

    Luz luz;

    public LuzOffCommand(Luz luz) {
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
