//Nama		: Iqbal Marcell
//Kelas		: D4 1A
//Program	: Kf.c
//Compiler	: Dev-C++ 5.11
//Teknik Informatika



#include "boolean.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void f_and_r(kf)
{
	printf("Masukan File: ");
	
	FILE* open_file(char file_name[], char mode[]){
	FILE *fp = fopen(file_name, mode);
	
	if(fp == NULL){
		perror("File tidak dapat titemukan.\n");
		exit(EXIT_FAILURE);
	}
	
	return fp;
}
	
	
	
	
}
