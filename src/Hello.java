public class Hello {
    public static void main(String[] args) {
        /*printam ceva
        ttttyrtyy
        rtyrtyrty
         */

        System.out.print("Hello world!");
        System.out.print("Hello world!");
        int x = 10;
        int y = x++;
        System.out.println(y);

        boolean noMoreCofee = true;
        if (noMoreCofee) ;
        System.out.println("Refill");
        System.out.println("Drink");

        boolean snowing = true;
        boolean raining = false;
        if (snowing) {
            System.out.println("play with snow");
        } else if (raining) {
            System.out.println("take your umbrella");
        } else {
            System.out.println("stay home");

        }

        boolean i = false;
        boolean j = true;
        if (i == j) {
            System.out.println("sunt egale");
        } else {
            System.out.println("nu sunt egale");


        }

        int p = 0;
        while(p<3) {
            System.out.println(p);
            p++;
        }
    }
}


