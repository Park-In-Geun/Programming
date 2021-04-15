
public class Dijkstra { //최단 경로 설정 다익스트라 클래스 입니다.
	
	private int weight[][]; //가중치 인접행렬 입니다.
	private int numOfVertex; //정점의 수 입니다.
	private int dist[]; //최단경로 값입니다.
	private boolean visit[]; //방문 했는지 확인하기위한 변수입니다.
	
	public Dijkstra(int w[][]) //생성자 입니다. 매개변수로 가중치 인접 행렬을 받습니다.
	{
		numOfVertex = 5; //정점의 개수를 5로 초기화합니다.
		weight = new int[numOfVertex][numOfVertex]; //가중치 인접행렬을 5x5행렬로 초기화합니다.
		visit = new boolean[numOfVertex];// boolean형 배열크기를 5로 초기화합니다.
		dist = new int[numOfVertex]; // 최단경로 배열 값을 5로 초기화합니다.
		
		for(int i = 0 ; i < numOfVertex ; i++){ // i가 0부터 정점의 개수만큼 1씩증가하면서 반복하는 반복문입니다.
			for(int j = 0 ; j < numOfVertex ; j++){ //j가 0부터 정점의 개수만큼 1씩 증가함면서 반복하는 반복문입니다.
				weight[i][j] = w[i][j]; //가중치 인접행렬에 매개변수로 받은 w 값을 넣습니다.
			}
		}
	
	}
	public void shortesPath(int vertex) //최단경로 계산 메서드입니다. 
	{
		
		for(int i = 0 ; i < numOfVertex ; i++){ // i가 0부터 정점의 개수만큼 1씩증가하면서 반복하는 반복문입니다.
			visit[i] = false; // 방문 배열에 false를 넣습니다.
			dist[i] = weight[vertex][i]; // 최단경로 값에 가중치 인접행렬의 vertex 행 i 열 값을 넣습니다.
		}
		
		visit[vertex] = true; // 방문 배열[vertex] 에 true를 넣습니다.
		dist[vertex] = 0; // 최단경로[vertex] 값에 0을 넣습니다.
				
		for(int i = 0 ; i < numOfVertex-2; i++){ //i가 0부터 정점의 개수-2만큼 1씩증가하면서 반복하는 반복문입니다.
			int min = 999; // 정수형 변수 min에 999를 넣습니다. (인접하지 않은 값)
			int u = 0; // 새로운 최단 경로를 선정합니다.
			
			for(int j = 0 ; j < numOfVertex ; j++){ // j가 0부터 정점의 개수만큼 1씩증가하면서 반복하는 반복문입니다.
				if(!visit[j] && min>dist[j]){ // 방문하지 않았는지 그리고 dist[j]가 min보다 작음으로써 인접한지 확인하는 조건문입니다.
					min = dist[j]; //min에 dist[j] (최단경로 값) 을 넣습니다. 
					u = j; // u에 j를 넣습니다.
				}
			}
			visit[u] = true; //방문 배열[u] 에 true 를 넣습니다.
			
			for(int w = 0 ; w < numOfVertex ; w++){ // 확정이 안된 경로들에 대해 다시 계산하기 위한 반복문입니다.
				if(!visit[w] && dist[w] > (dist[u]+weight[u][w])){ 
					//방문하지 않았는지 그리고 확정이 안된 최단경로 값이 가중치 인접행렬 값 + 최단경로 값 보다 큰지 확인하는 조건문입니다.
					dist[w] = (dist[u] + weight[u][w]);
					//확정이 안된 최단경로에 (최단경로 값 + 가중치 인접행렬 값) 을 더합니다.
				}
			}
			print(i); //print 메서드에 i 값을 매개변수로 보냅니다.
		}
	}
	
	private void print(int step) //최단 경로 곤련 값들을 출력하는 메서드입니다.
	{
		System.out.println("Step : " + (step + 1)); //매개변수로 받은 step에 1을 더한 값을 출력합니다.
		System.out.println("============================= Shortest Path===================================");// ""안의 내용을 출력합니다.
		System.out.printf("%9s", "Vertex : "); // 문자형으로 "" 내용을 출력합니다.
		for(int i = 0 ; i < numOfVertex ; i++) // i가 0부터 정점의 개수만큼 1씩증가하면서 반복하는 반복문입니다.
			System.out.printf("|%10d|",i); //정수형으로 10칸띄우고 i 값을 출력합니다.
		System.out.println(); //줄바꿈 입니다.
		
		System.out.printf("%9s", "S : ");  //문자형으로 "" 안의 내용을 출력합니다.
		for(int i = 0; i < numOfVertex; i++) //i가 0부터 정점의 개수만큼 1씩증가하면서 반복하는 반복문입니다.
			System.out.printf("|%10s|", visit[i]==true?"true":"false"); //문자형으로 10칸 띄어서 visit[i] 값이 true면 "true"를 false 면 "false"를 출력합니다.
		System.out.println(); //줄바꿈 입니다.
		
		System.out.printf("%9s", "Dist : "); //문자형으로 "" 안의 내용을 출력합니다.
		for(int i = 0 ; i < numOfVertex ; i++) //i가 0부터 정점의 개수만큼 1씩증가하면서 반복하는 반복문입니다.
			System.out.printf("|%10d|", dist[i]); //정수형으로 10칸 띄어서 dist[i] (최단 경로 값)을 출력합니다.
		System.out.println("\n=============================================================================\n"); // "" 안의 내용을 출력하고 줄바꿈 해줍니다.
	}
}
