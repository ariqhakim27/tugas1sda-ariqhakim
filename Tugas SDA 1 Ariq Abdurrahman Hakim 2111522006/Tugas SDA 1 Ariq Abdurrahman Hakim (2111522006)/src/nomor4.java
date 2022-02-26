import java.util.ArrayList;

public class nomor4 {
    public static void main(String[] args) {
        //String[] nama= {"a","k","i","m"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("k");
        nama.add("i");
        nama.add("m");
        
        // No 4, Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:   
        // indexOf(a), indexOf(c), indexOf(q)

        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));
    }
    
}
