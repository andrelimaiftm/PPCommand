package br.edu.iftm.pp.command;

public class BanheiraHOffCommand implements Command{

    BanheiraHidromassagem bh;
    
    public BanheiraHOffCommand(BanheiraHidromassagem bh) {
        this.bh = bh;
    }

    @Override
    public void execute() {
        bh.setTemperatura(18);
        bh.off();        
    }

    @Override
    public void undo() {
        bh.on();
        
    }
    
}
