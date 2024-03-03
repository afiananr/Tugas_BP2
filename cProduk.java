package pRumahMakan;
public class cProduk {
    private String nama, kode;
    private int harga, stok;
    cProduk (){
    }
    cProduk (String n, int h, int s){
        nama=n; harga=h; stok=s;
    }
    public void setHarga(int h){
        harga=h;
    }
    public void setStok (int a){
        stok=a;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public int getStok (){
        return stok;
    }
    public String ToString(){
        return nama+ " harga : " + harga + " stok :" + stok;
    }
}
