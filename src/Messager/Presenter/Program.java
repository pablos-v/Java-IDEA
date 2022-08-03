package Messager.Presenter;

import Messager.Model.ICQ;

public class Program {
    public static void main(String[] args) {
        ICQ icq = new ICQ("\"balabol\"");
        Functionality.basic(icq);
        Functionality.deletion(icq);
        Functionality.database(icq);

    }
}
