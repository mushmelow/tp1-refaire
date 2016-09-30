/**
 * Created by Hao on 2016-09-28.
 */
public class Main {

    public static void main( String [] args ) {


        Couleur c1 = new Couleur( 1, 4, 6 );
        Couleur c2 = c1;
        System.out.println( c2.toString() );
        c2.setRouge( 100 );
        System.out.println( c1.toString() );
        System.out.println( c2.toString() );


        c1.blanchir();
        System.out.println( c1.toString() );
        System.out.println( c2.toString() );
    }



}
