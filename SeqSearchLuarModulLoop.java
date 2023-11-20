/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seqsearchluarmodulloop;

import java.util.Scanner;
public class SeqSearchLuarModulLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data[]={"13","16","14","21","76","15",
        };
        boolean ketemu;
        int i,pilih=1;
        do{
            System.out.println("\nSequential Search Loop");
            System.out.print("Data: ");
            for(i=0;i<data.length;i++){
                System.out.print(data[i]+" ");
            }
            ketemu=false;
            System.out.println("");
            System.out.print("Cari Data= ");
            String cari = s.next();
            for(i=0;i<data.length;i++){
                if(data[i].compareToIgnoreCase(cari)==0){
                    ketemu=true;
                    break;
                }
               }
            if(ketemu==true){
                System.out.println("Ketemu di posisi terurut ke: "+(i+1));
            }else{
                System.out.println("Tidak ditemukan dalam array");
                }
            System.out.println("Masih ingin mencari lagi?");
            System.out.println("[1.Ya] [2.Tidak]");
            System.out.print("Jawab= ");
            pilih=s.nextInt();
            }while(pilih==1);
        System.out.println("Pencarian Selesai");
        }
    }
  
