package util;

import domain.RehvMudel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RehvGen {

    static int[] laiused = {185, 195, 205, 215, 225, 235, 245, 255, 265, 275};
    static int[] korgused = {35, 40, 45, 50, 55, 60, 65};
    static int[] diameetrid = {15, 16, 17, 18, 19, 20, 21};

    public static List<RehvMudel> genereeriRehvid(List<RehvMudel> rehvMudelidAlg) {
        Random suvaline = new Random();
        List<RehvMudel> rehvMudelGen = new ArrayList<>();
        for (RehvMudel rehvMudel : rehvMudelidAlg) {
            ArrayList<int[]> moodudList = new ArrayList<>();
            int hulk = suvaline.nextInt(10);
            for (int i = 0; i < hulk; i++) {
                int[] moodud = genereeriRehviMoot();
                for (int j = 0; j < moodudList.size(); j++) {
                    if (!onVordsed(moodudList.get(i), moodud)) {
                        moodudList.add(moodud);
                    }
                }
            }
            for (int[] moodud : moodudList) {
                rehvMudel.setLaius(moodud[0]);
                rehvMudel.setKorgus(moodud[1]);
                rehvMudel.setDiameeter(moodud[2]);
            }
        }
        return rehvMudelGen;
    }

    public static int[] genereeriRehviMoot() {
        Random suvaline = new Random();
        int[] moodud = new int[3];
        int indeks = suvaline.nextInt(laiused.length);
        moodud[0] = laiused[indeks];
        indeks = suvaline.nextInt(korgused.length);
        moodud[1] = korgused[indeks];
        indeks = suvaline.nextInt(diameetrid.length);
        moodud[2] = diameetrid[indeks];
        return moodud;
    }

    public static boolean onVordsed(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[1]) {
                return false;
            }
        }
        return true;
    }

}
