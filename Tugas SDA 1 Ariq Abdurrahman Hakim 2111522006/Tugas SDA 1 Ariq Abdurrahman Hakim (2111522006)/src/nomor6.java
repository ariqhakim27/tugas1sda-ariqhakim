import java.util.ArrayList;
public class nomor6 {
    public static void main(String[] args) {
        //String[] nama = {"a","k","i","m"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("k");
        nama.add("i");
        nama.add("m");
        // No 6, Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        // add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
        nama.add(0,"e");
        System.out.println("Element setelah string e di index 0 ditambahkan:" + nama);
    
        nama.add(2,"f");
        System.out.println("Element setelah string f di index 2 ditambahkan:" + nama);
    
        nama.add(3,"g");
        System.out.println("Element setelah string g di index 3 ditambahkan:" + nama);
    
        nama.add(4,"h");
        System.out.println("Element setelah string h di index 4 ditambahkan:" + nama);
    
        nama.add(6,"h");
        System.out.println("Element setelah string h di index 6 ditambahkan:" + nama);
    
        nama.add(-3,"j");
        System.out.println("Element setelah string j di index -3 ditambahkan:" + nama);         
        }
    }
    
