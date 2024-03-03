package pRumahMakan;
public class cPembeli {
    private String nama, alamat;
    cPembeli (String nm, String al){
        nama = nm ; alamat = al;
    }
    public void setNama (String nm){
        nama=nm;
    }
    public void setAlamat (String al){
        alamat = al;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat (){
        return alamat;
    }
    public String ToString (){
        return nama+ " [" +alamat+ "} ";
    }
}
