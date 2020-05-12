#include <iostream>
#include <vector>

using namespace std;

int main()
{
    long n,curr = 1;
    int days = 1;
    cin >> n;
    
    while(true)
    {
        if (curr >= n)
            break;
        days++;
        curr*=2;
    }
    cout << days << endl;
}