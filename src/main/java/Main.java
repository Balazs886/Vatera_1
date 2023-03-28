import java.util.*;

public class Main {
    /*
        https://www.vatera.hu/user/rating/rating.php?id=383691
        itt vannak a vateras felhasznalok adatlapjai
        itt látszik kikkel volt
        adásvételük
        tervezz egy olyan adatstruktúrát
        amiben
        el tudod tárolni
        hogy ki kivel volt üzleti kapcsolatban
        első fázis ez a struktúra


        következő
        perzisztálni valahogy ezt a strutkúrát
        harmadik fázis meg feltölteni automatikusan
     */

    public static void main(String[] args) {

        User sandor = new User("Sándor");
        User jozsef = new User("József");
        User benedek = new User("Benedek");
        User istvan = new User("István");

        Deal deals1 = new Deal("Sándor", "József", "kávégép");
        Deal deals2 = new Deal("Sándor", "Benedek", "táska");
        Deal deals3 = new Deal("István", "Sándor", "csavar");
        Deal deals4 = new Deal("Benedek", "István", "hajvágó");

        HashMap<Integer, Deal> businessRelationship = new HashMap<Integer, Deal>();
        businessRelationship.put(0, deals1);
        businessRelationship.put(1, deals2);
        businessRelationship.put(2, deals3);
        businessRelationship.put(3, deals4);


        System.out.println("Üzleti kapcsolatok:");
        for (int i = 0; i < businessRelationship.size(); i++) {
            System.out.println(businessRelationship.get(i));
            System.out.println();
        }
    }
}
