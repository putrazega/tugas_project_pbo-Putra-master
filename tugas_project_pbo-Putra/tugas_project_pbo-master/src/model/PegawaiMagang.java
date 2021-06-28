package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PegawaiMagang extends Pegawai {
    // Atribut
    public String asalKampus;
    public int lamaMagang;
    public Date tglMulai, tglSelesai;

    String polaTanggal = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

    public String getAsalKampus() {
        return asalKampus;
    }

    public void setAsalKampus(String asalKampus) {
        this.asalKampus = asalKampus;
    }

    public int getLamaMagang() {
        return lamaMagang;
    }

    public void setLamaMagang(int lamaMagang) {
        this.lamaMagang = lamaMagang;
    }

    public Date getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(Date tglMulai) {
        this.tglMulai = tglMulai;
    }

    public Date getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(Date tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

    public PegawaiMagang(String idPegawai, String nama, String alamat, String asalKampus, String tglMulai, String tglSelesai) throws ParseException {
        super(idPegawai, nama, alamat, asalKampus, tglMulai, tglSelesai);
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.asalKampus = asalKampus;
        this.jabatan = "Magang";
        this.tglMulai = simpleDateFormat.parse(tglMulai);
        this.tglSelesai = simpleDateFormat.parse(tglSelesai);
        this.lamaMagang = hitungLamaMagang();
        this.absen = false;
        this.pesanAbsen = "";
    }

    //overriding 1
    
    public boolean cariPegawaiMagang() {
        System.out.println("---------------------------------------");
        System.out.Println("           Hasil Pencarian             ");
        System.out.Println("---------------------------------------");
        System.out.Println("ID Pegawai : " + this.idPegawai);
        System.Out.Println("Nama : " + this.nama);
        return false;
    };

    //overriding 2
    public boolean cariPegawaiMagang(String asalKampus) {
        System.out.println("---------------------------------------");
        System.out.Println("           Hasil Pencarian             ");
        System.out.Println("---------------------------------------");
        System.out.Println("ID Pegawai : " + this.idPegawai);
        System.Out.Println("Nama : " + this.nama);
        return false;

    };


    // Method 1
    public int hitungLamaMagang() {
        Calendar tglMulai = Calendar.getInstance();
        tglMulai.setTime(this.tglMulai);
        Calendar tglSelesai = Calendar.getInstance();
        tglSelesai.setTime(this.tglSelesai);

        int selisihBulan = tglSelesai.get(Calendar.MONTH) -  tglMulai.get(Calendar.MONTH);

        if (tglSelesai.get(Calendar.DAY_OF_MONTH) < tglMulai.get(Calendar.DAY_OF_MONTH)) {
            selisihBulan--;
        }

        return selisihBulan;
    }

    // Method 2
    public void hitungGajiMagang() {
        int gajiPerBulan = 2000000;

        int gajiTotal = lamaMagang * gajiPerBulan;

        System.out.println("---------------------------------");
        System.out.println(" Menghitung Gaji Pegawai Magang  ");
        System.out.println("---------------------------------");

        System.out.println("Gaji Per Bulan = " + gajiPerBulan);
        System.out.println(this.nama + " Magang Selama " + lamaMagang + " Bulan = " + lamaMagang + " * " + gajiPerBulan);
        System.out.println("Total Gaji " + this.nama + " = " + gajiTotal);
    }

    public void tampilkanDataPegawaiMagang() {
        String polaTanggal = "dd-MM-yyyy";
        String absen;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("---------------------------------");
        System.out.println("       Data Pegawai Magang       ");
        System.out.println("---------------------------------");
        System.out.println("ID Pegawai = " + this.idPegawai);
        System.out.println("Nama = " + this.nama);
        System.out.println("Asal Kampus = " + this.asalKampus);
        System.out.println("Jabatan = " + this.jabatan);
        System.out.println("Alamat = " + this.alamat);
        System.out.println("Tanggal Mulai Magang = " + simpleDateFormat.format(this.tglMulai));
        System.out.println("Tanggal Akhir Magang = " + simpleDateFormat.format(this.tglSelesai));
        System.out.println("Lama Magang = " + this.lamaMagang + " Bulan");

        if (this.absen) {
            absen = "Hadir";
        } else {
            absen = "Tidak Hadir";
        }

        System.out.println("---------------------------------");
        System.out.println("         Absensi Pegawai         ");
        System.out.println("---------------------------------");
        if (pesanAbsen.isEmpty()) {
            System.out.println(this.nama + " " + simpleDateFormat.format(new Date()) + " = " + absen);
        } else {
            System.out.println(pesanAbsen);
        }
    }
}
