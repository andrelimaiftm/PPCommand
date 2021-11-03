package br.edu.iftm.pp.command;

public class BanheiraHOnCommand implements Command{

    BanheiraHidromassagem bh;

    

    public BanheiraHOnCommand(BanheiraHidromassagem bh) {
        this.bh = bh;
    }

    @Override
    public void execute() {
        bh.on();
        bh.setTemperatura(20);
        bh.circular();
        
    }

    @Override
    public void undo() {
        bh.off();
        
    }
    
}
