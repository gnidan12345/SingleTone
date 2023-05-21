import java.util.ArrayList;
import java.util.List;

public class Servers {
//    private List <String> serversList = new ArrayList<>();

    private Servers() {
    }

    private static  Servers servers;

    public static Servers getServers(){
        if(servers == null){
            servers = new Servers();
        }

        return servers;
    }

//    public boolean addServer(String server){
//        serversList.add(server);
//
//        return  true;
//    }
}
