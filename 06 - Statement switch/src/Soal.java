public class Soal {
    public static void main(String[] args) {
        
         // Menggunakan default, cetak "Nilai Tidak ADA" jika tidak ada case yang cocok.
        String nilai = "Z";

        switch (nilai) {
            case "A":
                System.out.println("SEMPURNA");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("CUKUP");
                break;
            case "D":
                System.out.println("REMEDIAL");
                break;
            default:
                System.out.println("Nilai Tidak ADA");
                break;
        }
    }
}
