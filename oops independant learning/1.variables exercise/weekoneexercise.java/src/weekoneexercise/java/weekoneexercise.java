package weekoneexercise.java;
import java.util.Scanner;

public class weekoneexercise {
    
    Scanner sc = new Scanner(System.in);
    boolean didOswaldActAlone(boolean a)
    {   
        return a;
    }
    boolean wasojGuilty(boolean b) 
    {
        return b;
    }
    String favouriteFilm() {
        return "My Favourite Film is Abiyum Nanum";
    }
    int filmRating() {
        System.out.print("Film Rating: ");
        int x = sc.nextInt();
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        weekoneexercise obj1 = new weekoneexercise();
        System.out.print("Did Oswald Act Alone? True or False: ");
        boolean a = sc.nextBoolean();
        boolean s = obj1.didOswaldActAlone(a);
        System.out.println(s);
        System.out.print("Is OJ Guilty? True or False: ");
        boolean b = sc.nextBoolean();
        boolean y = obj1.wasojGuilty(b);
        System.out.println(y);
        String z = obj1.favouriteFilm();
        System.out.println(z);
        int f = obj1.filmRating();
        System.out.println("Film Rating: " + f);
    }
}
