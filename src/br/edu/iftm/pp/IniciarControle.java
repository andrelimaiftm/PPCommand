package br.edu.iftm.pp;

import br.edu.iftm.pp.command.BanheiraHOffCommand;
import br.edu.iftm.pp.command.BanheiraHOnCommand;
import br.edu.iftm.pp.command.BanheiraHidromassagem;
import br.edu.iftm.pp.command.Command;
import br.edu.iftm.pp.command.ControleRemoto;
import br.edu.iftm.pp.command.Luz;
import br.edu.iftm.pp.command.LuzOffCommand;
import br.edu.iftm.pp.command.LuzOnCommand;
import br.edu.iftm.pp.command.MacroCommand;
import br.edu.iftm.pp.command.Stereo;
import br.edu.iftm.pp.command.StereoOffCommand;
import br.edu.iftm.pp.command.StereoOnCommand;
import br.edu.iftm.pp.command.TV;
import br.edu.iftm.pp.command.TVOffCommand;
import br.edu.iftm.pp.command.TVOnCommand;
import br.edu.iftm.pp.command.VentiladorTeto;
import br.edu.iftm.pp.command.VentiladorTetoMACommand;
import br.edu.iftm.pp.command.VentiladorTetoOffCommand;

public class IniciarControle {
    public static void main(String[] args) throws Exception {
        
        ControleRemoto controleRemoto = new ControleRemoto();

        Luz luz = new Luz("Copa");
        TV tv = new TV("Copa");
        Stereo stereo = new Stereo("Copa");
        BanheiraHidromassagem bh = new BanheiraHidromassagem();

        LuzOnCommand luzOn =  new LuzOnCommand(luz);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        BanheiraHOnCommand bhOn = new BanheiraHOnCommand(bh);
        
        LuzOffCommand luzOff = new LuzOffCommand(luz);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        BanheiraHOffCommand bhOff= new BanheiraHOffCommand(bh);

        Command[] festaOn = {luzOn, stereoOn, tvOn, bhOn};
        Command[] festaOff = {luzOff, stereoOff, tvOff, bhOff};

        MacroCommand festaOnMacro = new MacroCommand(festaOn);
        MacroCommand festaOffMacro = new MacroCommand(festaOff);

        controleRemoto.setCommand(0, festaOnMacro, festaOffMacro);


        VentiladorTeto ventiladorTeto = new VentiladorTeto("Copa");
        VentiladorTetoMACommand ventiladoON = new VentiladorTetoMACommand(ventiladorTeto);
        VentiladorTetoOffCommand ventiladoOff = new VentiladorTetoOffCommand(ventiladorTeto);
        controleRemoto.setCommand(1, ventiladoON, ventiladoOff);

        System.out.println(controleRemoto);
        System.out.println("--- Botão Macro On ---");
        controleRemoto.botaoOnPrecionado(0);
        System.out.println("--- Botão Macro off ---");
        controleRemoto.botaoOffPrecionado(0);

    }

}
