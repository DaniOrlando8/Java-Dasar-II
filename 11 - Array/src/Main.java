/* ~ Array ~

    Di Java, array adalah kumpulan nilai dari tipe data serupa.
    Array dapat mengelola beberapa bagian data.
    Seperti daftar nama, dalam satu variable daripada mendeklarasikannya secara terpisah.
    Setiap nilai dalam array disebut element.

    Saat mendeklarasikan variable untuk array, Anda harus meletakkan [] setelah tipe dari setiap element. 
    Misalnya, array dari nilai int akan bertipe int[], dan array nilai String akan bertipe String[].

    Anda bisa membuat array dengan menulis nilai di dalam { } dan memisahkannya dengan koma ,.
    Lihat contoh di bawah ini. Berhati-hatilah agar tidak bingung diantara [] dan { }.
*/
public class Main {
    public static void main(String[] args) throws Exception {
         
        int [] nomor = {10, 20, 30};
        String [] nama ={"Paijo", "Jokko Koe", "Budi"};

        System.out.println(nomor[0]);
        System.out.println(nomor[2]);
        System.out.println("--------");
        System.out.println(nama [1]);
        System.out.println(nama [2]);

    }
}
/*
    Setiap element array diberi nomor posisi seperti 0, 1, 2, .... Ini disebut nomor index.
    Perlu diingat bahwa nomor index dimulai dari 0. 
    Anda dapat mengakses element individu dengan menulis namaArray[index].
 */