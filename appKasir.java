package pRumahMakan;
import java.util.Scanner;
public class appKasir {
    public static void main(String []args){
        cProduk p = new cProduk();
        cProduk p2 = new cProduk ("Sate" , 15000, 100);
        cPembeli p3 = new cPembeli ("Nopal",  "Surabaya");
        cTransaksi p4 = new cTransaksi ("Sate", 1,  15000);
        Scanner s = new Scanner (System.in);
        int pilih=0;
        do{
            System.out.println("===== Selamat Datang di Rumah Makan Sederhana =====");
            System.out.println("            Silakan pilih Menu APP berikut:        ");
            System.out.println("\nMENU APP");
            System.out.println("1. Produk");
            System.out.println("2. Pembeli");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            System.out.print("Pilih : ");
            pilih = s.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("  [Produk]");
                    System.out.println("  1. Tambah");
                    System.out.println("  2. Ubah");
                    System.out.println("  3. Hapus");
                    System.out.println("  4. Detail");
                    System.out.print("  Pilih = ");
                    int pilih2 = s.nextInt();
                    switch (pilih2){
                        case 1:
                            System.out.print("Nama = ");
                            String nm = s.next();
                            System.out.print("Harga = ");
                            int hg = s.nextInt();
                            System.out.print("Stok = ");
                            int st = s.nextInt();
                            p2 = new cProduk (nm, hg,st);
                            break;
                        case 2:
                            System.out.print("Stok baru = ");
                            st=s.nextInt();
                            System.out.println("Yakin ubah?");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            System.out.println("Jawab = ");
                            int jwb=s.nextInt();
                            if(jwb==1){
                                p2.setStok(st);
                                System.out.println("Ubah stok berhasil..");
                            }else{
                                System.out.println("Ubah stok batal..");
                            }
                            break;
                        case 3:
                            System.out.print("  Nama = ");
                            nm = s.next();
                            if(nm.equalsIgnoreCase(p2.getNama())){
                                p2=null;
                                System.out.println("Hapus sukses..");
                            }else{
                                System.out.println("Produk tidak ada..");
                            }
                            break;
                        case 4:
                            if (p2!=null){
                                System.out.println(p2.ToString());
                            }else{
                                System.out.println("Object kosong");
                            }
                    }
                    break;
                case 2:
                    pilih2=0;
                    do{
                        System.out.println("Pembeli");
                        System.out.println("1. Buat data");
                        System.out.println("2. Lihat data");
                        System.out.println("3. Ubah data");
                        System.out.println("4. Kembali");
                        System.out.println("Pilih : ");
                        pilih2 = s.nextInt ();
                        switch (pilih2){
                            case 1:
                                System.out.println("Nama Pembeli = ");
                                String nm= s.next();
                                System.out.println("Alamat = ");
                                String al = s.next();
                                p3 = new cPembeli (nm,al);
                                break;
                            case 2:
                                String dp = p3.ToString();
                                System.out.println("Pembeli : "+dp);
                                break;
                            case 3:
                                System.out.println("Alamat Baru = ");
                                String ab = s.next();
                                p3.setAlamat(ab);
                                break;
                            case 4:
                                System.out.println("Ke Menu Utama");
                                break;
                        }
                    }while(pilih2!=4);
                    break;
                case 3:
                    pilih2=0;
                    do {
                        System.out.println("Transaksi");
                        System.out.println("1. Lihat keranjang ");
                        System.out.println("2. Cetak Struk");
                        System.out.println("3. Kembali");
                        System.out.print("pilih : ");
                        pilih2 = s.nextInt();
                        switch (pilih2) {
                            case 1 : 
                                if (p4!=null){
                                System.out.println(p4.ToString());
                                }else{
                                    System.out.println("Object kosong");
                                }
                            break;
                            case 2 : 
                                System.out.println(""); 
                                System.out.println("=====================================================");
                                System.out.println("                     Rumah Makan                     ");
                                System.out.println("                       SURABAYA                      ");
                                System.out.println("=====================================================");
                                System.out.println("");
                                System.out.println("Item:      Jumlah:");
                                System.out.println("");
                                System.out.println(p4.getKeranjang()+"     "+p4.getJumlah());
                                System.out.println("\n"+p4.getTotal());
                                System.out.println("");
                                System.out.println("=====================================================");
                                System.out.println("            Terimakasih Telah Berkunjung             ");
                                System.out.println("=====================================================");
                                System.exit(0);  
                            break;
                            case 3 :
                                System.out.println("Ke Menu Utama");
                                break;
                        }
                    }while (pilih2 !=2);           
                    break;
                case 4:
                    System.out.println("=====================================================");
                    System.out.println("            Terimakasih Telah Berkunjung             ");
                    System.out.println("=====================================================");
                    System.exit(0);
            }
        }while(pilih!=4);
    }
}
