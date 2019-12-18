import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpMain {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[ab]+c");
        Matcher matcher = pattern.matcher("abc");

        System.out.println(matcher.matches());
        System.out.println(pattern.matcher("ababbbc").matches());
        System.out.println("find(): "+pattern.matcher("ddddababbbcdddd").find());
        System.out.println("matches(): "+pattern.matcher("ddddababbbcdddd").matches());


        Pattern wzgr= Pattern.compile("[^-]*--(\\w+)--.*");
        Matcher matchgr = wzgr.matcher("ASTRA --Bialy-- ok");
        System.out.println("Czy pasuje do regexp: " + matchgr.matches());
        System.out.println("Grupa(0): " + matchgr.group(0));
        System.out.println("String z grupy: " + matchgr.group(1));

        //1
        Pattern z1=Pattern.compile("[ABC]?\\w*apa");
        System.out.println("z1: " + z1.matcher("Aapa").matches());
        System.out.println("z1: " + z1.matcher("Adsggdsgdsagdagfda453345534_apa").matches());
        System.out.println("z1: " + z1.matcher("Zxcd").matches());

        //2
        Pattern z2=Pattern.compile("[B-Z][a-z]{4,7}[0-5]{2}");
        System.out.println("z2: " + z2.matcher("Babcde14").matches());
        System.out.println("z2: " + z2.matcher("Babcde1").matches());

        //3
        Pattern z3=Pattern.compile("[A-Z][a-z]{2,}");
        System.out.println("z3: " + z3.matcher("Aga").matches());
        System.out.println("z3: " + z3.matcher("Zofia12").matches());

        //4
        Pattern z4 = Pattern.compile("[a-zA-Z0-9][\\w.]*\\w+\\@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}");
        System.out.println("z4: "+z4.matcher("a.kowalski23@o2.pl").matches());
        System.out.println("z4: "+z4.matcher("A.Kowalski23@p2.we.pl").matches());
        System.out.println("z4: "+z4.matcher("a.kowalski23@o2.p2l").matches());

        //5
        Pattern z5=Pattern.compile("[0-3][0-9]-[01][0-9]-[012]\\d{3}");
        System.out.println("z5: " + z5.matcher("24-08-2019").matches());
        System.out.println("z5: " + z5.matcher("44-08-2019").matches());
    }
}
