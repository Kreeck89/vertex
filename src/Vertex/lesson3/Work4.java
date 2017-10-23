package Vertex.lesson3;

import java.util.Locale;

public class Work4 {

    public static void main(String[] args) {
        String welcome = "welcome";
        String to = "to";
        String ukraine = "Ukraine";

/*        String result = welcome
                .concat(" ")
                .concat(to)
                .concat(" ")
                .concat(ukraine);

        String result = welcome
                + " "
                + to
                + " "
                + ukraine;*/

        final StringBuilder builder = new StringBuilder();
        String result = builder
                .append("             ")
                .append(welcome)
                .append(" ")
                .append(to)
                .append(" ")
                .append(ukraine)
                .toString();

        System.out.println("Before trim length");
        System.out.println(result.length());

        System.out.println("After trim");
        System.out.println(result.trim().length());

        System.out.println(result.charAt(19));

        final String trim = result.trim();

        System.out.println(trim);

        final String replaceAll = trim.replaceAll(" ", "");
        System.out.println(replaceAll);

        String hello = "Hello(%$";

        final String filtered = hello.replaceAll("[$(%]", ")");
        System.out.println(filtered);

        String name = "Alex";

        final String all = name.replaceAll(String.valueOf(name.charAt(0)),
                String.valueOf(name.charAt(0)).toLowerCase());

        System.out.println(all);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase(Locale.CHINA));
    }
}
