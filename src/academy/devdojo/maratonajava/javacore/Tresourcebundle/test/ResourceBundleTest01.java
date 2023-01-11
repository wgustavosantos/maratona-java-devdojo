package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));

        boolean isBundleExist = bundle.containsKey("hello");
        System.out.println(isBundleExist);

        System.out.println(bundle.getString("hello"));

        ResourceBundle bundle2 = ResourceBundle.getBundle("message", new Locale("en", "US"));
        boolean isBundle2Exist = bundle.containsKey("message");
        System.out.println(isBundle2Exist);

        System.out.println(bundle2.getString("hello"));


    }
}
