import java.util.ArrayList;

public class nomor5_1 {
    public static void main(String[] args) {
         //String[] nama= {"a","k","i","m"};
         ArrayList<String> nama = new ArrayList<String>();
         nama.add("a");
         nama.add("k");
         nama.add("i");
         nama.add("m");
         
         System.out.println("ArrayList sebelum remove:");
         for(String var: nama){
              System.out.println(var);
         }
         // No 5, Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:   
         // remove(0), remove(3), remove(2)

         // System.out.println(nama.remove(0));
          //nama.remove(0);
    nama.remove(0);
    //nama.remove(0);
    System.out.println("ArrayList setelah remove (0):");
       for(String var2: nama){
             System.out.println(var2);

            }
    }
}

   