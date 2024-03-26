import java.util.ArrayList;
import java.util.List;

public class kartuHasilStudi {
private String semester;
private double ips;
private List<Matakuliah> daftarMatakuliah;
  
  
  public kartuHasilStudi(String semester) {
    this.semester = semester;
    this.daftarMatakuliah = new ArrayList<>();

  }
  
  public void addMatakuliah(Matakuliah Matakuliah) {
    daftarMatakuliah.add(Matakuliah);

  }


  public String display() {
    StringBuilder sb = new StringBuilder();
    for (Matakuliah mk : daftarMatakuliah) {
      sb.append(mk.display());
      sb.append("\n");
    }
    return sb.toString();
  }


  public void hitungIPS() {

    double totalBobot = 0.0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalBobot += mk.nilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }

        if (totalSKS > 0) {
            ips = totalBobot / totalSKS;
        } else {
            ips = 0; // jika totalSKS adalah 0, maka IPS dianggap 0
        }

  }
  
   // Setter for semester
   public void setSemester(String semester) {
    this.semester = semester;
  }

  // Getter for semester
  public String getSemester() {
    return semester;
  }

  // Setter for daftarMatakuliah
  public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
    this.daftarMatakuliah = daftarMatakuliah;
  }

  // Getter for daftarMatakuliah
  public List<Matakuliah> getDaftarMatakuliah() {
    return daftarMatakuliah;
  }

  // Setter for IPS
  public void setIPS(double ips) {
    this.ips = ips;
  }

  // Getter for IPS
  public double getIPS() {
    return ips;
  }

  public int getTotalSKS(){
    int totalSKS = 0;
    for(Matakuliah mk : daftarMatakuliah){
        totalSKS += mk.getSks();
    }
    return totalSKS;
}


}
