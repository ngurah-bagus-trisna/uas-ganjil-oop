import java.util.ArrayList;
import java.util.List;

class Siswa {
    String nama;

    public Siswa(String nama) {
        this.nama = nama;
    }
}

class Sekolah {
    String nama;
    List<Siswa> daftarSiswa;

    public Sekolah(String nama) {
        this.nama = nama;
        this.daftarSiswa = new ArrayList<>();
    }

    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
    }

    public void tampilkanSiswa() {
        System.out.println("Siswa di " + nama + ":");
        for (Siswa s : daftarSiswa) {
            System.out.println("- " + s.nama);
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMA Negeri 1");
        Siswa s1 = new Siswa("Budi");
        Siswa s2 = new Siswa("Siti");

        sekolah.tambahSiswa(s1);
        sekolah.tambahSiswa(s2);

        sekolah.tampilkanSiswa();
    }
}