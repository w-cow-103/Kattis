#include <iostream>
#include <string>
#include <random>
#include <iomanip>
#include <functional>
#include <queue>
#include <vector>

using namespace std;

void selectionSort(int a[], int n) {
	int i, j, min, temp;
	for (i = 0; i < n - 1; i++) {
		min = i;
		for (j = i + 1; j < n; j++)
			if (a[j] > a[min])
				min = j;
		temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}
}

int main()
{
	int cases;
	cin >> cases;
	int* nums = new int[cases];

	std::priority_queue<int> list;

	for (int x = 0; x != cases; x++)
	{
		int temp; cin >> temp;
		//nums[x] = temp;
		list.push(temp);
	}
	//selectionSort(nums, cases);
	int sum = 0;
	//std::reverse(nums, nums + cases);
	for (int x = 0; x != cases; x++)
	{
		int temp = list.top();
		list.pop();
		//cout << nums[x] << ", ";
		if ((x + 1) % 3 != 0)
			sum += temp;
	}

	cout << sum << endl;
	delete nums;
	//system("pause");

}