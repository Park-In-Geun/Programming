
public class WG {
	
	private int numOfVertex; //정점의 개수
	private int[][] weight; //간선의 가중치
	
	//생성자
		public WG(int numOfVertex){ 
			this.numOfVertex = numOfVertex; //정점의 개수로 정의한 numOfVertex에 매개변수로 받은 numOfVertex를 넣습니다.
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
				weight[v][t] = w; //v 행 t열에 가중치 값 w를 넣습니다.
				weight[t][v] = w; //t 행 v열에 가중치 값 w를 넣습니다.
		}
		
		public Edge[] prim_MST(int vertex) //최소 비용 신장 트리 prim_MST 입니다. 
		{
			Edge[] T = new Edge[numOfVertex-1]; //Edge[] 형 객체 T를 생성하고 numOfVertex-1 을 받습니다. ( 최송 비용 신장 트리 생성)
			UnionFind uf = new UnionFind(numOfVertex); //UnionFind 형 객체 uf 를 생성하고 numOfVertex를 받습니다.
			
			for(int i = 0; i < numOfVertex-1 ; i++){ // 정수형 변수 i 가 0 부터 정점의개수 만큼 1씩 증가하며 반복하는 반복문입니다.
				for(int j = 0 ; j < numOfVertex-1 ; j++){ // 정수형 변수 j 가 0 부터 정점의 개수 만큼  1씩 증가하며 반복하는 반복문입니다.
						if(weight[i][j] != 0 && weight[i][j] != 999){ //자기 자신이 아니며 간선이 연결되어 있는지 확인하는 조건문입니다.
							T[i] = new Edge(i,weight[i][j],j); //최소 비용 신장 트리에 가중치 값을 넣습니다.
							if(uf.find(T[i].vertex, T[i].target)){ // 같은 집합에 속해있는지 확인하는 조건문입니다.
								continue; //조건이 맞을 경우 다시 반복문으로 돌아갑니다.
							}
							uf.union(T[i].vertex, T[i].target); //연결된 두 간선을 집합으로 만듭니다.
							
						}	
					}
				}	
			return T; //T를 반환합니다.
		}
		
		public void print()
		{
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
