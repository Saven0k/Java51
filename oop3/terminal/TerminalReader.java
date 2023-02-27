import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioFormat.Encoding;


public class TerminalReader{


    private static TerminalReader tR;
    private CommandParses comP ;


    private TerminalReader(CommandParses comP){
        this.comP = comP;
    }

    public static TerminalReader newTR(CommandParses comP){
        if (tR == null){
            tR = new TerminalReader(comP);
        }
        return tR;

    }
    
    void endless(){
        Scanner iScanner = new Scanner(System.in);
        while(true){
            String[] input = iScanner.nextLine().split(" ");
            if(input.equals("enough")) iScanner.close();
            CommandExecutable CE = new CommandExecutable() {
                @Override
                public void execute() {}
            };
        }
    }

    
}