/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3.pbo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class tebak {
    int angkaTebakan;
    int angkaSimpan;
    void menebak(){
        Random random = new Random();
        this.angkaSimpan = random.nextInt(101);
        System.out.println("Hai... Nama saya Mr. Lippie, saya telah memilih bilangan bulat secara acak antara 0 s/d\n" + "100. Silahkan ditebak ya gengs!!!" );
        do{
            Scanner angka = new Scanner(System.in);
            System.out.println("Tebakan anda = ");
            this.angkaTebakan = angka.nextInt();
            
            if(angkaTebakan > angkaSimpan){
                System.out.println("HAHAHAHA... bilangan tebakan anda terlalu besar");
            }else if(angkaTebakan < angkaSimpan){
                System.out.println("HAHAHAHA... bilangan tebakan anda terlalu kecil");    
            }else{
                System.out.println("Yey... bilangan tebakan anda BENAR");
                break;
            }
            
        }while(angkaTebakan != angkaSimpan);
    }
}
