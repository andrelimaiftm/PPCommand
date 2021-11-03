package br.edu.iftm.pp.command;

//essa classe é o meu Invocador(invoker)
public class ControleRemoto {
    Command[] comandosOn;
    Command[] comandosOff;
    Command comandoUndo;//defazet comando

    public ControleRemoto(){
        comandosOn = new Command[7];
        comandosOff = new Command[7];

        Command semComando = new semCommand();
        for (int i = 0; i < 7; i++) {
            comandosOn[i] = semComando;
            comandosOff[i] = semComando;
        }
        comandoUndo = semComando;
    }

    public void setCommand(int slot, Command comandosOn, Command comandosOff){
        this.comandosOn[slot] = comandosOn;
        this.comandosOff[slot] = comandosOff;
    }

    public void botaoOnPrecionado(int slot){
        comandosOn[slot].execute();
        comandoUndo =  comandosOn[slot];
    }

    public void botaoOffPrecionado(int slot){
        comandosOff[slot].execute();
        comandoUndo = comandosOff[slot];
    }

    public void botaoUndoPrecionado(){
        comandoUndo.undo();
    }

    public String toString(){
        StringBuffer msg = new StringBuffer();
        msg.append("\n------ Controle Remoto ------\n");
        for (int i = 0; i < comandosOn.length; i++) {
            msg.append("[slot " + i +"]" + comandosOn[i].getClass().getName()
            + "    " + comandosOff[i].getClass().getName() + "\n");
        }
        msg.append("[undo] " + comandoUndo.getClass().getName() + "\n");
        return msg.toString();
    }

    
}
