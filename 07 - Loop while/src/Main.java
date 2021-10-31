/* ~ Loop while ~

    Anda sering kali perlu menjalankan code yang sama berulang kali. 
    Misalnya, Anda mungkin ingin mencetak angka dari 1 sampai 100. 
    Tidak efisien untuk menulis System.out.println () 100 kali. 
    Sebagai gantinya, kita bisa menggunakan loop, juga dikenal sebagai iterasi.

    Salah satu jenis iterasi yang paling umum adalah loop while.
    Loop while ditulis seperti berikut : 

    while(kondisi){
        ulangi code ini
    }

    Code di dalam { } diulang selama kondisi adalah true.

*/
public class Main {
    public static void main(String[] args) throws Exception {
        
        int i = 0;                  // 1

        while (i <= 5){             // 2
            System.out.println(i);  // 3
            i++;                    // 4
        }
    }
}

/* ~ Cara kerja loop ~
    1. Inisialisasi variabel
    2. Memerikasa kosdisi
    3. Iterasi code 
    4. Perbaharui variabel
 
 */