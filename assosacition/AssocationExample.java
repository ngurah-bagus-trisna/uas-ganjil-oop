class Dosen {
  String nama;

  public Dosen(String nama) {
      this.nama = nama;
  }
}

class Mahasiswa {
  String nama;

  public Mahasiswa(String nama) {
      this.nama = nama;
  }

  public void belajarDari(Dosen dosen) {
      System.out.println(nama + " sedang belajar dari " + dosen.nama);
  }
}

public class AssocationExample {
  public static void main(String[] args) {
      Dosen dosen1 = new Dosen("Pak Budi");
      Mahasiswa mhs1 = new Mahasiswa("Andi");

      mhs1.belajarDari(dosen1);
  }
}