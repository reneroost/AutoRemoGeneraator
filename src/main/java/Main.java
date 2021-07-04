import domain.RehvMudel;
import domain.RehvTootja;
import util.LoeFailistUtil;
import util.RehvGen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<RehvTootja> rehvTootjad = new ArrayList<>();
    static List<RehvMudel> rehvMudelidAlg = new ArrayList<>();
    static List<RehvMudel> rehvMudelidGen = new ArrayList<>();

    public static void main(String[] args) {
        rehvTootjad = LoeFailistUtil.loeRehviTootjadFailist();
        rehvMudelidAlg = LoeFailistUtil.loeRehviMudelidFailist();

        for (RehvMudel rehvMudel: rehvMudelidAlg) {
            System.out.println(rehvMudel.getNimi());
        }

    }

    public static void looRehviMudelid(List<RehvMudel> rehvMudelidAlg) {
        for (RehvMudel rehvMudel : rehvMudelidAlg) {
//            rehvMudel = RehvGen.genereeriRehviMoot(rehvMudel);
        }
    }
}
