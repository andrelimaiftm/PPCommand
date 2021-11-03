package br.edu.iftm.pp.command;

public class TVOnCommand implements Command{

    TV tv;
    
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
        this.tv.setInputChannel();
        
    }

    @Override
    public void undo() {
        this.tv.off();
        
    }
    
}
