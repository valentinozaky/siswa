public class Siswa {
    
    //variabel
    int id;
    String nama;
    double ipk;

    //Constructor
    public Siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }
    //Cnstrustor Parameter
    public Siswa(int i,String n, double k ) {
        id = i;
        nama = n; 
        ipk = k;
    }


    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK ; " + ipk);
    }
}
