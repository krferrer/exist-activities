package com.activity.two.app;

import com.activity.two.Smartphone;
import com.activity.two.Telephone;

public class SeatworkTwo {
    public static void main(String[] args) {

        Telephone tp = new Telephone();
        tp.call("kurt ferrer");

        Smartphone sp = new Smartphone("09565672350","Android");
        sp.toString();

        sp.addContact("Russel","09565672356");
        sp.addContact("Haku","09565672351");
        sp.addContact("Yoona","09565672352");
        sp.addContact("Mary","09565672353");
        sp.addContact("Jon","09565672354");

        sp.displayContacts();

        sp.removeContact("Haku");

        sp.call("09565672359");

        sp.call("09565672356","Russel");
    }
}
