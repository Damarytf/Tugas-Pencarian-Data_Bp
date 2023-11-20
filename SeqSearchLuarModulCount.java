/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seqsearchluarmodulcount;

import java.util.Scanner;
public class SeqSearchLuarModulCount {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int data[]={13,16,14,21,76,15}; 
        boolean ketemu;
        int i,pilih;
        do{
            int count=0;
            System.out.println("\nSequential Search Loop");
            System.out.print("Data : ");
            for (i=0;i<data.length;i++){
                System.out.print(data[i]+" ");
            }
            ketemu=false;
            System.out.println("");
            System.out.println("Cari Angka yang diinginkan =  ");
            int cari = s.nextInt();
            for(i=0;i<data.length;i++){
                count++;
                if(data[i]==cari){
                    ketemu=true;
                    break;
                }
            }
            if(ketemu==true){
                System.out.print("Ditemukan setelah ");
                System.out.println(count+" Kali seleksi");
            }else{
                System.out.println("Tidak ditemukan");
                System.out.print("Meski sudah "+count);
                System.out.println(" kali seleksi");
            }
            System.out.println("Ingin mencari lagi?");
            System.out.println("[1.Ya] [2.Tidak]");
            System.out.print("Jawab = ");
            pilih = s.nextInt();
        }while(pilih==1);
        System.out.println("Selesai");
                    
        }
    }
    

