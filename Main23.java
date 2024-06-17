public class Main23 {

    public static void main(String[] args) {
        ScavengerHunt23 scavengerHunt = new ScavengerHunt23();
        scavengerHunt.addPoint("Apa nama angkatan JTI POLINEMA 2023?", "Alceena");
        scavengerHunt.addPoint("Apa nama kegiatan Malam Keakraban JTI POLINEMA angkatan 2023?", "AlceeNight 23");
        scavengerHunt.addPoint("Ada berapa program studi di JTI POLINEMA?", "3");

        System.out.println("-------------------------------------------------------------------");
        System.out.println("                          ~SELAMAT DATANG~                            ");
        System.out.println("~GAME SCAVENGER HUNT~");
        System.out.println(" Untuk menemukan harta karun Anda harus menjawab beberapa pertanyaan !");
        if (scavengerHunt.playGame()) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("WOWW! Anda berhasil menjawab semua pertanyaan dengan benar!");
            System.out.println("Anda mendapatkan harta karun!");
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Anda gagal menjawab semua pertanyaan dengan benar.");
            System.out.println("Silakan coba lagi ");
            System.out.println("---------------------------------------------------------------");
        }
    }
}