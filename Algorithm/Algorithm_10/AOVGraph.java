import java.util.*; //라이브러리를 사용하기 위해 선언합니다.

public class AOVGraph { // 가중치 그래프 위상 정렬 클래스입니다.
	
	private Queue<Integer>[] Q; // 정점의 직속 후속자를 지정하는 큐 입니다.
	private Queue<Integer> zeroPredQ; // 선행자가 없는 정점들을 저장하는 큐 입니다.
	private LinkedList<Integer> sortedList; //위상 정렬 결과를 보관하는 리스트 입니다.
	private int[] indegree; //정점의 진입 차수를 저장하는 배열입니다.
	private int n; //정점의 수 입니다.
	
	public AOVGraph(int numOfVertex) // 생성자 입니다.
	{
		n = numOfVertex; // 정점의 수에 매개변수로 받은 numOfvertex를 넣습니다.
		Q = new Queue[n]; //큐 배열 입니다.
		zeroPredQ = new LinkedList<>(); // zeroPredQ 를 LinkedList로 초기화 해 줍니다.
		sortedList = new LinkedList<>(); // sortedList 를 LinkedList로 초기화 해줍니다.
		
		for(int i = 0 ; i < n ; i++){ // 정수형 변수 i 가 0 부터 n 까지 1씩 증가하는 반복문입니다.
			Q[i] = new LinkedList<>(); //각 Q[i] 에 대해 LinkedList로 초기화합니다.
		}
		indegree = new int[n]; // 정점의 진입 차수를 저장하는 배열을 n개의 배열로 초기화 해줍니다.
	}
	public void topologicalSort() // 위상 정렬 메서드입니다.
	{
		int i, v, successor; // 정수형 변수 i, v, successor을 선언합니다.
		for(i = 0 ; i < n ; i++){ // 정수형 변수 i 가 0 부터 n 까지 1씩 증가하는 반복문입니다.
			if(indegree[i] == 0) // 선행자가 없는지 확인하는 조건문입니다.
				zeroPredQ.offer(i); // zeroPredQ에 i를 삽입합니다.
		}
		
		if(zeroPredQ.isEmpty()){ // zeroPredQ가 비어있는지 확인하는 조건문입니다.
			System.out.println("network has a cycle"); // 비어있으면 출력문을 출력합니다.
			return; // 아무것도 반환하지 않습니다.
		}
		
		while(!zeroPredQ.isEmpty()){ // zeroPredQ가 빌때까지 반복하는 반복문입니다.
			
			v = zeroPredQ.poll(); // v에 indegree 가 0 인 정점들을 큐에서 하나씩 삭제해 처리합니다.
			
			sortedList.add(v); // indegree 가 0인 정점들을 sortedList 에 삽입해줍니다.
			
			if(Q[v].isEmpty()) continue; //정점 v의 후속자가 없는지 확인하고 없을 시 밖의 반복문으로 다시 돌아갑니다.
										 
			else successor = Q[v].poll(); //후속자가 있으면  그 후속자를 successor로 설정합니다.
			
			while(true){ // false가 될 때 까지 반복하는 반복문입니다.
				indegree[successor]--; // v의 후속자가 정점의 진입차수를 갑소시킵니다.
				if(indegree[successor] == 0) zeroPredQ.offer(successor); 
				// 진입차수가 0이 되면 zeroPredQ에 삽입합니다.
				
				if(!Q[v].isEmpty()) successor = Q[v].poll();
				// 정점 v의 후속자가 있으면 후속자를 successor로 설정합니다.
				else break; // 있으면 while(true) 반복문을 종료합니다.
			}
		} // end while
		System.out.println("Topological Order is : "); // "" 안의 내용을 출력합니다.
		
		while(!sortedList.isEmpty()) // soretedList가 빌 때 까지 반복하는 반복문입니다.
			System.out.print(sortedList.remove() + " "); // sortedList의 원소를 제거하고 출력합니다.
		System.out.println(); // 줄바꿈 입니다.
		System.out.println("End."); // "" 안의 내용을 출력합니다.
	} // end topologicalSort()
	
	public void insertEdge(int i, int j) // 삽입 메서드입니다. 정수형 변수 i와 j를 받습니다.
	{
		Q[i].offer(j); // 정점 i에 j를 삽입합니다.
		indegree[j]++; //indegree j번째 배열을 1 증가시킵니다.
	}
}
