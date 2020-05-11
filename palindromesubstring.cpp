#include <iostream>
#include <string>
#include <random>
#include <set>
using namespace std;

bool isPalindromeR(string str)
{
    int fir = 0, last = str.length()-1;
    while (fir < last+1)
    {
        if (str.at(fir) != str.at(last))
            return false;
        fir++;
        last--;
    }
    return true;
}

int main()
{
	string line, temp;
	while (getline(cin, line))
	{
		line += line.at(line.length() - 1);
		set <string> words;
		for (int x = 0; x != line.length(); x++)
		{
			
			for (int y = x; y != line.length(); y++)
			{
				temp = line.substr(x,y-x);
				if (temp.length() > 1 && isPalindromeR(temp))
				{
					words.insert(temp);
				}
			}
		}
		for (string x : words)
			cout << x << endl;
		cout << endl;
	}
}