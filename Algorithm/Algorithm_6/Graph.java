import java.util.*;
public class Graph {
	private GraphNode[] header; // �� ������ ���� ����Ʈ
	private int vertex_cnt; //������ ����

	public Graph(int vertex_cnt) //�׷��� �������Դϴ�.
	{
		this.vertex_cnt = vertex_cnt; //this.vertex_cnt�� vertex_cnt�� �־��ݴϴ�.
		this.header = new GraphNode[vertex_cnt]; 
		// this.header �� GraphNode �� �迭�� vertex_cnt�� �־��� ���� �־��ݴϴ�.
		for(int i = 0 ; i < vertex_cnt ; i++){
		//������ ���� i �� 0���� vertex_cnt���� 1�������ϴ� �ݺ����Դϴ�.	
			header[i] = new GraphNode(i); //header�� i��°�� GraphNode�� i ���� ���� �ֽ��ϴ�.
		}
	}
	
	//���� ���� Ȯ�� �޼���, ������ �Ǿ������� true ��ȯ �ƴϸ� false ��ȯ
	private boolean EdgeCheck(int vertex, int target)
	{
		GraphNode gNode = header[vertex];
		// header �� vertex ���� ������ GraphNode�� gNode ��ü�� �����մϴ�. 
		while(gNode != null){ //gNode �� null�� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			if(gNode.getNumber() == target){ //gNode �� number�� target�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				return true; //������ ���� ��� true�� ��ȯ�մϴ�.
			}
			gNode = gNode.getLink(); //gNode�� gNode �� link�κ��� �־ �̾��ݴϴ�.
		}
		return false; //false�� ��ȯ�մϴ�.
	}
	//�������� ���� ���� �޼���
	public void insertEdge(int vertex, int target)
	{	
		if(EdgeCheck(vertex,target)){ // ������ �̹� ���� �Ǿ� �ִ��� Ȯ���մϴ�.
			System.out.println("The vertex " + vertex + "is connected to the vertex" + target + ".");
			// ������ �����ϸ� ����ϴ� ��¹��Դϴ�.
		}
		int point = target; // ������ ���� point�� �����ϰ� ó�� ������ ������ target�� �־��ݴϴ�.
		for(int i = 0; i < 2 ; i++){
		// ������ ���� i �� 0���� 2���� 1�� �����ϴ� �ݺ����Դϴ�.	
			GraphNode gNode = new GraphNode(header[point].getNumber());
			//GraphNode�� ��ü gNode�� header�� point �κ��� getNumber���� �����Ͽ� �����մϴ�. (������ ������ ��)
			GraphNode p = header[(point == target) ? vertex : target];
			//GraphNode�� p�� �����ϰ� point�� target�� ������ ���� ������ vertex �ٸ��� target�� header �迭�� �ֽ��ϴ�.
			while(p.getLink() != null) //p�� link�� ���� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
				p = p.getLink(); //p�� p�� link�κ��� �ֽ��ϴ�.
			p.setLink(gNode); //p�� setLink�� gNode�� �ֽ��ϴ�.
			point = vertex; //point�� vertex�� �־ target�� ������ �����մϴ�.
		}	
	}
	//������ ������ ���� ����.
	public void deleteEdge(int vertex, int target){
		if(!(EdgeCheck(vertex,target))){ //������ ����Ǿ� �ִ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			System.out.println("vertex " + vertex + "and" + target + "are not connected");
			//������ �����ϸ� ������ ���ٰ� ����մϴ�.
		}
		
		int del = target; //������ ���� del �� �����ϰ� �Ű������� ���� target�� �־��ݴϴ�.
		for(int i = 0 ; i < 2 ; i++){ //������ ���� i�� 0���� 2���� 1�� ������Ű�� �ݺ����Դϴ�.
			GraphNode gNode = header[(del == target) ? vertex : target];
			//GraphNode�� gNode�� �����ϰ� del�� target�� ������ ���� ������ vertex �ٸ��� target�� header �迭�� �ֽ��ϴ�.
		
			while(gNode != null){ //gNode �� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
				if(gNode.getLink() == null) break;
				//gNode�� link �κ��� ������ �ݺ����� �����մϴ�.
				if(gNode.getLink().getNumber() == del){ //������ ������ ã���� ��츦 Ȯ���ϴ� ���ǹ��Դϴ�.
					gNode.setLink(gNode.getLink().getLink()); // gNode�� link�� ������ ������ link���� �ֽ��ϴ�.
				}
				gNode = gNode.getLink(); //gNode �� gNode�� link�κ��� �־ �̾��ݴϴ�.
			}
			del = vertex; //del �� vertex���� �ֽ��ϴ�.
		}
		
	}
	//������ ���� ���� ����
	public int degree(int vertex){
		int count=0; //������ ���� ������ ��ȯ�� ������ ���� count�� �������ְ� 0�� �ֽ��ϴ�.
	
		GraphNode gNode = header[vertex]; //GraphNode�� gNode�� �����ϰ� header[vertex]���� �ֽ��ϴ�.
		gNode = gNode.getLink(); //gNode�� gNode�� link�κ��� �־ �̾��ݴϴ�.
		
		while(gNode != null){ //gNode�� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			count++; //���� ������ 1 ������ŵ�ϴ�.
			gNode = gNode.getLink(); //gNode�� gNode�� link�κ��� �־ �̾��ݴϴ�.
		}
		return count; //���� ������ ��ȯ�մϴ�.
	}
	//������ ���� ���� �迭 ��ȯ
	public int[] adjacency(int vertex){
		int[] Number = new int[degree(vertex)]; //Number ��� ������ �迭�� �����ϰ� ������ degree(vertex)�� �־��ݴϴ�.
		GraphNode gNode  = header[vertex]; //GraphNode�� gNode�� �����ϰ� header[vertex] (����) �� �ֽ��ϴ�. 
		int point = 0; //������ ���� point�� �����ϰ� 0�� �ֽ��ϴ�. (�迭�� �ε���)
		
		while(gNode.getLink() != null){
		// gNode�� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			gNode = gNode.getLink(); //gNode�� gNode�� link�� �־ �̾��ݴϴ�.
			Number[point++] = gNode.getNumber(); // ���� ������ gNode�� number ���� �ֽ��ϴ�.
		}
		return Number; //���� ���� �迭�� ��ȯ�մϴ�.
	}
	
	//�ش� ���� �������� ���� �켱 Ž��
	public void DFS(int vertex){
		boolean visited[] = new boolean[vertex_cnt];
		//boolean�� visited�迭�� �����ϰ� vertex_cnt���� �ֽ��ϴ�. ������ ���� �湮�ϴ��� üũ�ϴ� �����Դϴ�.
		
		int visit; //������ ���� visit ����
		System.out.println("\n" + vertex + "vertex start DFS"); //���� ��� DFS������ �˸��ϴ�.
		
		for(int i = 0 ; i < vertex_cnt ; i++){
		// ������ ���� i �� 0���� vertex_cnt���� 1�� �����ϴ� �ݺ����Դϴ�.
			visited[i] = false; //��� ������ ���� �ݹ����� ���� ������ üũ�մϴ�.
		}
		Stack gp = new Stack(); //gp��� ������ �����մϴ�.
		gp.push(vertex); //gp ���ÿ� vertex ���� �ֽ��ϴ�.
		
		while(!(gp.isEmpty())){ //������ �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			visit = (int) gp.pop(); //gp ���ÿ� �ִ� ������ ���� ���� visit�� �ֽ��ϴ�.
		
			if(!(visited[visit])){ //visted�迭�� visit�� �湮�ߴ��� Ȯ���մϴ�.
				System.out.print("| " + header[visit].getNumber() + " |");
				//header[visit]�� number�� ����մϴ�.
				visited[visit] = true; //true ���� �־ �湮�� ���� ��Ÿ���ϴ�.
			}
			
			for(int j : adjacency(visit)){ 
			//�ֺ� ���ڸ� �迭�� �޾Ƽ� �ϳ��� ���ÿ� �����մϴ�.	
				if(!visited[j]) // ���� �湮���� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
					gp.push(j); // gp���ÿ� j�� �����մϴ�.
			}
		}
	}
	//�ش� ���� �������� �ʺ� �켱 Ž��
	public void BFS(int vertex){
		boolean visited[] = new boolean[vertex_cnt];
		//boolean�� visited�迭�� �����ϰ� vertex_cnt���� �ֽ��ϴ�. ������ ���� �湮�ϴ��� üũ�ϴ� �����Դϴ�.
		
		System.out.println("\n" + vertex + "vertex start BFS"); //���� ��� BFS������ �˸��ϴ�.
		
		for(int i = 0 ; i < vertex_cnt ; i++){
		// ������ ���� i �� 0���� vertex_cnt���� 1�� �����ϴ� �ݺ����Դϴ�.
			visited[i] = false; //��� ������ ���� �ݹ����� ���� ������ üũ�մϴ�.
		} 
		
		Queue gp = new LinkedList(); //gp��� ť�� �����մϴ�.
		gp.add(vertex); // vertex�� ť�� �����մϴ�.
		
		while(!(gp.isEmpty())){
		//gp�� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			int visit = (int) gp.remove(); // ������ ���� visit�� gp ť���� �� ���� ���������� �ֽ��ϴ�.
			if(!(visited[visit])){ //visted�迭�� visit�� �湮�ߴ��� Ȯ���մϴ�.
				System.out.print("| " + header[visit].getNumber() + " |");
				//header�迭�� visit �κ��� number�� ����մϴ�.
				visited[visit] = true; //true ���� �־ �湮�� ���� ��Ÿ���ϴ�.
			}
			
			for(int j : adjacency(visit)){
			//�ֺ� ���ڸ� �迭�� �޾Ƽ� �ϳ��� ���ÿ� �����մϴ�.	
				if(!(visited[j])) // ���� �湮���� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
					gp.add(j); //gp ť�� j�� �ֽ��ϴ�.
			}
		}
		System.out.println(); //�ٹٲ����ݴϴ�.
	}
	//��� ������ ���� ���� ���
	public void display() // �������� ����� �������� �����ִ� �Լ��Դϴ�.
	{
			
		for(int i = 0 ; i < vertex_cnt; i++){
		// ������ ���� i �� 0���� vertex_cnt���� 1�� �����ϴ� �ݺ����Դϴ�.	
			
			GraphNode gNode = header[i]; //GraphNode�� gNode�� �����ϰ� header�� i ���� ���� �ֽ��ϴ�.
			System.out.print("vertex\n"); // ���� �����ֱ� ���� ��¹��Դϴ�.
			while(gNode != null){ //gNode �� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
				System.out.print(" | " + gNode.getNumber() + " | " ); //gNode�� number �κ��� ����մϴ�.
				gNode = gNode.getLink(); //gNode�� gNode�� link�� �������ݴϴ�.
			}
			System.out.print("\n"); //�ٹٲ� ��¹��Դϴ�.
		}
	}
}
