import java.util.Scanner;

public class SimpleMethod {
    static void CetakJudul(){
        String nama;
        String nim;
        String kelas;
        String namaProject;
        nama = "Kartika Deviani";
        nim = "21090097";
        kelas = "1C";
        namaProject = "Menghitung Ganjil / Genap Suatu Bilangan";
        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+nim);
        System.out.println("Kelas: "+kelas);
        System.out.println(namaProject);

    }
    private static void HitungGanjilGenap(){
        Scanner inputangka = new Scanner(System.in);
        System.out.println("\nMasukkan Angka = ");
        double angka=inputangka.nextDouble();
        if (angka %2==0){
            System.out.println("angka " +angka +" Adalah Bilangan Genap");
        }else {
            System.out.println("angka " +angka +" Adalah Bilangan Ganjil");
        }

    }

    public static void main(String[] args) {
        CetakJudul();

        System.out.println("\n........................................");
        HitungGanjilGenap();
        //SimpleMethod Latihanku = new SimpleMethod();
        //Latihanku.CetakJudul();
        //Latihan.HitungGanjilGenap();
    }
}
