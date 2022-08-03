package Messager.Presenter;

import Messager.Model.ICQ;

public class Program {
    public static void main(String[] args) {
        ICQ icq = new ICQ("\"balabol\"");
        Functionality.base(icq);
        Functionality.deletion(icq);


    }
}
