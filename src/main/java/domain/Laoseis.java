package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laoseis {

    private int tookodaId;
    private int rehvId;
    private int kogus;

    public static String tabeliPealkiri() {
        return String.format("%-12s%-12s%-10s",
                "esindusId", "varuosaId", "kogus");
    }

    public String tabeliRida() {
        return String.format("%-12d%-12d%-10d",
                this.getTookodaId(), this.getRehvId(), this.getKogus());
    }

    public static String csvPealkiri() {
        return "esindus_id" + "," +
                "varuosa_id" + "," +
                "kogus" + "\n";
    }

    public String csvRida(int id) {
        return this.getTookodaId() + "," +
                this.getRehvId() + "," +
                this.getKogus() + "\n";
    }

}
