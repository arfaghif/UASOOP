import java.util.*;

public class Apartemen extends Properti {
    private final int jumlahKamar;
    public Apartemen(int harga ,int jumlahKamar, Pemilik pemilik){
        super(pemilik);
        this.harga = harga;
        this.jumlahKamar = jumlahKamar;
        this.allFasilitas = new ArrayList<Fasilitas>();
    }
}