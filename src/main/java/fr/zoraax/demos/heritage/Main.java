package fr.zoraax.demos.heritage;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Salarie pierre = new Salarie(
                "Quezac",
                "Pierre",
                LocalDate.of(1982, 12, 31),
                30,
                LocalDate.now()
        );
        System.out.println(pierre);
    }
}
