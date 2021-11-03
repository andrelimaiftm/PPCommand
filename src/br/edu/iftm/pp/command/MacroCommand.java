package br.edu.iftm.pp.command;

public class MacroCommand implements Command{

    Command[] comandos;

    public MacroCommand(Command[] comandos) {
        this.comandos = comandos;
    }

    @Override
    public void execute() {
        for (int i = 0; i < comandos.length; i++) {
            comandos[i].execute();
        }
        
    }

    @Override
    public void undo() {
        for (int i = comandos.length - 1; i >= 0; i--) {
            comandos[i].undo();
        }
        
    }
    
}
