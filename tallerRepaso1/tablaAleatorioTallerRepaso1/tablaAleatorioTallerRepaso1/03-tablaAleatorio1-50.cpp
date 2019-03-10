#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

int main() {

	int num,
		tablaMatriz[4][4];

	srand((unsigned int)time(NULL));

	for (int i = 0; i < 4; i++)
		for (int j = 0; j < 4; j++)
			tablaMatriz[i][j] = (1 + rand() % (50));

	for (int k = 0; k < 4; k++) {
		for (int l = 0; l < 4; l++) {
			cout << "|\t" << tablaMatriz[k][l]<<"\t|";
		}
		cout << endl;
	}
		cout << endl << endl;
		system("Pause");
		return 0;
	
}