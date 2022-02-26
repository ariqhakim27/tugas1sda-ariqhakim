import java.util.ArrayList;
public class nomor5_0 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("k");
        nama.add("i");
        nama.add("m");

        System.out.println("sebelum remove:");
         for(String x: nama){
              System.out.println(x);
         }
        
        nama.remove(0);
        //nama.remove(3);
        nama.remove(2);
           
        System.out.println("setelah remove :");
           for(String y: nama){
             System.out.println(y);
           }
    } 
}

