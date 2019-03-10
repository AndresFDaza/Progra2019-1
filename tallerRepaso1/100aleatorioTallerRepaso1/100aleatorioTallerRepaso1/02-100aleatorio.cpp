#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

int main() {

	int num, numerosAny[] = { 0,0,0,0,0 };

	srand((unsigned int)time(NULL));

	for (int i = 0; i < 100; i++) {
		num = 1 + rand() % (5);
		switch (num)
		{
		case 1:
			numerosAny[(num - 1)] += 1; break;
		case 2:
			numerosAny[(num - 1)] += 1; break;
		case 3:
			numerosAny[(num - 1)] += 1; break;
		case 4:
			numerosAny[(num - 1)] += 1; break;
		case 5:
			numerosAny[(num - 1)] += 1; break;
		default:
			cout << "Se presentó un error" << endl;
			break;
		}
	}

	cout << "\nEn el arreglo..." << endl;
	for (short j = 0; j < 5; j++)
		cout << "\nNumeros " << j + 1 << " -> " << numerosAny[j] << endl;


	cout << endl << endl;
	system("Pause");
	return 0;
}