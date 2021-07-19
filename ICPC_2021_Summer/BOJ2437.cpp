// ���� ���� (������+1) ���� �۰ų� ������ �� ������ ��� ǥ�� �����ϴ�...
// 1 2 4 8 �϶� �������� 15�̴ϱ� ���� 15���� ���� ǥ�� ����. �� ���� ���� 16 �����̸� ok...

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int BOJ2437() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int N;
	cin >> N;
	vector<int> vec(N);
	for (int i = 0;i < N;i++) {
		cin >> vec[i];
	}
	sort(vec.begin(), vec.end());
	
	if (vec[0] != 1) {
		cout << 1;
		return 0;
	}
	int sum = 1;
	for (int i = 1;i < N;i++) {
		if (vec[i] > sum + 1) {
			break;
		}
		else {
			sum += vec[i];
		}
	}
	cout << sum + 1;
	return 0;
}