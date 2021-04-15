import java.util.*;
public class Graph {
	private GraphNode[] header; // 각 정점의 인접 리스트
	private int vertex_cnt; //정점의 개수

	public Graph(int vertex_cnt) //그래프 생성자입니다.
	{
		this.vertex_cnt = vertex_cnt; //this.vertex_cnt에 vertex_cnt를 넣어줍니다.
		this.header = new GraphNode[vertex_cnt]; 
		// this.header 에 GraphNode 형 배열에 vertex_cnt가 넣어진 값을 넣어줍니다.
		for(int i = 0 ; i < vertex_cnt ; i++){
		//정수형 변수 i 는 0부터 vertex_cnt까지 1씩증가하는 반복문입니다.	
			header[i] = new GraphNode(i); //header의 i번째에 GraphNode에 i 넣은 값을 넣습니다.
		}
	}
	
	//간선 연결 확인 메서드, 연결이 되어있으면 true 반환 아니면 false 반환
	private boolean EdgeCheck(int vertex, int target)
	{
		GraphNode gNode = header[vertex];
		// header 에 vertex 넣은 값으로 GraphNode형 gNode 객체를 생성합니다. 
		while(gNode != null){ //gNode 가 null이 될 때 까지 반복하는 반복문입니다.
			if(gNode.getNumber() == target){ //gNode 의 number가 target과 같은지 확인하는 조건문입니다.
				return true; //조건이 맞을 경우 true를 반환합니다.
			}
			gNode = gNode.getLink(); //gNode에 gNode 의 link부분을 넣어서 이어줍니다.
		}
		return false; //false를 반환합니다.
	}
	//정점끼리 간선 연결 메서드
	public void insertEdge(int vertex, int target)
	{	
		if(EdgeCheck(vertex,target)){ // 정점이 이미 연결 되어 있는지 확인합니다.
			System.out.println("The vertex " + vertex + "is connected to the vertex" + target + ".");
			// 조건을 만족하면 출력하는 출력문입니다.
		}
		int point = target; // 정수형 변수 point를 선언하고 처음 간선을 삽입할 target을 넣어줍니다.
		for(int i = 0; i < 2 ; i++){
		// 정수형 변수 i 는 0부터 2까지 1씩 증가하는 반복문입니다.	
			GraphNode gNode = new GraphNode(header[point].getNumber());
			//GraphNode형 객체 gNode를 header의 point 부분의 getNumber값을 삽입하여 생성합니다. (간선에 삽입할 것)
			GraphNode p = header[(point == target) ? vertex : target];
			//GraphNode형 p를 생성하고 point와 target이 같은지 비교해 같으면 vertex 다르면 target을 header 배열에 넣습니다.
			while(p.getLink() != null) //p의 link가 널이 될 때 까지 반복하는 반복문입니다.
				p = p.getLink(); //p에 p의 link부분을 넣습니다.
			p.setLink(gNode); //p의 setLink로 gNode를 넣습니다.
			point = vertex; //point에 vertex를 넣어서 target에 간선을 삽입합니다.
		}	
	}
	//정점과 정점의 간선 해제.
	public void deleteEdge(int vertex, int target){
		if(!(EdgeCheck(vertex,target))){ //간선이 연결되어 있는지 확인하는 조건문입니다.
			System.out.println("vertex " + vertex + "and" + target + "are not connected");
			//조건을 만족하면 간선이 없다고 출력합니다.
		}
		
		int del = target; //정수형 변수 del 을 선언하고 매개변수로 받은 target을 넣어줍니다.
		for(int i = 0 ; i < 2 ; i++){ //정수형 변수 i를 0부터 2까지 1씩 증가시키는 반복문입니다.
			GraphNode gNode = header[(del == target) ? vertex : target];
			//GraphNode형 gNode를 생성하고 del과 target이 같은지 비교해 같으면 vertex 다르면 target을 header 배열에 넣습니다.
		
			while(gNode != null){ //gNode 가 빌 때 까지 반복하는 반복문입니다.
				if(gNode.getLink() == null) break;
				//gNode의 link 부분이 없으면 반복문을 종료합니다.
				if(gNode.getLink().getNumber() == del){ //삭제할 간선을 찾았을 경우를 확인하는 조건문입니다.
					gNode.setLink(gNode.getLink().getLink()); // gNode의 link에 삭제할 간선의 link값을 넣습니다.
				}
				gNode = gNode.getLink(); //gNode 에 gNode의 link부분을 넣어서 이어줍니다.
			}
			del = vertex; //del 에 vertex값을 넣습니다.
		}
		
	}
	//정점의 간선 개수 리턴
	public int degree(int vertex){
		int count=0; //정점의 간선 개수를 반환할 정수형 변수 count를 선언해주고 0을 넣습니다.
	
		GraphNode gNode = header[vertex]; //GraphNode형 gNode를 생성하고 header[vertex]값을 넣습니다.
		gNode = gNode.getLink(); //gNode에 gNode의 link부분을 넣어서 이어줍니다.
		
		while(gNode != null){ //gNode가 빌 때 까지 반복하는 반복문입니다.
			count++; //간선 개수를 1 증가시킵니다.
			gNode = gNode.getLink(); //gNode에 gNode의 link부분을 넣어서 이어줍니다.
		}
		return count; //간선 개수를 반환합니다.
	}
	//정점의 인접 정점 배열 반환
	public int[] adjacency(int vertex){
		int[] Number = new int[degree(vertex)]; //Number 라는 정수형 배열을 생성하고 범위로 degree(vertex)를 넣어줍니다.
		GraphNode gNode  = header[vertex]; //GraphNode형 gNode를 생성하고 header[vertex] (정점) 를 넣습니다. 
		int point = 0; //정수형 변수 point를 생성하고 0을 넣습니다. (배열의 인덱스)
		
		while(gNode.getLink() != null){
		// gNode가 빌 때 까지 반복하는 반복문입니다.
			gNode = gNode.getLink(); //gNode에 gNode의 link를 넣어서 이어줍니다.
			Number[point++] = gNode.getNumber(); // 인접 정점에 gNode의 number 값을 넣습니다.
		}
		return Number; //인접 정점 배열을 반환합니다.
	}
	
