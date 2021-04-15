
public class Dijkstra { //�ִ� ��� ���� ���ͽ�Ʈ�� Ŭ���� �Դϴ�.
	
	private int weight[][]; //����ġ ������� �Դϴ�.
	private int numOfVertex; //������ �� �Դϴ�.
	private int dist[]; //�ִܰ�� ���Դϴ�.
	private boolean visit[]; //�湮 �ߴ��� Ȯ���ϱ����� �����Դϴ�.
	
	public Dijkstra(int w[][]) //������ �Դϴ�. �Ű������� ����ġ ���� ����� �޽��ϴ�.
	{
		numOfVertex = 5; //������ ������ 5�� �ʱ�ȭ�մϴ�.
		weight = new int[numOfVertex][numOfVertex]; //����ġ ��������� 5x5��ķ� �ʱ�ȭ�մϴ�.
		visit = new boolean[numOfVertex];// boolean�� �迭ũ�⸦ 5�� �ʱ�ȭ�մϴ�.
		dist = new int[numOfVertex]; // �ִܰ�� �迭 ���� 5�� �ʱ�ȭ�մϴ�.
		
		for(int i = 0 ; i < numOfVertex ; i++){ // i�� 0���� ������ ������ŭ 1�������ϸ鼭 �ݺ��ϴ� �ݺ����Դϴ�.
			for(int j = 0 ; j < numOfVertex ; j++){ //j�� 0���� ������ ������ŭ 1�� �����Ը鼭 �ݺ��ϴ� �ݺ����Դϴ�.
				weight[i][j] = w[i][j]; //����ġ ������Ŀ� �Ű������� ���� w ���� �ֽ��ϴ�.
			}
		}
	
	}
	public void shortesPath(int vertex) //�ִܰ�� ��� �޼����Դϴ�. 
	{
		
		for(int i = 0 ; i < numOfVertex ; i++){ // i�� 0���� ������ ������ŭ 1�������ϸ鼭 �ݺ��ϴ� �ݺ����Դϴ�.
			visit[i] = false; // �湮 �迭�� false�� �ֽ��ϴ�.
			dist[i] = weight[vertex][i]; // �ִܰ�� ���� ����ġ ��������� vertex �� i �� ���� �ֽ��ϴ�.
		}
		
		visit[vertex] = true; // �湮 �迭[vertex] �� true�� �ֽ��ϴ�.
		dist[vertex] = 0; // �ִܰ��[vertex] ���� 0�� �ֽ��ϴ�.
				
		for(int i = 0 ; i < numOfVertex-2; i++){ //i�� 0���� ������ ����-2��ŭ 1�������ϸ鼭 �ݺ��ϴ� �ݺ����Դϴ�.
			int min = 999; // ������ ���� min�� 999�� �ֽ��ϴ�. (�������� ���� ��)
			int u = 0; // ���ο� �ִ� ��θ� �����մϴ�.
			
			for(int j = 0 ; j < numOfVertex ; j++){ // j�� 0���� ������ ������ŭ 1�������ϸ鼭 �ݺ��ϴ� �ݺ����Դϴ�.
				if(!visit[j] && min>dist[j]){ // �湮���� �ʾҴ��� �׸��� dist[j]�� min���� �������ν� �������� Ȯ���ϴ� ���ǹ��Դϴ�.
					min = dist[j]; //min�� dist[j] (�ִܰ�� ��) �� �ֽ��ϴ�. 
					u = j; // u�� j�� �ֽ��ϴ�.
				}
			}
			visit[u] = true; //�湮 �迭[u] �� true �� �ֽ��ϴ�.
			
			for(int w = 0 ; w < numOfVertex ; w++){ // Ȯ���� �ȵ� ��ε鿡 ���� �ٽ� ����ϱ� ���� �ݺ����Դϴ�.
				if(!visit[w] && dist[w] > (dist[u]+weight[u][w])){ 
					//�湮���� �ʾҴ��� �׸��� Ȯ���� �ȵ� �ִܰ�� ���� ����ġ ������� �� + �ִܰ�� �� ���� ū�� Ȯ���ϴ� ���ǹ��Դϴ�.
					dist[w] = (dist[u] + weight[u][w]);
					//Ȯ���� �ȵ� �ִܰ�ο� (�ִܰ�� �� + ����ġ ������� ��) �� ���մϴ�.
				}
			}
			print(i); //print �޼��忡 i ���� �Ű������� �����ϴ�.
		}
	}
	
	private void print(int step) //�ִ� ��� ��� ������ ����ϴ� �޼����Դϴ�.
	{
		System.out.println("Step : " + (step + 1)); //�Ű������� ���� step�� 1�� ���� ���� ����մϴ�.
		System.out.println("============================= Shortest Path===================================");// ""���� ������ ����մϴ�.
		System.out.printf("%9s", "Vertex : "); // ���������� "" ������ ����մϴ�.
		for(int i = 0 ; i < numOfVertex ; i++) // i�� 0���� ������ ������ŭ 1�������ϸ鼭 �ݺ��ϴ� �ݺ����Դϴ�.
			System.out.printf("|%10d|",i); //���������� 10ĭ���� i ���� ����մϴ�.
		System.out.println(); //�ٹٲ� �Դϴ�.
		
		System.out.printf("%9s", "S : ");  //���������� "" ���� ������ ����մϴ�.
		for(int i = 0; i < numOfVertex; i++) //i�� 0���� ������ ������ŭ 1�������ϸ鼭 �ݺ��ϴ� �ݺ����Դϴ�.
			System.out.printf("|%10s|", visit[i]==true?"true":"false"); //���������� 10ĭ �� visit[i] ���� true�� "true"�� false �� "false"�� ����մϴ�.
		System.out.println(); //�ٹٲ� �Դϴ�.
		
		System.out.printf("%9s", "Dist : "); //���������� "" ���� ������ ����մϴ�.
		for(int i = 0 ; i < numOfVertex ; i++) //i�� 0���� ������ ������ŭ 1�������ϸ鼭 �ݺ��ϴ� �ݺ����Դϴ�.
			System.out.printf("|%10d|", dist[i]); //���������� 10ĭ �� dist[i] (�ִ� ��� ��)�� ����մϴ�.
		System.out.println("\n=============================================================================\n"); // "" ���� ������ ����ϰ� �ٹٲ� ���ݴϴ�.
	}
}
