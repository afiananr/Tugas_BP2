package pRumahMakan;
public class cTransaksi {
    private int jumlah,total;
    private String keranjang;
    cTransaksi (String k,int j, int t) {
        keranjang = k ;jumlah =j ; total = t;
    }
    public String ToString () {
        return "item : " + keranjang + " jumlah " + jumlah + " \nTotal pembelian: " +total;
    }
    public void setTotal(int t) {
        total = t;
    }
    public int getTotal () {
        return total;
    }
    public void setKeranjang(String k) {
        keranjang = k;
    }
    public String getKeranjang () {
        return keranjang;
    }
    public void setJumlah(int j) {
        jumlah = j;
    }
    public int getJumlah () {
        return jumlah;
    }
}


