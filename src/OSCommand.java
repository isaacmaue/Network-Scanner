import java.lang.ProcessBuilder;
import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;



public class OSCommand {

    private String sudo;
    private String command;
    private String option;
    private String subnet;

    public OSCommand() {
        this.sudo = "sudo";
        this.command = "nmap";
        this.option = "-sn";
        this.subnet = "192.168.1.0/24";
    }

    //Implement the nmap command
    public
}
