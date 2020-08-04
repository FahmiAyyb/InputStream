/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdataa;
import java.util.Scanner;
/**
 *
 * @author Fahmii
 */
public class InputDataa {
    public static void main(String[] args) {
        Scanner bd = new Scanner(System.in);
        String nama,fklts, prodi,nim;
        
    
        System.out.println("Masukkan Data Anda\n");
        System.out.print("Nama      : ");
        nama = bd.next();
        
        System.out.print("Nim       : ");
        nim = bd.next();
        
        System.out.print("Fakultas  : ");
        fklts = bd.next();
        
        System.out.print("Prodi     : ");
        prodi = bd.next();
        
        System.out.println("\nNama        : "+nama);
        System.out.println("Nim         : "+nim);
        System.out.println("Fakultas    : "+fklts);
        System.out.println("Prodi       : "+prodi);
    }
    
}
