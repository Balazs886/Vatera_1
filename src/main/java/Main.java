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

        Opinion O_000001 = new Opinion(2,"Korrekt.", sandor, jozsef);

        System.out.println(O_000001);

    }
}
