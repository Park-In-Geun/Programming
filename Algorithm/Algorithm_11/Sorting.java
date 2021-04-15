
public class Sorting { //���� Ŭ�����Դϴ�.
	
	public static void swap(int[] a, int j, int k){
		// �迭�� ������ ��ġ�� �ٲٱ� ���� swap ���� �޼���� �Ű����� �迭 a, ������ ���� j,k�� �޽��ϴ�.
		int temp; // ������ ���� temp�� �����մϴ�.
		
		temp = a[j]; //temp�� a�迭�� j��° ���Ҹ� �ֽ��ϴ�.
		a[j] = a[k]; //a �迭�� j��° ���ҿ� a �迭�� k��° ���Ҹ� �ֽ��ϴ�. (j ��ġ�� k �ֱ�)
		a[k] = temp; //a �迭�� k��°�� temp ���� �ֽ��ϴ�. (k ��ġ�� j �ֱ�)
	}
	
	public static void selectionSort(int[] a){
		// ���� ������ ���� selectionSort ���� �޼���� �Ű������� ������ �迭 a �� �޽��ϴ�.
		int i, j, k; // ������ ���� i,j,k�� �����մϴ�.
		
		System.out.println("===== Selection Sort ===="); // " " ���� ������ ����մϴ�.
		
		for(i = 0 ; i < a.length - 1 ; i++){ // i �� 0���� a�迭�� ���� - 1 ���� 1�� ������Ű�� �ݺ����Դϴ�.
			
			for(j = i+1, k = i ; j< a.length ; j++){ // k�� i���� �����ְ� j�� i+1 ���� a�迭�� ���̱��� 1�� ������Ű�� �ݺ����Դϴ�.
			
				if(a[j] < a[k]) k = j; //a�迭�� j��° ���Ұ� a�迭�� k��° ���Һ��� ���� ��츦 Ȯ���� ������ ��� k�� j�� �ֽ��ϴ�.
			}
			
			swap(a,k,i); //swap �޼��忡 a , k , i ���� �־� k�� i ��° ���� ��ġ�� �ٲߴϴ�.
			
			System.out.printf("Pass %d = >", i+1); // Pass (i+1) �� ����մϴ�. 
			System.out.print("\n"); // �ٹٲ��Դϴ�.
		
			for(int t = 0; t < a.length ; t++) //������ ���� t�� 0���� a�迭�� ���̱��� 1�� �����ϴ� �ݺ����Դϴ�.
				System.out.print("| " + a[t] + " |"); // a�迭�� t��° ���Ҹ� ����մϴ�.
			System.out.print("\n"); //�ٹٲ��Դϴ�.
		}
		System.out.print("=========================\n"); //""���� ������ ����ϰ� �ٹٲ� ���ݴϴ�.
	}
	
	public static void bubbleSort(int[] a){
		// ���� ������ ���� bubbleSort ���� �޼���� �Ű������� ������ �迭 a�� �޽��ϴ�.
		int i,j,k=0; // ������ ���� i,j,k�� �����ϰ� k�� 0���� �ʱ�ȭ���ݴϴ�.
		
		System.out.print("====== Bubble Sort ======\n"); //""���� ������ ����ϰ� �ٹٲ� ���ݴϴ�.
		
		for( i = a.length - 1 ; i >= 0 ; --i){ // i �� a�迭�� ���� -1 ���� 0���� ũ�ų� ������ ���� 1�� ���ҽ�Ű�� �ݺ����Դϴ�.
			
			for(j = 0 ; j < i ; j++){ // j�� 0���� i ���� 1�� ������Ű�� �ݺ����Դϴ�.
				
				if(a[j] > a[j+1]){ // a�迭�� j��°�� a �迭�� j+1��°���� ū ��츦 Ȯ���մϴ�.
					
					swap(a,j,j+1); // a�迭�� j��°���� j+1��° ���� ��ġ�� �ٲߴϴ�.
					
					System.out.printf("Pass %d = >\n", ++k); // Pass (++k) �� ����մϴ�.
					
					for(int t = 0 ; t < a.length ; t++){ // ������ ���� t�� 0���� a�迭�� ���̱��� 1�� ������Ű�� �ݺ����Դϴ�.
						System.out.print("| " + a[t] + " |"); // a�迭�� t��° ���� ����մϴ�.
					}
					
					System.out.print("\n"); //�ٹٲ��Դϴ�.
				}
			}
		}
		
		System.out.print("=========================\n"); // ""���� ���� ����� �ٹٲ� ���ݴϴ�.
	}
	
	public static void insertionSort(int[] a){ 
		// ���� ������ ���� insertionSort ���� �޼���� �Ű����� ������ �迭 a�� �޽��ϴ�.
		int i, j, k; //������ ���� i,j,k�� �����մϴ�.
		boolean move; // boolean�� move�� �����մϴ�. (������ ũ�� �񱳸� ���� ���)
		
		System.out.print("===== Insertion Sort ====\n"); // "" ���� ������ ����մϴ�.
		
		for(i = 1 ; i < a.length  ; i++){ // i�� 1���� a�迭�� ���̱��� 1�� ������Ű�� �ݺ����Դϴ�.
			k = a[i]; //k�� a�迭�� i��° ���� �ֽ��ϴ�.
			j = i; //j�� i�� �ֽ��ϴ�.
			
			if(a[j-1] > k) move = true; 
			// a�迭�� j-1��° ���� k���� Ŭ ��츦 Ȯ���մϴ�. ���� ������ move�� true �� �ֽ��ϴ�.
			
			else move = false; // �Ҹ����� move�� false�� �ֽ��ϴ�.
			
			while(move){ // move�� false ���� ���� �� ���� �ݺ��ϴ� �ݺ����Դϴ�. 
				a[j] = a[j-1]; // a�迭�� j��°�� a�迭�� j-1��° ���� �ֽ��ϴ�.
				j = j-1; //j�� j-1�� �ֽ��ϴ�.
				
				if(j > 0 && a[j-1] > k) move = true; 
				// j �� 0���� ũ�� a�迭�� j-1��° ���� k���� Ŭ ��츦 Ȯ���ϰ� ���� ������ move�� true���� �ֽ��ϴ�.
				else move = false;
				// �Ҹ����� move�� false�� �ֽ��ϴ�.
			}
			a[j] = k; //a �迭�� j��°�� k �� �ֽ��ϴ�.
			System.out.printf("Pass %d = >", i); // Pass (i) �� ����մϴ�.
			System.out.print("\n"); //�ٹٲ��Դϴ�.
			for(int t = 0; t < a.length ; t++) // ������ ���� t�� 0���� a�迭�� ���̱��� 1�� ������Ű�� �ݺ����Դϴ�.
				System.out.print("| " + a[t] + " |"); // a�迭�� t��° ���� ����մϴ�.
			System.out.print("\n"); //�ٹٲ��Դϴ�.
		}
		System.out.print("=========================="); // "" ���� ������ ����մϴ�.
	}
}
