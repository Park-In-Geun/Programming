import java.util.*;

public class SortMain_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 1, 9, 8, 4}; //���Ŀ� ����� �迭
		int arr_merge[] = Arrays.copyOf(arr, arr.length); //�պ� ���Ŀ� ����� �迭�� arr �迭�� ����
		int arr_quick[] = Arrays.copyOf(arr, arr.length); //�� ���Ŀ� ����� �迭�� arr �迭�� ����
		System.out.println("Base Array =>"); //"" ���� ���
		for(int i = 0; i < arr.length; i++) // ������ �迭 i�� 0���� arr �迭�� ���̱��� 1�� �����ϴ� �ݺ���
			System.out.print("| " + arr[i] + " |"); // �⺻ �迭 ���
		System.out.println("\n"); // �ٹٲ� 
		
		System.out.println("====== Merge Sort ======"); // "" ���� ���� ��� (�պ� ���� ����)
		Sorting.mergeSort(arr_merge); // mergeSort �޼��忡 �Ű������� arr_merge �迭�� �־� �պ� ����
		for(int i = 0; i < arr.length; i++) // ������ �迭 i�� 0���� arr �迭�� ���̱��� 1�� �����ϴ� �ݺ���
			System.out.print("| " + arr_merge[i] + " |"); // �պ� ���ĵ� �迭 ���
		System.out.println(); // �ٹٲ�
		
		System.out.println("====== Quick Sort ======"); // "" ���� ���� ���(�� ���� ����)
		Sorting.quickSort(arr_quick); // quickSort �޼��忡 �Ű������� arr_quick �迭�� �־� �� ����
		for(int i = 0; i < arr.length; i++) // ������ �迭 i�� 0���� arr �迭�� ���̱��� 1�� �����ϴ� �ݺ���
			System.out.print("| " + arr_quick[i] + " |"); // �� ���ĵ� �迭 ���
	}
}

class Sorting //���� Ŭ���� 
{
	public static void mergeSort(int[] arr) // �պ� ���� �޼���� �Ű����� arr �迭�� ����
	{
		int[] temp = new int[arr.length];	//�ӽ������� ����� �迭
		internalMergeSort(arr, temp,0,(arr.length)-1); 
		// internalMergeSort �޼���(��� �պ�����)�� �Ű������� arr �迭, 0, arr�迭�� ���� - 1 �� ����
	}
	
	private static void internalMergeSort(int[] arr,int[] temp,int m,int n) 
	// �պ� ���� �޼���� �Ű����� arr �迭, temp �迭, ������ ���� m , n �� ����
	{
		if(m<n)	//arr�� ���̸� ���� �ʵ���
		{
			int middle = (m+n)/2; //�迭�� �ݾ����� �ɰ���.
			internalMergeSort(arr,temp,m,middle);	//���͸� �̿��� ����,������ �迭��
			internalMergeSort(arr,temp,middle+1,n);	//�� �ɰ��ش�.
			merge(arr,temp,m,middle,middle+1,n);	//�迭�� �ű�鼭 ������ �ȴ�.
		}
	}
	private static void merge(int[] arr, int[] temp, int m, int p, int q, int n)
	// merge �޼��忡 arr �迭, temp �迭, ������ ���� m,p,q,n �� ����
	{
		int t=m; //������ ���� t �� �����ϰ� m�� ����
		int numElements = n-m+1;	//���� ��
		while(m <=p && q<=n)		//���� �� ���Ұ� ���� ��
		{
			if(arr[m] < arr[q])		//�ΰ��� �迭�� ���ؼ�
				temp[t++] = arr[m++];	//ũ�� ������ ����
			else temp[t++] = arr[q++];	//�迭�� �����Ѵ�
		}
		//�迭 ���ʰ� �����ʿ� ���� ���Ұ� �������� ��츦 ó���Ѵ�
		while(m <= p)
			temp[t++] = arr[m++];
		while(q <=n)
			temp[t++] = arr[q++];
		//�迭 �����ϱ�
		for(int i=0; i<numElements; i++,n--)
			arr[n] = temp[n];
	}
	
	public static void quickSort(int[] arr) // quickSort �޼��忡 �Ű������� arr �迭�� ����
	{
		internalquickSort(arr,0,(arr.length)-1); // internalquickSort �޼���(��� �� ����)�� �Ű������� arr�迭, 0 , arr�迭�� ���� - 1 �� ����
	}
	
	private static void internalquickSort(int[] arr,int m,int n)
	// internalquickSort �޼���(��� �� ����)�� �Ű������� arr�迭, ������ ���� m,n�� ����
	{
		int p; //������ ���� p ���� (���� �� ���� ���� ����)
		if(m>n) return;		//�迭�� ������
		
		p = partition(arr,m,n);		//���� �ϸ鼭,���� �迭�� ���Ҹ� ���� �ڸ��� �޾�
		internalquickSort(arr,m,p-1);	//����Ѵ�.
		internalquickSort(arr,p+1,n);
	}
	private static int partition(int[] arr, int i, int j) //���� �޼���
	{
		int middle = (j+i)/2;		//�迭�� �߾� ��
		int pivot = arr[middle];	//�߾� ���� ����
		arr[middle] = arr[i];		//arr[i](ó����ġ)�� �߾� ���� ��ȯ
		arr[i] = pivot;				
		
		int p = i;					//�������� �迭 ��踦 �����ϴ� p
		int temp =0;				//�迭���� �ӽ� ������ ����
		
		for(int k=i+1; k<=j; k++)		
		{
			if(arr[k] < pivot)		//i(ó��)���� �����ʿ� �ִ� ���ҵ���
			{						//arr[i](ó��)������ �۴ٸ�
				p++;				//p(���)�� ���������� �ű��.
				temp = arr[p];		//arr[p]�ӽ�����
				arr[p] = arr[k];
				arr[k] = temp;
			}
		}
		temp = arr[i];				//�ӽ� �����ߴ� arr[p]��
		arr[i] = arr[p];			//arr[i]�� ��ȯ�Ѵ�
		arr[p] = temp;
		return p;					//p�� �����ش�.
		
	}
}
