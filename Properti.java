import java.util.List;
public abstract class Properti {
    protected Pemilik pemilik;
    protected boolean available;
    protected List<Fasilitas> allFasilitas;
    protected int harga;
    
    public Properti(Pemilik pemilik){
        this.pemilik = pemilik;
        this.available = true;
    }
    public void setAvailabe(boolean available ){
        this.available = available;
    }
    public boolean isAvailable(){
        return this.available;
    }
    public  List<Fasilitas> getAllFasilitas(){
        return this.allFasilitas;
    }
    public int getTotalHarga(){
        int sumHarga =0;
        for(Fasilitas fasilitas : this.allFasilitas){
            sumHarga += fasilitas.getHarga();
        }
        return sumHarga + this.harga;
    }
    public void AddFasilitas(Fasilitas fasilitas){
        this.allFasilitas.add(fasilitas);
    }
}