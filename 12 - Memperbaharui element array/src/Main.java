/* ~ Memperbaharui element array ~

    Mari mencoba memperbarui element dari sebuah array! 
    Setiap element dalam array adalah nilai, sehingga Anda dapat memperbaruinya dengan memberikan nilai yang berbeda kepadanya.
*/
public class Main {
    public static void main(String[] args) throws Exception {
        
        String [] buah = {"APEL", "NENAS", "SEMANGKA"};

        System.out.println(buah[1]);

        buah[1] = "JERUK";

        System.out.println(buah[1]);
    }
}
/*
    Anda tidak dapat menetapkan nilai ke index yang tidak ada. 
    Ini akan menghasilkan error, seperti pada contoh di bawah ini!

    String [] buah = {"APEL", "NENAS", "SEMANGKA"};
                        0        1          2
    
    System.out.println(buah[3]);

    Tidak ada index pada element array!

*/