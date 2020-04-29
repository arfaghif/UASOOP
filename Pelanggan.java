
public class Pelanggan {
    private String nama;
    private String email;
    private int noTelepon;
    public Pelanggan(String nama, String email, int noTelepon){
        this.nama = nama;
        this.email = email;
        this.noTelepon = noTelepon;
    }
    public void getMassage(Pemilik pemilik, String pesan){
        System.out.println(this.nama + " menerima pesan dari " + pemilik.getNama()+ " berupa " + pesan);
    }
}