package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RehvMudel {

    private int id;
    private int tootjaId;
    private String nimi;
    private String rehviTyyp;
    private String soidukiTyyp;
    private int laius;
    private int korgus;
    private int diameeter;

    public static String tabeliPealkiri() {
        return String.format("%-5s%-12s%-10s%-15s%n%-10s%-10s%-10s",
                "id",
                "tootjaId",
                "nimi",
                "rehviTyyp",
                "soidukiTyyp",
                "laius",
                "korgus",
                "diameeter");
    }

    public String tabeliRida() {
        return String.format("%-5s%-12s%-10s%-15s%n%-10s%-10s%-10s",
                this.getId(),
                this.getTootjaId(),
                this.getNimi(),
                this.getRehviTyyp(),
                this.getSoidukiTyyp(),
                this.getLaius(),
                this.getKorgus(),
                this.getDiameeter());
    }

    public static String csvPealkiri() {
        return "id" +"," +
                "tootjaId" + "," +
                "nimi" + "," +
                "rehviTyyp" + "," +
                "soidukiTyyp" + "," +
                "laius" + "," +
                "korgus" + "," +
                "diameeter" + "\n";
    }

    public String csvRida() {
        return this.getId() + "," +
                this.getTootjaId() + "," +
                this.getNimi() + "," +
                this.getRehviTyyp() + "," +
                this.getSoidukiTyyp() + "," +
                this.getLaius() + "," +
                this.getKorgus() + "," +
                "\"" + this.getDiameeter() + "\"" + "\n";
    }


}
