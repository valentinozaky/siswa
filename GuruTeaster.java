public class GuruTeaster {
    public static void main(String[] args) {
        Guru BuPasha = new Guru(3451, "Pasha", "RPL", "TETAP");
        Guru PakThoriq = new Guru(2843, "Thoriq", "PJOK", "TETAP");
        Guru BuAul = new Guru(3942, "Aul", "RPL", "TETAP");
        Guru PakAndre = new Guru(4190, "Andre", "BAHASAINGGRIS", "TETAP");
        Guru PakFalah = new Guru(8932, "Falah", "BAHASAINDONESIA", "TETAP");

        BuPasha.print();
        PakThoriq.print();
        BuAul.print();
        PakAndre.print();
        PakFalah.print();
    }
 }
