package square;

import java.util.Scanner;

class Negyzet{
    private int a;
    public Negyzet(int a) {
        super();this.a = a;
    }
    public int kerulet()
    {
        return(4*a);
    }
    public int terulet()
    {
        return (a*a);
    }
}

public class square {
    public static void main(String[] args)
    {
        Scanner asd = new Scanner(System.in);
        int x = scanner.nextInt();
Negyzet negyzet = new Negyzet(3);    // a konstruktornak a négyzet oldalának a hosszát adjuk át
int k = negyzet.kerulet();    // 12
int t = negyzet.terulet();
    }
    }
 