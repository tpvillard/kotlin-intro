package interop;

import classes.CustomerKotlin;
import classes.CustomerKotlinKt;
import classes.Status;
import function.FunctionsKt;

import java.io.IOException;

public class TalkingToKotlin {

    public static void main(String[] args) {

        CustomerKotlin customer = new CustomerKotlin(1, "rgicquel", "rgicquel@gmail.com");

        // No more kotlin properties but getter and setter
        String name = customer.getName();

        String value  = customer.getAProperty();
        System.out.println("property: " + value);
        customer.setAProperty("uuuuu");
        value  = customer.getAProperty();
        System.out.println("property: " + value);

        customer.changeStatus(Status.CURRENT);

        // I get the overload version with no argument thanks to the annotation
        customer.changeStatus();

        // Ctrl Alt T to surround, this is nice!!!
        try {
            customer.loadStatistics("pipo");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Access top level functions
        FunctionsKt.reverse("Hello World");

        // call extension function from Java
        CustomerKotlinKt.extension(customer);
    }
}
