/*
 * Pilha.cpp
 *
 *  Created on: 14 de abr de 2016
 *      Author: wilson
 */
#include <iostream>
#include "Pilha.h"
using namespace std;
Pilha::Pilha() {
	// TODO Auto-generated constructor stub
	fundo=new No();
	fundo->prox=NULL;
	topo=fundo;
}

void Pilha::empilha(Item item){
	No *aux=new No();
	topo->item=item;
	aux->prox=topo;
	topo=aux;
}

void Pilha::desempilha(Item &item){
	No *aux;
	aux=topo;
	topo=topo->prox;
	item=topo->item;
	delete(aux);
}

void Pilha::mostra(){
	No *aux;
	aux=topo->prox;
	while(aux!=NULL)
	{
		aux->item.mostra();
		aux=aux->prox;
	}
}

		/*     Comeco da fila*/
Fila::Fila(int tam)
{
	// TODO Auto-generated constructor stub
	pilhas=new Pilha[tam];
	primeiro=0;
	ultimo=0;
	this->tam=tam;
}

void Fila::enfileira(Pilha pilha)
{
	if((ultimo+1)%tam!=primeiro)
	{
		pilhas[ultimo]=pilha;
		ultimo=ultimo+1%tam;
	}else{
		cout<<"fila cheia";

	}
}

void Fila::desenfileirar(){
		if(ultimo==primeiro)
		{

			cout<<"fila vazia\n";
		}else{
			primeiro=(primeiro+1)%tam;
		}
}


void Fila::mostra(){
		int primeiroLocal=primeiro;
		while(ultimo!=primeiroLocal)
		{
				pilhas[primeiroLocal].mostra();
				cout<<"\n";
				primeiroLocal=(primeiroLocal+1)%tam;
		}

}




