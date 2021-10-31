/* ~ Stetement switch ~ 
    
    Statement switch adalah tipe lain dari control flow. 
    Ia menggunakan case, dan case yang cocok dengan nilai dari kondisi akan dijalankan. 
    Jangan lupa untuk meletakkan titik dua : setelah setiap case.
    
    Mari kita bandingkan statement switch dengan statement if. 
    Statement if menambahkan flow berdasarkan kondisi, sedangkan statement switch menambahkan flow berdasarkan nilai. 
    Statement switch lebih baik jika ada banyak kondisi berdasarkan nilai.    
*/
public class Main {
    public static void main(String[] args) {
        
        int x = 12;

        switch (x % 5){

        case 0:
            System.out.println(" Dapat dibagi 3");
            break;

        case 1:
            System.out.println("Sisahnya adalah 1 ketika dibagi 3");
            break;

        case 2:
            System.out.println("Sisahnya adalah 2 ketika dibagi 3");
            break;

        default:
            System.out.println("Tidak ada case yang cocok");
            break;

        }
    }
}
/* ~ Case default ~

    Dalam statement switch, Anda dapat mengatur case default ketika tidak ada case yang cocok. 
    Ini fungsinya mirip dengan else dalam statement if

*/