#include <bits/stdc++.h>
using namespace std;

void heapify(vector<int> &arr, int n, int i)
{
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;

    if (l < n && arr[l] > arr[largest])
        largest = l;

    if (r < n && arr[r] > arr[largest])
        largest = r;

    if (largest != i) {
        swap(arr[i], arr[largest]);

        heapify(arr, n, largest);
    }
}

void heapSort(vector<int> &arr, int n)
{

    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    for (int i = n - 1; i >= 0; i--) {
        swap(arr[0], arr[i]);
        heapify(arr, i, 0);
    }
}

void printArray(vector<int> &arr, int size)
{
	int i;
	for (i = 0; i < size; i++)
		cout << arr[i] << " ";
	cout << endl;
}

int main()
{
  int n;
  vector<int> arr;
  cout<<"Enter the number of elemnts of array:"<<endl;
  cin>>n;

  for(int i = 0; i < n; i++)
  {
    arr.push_back(rand());
    // arr[i]= rand();
  }

  // sort(arr.begin(), arr.end(), greater<int>());

  cout<<"Elements of array are:"<<endl;
  printArray(arr, n);

  clock_t time_req;

  time_req = clock();
	heapSort(arr, n);
  time_req = clock() - time_req;

  double time_taken_quick = (double)time_req/CLOCKS_PER_SEC;

	cout << "Sorted array: \n";
	printArray(arr, n);
  cout<< "Time taken by heap sort is "<<fixed<<setprecision(9)<<time_taken_quick<<endl;
	return 0;
}
