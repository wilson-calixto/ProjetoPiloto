#include<iostream>
#include<cstdlib>
#define TAM 10


using namespace std;
// colocar variaveis inicio e fim
int BuscaSequencial(int *vet,int pivo,int procurado)
{
	pivo=pivo/2;


	if(procurado==vet[pivo])
	{
		return pivo;
	}

	if(pivo==0 && procurado!=vet[pivo])
	{
		return -1;
	}else{
		
		BuscaSequencial(vet,pivo-1,procurado);	
		BuscaSequencial(vet,pivo+1,procurado);	
	}	
}
int main(){	
	int n[TAM],indice=TAM,i,procurado=3;
	for(i=9;i>=0;i--)
	{
		n[i]=i;
//		cin>>n[i];

	}

	for(i=0;i<TAM;i++)
	{
		cout<<n[i]<<"\n";

	}
	cout<<"resuldado indice \n"<<BuscaSequencial(n,indice-1,procurado)<<"";	

	
	return 0;
}

