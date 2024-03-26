public class Mahasiswa {
  private String NRP;
  private String nama;

  public Mahasiswa() {
    this.NRP = "";
    this.nama = "";
  }


  public Mahasiswa(String NRP, String nama) {
    this.NRP = NRP;
    this.nama = nama;
  }

  // Setter untuk NRP
  public void setNRP(String NRP) {
    this.NRP = NRP;
  }

  // Getter untuk NRP
  public String getNRP() {
    return NRP;
  }

  // Setter untuk nama
  public void setNama(String nama) {
    this.nama = nama;
  }

  // Getter untuk nama
  public String getNama() {
    return nama;
  }

  // Metode untuk menampilkan data mahasiswa
  public String display() {
    return "NRP = " + NRP + ", Nama = " + nama;
  }
}
