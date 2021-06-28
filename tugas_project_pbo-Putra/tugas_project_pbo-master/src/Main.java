import model.Pegawai;
import model.PegawaiMagang;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException) {

        // Object 1
        Pegawai Putra = new Pegawai("PG-01", "Putra Zega", "Manajer", "Banjarmasin", "23-09-1999", false);
        Zikri.absensiPegawai("Putra Zega");
        Zikri.tampilkanData();
        Zikri.hitungGaji();

        System.out.println();

        // Object 2
        Pegawai Sariffudin = new Pegawai("PG-02", "Sarifuddin", "Staff", "Banjarbaru", "23-06-1998", true);
        Arul.tampilkanData();
        Arul.hitungGaji();

        System.out.println();

        // Object 3
        PegawaiMagang Anang = new PegawaiMagang("MG-01", "Anang Saidi", "Banjarmasin", "ULM", "21-04-2021", "12-05-2021");
        Fajar.absensiPegawai("Anang Saidi");
        Fajar.tampilkanDataPegawaiMagang();
        Fajar.hitungGajiMagang();

        System.out.println();

        // Object 4
        PegawaiMagang Sapri = new PegawaiMagang("MG-02", "Sapri Ananta", "Martapura", "UNISKA", "20-09-2021", "23-10-2021");
        Supri.tampilkanDataPegawaiMagang();
        Supri.hitungGajiMagang();

        System.out.println();

        // Object 5
        Pegawai Anjar = new Pegawai("PG-03", "Anjar Dermawan", "anjar", "anjar");

        System.out.println();

        // Object 6
        Pegawai Rusdi = new Pegawai("PG-04", "Rusdiyanto", "rusdi", "rusdi");
    }

}
