

public class WG { // 가중치 그래프 클래스입니다.
	private int numOfVertex; //정점의 개수
	private int numOfEdge; //간선의 개수
	private int[][] weight; //간선의 가중치
	
	//생성자
	public WG(int numOfVertex){ 
		this.numOfVertex = numOfVertex; //정점의 개수로 정의한 numOfVertex에 매개변수로 받은 numOfVertex를 넣습니다.
		this.numOfEdge = 0; //간선의 개수로 정의한 numOfEdge에 0 을 넣습니다.
		weight = new int[this.numOfVertex][this.numOfVertex]; //간선의 가중치를 [this.numOfVertex][this.numOfVertex] 2차원 배열에 저장합니다.
		
		for(int i = 0; i < this.numOfVertex; i++){ // 정수형 변수 i 가 0 부터 정점의개수 만큼 1씩 증가하며 반복하는 반복문입니다.
			for(int j = 0 ; j < this.numOfVertex; j++){ // 정수형 변수 j 가 0 부터 정점의 개수 만큼  1씩 증가하며 반복하는 반복문입니다.
				if(i == j) // i와 j가 같은지 확인하는 조건문입니다.
					weight[i][j] = 0; // 자기 자신의 위치면 0을 나타냅니다.
				else //조건을 불만족시 실행합니다.
					weight[i][j] = 999; // 연결 되지 않는 간선의 가중치를 999로 지정합니다.
			}
		}
	}
	
	//간선 삽입 매개변수로 정수형 변수 v, w ,t 를 받으며 이 때 v w는 가중치입니다.
	public void insertEdge(int v, int w, int t){
		
		if(weight[v][t] == 999) // 가중치가 999, 즉 간선이 연결 되지 않았는지 확인합니다.
			numOfEdge++; //간선의 개수를 1 증가시킵니다.
		weight[v][t] = w; //v 행 t열에 가중치 값 w를 넣습니다.
		weight[t][v] = w; //t 행 v열에 가중치 값 w를 넣습니다.
	}
	//kruskal algorithm
	public Edge[] kruskal_MST(){ 
		Edge[] T = new Edge[numOfVertex]; //Edge 형 객체 T룰 선언하고 매개변수로 numOfVertex를 줍니다.
		int et = -1; //정수형 변수 et를 -1로 선언합니다.
		MinHeap edgeList = new MinHeap(); //Minheap 형 객체 edgeList를 생성합니다. 
		for(int i = 0 ; i < numOfVertex ; i++){ // 정수형 변수 i는 1부터 정점의 개수만큼 1씩 증가하는 반복문입니다.
			for(int j = i+1; j < numOfVertex ; j++){ //정수형 변수 j는 j+1 부터 정점의개수 만큼 1씩 증가하는 반복문입니다.
				if(weight[i][j] != 999) // 연결 되지 않은 간선이 있는지 확인합니다.
					edgeList.insert(new Edge(i,weight[i][j],j)); //조건을 만족할 경우 edgeList에 Edge에 i와 가중치값과 j 값을 삽입합니다.
			}
		}
		
		UnionFind uf = new UnionFind(numOfVertex); //UnionFind 형 객체를 생성하고 매개변수로 numOfVertex를 줍니다.
		
		while(et < numOfVertex-1 && edgeList.numberElements() > 0 ) // et가 정점의개수 -1 보다 커지거나 edgeList의 numberElements 메서드가 0보다 작아질 때 까지 반복하는 반복문입니다.
		{
			Edge edge = (Edge) (edgeList.delete()); //Egde형 객체 edge를 생성하고 edgeList에서 삭제한 내용을 넣습니다.
			for(int i = 0 ; i < numOfVertex ; i++){// 정수형 i 가 0부터 정점의 개수 만큼 1씩 증가시키는 반복문입니다.
				for(int j = 0 ; j < numOfVertex ; j++){ //정수형 j가 0부터 정점의 개수 만큼 1씩 증가시키는 반복문입니다.
					if(!(uf.find(i, j))){ // uf의 객체에 i,j를 넣어서 false인지 확인하는 조건문입니다.
						edgeList.insert(new Edge(i,weight[i][j],j)); //edgeList에 Edge형 으로 i, 가중치, j를 삽입합니다.
						
					}
				}
			}
			
		}
		return ; 
	}

	//Edge print
	public void printEdge(){
		for(int i = 0 ; i < numOfVertex ; i++){ //정수형 변수 i가 0부터 정점의 개수 만큼 1씩 증가시키는 반복문입니다. 
			for(int j = i ; j < numOfVertex ; j++){ //정수형 변수 j가 i부터 정점의 개수 만큼 1씩 증가시키는 반복문입니다. 
				if(weight[i][j] != 999 && weight[i][j]!=0) // 자기 자신의 위치 그리고 연결 되지 않은 간선이 아닐 경우를 확인하는 조건문입니다.
					System.out.print("[ " + i + "-- " + weight[i][j] + "-->" + j + "]\n"); //조건이 연결된 그래프 값을 출력합니다.
			}
		}
	}
	
	//Graph print
	public void print(){
		for(int i = 0 ; i < numOfVertex ; i ++){ // 정수형 변수 i가 0부터 정점의 개수 만큼 1씩 증사시키는 반복문입니다.
			for(int j = 0; j < numOfVertex ; j++){ //정수형 변수 j가 0부터 정점의 개수 만큼 1씩 증가시키는 반복문입니다.
				if(weight[i][j] == 0){ // 자기 자신의 위치일 경우를 확인합니다.
					System.out.print("|  " + weight[i][j] + "|"); //조건이 맞을 경우 0을 출력합니다.
				}
				else if(weight[i][j] == 999){ // 간선이 연결 되지 않은 경우를 확인합니다.
					System.out.print("|" + weight[i][j] + "|");	 // 조건이 맞을 경우 999를 출력합니다.
				}
				else //위의 두 경우가 모두 해당하지 않을 때 실행합니다.
					System.out.print("|  " + weight[i][j] + "|"); // 해당 가중치 값을 출력합니다.
			}
			System.out.println(); //줄바꿈 합니다.
		}
	}
	
}