	//해당 정점 기준으로 깊이 우선 탐색
	public void DFS(int vertex){
		boolean visited[] = new boolean[vertex_cnt];
		//boolean형 visited배열을 생성하고 vertex_cnt값을 넣습니다. 정점에 대해 방문하는지 체크하는 변수입니다.
		
		int visit; //정수형 변수 visit 생성
		System.out.println("\n" + vertex + "vertex start DFS"); //정점 출력 DFS시작을 알립니다.
		
		for(int i = 0 ; i < vertex_cnt ; i++){
		// 정수형 변수 i 가 0부터 vertex_cnt까지 1씩 증가하는 반복문입니다.
			visited[i] = false; //모든 정점에 대해 반문하지 않은 것으로 체크합니다.
		}
		Stack gp = new Stack(); //gp라는 스택을 생성합니다.
		gp.push(vertex); //gp 스택에 vertex 값을 넣습니다.
		
		while(!(gp.isEmpty())){ //스택이 빌 때 까지 반복하는 반복문입니다.
			visit = (int) gp.pop(); //gp 스택에 있는 정수형 값을 빼서 visit에 넣습니다.
		
			if(!(visited[visit])){ //visted배열의 visit를 방문했는지 확인합니다.
				System.out.print("| " + header[visit].getNumber() + " |");
				//header[visit]의 number를 출력합니다.
				visited[visit] = true; //true 값을 넣어서 방문한 것을 나타냅니다.
			}
			
			for(int j : adjacency(visit)){ 
			//주변 인자를 배열로 받아서 하나씩 스택에 삽입합니다.	
				if(!visited[j]) // 아직 방문하지 않은 정점을 확인하는 조건문입니다.
					gp.push(j); // gp스택에 j를 삽입합니다.
			}
		}
	}
	//해당 정점 기준으로 너비 우선 탐색
	public void BFS(int vertex){
		boolean visited[] = new boolean[vertex_cnt];
		//boolean형 visited배열을 생성하고 vertex_cnt값을 넣습니다. 정점에 대해 방문하는지 체크하는 변수입니다.
		
		System.out.println("\n" + vertex + "vertex start BFS"); //정점 출력 BFS시작을 알립니다.
		
		for(int i = 0 ; i < vertex_cnt ; i++){
		// 정수형 변수 i 가 0부터 vertex_cnt까지 1씩 증가하는 반복문입니다.
			visited[i] = false; //모든 정점에 대해 반문하지 않은 것으로 체크합니다.
		} 
		
		Queue gp = new LinkedList(); //gp라는 큐를 생성합니다.
		gp.add(vertex); // vertex를 큐에 삽입합니다.
		
		while(!(gp.isEmpty())){
		//gp가 빌 때 까지 반복하는 반복문입니다.
			int visit = (int) gp.remove(); // 정수형 변수 visit에 gp 큐에서 뺀 값을 정수값으로 넣습니다.
			if(!(visited[visit])){ //visted배열의 visit를 방문했는지 확인합니다.
				System.out.print("| " + header[visit].getNumber() + " |");
				//header배열의 visit 부분의 number을 출력합니다.
				visited[visit] = true; //true 값을 넣어서 방문한 것을 나타냅니다.
			}
			
			for(int j : adjacency(visit)){
			//주변 인자를 배열로 받아서 하나씩 스택에 삽입합니다.	
				if(!(visited[j])) // 아직 방문하지 않은 정점을 확인하는 조건문입니다.
					gp.add(j); //gp 큐에 j를 넣습니다.
			}
		}
		System.out.println(); //줄바꿈해줍니다.
	}
	//모든 정점의 인접 정점 출력
	public void display() // 간선으로 연결된 정점들을 보여주는 함수입니다.
	{
			
		for(int i = 0 ; i < vertex_cnt; i++){
		// 정수형 변수 i 가 0부터 vertex_cnt까지 1씩 증가하는 반복문입니다.	
			
			GraphNode gNode = header[i]; //GraphNode형 gNode를 생성하고 header의 i 번ㅉ 값을 넣습니다.
			System.out.print("vertex\n"); // 정점 보여주기 시작 출력문입니다.
			while(gNode != null){ //gNode 가 빌 때 까지 반복하는 반복문입니다.
				System.out.print(" | " + gNode.getNumber() + " | " ); //gNode의 number 부분을 출력합니다.
				gNode = gNode.getLink(); //gNode에 gNode의 link를 연결해줍니다.
			}
			System.out.print("\n"); //줄바꿈 출력문입니다.
		}
	}
}
