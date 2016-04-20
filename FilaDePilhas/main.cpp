/*
 * main.cpp
 *
 *  Created on: 4 de abr de 2016
 *      Author: wilson
 */
#include<iostream>
#include "Pilha.h"

using namespace std;
int main(){
	Fila filaDePilhas(4);
	Pilha p1;
	Pilha p2;
	Pilha p3;
	Item i("0");
	Item i1("1");
	Item i2("2");
	Item i3("3");
	Item i4("4");
	Item i5("5");
	Item i6("6");
	Item i7("7");
	Item i8("8");

	// PILHA 1
	p1.empilha(i);
	p1.empilha(i1);
	p1.empilha(i2);
	p1.empilha(i3);
	//N PILHA 2
	p2.empilha(i4);
	p2.empilha(i5);
	p2.empilha(i6);
	//N PILHA 3
	p3.empilha(i7);
	p3.empilha(i8);

	filaDePilhas.enfileira(p1);
	filaDePilhas.enfileira(p2);
	filaDePilhas.enfileira(p3);
	cout<<"\nlista final\n";
	filaDePilhas.mostra();
	cout<<"blz";


	return 0;
}
