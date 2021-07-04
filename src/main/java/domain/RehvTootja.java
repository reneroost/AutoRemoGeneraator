package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RehvTootja {

    private int id;
    private String nimi;
    private String riik;
    private String tutvustus;

    public static String tabeliPealkiri() {
        return String.format("%-5s%-10s%-10s%-10s%n",
                "id", "nimi", "riik", "tutvustus");
    }

    public String tabeliRida() {
        return String.format("%-5d%-20s%-10s%-10d%-20s%-12d%-10s%n",
                this.getId(), this.getNimi(), this.getRiik(), this.getTutvustus());
    }

    public static String csvPealkiri() {
        return "id" +"," +
                "nimi" + "," +
                "riik" + "," +
                "tutvustus" + "\n";
    }

    public String csvRida() {
        return this.getId() + "," +
                this.getNimi() + "," +
                this.getRiik() + "," +
                "\"" + this.getTutvustus() + "\"" + "\n";
    }
}
