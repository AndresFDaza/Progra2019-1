#include <iostream>

using namespace std;

int main() {

	int option, maxArray = 0, suma = 0,
		elArray[100];

	do {
		cout << endl << "\t---Menu---" << endl << endl; 
		cout << "1. Ingresar datos a un arreglo" <<
			"\n2. Listar los datos ingresados al arreglo." <<
			"\n3. Sumar los datos contenidos en el arreglo e imprimir el arreglo." <<
			"\n(0. Salir)" << endl;
		cout << "Su opcion: "; cin >> option;

		switch (option)
		{
		case 1:
			system("cls");
			int ndato;
			cout << "Numero de datos a ingresar: "; cin >> ndato;
			for (int i = maxArray; i < (maxArray+ndato); i++) {
				cout << "Ingrese nuevo dato [" << i << "] :"; cin >> elArray[i];
			} 
			maxArray += ndato;
			system("cls");
			break;
		case 2:
			system("cls");
			cout << "\tSus datos: " << endl;
			for (int i = 0; i < maxArray; i++) {
				cout << (i + 1) << ". -> " << elArray[i] << endl;
			}
			cout << endl << endl;
			break;
		case 3:
			system("cls");
			cout << endl << "\t--Su arreglo--" << endl << endl;
			cout << "Arreglo[" << maxArray << "]={ ";
			for (int i = 0; i < maxArray; i++) {
				cout << elArray[i] << ",";
			}
			cout << "}" << endl;
			for (int j = 0; j < maxArray; j++)
				suma += elArray[j];
			cout <<endl<< "La suma de este arreglo es de: " << suma << endl << endl;;
			break;
		default:
			cout<<endl << "OPCION FUERA DE RANGO INTENTE NUEVAMENTE" << endl << endl; break;
		}

	} while (option!=0);

}