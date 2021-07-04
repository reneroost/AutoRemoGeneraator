package util;

import domain.RehvMudel;
import domain.RehvTootja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoeFailistUtil {

    private static String failiTeeAlgus = System.getProperty("user.dir") + "\\src\\main\\resources\\sisend\\";

    public static List<RehvTootja> loeRehviTootjadFailist() {
        List<RehvTootja> rehvTootjad = new ArrayList<>();
        String tootjadFailinimi = "man_tootjad.csv";
        String tootjadFailiTee = failiTeeAlgus + tootjadFailinimi;
        BufferedReader br = null;
        String csvEraldaja = ",";

        try {
            br = new BufferedReader((new FileReader(tootjadFailiTee)));
            String rida = br.readLine();
            while ((rida = br.readLine()) != null) {
                String[] tootjaRida = rida.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                RehvTootja rehvTootja = new RehvTootja(
                        Integer.parseInt(tootjaRida[0]),
                        tootjaRida[1],
                        tootjaRida[2],
                        tootjaRida[3].replace("\"", ""));
                rehvTootjad.add(rehvTootja);
            }
        } catch (FileNotFoundException erind) {
            System.out.println("Faili " + tootjadFailinimi + " ei leitud.");
        } catch (IOException erind) {
            System.out.println("Failis " + tootjadFailinimi + " rida ei õnnestunud lugeda. Stack trace:");
            erind.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException erind) {
                    System.out.println("Faili " + tootjadFailinimi + " ei õnnestunud sulgeda. Stack trace:");
                    erind.printStackTrace();
                }
            }
        }

        return rehvTootjad;
    }

    public static List<RehvMudel> loeRehviMudelidFailist() {
        List<RehvMudel> rehvMudelid = new ArrayList<>();
        String mudelidFailinimi = "man_mudelid.csv";
        String mudelidFailiTee = failiTeeAlgus + mudelidFailinimi;
        BufferedReader br = null;
        String csvEraldaja = ",";

        try {
            br = new BufferedReader((new FileReader(mudelidFailiTee)));
            String rida = br.readLine();
            while ((rida = br.readLine()) != null) {
                String[] mudelRida = rida.split(csvEraldaja);
                RehvMudel mudel = new RehvMudel(
                        Integer.parseInt(mudelRida[0]),
                        Integer.parseInt(mudelRida[1]),
                        mudelRida[2].replace("\"", ""),
                        mudelRida[3],
                        "sõiduauto",
                        0,
                        0,
                        0);
                rehvMudelid.add(mudel);
            }
        } catch (FileNotFoundException erind) {
            System.out.println("Faili " + mudelidFailinimi + " ei leitud.");
        } catch (IOException erind) {
            System.out.println("Failis " + mudelidFailinimi + " rida ei õnnestunud lugeda. Stack trace:");
            erind.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException erind) {
                    System.out.println("Faili " + mudelidFailinimi + " ei õnnestunud sulgeda. Stack trace:");
                    erind.printStackTrace();
                }
            }
        }
        return rehvMudelid;
    }
}
