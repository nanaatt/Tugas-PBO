/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanpertama;

/**
 *
 * @author Careen Emilza
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan dinosaurus = new Hewan();
        dinosaurus.bernafas();
        dinosaurus.tumbuh();
        dinosaurus.setberjalan("berjalan");
        dinosaurus.setjumlahKaki(4);
        System.out.println("Dinosaurus adalah hewan yang " + dinosaurus.getberjalan() + " dengan kaki yang berjumlah " +dinosaurus.getjumlahKaki());
        System.out.println();
        
        Ikan nemo = new Ikan();
        nemo.setsirip("menentukan arah gerak");
        nemo.setguratSisi("mengetahui tekanan air");
        nemo.bernafas();
        nemo.tumbuh();
        System.out.println("Nemo adalah ikan dengan sirip yang memiliki fungsi " + nemo.getsirip() + " dan gurat sisi yang berfungsi " + nemo.getguratSisi());
        System.out.println();
        
        Mamalia hamster = new Mamalia();
        hamster.setkelenjarSusu(8);
        hamster.setrambut("coklat kemerahan dengan bagian bawah berwarna putih keabu-abuan");
        hamster.bernafas();
        hamster.tumbuh();
        System.out.println("Hamster adalah mamalia yang memiliki kelenjar susu berjumlah " + hamster.getkelenjarSusu() + " dan rambut dengan berbagai warna " + hamster.getrambut());
        System.out.println();
        
        Amfibi salamander = new Amfibi();
        salamander.setkulitTipis("untuk mempermudah oksigen dan air masuk");
        salamander.setbatangHijauRetina("untuk membedakan warna");
        salamander.bernafas();
        salamander.tumbuh();
        System.out.println("Salamander adalah amfibi yang memiliki kulit tipis " + salamander.getkulitTipis() + " dan batang hijau pada retina mereka " + salamander.getbatangHijauRetina());
        System.out.println();
        
        Reptil tokek = new Reptil();
        tokek.setmelata("melata");
        tokek.setvertebrata("vertebrata");
        tokek.bernafas();
        tokek.tumbuh();
        System.out.println("Tokek adalah reptil yang bergerak dengan cara " + tokek.getmelata() + " dan termasuk dengan hewan " + tokek.getvertebrata());
        System.out.println();
        
        Aves merpati = new Aves();
        merpati.setbulu("bulu yang membentuk sayap");
        merpati.settulangBerongga("tulang berongga agar memiliki tubuh yang ringan");
        merpati.bernafas();
        merpati.tumbuh();
        System.out.println("Merpati adalah aves dengan " + merpati.getbulu() + " dan " + merpati.gettulangBerongga());
        System.out.println();
        
        Tumbuhan kiwi = new Tumbuhan();
        kiwi.setwarnaDaun("Hijau");
        kiwi.setarahDaun("");
        kiwi.bernafas();
        kiwi.tumbuh();
        System.out.println("Kiwi adalah tumbuhan yang memiliki daun berwarna " + kiwi.getwarnaDaun() + "");
        System.out.println();
        
        Monokotil gandum = new Monokotil();
        gandum.setjumlahKotiledon(1);
        gandum.settulangDaun("sejajar/melengkung");
        gandum.bernafas();
        gandum.tumbuh();
        System.out.println("Gandum adalah tumbuhan monokotil yang memiliki kotiledon berjumlah " + gandum.getjumlahKotiledon() + " dan memiliki tulang daun yang berbentuk " + gandum.gettulangDaun());
        System.out.println();
        
        Dikotil pepaya = new Dikotil();
        pepaya.setjumlahKelopak(2);
        pepaya.setjaringanParenkim("dibagi menjadi dua, palisade dan spons");
        pepaya.bernafas();
        pepaya.tumbuh();
        System.out.println("Pepaya adalah tumbuhan dikotil yang memiliki kelopak berjumlah " + pepaya.getjumlahKelopak() + "dan memiliki jaringan parenkim yang " + pepaya.getjaringanParenkim());
        System.out.println();
    }
    
}