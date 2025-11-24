#include <iostream>

using namespace std;
int A[1000000];
int main() {
	int n, a, min = 1000000, max = -1000000;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> a;
		A[i] = a;
	}
	for (int i = 0; i < n; i++) {
		if (A[i] < min) min = A[i];
		if (A[i] > max) max = A[i];
	}
	cout << min << " " << max;
}