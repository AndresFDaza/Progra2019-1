#include <iostream>
using namespace std;


int main() {

	int emparedadosCompletos = 0,
		emparedados3Ingredientes = 0,
		ingredientes[] = { 60,25,22,21 };

	do {

		for (int i = 0; i < 4; i++) {
			if (i == 0)
				ingredientes[i] -= 2;
			else
				ingredientes[i] -= 1;
		}
		emparedadosCompletos++;
	} while (ingredientes[0] > 0 && ingredientes[1] > 0 &&
		ingredientes[2] > 0 && ingredientes[3] > 0);

	cout << "\nEmparedados completos: " << emparedadosCompletos << endl;

	if (ingredientes[0] <= 0)
		cout << "Ya no hay mas pan.\n";
	else if (ingredientes[1] <= 0) {
		do {
			for (int j = 0; j < 4; j++) {
				if (j == 0)
					ingredientes[j] -= 2;
				else if (j != 1)
					ingredientes[j] -= 1;
			}
			emparedados3Ingredientes++;
		} while (ingredientes[0] > 0 && ingredientes[2] > 0
			&& ingredientes[3] > 0);
	}
	else if (ingredientes[2] <= 0) {
		do {
			for (int j = 0; j < 4; j++) {
				if (j == 0)
					ingredientes[j] -= 2;
				else if (j != 2)
					ingredientes[j] -= 1;
			}
			emparedados3Ingredientes++;
		} while (ingredientes[0] > 0 && ingredientes[1] > 0
			&& ingredientes[3] > 0);
	}
	else if (ingredientes[3] <= 0) {
		do {
			for (int j = 0; j < 4; j++) {
				if (j == 0)
					ingredientes[j] -= 2;
				else if (j != 1)
					ingredientes[j] -= 1;
			}
			emparedados3Ingredientes++;
		} while (ingredientes[0] > 0 && ingredientes[1] > 0
			&& ingredientes[2] > 0);
	}

	cout << "\nEmparedados de 3 ingredientes: " << emparedados3Ingredientes << endl;

	cout << endl << endl;
	system("Pause");
	return 0;
}
