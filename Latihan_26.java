package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Waktu Sekarang
 *          Waktu Saat Ini
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan_26 {

    public static void main(String[] args) {
        LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMM yyyy HH.mm.ss");

        String hasil = sekarang.format(formatter);
        System.out.println("Hari ini adalah hari : " + hasil);
    }
}