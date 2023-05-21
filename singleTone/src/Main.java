
public class Main {
    public static void main(String[] args) {


       Servers servers =  Servers.getServers();
       Servers serversAnother =  Servers.getServers();

        System.out.println(servers == serversAnother);

    }
}