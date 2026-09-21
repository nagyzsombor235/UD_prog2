package sztringek2;
public class sztringek2
{
    // E. verbing
    // Ha az adott sztring hossza legalább 3, akkor
    // a végéhez adjuk hozzá az 'ing' ragot.
    // Ha 'ing'-re végződik, akkor ehelyett az 'ly'
    // ragot tegyük hozzá.
    // Ha a sztring hossza rövidebb 3 karakternél, akkor
    // hagyjuk változatlanul.
    // Adjuk vissza az eredménysztringet.
    private static String verbing(String s)
    {
        if(s.length() < 3)
        {
            return(s);
        }
        else
        {
            String asd = s.substring(s.length()-3);
            if(asd.compareTo("ing") == 0)
            {
                return(s + "ly");
            }
            else
            {
                return(s + "ing");
            }
        }
    }

    // F. not_bad
    // Egy adott sztringben keressük meg a 'not' és
    // 'bad' szavak előfordulási helyét. Ha a 'bad'
    // a 'not' szót követi, akkor cseréljük ki az
    // egész 'not'...'bad' részsztringet a 'good' szóra.
    // Adjuk vissza az eredmény sztringet.
    // Példa: 'This dinner is not that bad!' ->
    //        This dinner is good!
    private static String notBad(String s)
    {
        int a = s.indexOf("not");
        int b = s.indexOf("bad");
        if(a < b)
        {
            return(s.substring(0, a) + "good" + s.substring(b+3));
        }
        else
        {
            return(s);
        }
    }

    // G. front_back
    // Egy sztringet osszunk két részre, s a két részt nevezzük
    // a sztring elejének és végének. Ha a sztring hossza páros, akkor
    // a két rész hossza azonos. Ha a hossz páratlan, akkor az eleje
    // legyen egy karakterrel hosszabb mint a vége.
    // Például 'abcde' esetén a két rész: 'abc' és 'de'.
    // Két adott sztring (a és b) esetén adjunk vissza egy sztringet, mely
    // a következőképpen épül fel:
    // a-eleje + b-eleje + a-vége + b-vége
    // Például ha a = 'abcd' és b = 'xy', akkor az eredmény 'abxcdy' legyen.
    private static String frontBack(String a, String b)
    {


        int aparity = a.length()%2;
        int bparity = b.length()%2;  
        String afront = a.substring(0, a.length()/2+aparity);
        String aback = a.substring(a.length()/2+aparity);
        String bfront = b.substring(0, b.length()/2+bparity);
        String bback = b.substring(b.length()/2+bparity);
        /*
        if(a.length()%2 == 0)
        {
            afront = a.substring(0, a.length()/2);
            aback = a.substring(a.length()/2);
        }
       /* else
        {
            afront = a.substring(0, a.length()/2+1);
            aback = a.substring(a.length()/2+1);
        }
        if(b.length()%2 == 0)
        {
            bfront = b.substring(0, b.length()/2);
            bback = b.substring(b.length()/2);
        }
        else
        {
            bfront = b.substring(0, b.length()/2+1);
            bback = b.substring(b.length()/2+1);
        }*/
        return(afront + bfront + aback + bback);
    }

    static void test(String got, String expected)
    {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swiming"), "swimingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(notBad("This movie is not so bad"), "This movie is good");
        test(notBad("This dinner is not that bad!"), "This dinner is good!");
        test(notBad("This tea is not hot"), "This tea is not hot");
        test(notBad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(frontBack("abcd", "xy"), "abxcdy");
        test(frontBack("abcde", "xyz"), "abcxydez");
        test(frontBack("Kitten", "Donut"), "KitDontenut");
    }
}
