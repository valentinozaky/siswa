//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa davin = new Siswa();
        Siswa angga = new Siswa();
        Siswa rafi = new Siswa();
        Siswa rabani = new Siswa();
        Siswa dimas = new Siswa();
        Siswa felix = new Siswa(14, "Felix", 80);

        davin.id = 8;
        davin.nama = "Davin";
        davin.ipk = 88.8;
        angga.id = 9;
        angga.nama = "Angga";
        angga.ipk = 85.8;
        rabani.id = 24;
        rabani.nama = "rabani";
        rabani.ipk = 92.9;
        dimas.id = 10;
        dimas.nama = "Dimas";
        dimas.ipk = 86.8;


        davin.print();
        angga.print();
        rafi.print();
        rabani.print();
        dimas.print();
        felix.print();

























































    }
}
