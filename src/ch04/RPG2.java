package ch04;

/**
 * Created by zou on 2016/12/15.
 */
public class RPG2 {
    public static void main(String[] args) {
        SwordsMan1 swordsMan = new SwordsMan1();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        Magician1 magician = new Magician1();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);

        showBlood(swordsMan);
        showBlood(magician);

    }

    static void showBlood(Role1 role) {
        System.out.printf("%s 血量 %d%n", role.getName(), role.getBlood());
    }
}




