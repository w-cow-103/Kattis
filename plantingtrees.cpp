#include <iostream>
#include <string>
#include <random>
#include <iomanip>
#include <algorithm>

using namespace std;

int main()
{
	int cases;
	cin >> cases;

	int* nums = new int[cases];
	for (int x = 0; x != cases; x++)
	{
		int temp;
		cin >> temp;
		nums[x] = temp;
	}

	sort(nums, nums + cases, greater<int>());

	int max = 0;

	for (int x = 0; x != cases; x++)
	{
		int curr = nums[x];
		if (curr + x+2 > max)
			max = curr + x+2;
		//cout << max << endl;
	}
	cout << max << endl;
	//system("pause");
}