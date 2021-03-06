
public class Heap { // Heap 클래스 입니다.
	
	private int numOfNode; // Heap 클래스 내에서만 사용가능한 정수형 변수 numOfNode 입니다.
	private int heap[]; // Heap 클래스 내에서만 사용가능한 정수형 배열 변수 heap 입니다.
	
	public Heap(int size){ // 히프의 크기를 결정하는 Heap 메서드입니다. 매개변수로 정수형 변수 size를 받습니다.
		numOfNode = 0; // numOfNode 값에 0 을 넣어줍니다.
		heap = new int[20]; // heap 배열의 크기를 20으로 지정합니다.
	}
	
	private void heapFull(){ // Heap 클래스 내에서만 사용가능한 heapFull 메서드로 히프의 크기를 증가시켜 줍니다.
		int temp[] = new int[50]; // 정수형 배열 변수 temp를 선언해주고 크기를 50으로 지정합니다. 
		for(int i = 0 ; i <= heap.length ; i++){ // 배열의 크기를 증가시켜 주기 위해 사용하는 반복문입니다.
			temp[i] = heap[i]; //temp 의 i 번째 항에 heap 의 i 번째 항을 넣어줍니다. (배열 복사)
		}
		heap = temp; // heap 에 temp 를 넣어 배열 크기를 증가키셔 줍니다.
	}
	
	public void insert(int key) // 히프에 값을 삽입하는 메서드입니다. 매개변수로 정수형 변수 key를 받습니다.
	{
		int i = ++numOfNode; // 정수형 변수 i 를 선언하고 numOfNode를 1증가시킨 값을 넣습니다.
		
		while((i != 1) && (key > heap[i/2])){ 
			// i의 값이 1 과 같아지거나 key 값이 heap의 i/2 번째 항의 값보다 작을 때 까지 반복하는 반복분입니다.
			heap[i] = heap[i/2]; // heap 배열의 i번째 에 heap 의 i/2 번째에 넣어줍니다.
			i /= 2; // i 에 i/2 의 값을 넣어줍니다.
		}
		heap[i] = key; // heap의 i번째 에 key를 넣어줍니다.
	}
	public int delete(){ // 히프의 내용을 삭제하는 메서드입니다.
		int item,temp; //정수형 변수 item 과 temp를 선언합니다.
		int i = 1, j = 2; // 정수형 변수 i 에 1 을 넣고, j에 2 를 넣어줍니다.
		item = heap[1]; // item에 heap의 1번째 내용을 넣어줍니다.
		temp = heap[numOfNode]; //temp에 heap의 numOfNode 번째 내용을 넣어줍니다.
		numOfNode -= 1; // numOfNode 에 numOfNode - 1 한 값을 넣어줍니다.
		while(j <= numOfNode){ // j 가 numOfNode 보다 커질 때 까지 반복하는 반복문입니다.
			if(j < numOfNode){ // j 가 numOfNode 보다 작은지 확인하는 조건문입니다.
				if(heap[j] < heap[j+1]) // heap 의 j번째가 heap 의 j+1 번째 항보다 작은지 확인하는 조건문입니다.
					j += 1; // j 에 j + 1 한 값을 넣어줍니다.
			}
			if(temp >= heap[j]) break; //temp 가 heap 의 j번째 큰 지 확인하는 조건문입니다.
			heap[i] = heap[j]; // heap 의 i번째에 heap 의 j번째에 넣어줍니다.
			i = j; //i 에 j를 넣어줍니다.
			j = j*2; // j 에 j*2를 넣어줍니다.
		}
		heap[i] = temp; //heap의 i번째에 temp를 넣어줍니다.
		return item; //item을 반환합니다.
	}
	public void makeTreeHeap(){ // 최대 히프를 생성하는 클래스 입니다.
		int i , p, j, temp; // 정수형 변수 i , p , j, temp 를 생성합니다.
		for(i = numOfNode ; i >= 1 ; i --){ 
			// i에 numOfNode 값을 넣어주고 i 가 1보다 크거나 같을 때 까지 i를 1씩 감소 시키는 반복문입니다.
			p = i; // p 에 i 를 넣어줍니다.
			for(j = 2*p; j<= numOfNode; j = 2*j){ 
				// j 에 2*p 값을 넣어주고 j 가 numOfNode 값보다 작거나 같을 때 까지 j에 2를 곱하는 반복문입니다. 
				if(j < numOfNode) //j가 numOfNode 값보다 작은지 확인하는 조건문입니다.
					if(heap[j] < heap[j+1]) // heap의 j번째가 heap의 j+1번째 보다 작은지 확인하는 조건문입니다.
						j += 1; // j에 j+1을 넣어줍니다.
				if(heap[p] >= heap[j]) break; 
				// heap의 p번째가 heap의 번째보다 크거나 같은지 확인하는 반복문이며 조건을 만족할 경우 반복문을 종료합니다.
				temp = heap[p]; //temp 에 heap의 p번째의 내용을 넣어줍니다.
				heap[p] = heap[j]; //heap의 p번째에 heap의 j번째의 내용을 넣어줍니다.
				heap[j] = temp; //heap의 j번째에 temp를 넣어줍니다.
				p = j; //p에 j를 넣어줍니다.
			}
		}
	}
	
	public void testInsert(int key) //삽입 test 메서드이며 매개변수로 정수형 변수 key값을 넣습니다.
	{
		if((heap.length -1) == numOfNode) //(heap 배열의 길이 - 1) 이 numOfNode의 값과 같은지 확인하는 조건문입니다.
			heapFull(); //조건을 만족하면 heapFull 메서드를 실행합니다.
		heap[++numOfNode] = key; //heap의 1 + numOfNode 번째에 key 값을 넣어줍니다.
	}
	
	public void print() // 히프를 출력하는 메서드입니다.
	{
		System.out.print("Heap Data : "); //" " 안의 내용을 출력합니다.
		for(int i = 1 ; i <= numOfNode; i++) 
			//i에 1을 넣어주고 i가 numOfNode 값보다 작거나 같을 때 까지 i를 1씩 증가시켜주는 반복문입니다.
			System.out.printf("| %2d |",heap[i]); //heap의 i번째 값을 출력합니다.
		System.out.println("\n"); //줄바꿈 해줍니다.
			
	}
}
