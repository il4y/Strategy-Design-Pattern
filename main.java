/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Monster zyklop = new Zyklop();
        zyklop.Info();
        zyklop.angriff();

        Monster drache = new Drache();
        drache.Laufen();
        drache.angriff();
    }
}