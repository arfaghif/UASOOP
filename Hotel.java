import java.util.*;
public class Hotel extends  Properti{
    private TipeKamar tipe;
    public Hotel(int harga, TipeKamar tipeKamar, Pemilik pemilik){
        super(pemilik);
        this.harga = harga;
        this.tipe = tipeKamar;
        this.allFasilitas = new ArrayList<Fasilitas>();
        switch (tipeKamar) {
            case standard:
                this.harga += 100000;
                break;
            case deluxe:
                this.harga += 200000;
        
            default:
                assert tipeKamar == TipeKamar.suite;
                this.harga += 300000;
                break;
        }
    }
}