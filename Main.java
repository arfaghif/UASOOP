
public class Main {
    public static void main(String[] args) {
        Sistem sistem = new Sistem();
        BroadCast broadCast = new BroadCast();
        Pemilik aPemilik = new Pemilik("Naufal");
        Pemilik bPemilik = new Pemilik("Arfa");  
        sistem.registry.pemiliks.add(aPemilik);
        sistem.registry.pemiliks.add(bPemilik);
        
        
        // nomoor 1
        for(int i =0 ; i<10 ; ++i){
            // Thread t = new Thread(new Runnable(){
            
            //     @Override
            //     public void run() {
                    // TODO Auto-generated method stub
                    Hotel hotel = new Hotel(400000, TipeKamar.standard, aPemilik);
                    hotel.AddFasilitas(new Fasilitas("kolam renang", 80000));
                    sistem.properties.add(hotel);

                    
            //     }
            // }).start();

        }
        for(int i =0 ; i<10 ; ++i){
            // Thread t = new Thread(new Runnable(){
            
            //     @Override
            //     public void run() {
                    // TODO Auto-generated method stub
                    Hotel hotel = new Hotel(600000, TipeKamar.deluxe, aPemilik);
                    hotel.AddFasilitas(new Fasilitas("kolam renang", 80000));
                    sistem.properties.add(hotel);
                    
            //     }
            // }).start();

        }
        for (int i =0 ; i<=3 ; ++i){
            Apartemen apartemen = new Apartemen(70000, 2, bPemilik);
            apartemen.AddFasilitas(new Fasilitas("sarapan", 60000));
            sistem.properties.add(apartemen);
        }
        for (int i =0 ; i<=5 ; ++i){
            HomeStay homeStay = new HomeStay(150000, bPemilik);
            
        }
        
        
        //nomor 2
        Pelanggan aPelanggan = new Pelanggan("Tono", "a@a.com", 14022);
        Pelanggan bPelanggan = new Pelanggan("Tini", "b@b.com", 12345);
        
        
        
        //nomor 4
        broadCast.addPelanggan(aPemilik, aPelanggan);
        broadCast.addPelanggan(bPemilik, aPelanggan);


        //nomor 6
        broadCast.addPelanggan(bPemilik, bPelanggan);

        broadCast.sendEvent(aPemilik, "Selamat Siang");
        broadCast.sendEvent(bPemilik, "Tetap Semangat");



    }
}