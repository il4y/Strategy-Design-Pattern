/**
 * Monster
 */
public abstract class Monster {

    AngriffsArt angriffArt;


    public void Info() {
        System.out.println("Info");
    }

    public void Laufen() {
        System.out.println("Laufen");
    }

    public void SetAngriff(AngriffsArt aga) {
       angriffArt = aga;
    }

    public void angriff() {
        angriffArt.angriff();;
    }
}