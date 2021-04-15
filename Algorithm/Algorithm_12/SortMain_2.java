import java.util.*;

public class SortMain_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 1, 9, 8, 4}; //정렬에 사용할 배열
		int arr_merge[] = Arrays.copyOf(arr, arr.length); //합병 정렬에 사용할 배열로 arr 배열을 복사
		int arr_quick[] = Arrays.copyOf(arr, arr.length); //퀵 정렬에 사용할 배열로 arr 배열을 복사
		System.out.println("Base Array =>"); //"" 내용 출력
		for(int i = 0; i < arr.length; i++) // 정수형 배열 i가 0부터 arr 배열의 길이까지 1씩 증가하는 반복문
			System.out.print("| " + arr[i] + " |"); // 기본 배열 출력
		System.out.println("\n"); // 줄바꿈 
		
		System.out.println("====== Merge Sort ======"); // "" 안의 내용 출력 (합병 정렬 시작)
		Sorting.mergeSort(arr_merge); // mergeSort 메서드에 매개변수로 arr_merge 배열을 주어 합병 정렬
		for(int i = 0; i < arr.length; i++) // 정수형 배열 i가 0부터 arr 배열의 길이까지 1씩 증가하는 반복문
			System.out.print("| " + arr_merge[i] + " |"); // 합병 정렬된 배열 출력
		System.out.println(); // 줄바꿈
		
		System.out.println("====== Quick Sort ======"); // "" 안의 내용 출력(퀵 정렬 시작)
		Sorting.quickSort(arr_quick); // quickSort 메서드에 매개변수로 arr_quick 배열을 주어 퀵 정렬
		for(int i = 0; i < arr.length; i++) // 정수형 배열 i가 0부터 arr 배열의 길이까지 1씩 증가하는 반복문
			System.out.print("| " + arr_quick[i] + " |"); // 퀵 정렬된 배열 출력
	}
}

class Sorting //정렬 클래스 
{
	public static void mergeSort(int[] arr) // 합병 정렬 메서드로 매개변수 arr 배열을 받음
	{
		int[] temp = new int[arr.length];	//임시적으로 사용할 배열
		internalMergeSort(arr, temp,0,(arr.length)-1); 
		// internalMergeSort 메서드(재귀 합병졍렬)에 매개변수로 arr 배열, 0, arr배열의 길이 - 1 을 전달
	}
	
	private static void internalMergeSort(int[] arr,int[] temp,int m,int n) 
	// 합병 졍렬 메서드로 매개변수 arr 배열, temp 배열, 정수형 변수 m , n 을 받음
	{
		if(m<n)	//arr의 길이를 넘지 않도록
		{
			int middle = (m+n)/2; //배열을 반씩으로 쪼갠다.
			internalMergeSort(arr,temp,m,middle);	//제귀를 이용해 왼쪽,오른쪽 배열을
			internalMergeSort(arr,temp,middle+1,n);	//또 쪼개준다.
			merge(arr,temp,m,middle,middle+1,n);	//배열에 옮기면서 정렬이 된다.
		}
	}
	private static void merge(int[] arr, int[] temp, int m, int p, int q, int n)
	// merge 메서드에 arr 배열, temp 배열, 정수형 변수 m,p,q,n 을 받음
	{
		int t=m; //정수형 변수 t 를 선언하고 m을 넣음
		int numElements = n-m+1;	//원소 수
		while(m <=p && q<=n)		//정렬 할 원소가 있을 때
		{
			if(arr[m] < arr[q])		//두개의 배열을 비교해서
				temp[t++] = arr[m++];	//크고 작음을 비교해
			else temp[t++] = arr[q++];	//배열에 복사한다
		}
		//배열 왼쪽과 오른쪽에 서로 원소가 남아있을 경우를 처리한다
		while(m <= p)
			temp[t++] = arr[m++];
		while(q <=n)
			temp[t++] = arr[q++];
		//배열 복사하기
		for(int i=0; i<numElements; i++,n--)
			arr[n] = temp[n];
	}
	
	public static void quickSort(int[] arr) // quickSort 메서드에 매개변수로 arr 배열을 받음
	{
		internalquickSort(arr,0,(arr.length)-1); // internalquickSort 메서드(재귀 퀵 정렬)에 매개변수로 arr배열, 0 , arr배열의 길이 - 1 을 전달
	}
	
	private static void internalquickSort(int[] arr,int m,int n)
	// internalquickSort 메서드(재귀 퀵 정렬)에 매개변수로 arr배열, 정수형 변수 m,n을 받음
	{
		int p; //정수형 변수 p 선언 (분할 한 값을 넣을 변수)
		if(m>n) return;		//배열이 끝나면
		
		p = partition(arr,m,n);		//정렬 하면서,다음 배열에 원소를 넣을 자리를 받아
		internalquickSort(arr,m,p-1);	//재귀한다.
		internalquickSort(arr,p+1,n);
	}
	private static int partition(int[] arr, int i, int j) //분할 메서드
	{
		int middle = (j+i)/2;		//배열의 중앙 값
		int pivot = arr[middle];	//중앙 값을 저장
		arr[middle] = arr[i];		//arr[i](처음위치)와 중앙 값을 교환
		arr[i] = pivot;				
		
		int p = i;					//나누었던 배열 경계를 저장하는 p
		int temp =0;				//배열값을 임시 저장할 변수
		
		for(int k=i+1; k<=j; k++)		
		{
			if(arr[k] < pivot)		//i(처음)보다 오른쪽에 있는 원소들이
			{						//arr[i](처음)값보다 작다면
				p++;				//p(경계)를 오른쪽으로 옮긴다.
				temp = arr[p];		//arr[p]임시저장
				arr[p] = arr[k];
				arr[k] = temp;
			}
		}
		temp = arr[i];				//임시 저장했던 arr[p]와
		arr[i] = arr[p];			//arr[i]를 교환한다
		arr[p] = temp;
		return p;					//p를 돌려준다.
		
	}
}
