package br.edu.iftm.pp.command;

//interface command
public interface Command {
    public void execute();
    public void undo();    
}