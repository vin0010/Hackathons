// #define GETC ({char x;scanf("%c ", &x);x;})
// #define GETL ({long x;scanf("%li\n", &x);x;})
// long t=GETL;
// char c= GETC;
//to find left child : 2n+1 right : 2n+2
#include<iostream>
using namespace std;
void maxHeapify(int, int, int);
void minHeapify(int, int, int);
void buildMaxHeap(int, int);
void buildMinHeap(int, int);
int findIndexMaxHeap(int*, int, int);
int findIndexMinHeap(int*, int, int);
int removeFromMinHeap(int*, int, int);
int removeFromMaxHeap(int*, int, int);

void swap(int*, int, int, int);
void printArray(int*, int);

void maxHeapify(int *arr, int n, int i){
	int l=2*i;
	int r=(2*i)+1;
	// int left=left(i);
	// int right=right(i);
	int largest = i;
	if(l<n && arr[i]<arr[l]){
		largest=l;
	}
	if(r<n && arr[largest]<arr[r]){
		largest = r;
	}
	if(largest != i){
		swap(arr, n, i, largest);
		maxHeapify(arr,n,largest);//maxheapify affected sub array again
	}

}
void minHeapify(int *arr, int n, int i){
	int l=2*i;
	int r=(2*i)+1;
	// int left=left(i);
	// int right=right(i);
	int smallest = i;
	if(l<n && arr[i]>arr[l]){
		smallest=l;
	}
	if(r<n && arr[smallest]>arr[r]){
		smallest = r;
	}
	if(smallest != i){
		swap(arr, n, i, smallest);
		maxHeapify(arr,n,smallest);//minheapify affected sub array again
	}

}
void buildMaxHeap(int *arr, int n){
	for(int i=n/2;i>=1;i--){
		maxHeapify(arr,n,i);
	}
}
void buildMinHeap(int *arr, int n){
	for(int i=n/2;i>=1;i--){
		minHeapify(arr,n,i);
	}
}
int findIndexMaxHeap(int *arr, int n, int k){
	for(int i=1;i<n/2;i++){
		if(){

		}
	}
}
int findIndexMinHeap(int *arr, int n, int k){

}
void swap(int *arr, int n, int i, int j){
	cout<<"\nswapping:"<<arr[i]<<" and "<<arr[j];
	int temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	printArray(arr,11);
}
int left(int *arr, int n, int i){
	int index=2*i;
	if(index<n){
		return arr[index];
	}
	return -1;
}
int right(int *arr, int n, int i){
	int index=(2*i)+1;
	if(index<n){
		return arr[index];
	}
	return -1;
}
int parent(int *arr, int i){
	int index=(i/2);
	return arr[index];
}
void printArray(int *arr, int n){
	cout<<"\n";
	for(int i=0;i<n;i++){
		cout<<"->"<<arr[i];
	}
	cout<<"\n";
}
int main(){
	int n;
	// cin>>n;
	// int arr[] = new arr[n+1];
	// for(int i=1;i<=n;i++){
	// 	cin>>arr[i];
	// }
	int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
	buildMaxHeap(arr,11);
	printArray(arr,11);

	return 0;
}