package HOmeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbsClient> arr = new ArrayList<>();

        arr.add(new SuperClient());
        arr.add(new VIPClient());
        arr.add(new Client());

        var h = new SuperClient();
        var j = new Client();
        var i = new VIPClient();

        var r = (SuperClient) i;


    }
}
