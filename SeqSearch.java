/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seqsearch;

import java.util.Scanner;
public class SeqSearch {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String rumah[]={"Paidi","Paijo","Painem",
                    "Paimin","Paini","Paiman",
                    "Pailan"
                    };
        boolean ketemu=false; int i;
        System.out.println("Seaquential Search");
        System.out.print("Pemilik Rumah : ");
        for (i=0;i<rumah.length; i++){
            System.out.print(rumah[i]+" ");
        }
        System.out.println("");
        System.out.print("Cari Pemilik = ");
        String cari = s.next();
        for (i=0; i<rumah.length;i++){
            if(rumah[i].compareToIgnoreCase(cari)==0){
                ketemu = true;
                break;
            }
        }
        if(ketemu==true){
            System.out.println("Ada di nomor "+(i+1));
        }else{
            System.out.println("Tidak ditemukan");
        }
    }//end main
   }//end class

    

