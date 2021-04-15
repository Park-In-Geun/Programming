
public class WG {
	
	private int numOfVertex; //������ ����
	private int[][] weight; //������ ����ġ
	
	//������
		public WG(int numOfVertex){ 
			this.numOfVertex = numOfVertex; //������ ������ ������ numOfVertex�� �Ű������� ���� numOfVertex�� �ֽ��ϴ�.
			weight = new int[this.numOfVertex][this.numOfVertex]; //������ ����ġ�� [this.numOfVertex][this.numOfVertex] 2���� �迭�� �����մϴ�.
			
			for(int i = 0; i < this.numOfVertex; i++){ // ������ ���� i �� 0 ���� �����ǰ��� ��ŭ 1�� �����ϸ� �ݺ��ϴ� �ݺ����Դϴ�.
				for(int j = 0 ; j < this.numOfVertex; j++){ // ������ ���� j �� 0 ���� ������ ���� ��ŭ  1�� �����ϸ� �ݺ��ϴ� �ݺ����Դϴ�.
					if(i == j) // i�� j�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
						weight[i][j] = 0; // �ڱ� �ڽ��� ��ġ�� 0�� ��Ÿ���ϴ�.
					else //������ �Ҹ����� �����մϴ�.
						weight[i][j] = 999; // ���� ���� �ʴ� ������ ����ġ�� 999�� �����մϴ�.
				}
			}			
		}
		//���� ���� �Ű������� ������ ���� v, w ,t �� ������ �� �� v w�� ����ġ�Դϴ�.
		public void insertEdge(int v, int w, int t){
			
			if(weight[v][t] == 999) // ����ġ�� 999, �� ������ ���� ���� �ʾҴ��� Ȯ���մϴ�.
				weight[v][t] = w; //v �� t���� ����ġ �� w�� �ֽ��ϴ�.
				weight[t][v] = w; //t �� v���� ����ġ �� w�� �ֽ��ϴ�.
		}
		
		public Edge[] prim_MST(int vertex) //�ּ� ��� ���� Ʈ�� prim_MST �Դϴ�. 
		{
			Edge[] T = new Edge[numOfVertex-1]; //Edge[] �� ��ü T�� �����ϰ� numOfVertex-1 �� �޽��ϴ�. ( �ּ� ��� ���� Ʈ�� ����)
			UnionFind uf = new UnionFind(numOfVertex); //UnionFind �� ��ü uf �� �����ϰ� numOfVertex�� �޽��ϴ�.
			
			for(int i = 0; i < numOfVertex-1 ; i++){ // ������ ���� i �� 0 ���� �����ǰ��� ��ŭ 1�� �����ϸ� �ݺ��ϴ� �ݺ����Դϴ�.
				for(int j = 0 ; j < numOfVertex-1 ; j++){ // ������ ���� j �� 0 ���� ������ ���� ��ŭ  1�� �����ϸ� �ݺ��ϴ� �ݺ����Դϴ�.
						if(weight[i][j] != 0 && weight[i][j] != 999){ //�ڱ� �ڽ��� �ƴϸ� ������ ����Ǿ� �ִ��� Ȯ���ϴ� ���ǹ��Դϴ�.
							T[i] = new Edge(i,weight[i][j],j); //�ּ� ��� ���� Ʈ���� ����ġ ���� �ֽ��ϴ�.
							if(uf.find(T[i].vertex, T[i].target)){ // ���� ���տ� �����ִ��� Ȯ���ϴ� ���ǹ��Դϴ�.
								continue; //������ ���� ��� �ٽ� �ݺ������� ���ư��ϴ�.
							}
							uf.union(T[i].vertex, T[i].target); //����� �� ������ �������� ����ϴ�.
							
						}	
					}
				}	
			return T; //T�� ��ȯ�մϴ�.
		}
		
		public void print()
		{
			for(int i = 0 ; i < numOfVertex ; i ++){ // ������ ���� i�� 0���� ������ ���� ��ŭ 1�� �����Ű�� �ݺ����Դϴ�.
				for(int j = 0; j < numOfVertex ; j++){ //������ ���� j�� 0���� ������ ���� ��ŭ 1�� ������Ű�� �ݺ����Դϴ�.
					if(weight[i][j] == 0){ // �ڱ� �ڽ��� ��ġ�� ��츦 Ȯ���մϴ�.
						System.out.print("|  " + weight[i][j] + "|"); //������ ���� ��� 0�� ����մϴ�.
					}
					else if(weight[i][j] == 999){ // ������ ���� ���� ���� ��츦 Ȯ���մϴ�.
						System.out.print("|" + weight[i][j] + "|");	 // ������ ���� ��� 999�� ����մϴ�.
					}
					else //���� �� ��찡 ��� �ش����� ���� �� �����մϴ�.
						System.out.print("|  " + weight[i][j] + "|"); // �ش� ����ġ ���� ����մϴ�.
				}
				System.out.println(); //�ٹٲ� �մϴ�.
			}	
		}
}
