import java.lang.ProcessBuilder;
import java.io.*;

public class OSCommand {

    private String command;
    private String option;
    private String targetHost;

    public OSCommand(String command, String option, String targetHost) {
        this.command = command;
        this.option = option;
        this.targetHost = targetHost;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setTargetHost(String targetHost) {
        this.targetHost = targetHost;
    }
}
