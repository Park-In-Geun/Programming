
public class Heap { // Heap Ŭ���� �Դϴ�.
	
	private int numOfNode; // Heap Ŭ���� �������� ��밡���� ������ ���� numOfNode �Դϴ�.
	private int heap[]; // Heap Ŭ���� �������� ��밡���� ������ �迭 ���� heap �Դϴ�.
	
	public Heap(int size){ // ������ ũ�⸦ �����ϴ� Heap �޼����Դϴ�. �Ű������� ������ ���� size�� �޽��ϴ�.
		numOfNode = 0; // numOfNode ���� 0 �� �־��ݴϴ�.
		heap = new int[20]; // heap �迭�� ũ�⸦ 20���� �����մϴ�.
	}
	
	private void heapFull(){ // Heap Ŭ���� �������� ��밡���� heapFull �޼���� ������ ũ�⸦ �������� �ݴϴ�.
		int temp[] = new int[50]; // ������ �迭 ���� temp�� �������ְ� ũ�⸦ 50���� �����մϴ�. 
		for(int i = 0 ; i <= heap.length ; i++){ // �迭�� ũ�⸦ �������� �ֱ� ���� ����ϴ� �ݺ����Դϴ�.
			temp[i] = heap[i]; //temp �� i ��° �׿� heap �� i ��° ���� �־��ݴϴ�. (�迭 ����)
		}
		heap = temp; // heap �� temp �� �־� �迭 ũ�⸦ ����Ű�� �ݴϴ�.
	}
	
	public void insert(int key) // ������ ���� �����ϴ� �޼����Դϴ�. �Ű������� ������ ���� key�� �޽��ϴ�.
	{
		int i = ++numOfNode; // ������ ���� i �� �����ϰ� numOfNode�� 1������Ų ���� �ֽ��ϴ�.
		
		while((i != 1) && (key > heap[i/2])){ 
			// i�� ���� 1 �� �������ų� key ���� heap�� i/2 ��° ���� ������ ���� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			heap[i] = heap[i/2]; // heap �迭�� i��° �� heap �� i/2 ��°�� �־��ݴϴ�.
			i /= 2; // i �� i/2 �� ���� �־��ݴϴ�.
		}
		heap[i] = key; // heap�� i��° �� key�� �־��ݴϴ�.
	}
	public int delete(){ // ������ ������ �����ϴ� �޼����Դϴ�.
		int item,temp; //������ ���� item �� temp�� �����մϴ�.
		int i = 1, j = 2; // ������ ���� i �� 1 �� �ְ�, j�� 2 �� �־��ݴϴ�.
		item = heap[1]; // item�� heap�� 1��° ������ �־��ݴϴ�.
		temp = heap[numOfNode]; //temp�� heap�� numOfNode ��° ������ �־��ݴϴ�.
		numOfNode -= 1; // numOfNode �� numOfNode - 1 �� ���� �־��ݴϴ�.
		while(j <= numOfNode){ // j �� numOfNode ���� Ŀ�� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			if(j < numOfNode){ // j �� numOfNode ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				if(heap[j] < heap[j+1]) // heap �� j��°�� heap �� j+1 ��° �׺��� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
					j += 1; // j �� j + 1 �� ���� �־��ݴϴ�.
			}
			if(temp >= heap[j]) break; //temp �� heap �� j��° ū �� Ȯ���ϴ� ���ǹ��Դϴ�.
			heap[i] = heap[j]; // heap �� i��°�� heap �� j��°�� �־��ݴϴ�.
			i = j; //i �� j�� �־��ݴϴ�.
			j = j*2; // j �� j*2�� �־��ݴϴ�.
		}
		heap[i] = temp; //heap�� i��°�� temp�� �־��ݴϴ�.
		return item; //item�� ��ȯ�մϴ�.
	}
	public void makeTreeHeap(){ // �ִ� ������ �����ϴ� Ŭ���� �Դϴ�.
		int i , p, j, temp; // ������ ���� i , p , j, temp �� �����մϴ�.
		for(i = numOfNode ; i >= 1 ; i --){ 
			// i�� numOfNode ���� �־��ְ� i �� 1���� ũ�ų� ���� �� ���� i�� 1�� ���� ��Ű�� �ݺ����Դϴ�.
			p = i; // p �� i �� �־��ݴϴ�.
			for(j = 2*p; j<= numOfNode; j = 2*j){ 
				// j �� 2*p ���� �־��ְ� j �� numOfNode ������ �۰ų� ���� �� ���� j�� 2�� ���ϴ� �ݺ����Դϴ�. 
				if(j < numOfNode) //j�� numOfNode ������ ������ Ȯ���ϴ� ���ǹ��Դϴ�.
					if(heap[j] < heap[j+1]) // heap�� j��°�� heap�� j+1��° ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
						j += 1; // j�� j+1�� �־��ݴϴ�.
				if(heap[p] >= heap[j]) break; 
				// heap�� p��°�� heap�� ��°���� ũ�ų� ������ Ȯ���ϴ� �ݺ����̸� ������ ������ ��� �ݺ����� �����մϴ�.
				temp = heap[p]; //temp �� heap�� p��°�� ������ �־��ݴϴ�.
				heap[p] = heap[j]; //heap�� p��°�� heap�� j��°�� ������ �־��ݴϴ�.
				heap[j] = temp; //heap�� j��°�� temp�� �־��ݴϴ�.
				p = j; //p�� j�� �־��ݴϴ�.
			}
		}
	}
	
	public void testInsert(int key) //���� test �޼����̸� �Ű������� ������ ���� key���� �ֽ��ϴ�.
	{
		if((heap.length -1) == numOfNode) //(heap �迭�� ���� - 1) �� numOfNode�� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			heapFull(); //������ �����ϸ� heapFull �޼��带 �����մϴ�.
		heap[++numOfNode] = key; //heap�� 1 + numOfNode ��°�� key ���� �־��ݴϴ�.
	}
	
	public void print() // ������ ����ϴ� �޼����Դϴ�.
	{
		System.out.print("Heap Data : "); //" " ���� ������ ����մϴ�.
		for(int i = 1 ; i <= numOfNode; i++) 
			//i�� 1�� �־��ְ� i�� numOfNode ������ �۰ų� ���� �� ���� i�� 1�� ���������ִ� �ݺ����Դϴ�.
			System.out.printf("| %2d |",heap[i]); //heap�� i��° ���� ����մϴ�.
		System.out.println("\n"); //�ٹٲ� ���ݴϴ�.
			
	}
}