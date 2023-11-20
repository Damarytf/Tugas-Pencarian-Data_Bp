/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seqsearchloop;

import java.util.Scanner;
public class SeqSearchLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rumah[]={"Paidi","Paijo","Painem",
            "Paimin","Paini","Paiman",
            "Pailan"
            };
        boolean ketemu;
        int i,pilih=1;
        do{
            System.out.println("\nSequential Search Loop");
            System.out.print("Pemilik Rumah : ");
            for(i=0;i<rumah.length;i++){
                System.out.print(rumah[i]+" ");
            }
            ketemu=false;
            System.out.println("");
            System.out.print("Cari Pemilik= ");
            String cari = s.next();
            for(i=0;i<rumah.length;i++){
                if(rumah[i].compareToIgnoreCase(cari)==0){
                    ketemu=true;
                    break;
                }//end if
               }//end for
            if(ketemu==true){
                System.out.println("Ada di nomor "+(i+1));
            }else{
                System.out.println("Tidak ditemukan");
                }
            System.out.println("Cari lagi?");
            System.out.println("[1.Ya] [2.Tidak]");
            System.out.print("Jawab= ");
            pilih=s.nextInt();
            }while(pilih==1);
        System.out.println("Terima kasih...");
        }//end main
    }//end class
    

