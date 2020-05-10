package comandline;

import picocli.CommandLine.Option;

public class CommandLineApp {

    @Option(names = {"-h","--help"},description = "Helper")
    boolean h;


    public void run(){
        if(h){
            System.out.println("Help Description : \n");
        }

    }
}
