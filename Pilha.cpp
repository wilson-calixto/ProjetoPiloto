/*
 * Pilha.cpp
 *
 *  Created on: 14 de abr de 2016
 *      Author: wilson
 */
#include <iostream>
#include "Pilha.h"
using namespace std;
Pilha::Pilha(){
	// TODO Auto-generated constructor stub
	//cria o No sentinela
	Item sentinela("nulo");
	fundo=new No(sentinela);
	fundo->prox=NULL;
	topo=fundo;
	estado="t";
}


void Pilha::empilha(Item item){

	No *aux=new No();
	aux->setIndice(indice);//coloca o indice no no
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

bool Pilha::busca(Item item){
	No *aux;
	aux=topo->prox;
	while(aux!=NULL)
	{
		if(aux->item.codigo==item.codigo)
		{
			return true;
		}
		aux=aux->prox;
	}
	return false;
}

Fila::Fila() {
	frente = new No();
	frente->prox = NULL;
	tras = frente;
}

FilaDeFila::FilaDeFila() {
	frente = new NoFila();
	frente->prox = NULL;
	tras = frente;
}

void Fila::enfileira(Item *x) {
	tras->prox = new No();
	tras = tras->prox;
	tras->item = *x;
	tras->prox = NULL;
}

void FilaDeFila::enfileiraFila(Fila *x) {
	tras->prox = new NoFila();
	tras = tras->prox;
	tras->fila = *x;
	tras->prox = NULL;
}

void Fila::desenfileira(Item *x) {
	No *aux = frente;
	frente = frente->prox;
	*x = frente->item;
	delete aux;
}

void FilaDeFila::desenfileiraFila(Fila *x) {
	NoFila *aux = frente;
	frente = frente->prox;
	*x = frente->fila;
	delete aux;
}

void Fila::mostra(){
	No *aux;
	aux=frente->prox;
	while(aux!=NULL)
	{
		aux->item.mostra();
		aux=aux->prox;
	}
	cout << endl;
}

void Fila::esvaziar() {
	No *aux = frente;
	frente = frente->prox;
	while(aux!=NULL) {
		delete aux;
		No *aux = frente;
		frente = frente->prox;
	}
}

		/*     Comeco da Controle*/
Controle::Controle(int tam)
{
	// TODO Auto-generated constructor stub
	temporario=new int[tam-2];

	pilhas=new Pilha[tam];
	primeiro=0;
	ultimo=0;
	this->tam=tam;
}

void Controle::aloca(Pilha pilha)
{
	if((ultimo+1)%tam!=primeiro)
	{
		pilha.setIndice(ultimo);//coloca o indice na pilha
		pilhas[ultimo]=pilha;
		ultimo=ultimo+1%tam;
	}else{
		cout<<"Controle cheia";

	}
}

void Controle::desenfileirar(){
		if(ultimo==primeiro)
		{

			cout<<"Controle vazia\n";
		}else{
			primeiro=(primeiro+1)%tam;
		}
}


void Controle::mostra(){
		int primeiroLocal=primeiro;
		while(ultimo!=primeiroLocal)
		{
				pilhas[primeiroLocal].mostra();
				cout<<"\n";
				primeiroLocal=(primeiroLocal+1)%tam;
		}

}
int Controle::busca(Item item){
		int primeiroLocal=primeiro;
		bool achou=false;
		while(ultimo!=primeiroLocal)
		{
				achou=pilhas[primeiroLocal].busca(item);
				if(achou)
				{
						return primeiroLocal;
				}
				primeiroLocal=(primeiroLocal+1)%tam;
		}
		return -1;
}

void Controle::enfileiraEntrada() {
	string container;
	do {
		do {
			cout << "\nInsira container | -1 para sair | -2 para enfileirar outra fila" << endl;
			cin >> container;
			Item item(container);
			if(container != "-1" && container != "-2") fila.enfileira(&item);
			
		} while(container != "-2" && container != "-1");
		
		filaDeFila.enfileiraFila(&fila);
		fila.esvaziar();
		
	} while(container != "-1");
}



