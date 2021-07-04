package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tookoda {

    private int id;
    private String nimi;
    private String tanav;
    private String linn;
    private int postiIndeks;

    public static String tabeliPealkiri() {
        return String.format("%-5s%-10s%-10s%-10s%-10s%n",
                "id",
                "nimi",
                "tanav",
                "linn",
                "postiIndeks"
        );
    }

    public String tabeliRida() {
        return String.format("%-5d%-10s%-10s%-10s%-10d%n",
                this.getId(),
                this.getNimi(),
                this.getTanav(),
                this.getLinn(),
                this.getPostiIndeks()
        );
    }

    public static String csvPealkiri() {
        return "id" + "," +
                "nimi" + "," +
                "tanav" + "," +
                "linn" + "," +
                "postiIndeks" + "\n";
    }

    public String csvRida() {
        return this.getId() + "," +
                this.getNimi() + "," +
                this.getTanav() + "," +
                this.getPostiIndeks() + "\n";
    }

}
