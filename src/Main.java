import javax.naming.Name;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String nameAndLastname;
        LocalDate bornDate;
        int contract;
        double quantityInTons;
        String residenceOfEmployee;
        String SPZ;
        double vehicleConsumptionInLit;
        String computerIP;

        nameAndLastname = "Tomáš Novotný";
        bornDate = LocalDate.of(1987, 10, 13);
        contract = 8;
        quantityInTons = 18.6;
        residenceOfEmployee = "Prague";
        SPZ = "A23 5213";
        vehicleConsumptionInLit = 12;
        computerIP = "IP adresa verze 4";

        System.out.println(quantityInTons / contract);

    }
}

