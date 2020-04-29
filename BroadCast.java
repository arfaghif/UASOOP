import java.util.*;
public class BroadCast {

  private HashMap<Pemilik,HashSet<Pelanggan>> gruoup;
  public BroadCast(){
    this.gruoup= new HashMap<Pemilik,HashSet<Pelanggan>>();
  }

  public void addPelanggan(Pemilik pemilik, Pelanggan pelanggan) {
    HashSet<Pelanggan> pelanggans = this.gruoup.get(pemilik);
    if(pelanggans == null){
      pelanggans = new HashSet<Pelanggan>();
    }
    pelanggans.add(pelanggan);
    this.gruoup.put(pemilik, pelanggans);
  }

  public void sendEvent(Pemilik pemilik, String event) {
    HashSet<Pelanggan> pelanggans = this.gruoup.get(pemilik);
    if(pelanggans != null){
      for(Pelanggan pelanggan : pelanggans){
        pelanggan.getMassage(pemilik, event);
      }
    }
  }
}

