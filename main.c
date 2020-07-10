//Nama		: Iqbal Marcell
//Kelas		: D4 1A
//Program	: Main.c
//Compiler	: Dev-C++ 5.11
//Teknik Informatika

#include <stdio.h>
#include "kf.c"


int main()
{
    int choice;
    int i;
    i=1;
    while (i==1)
    {
        printf("1.FIND AND REPLACE pada subuah Teks \n");
        printf("2.MEMBUAT STATISTIK	KATA DARI SEBUAH FILE TEKS YANG DIBACA \n");
        printf("3.Exit \n");
        printf("pilih  : ");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:
            f_and_r();
            i=0;
            break;
            case 2:
            i=0;
            break;
            case 3:
            i=0;
            break;
            default:
            printf("ga ada cuy \n");
        }
    }   
} 

