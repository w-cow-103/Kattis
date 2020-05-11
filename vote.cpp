#include <iostream>
#include <string>
#include <random>

using namespace std;

int main()
{
	int test, can;
	cin >> test;

	for (int asdf = 0; asdf != test; asdf++)
	{
		cin >> can;
		bool tie = true;
		int sum = 0, maxV = 0, mavP = -1;
		for (int fdsa = 1; fdsa != can+1; fdsa++)
		{
			//cout << "MaxVotes:" << maxV << "   leader:" << mavP << endl;
			int votes = 0;
			cin >> votes;
			sum += votes;
			if (votes > maxV)
			{
				mavP = fdsa;
				maxV = votes;
				tie = false;
			}
			else if (votes == maxV)
				tie = true;
		}
		if (tie)
		{
			cout << "no winner" << endl;
			continue;
		}
		if ((maxV * 2) > sum)
			cout << "majority winner ";
		else
			cout << "minority winner ";
		cout << mavP << endl;
	}

	//system("pause");
}