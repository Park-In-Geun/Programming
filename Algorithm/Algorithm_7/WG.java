

public class WG { // ����ġ �׷��� Ŭ�����Դϴ�.
	private int numOfVertex; //������ ����
	private int numOfEdge; //������ ����
	private int[][] weight; //������ ����ġ
	
	//������
	public WG(int numOfVertex){ 
		this.numOfVertex = numOfVertex; //������ ������ ������ numOfVertex�� �Ű������� ���� numOfVertex�� �ֽ��ϴ�.
		this.numOfEdge = 0; //������ ������ ������ numOfEdge�� 0 �� �ֽ��ϴ�.
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
			numOfEdge++; //������ ������ 1 ������ŵ�ϴ�.
		weight[v][t] = w; //v �� t���� ����ġ �� w�� �ֽ��ϴ�.
		weight[t][v] = w; //t �� v���� ����ġ �� w�� �ֽ��ϴ�.
	}
	//kruskal algorithm
	public Edge[] kruskal_MST(){ 
		Edge[] T = new Edge[numOfVertex]; //Edge �� ��ü T�� �����ϰ� �Ű������� numOfVertex�� �ݴϴ�.
		int et = -1; //������ ���� et�� -1�� �����մϴ�.
		MinHeap edgeList = new MinHeap(); //Minheap �� ��ü edgeList�� �����մϴ�. 
		for(int i = 0 ; i < numOfVertex ; i++){ // ������ ���� i�� 1���� ������ ������ŭ 1�� �����ϴ� �ݺ����Դϴ�.
			for(int j = i+1; j < numOfVertex ; j++){ //������ ���� j�� j+1 ���� �����ǰ��� ��ŭ 1�� �����ϴ� �ݺ����Դϴ�.
				if(weight[i][j] != 999) // ���� ���� ���� ������ �ִ��� Ȯ���մϴ�.
					edgeList.insert(new Edge(i,weight[i][j],j)); //������ ������ ��� edgeList�� Edge�� i�� ����ġ���� j ���� �����մϴ�.
			}
		}
		
		UnionFind uf = new UnionFind(numOfVertex); //UnionFind �� ��ü�� �����ϰ� �Ű������� numOfVertex�� �ݴϴ�.
		
		while(et < numOfVertex-1 && edgeList.numberElements() > 0 ) // et�� �����ǰ��� -1 ���� Ŀ���ų� edgeList�� numberElements �޼��尡 0���� �۾��� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
		{
			Edge edge = (Edge) (edgeList.delete()); //Egde�� ��ü edge�� �����ϰ� edgeList���� ������ ������ �ֽ��ϴ�.
			for(int i = 0 ; i < numOfVertex ; i++){// ������ i �� 0���� ������ ���� ��ŭ 1�� ������Ű�� �ݺ����Դϴ�.
				for(int j = 0 ; j < numOfVertex ; j++){ //������ j�� 0���� ������ ���� ��ŭ 1�� ������Ű�� �ݺ����Դϴ�.
					if(!(uf.find(i, j))){ // uf�� ��ü�� i,j�� �־ false���� Ȯ���ϴ� ���ǹ��Դϴ�.
						edgeList.insert(new Edge(i,weight[i][j],j)); //edgeList�� Edge�� ���� i, ����ġ, j�� �����մϴ�.
						
					}
				}
			}
			
		}
		return ; 
	}

	//Edge print
	public void printEdge(){
		for(int i = 0 ; i < numOfVertex ; i++){ //������ ���� i�� 0���� ������ ���� ��ŭ 1�� ������Ű�� �ݺ����Դϴ�. 
			for(int j = i ; j < numOfVertex ; j++){ //������ ���� j�� i���� ������ ���� ��ŭ 1�� ������Ű�� �ݺ����Դϴ�. 
				if(weight[i][j] != 999 && weight[i][j]!=0) // �ڱ� �ڽ��� ��ġ �׸��� ���� ���� ���� ������ �ƴ� ��츦 Ȯ���ϴ� ���ǹ��Դϴ�.
					System.out.print("[ " + i + "-- " + weight[i][j] + "-->" + j + "]\n"); //������ ����� �׷��� ���� ����մϴ�.
			}
		}
	}
	
	//Graph print
	public void print(){
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
