/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seqsearchluarmodulsimulasi;

import java.util.Scanner;
public class SeqSearchLuarModulSimulasi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[]={13,16,14,21,76,15}; 
        int cari;
        boolean ketemu=false;
        System.out.println("Simulasi Seq Search");
        System.out.print("Data: ");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        System.out.print("Cari = ");
        cari=s.nextInt();
        for(int i=0;i<data.length;i++){
            System.out.print("Benarkah "+data[i]+"="+cari+"? ");
            if(data[i]==cari){
                System.out.println("Ya");
                ketemu=true;
                break; //hentikan perulangan
            }
            else{
                System.out.println("Tidak");
            }
        }
        if(ketemu==true)
            System.out.println("Data Sesuai");
        else
            System.out.println("Data tidak ditemukan");
    }
}
