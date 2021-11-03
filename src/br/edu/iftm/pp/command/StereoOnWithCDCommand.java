package br.edu.iftm.pp.command;

public class StereoOnWithCDCommand implements Command{

    Stereo stereo;
    
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
        stereo.setVolume(11);
        
    }

    @Override
    public void undo() {
        this.stereo.off();
        
    }
    
}
