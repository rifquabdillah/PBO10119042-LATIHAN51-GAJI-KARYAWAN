/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan51;
import java.util.Scanner;
/**
 *
 * @author Muhammad Rifqu Abdillah
 * Kelas : IF-1
 * NIM   : 10119042
 */
public class Main extends Karyawan {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        Karyawan  oo1 = new Karyawan();
        Manager  oo2 = new Manager();
        
        System.out.println("=====Program Perhitungan Gaji Pegawai=====");
        System.out.print("Masukan NIK : ");
        oo1.setNik(scan.nextLine());
        System.out.print("Masukan Nama : ");
        oo1.setNama(scan.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        oo1.setGolongan(scan.nextInt());
        System.out.print("Masukan jabatan (Manager/Kabag): ");
        oo1.setJabatan(scan.next());
        System.out.print("Masukan Jumlah Kehadiran :");
        oo2.setKehadiran(scan.nextInt());
        
        String nik = oo1.getNik();
        String nama =oo1.getNama();
        int golongan = oo1.getGolongan();
        String jabatan = oo1.getJabatan();
        float tunjanganGolongan = oo2.tunjanganGolongan(golongan);
        float tunjanganJabatan = oo2.tunjanganJabatan(jabatan);
        int hadir = oo2.getKehadiran();
        float tunjanganKehadiran = oo2.tunjanganKehadiran(hadir);
        float totalGaji = oo2.totalGaji();
        
         System.out.println();
        System.out.println("=====HASIL PERHITUNGAN=====");
        System.out.println("NIK\t\t: " + nik);
        System.out.println("NAMA\t\t: " + nama);
        System.out.println("GOLONGAN \t: " + golongan);
        System.out.println("JABATAN\t\t: " + jabatan);
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN\t: Rp " + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN\t: Rp " + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN\t: Rp " + tunjanganKehadiran);
        System.out.println();
        System.out.println("GAJI TOTAL\t: Rp " + totalGaji);
    
    }
    
}
