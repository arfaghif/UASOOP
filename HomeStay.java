import java.util.*;
public class HomeStay extends Properti {
    public HomeStay(int harga, Pemilik pemilik){
        super(pemilik);
        this.harga = harga;
        this.allFasilitas = new ArrayList<Fasilitas>();
    }
}