import java.util.*; //���̺귯���� ����ϱ� ���� �����մϴ�.

public class AOVGraph { // ����ġ �׷��� ���� ���� Ŭ�����Դϴ�.
	
	private Queue<Integer>[] Q; // ������ ���� �ļ��ڸ� �����ϴ� ť �Դϴ�.
	private Queue<Integer> zeroPredQ; // �����ڰ� ���� �������� �����ϴ� ť �Դϴ�.
	private LinkedList<Integer> sortedList; //���� ���� ����� �����ϴ� ����Ʈ �Դϴ�.
	private int[] indegree; //������ ���� ������ �����ϴ� �迭�Դϴ�.
	private int n; //������ �� �Դϴ�.
	
	public AOVGraph(int numOfVertex) // ������ �Դϴ�.
	{
		n = numOfVertex; // ������ ���� �Ű������� ���� numOfvertex�� �ֽ��ϴ�.
		Q = new Queue[n]; //ť �迭 �Դϴ�.
		zeroPredQ = new LinkedList<>(); // zeroPredQ �� LinkedList�� �ʱ�ȭ �� �ݴϴ�.
		sortedList = new LinkedList<>(); // sortedList �� LinkedList�� �ʱ�ȭ ���ݴϴ�.
		
		for(int i = 0 ; i < n ; i++){ // ������ ���� i �� 0 ���� n ���� 1�� �����ϴ� �ݺ����Դϴ�.
			Q[i] = new LinkedList<>(); //�� Q[i] �� ���� LinkedList�� �ʱ�ȭ�մϴ�.
		}
		indegree = new int[n]; // ������ ���� ������ �����ϴ� �迭�� n���� �迭�� �ʱ�ȭ ���ݴϴ�.
	}
	public void topologicalSort() // ���� ���� �޼����Դϴ�.
	{
		int i, v, successor; // ������ ���� i, v, successor�� �����մϴ�.
		for(i = 0 ; i < n ; i++){ // ������ ���� i �� 0 ���� n ���� 1�� �����ϴ� �ݺ����Դϴ�.
			if(indegree[i] == 0) // �����ڰ� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				zeroPredQ.offer(i); // zeroPredQ�� i�� �����մϴ�.
		}
		
		if(zeroPredQ.isEmpty()){ // zeroPredQ�� ����ִ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			System.out.println("network has a cycle"); // ��������� ��¹��� ����մϴ�.
			return; // �ƹ��͵� ��ȯ���� �ʽ��ϴ�.
		}
		
		while(!zeroPredQ.isEmpty()){ // zeroPredQ�� �������� �ݺ��ϴ� �ݺ����Դϴ�.
			
			v = zeroPredQ.poll(); // v�� indegree �� 0 �� �������� ť���� �ϳ��� ������ ó���մϴ�.
			
			sortedList.add(v); // indegree �� 0�� �������� sortedList �� �������ݴϴ�.
			
			if(Q[v].isEmpty()) continue; //���� v�� �ļ��ڰ� ������ Ȯ���ϰ� ���� �� ���� �ݺ������� �ٽ� ���ư��ϴ�.
										 
			else successor = Q[v].poll(); //�ļ��ڰ� ������  �� �ļ��ڸ� successor�� �����մϴ�.
			
			while(true){ // false�� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
				indegree[successor]--; // v�� �ļ��ڰ� ������ ���������� ���ҽ�ŵ�ϴ�.
				if(indegree[successor] == 0) zeroPredQ.offer(successor); 
				// ���������� 0�� �Ǹ� zeroPredQ�� �����մϴ�.
				
				if(!Q[v].isEmpty()) successor = Q[v].poll();
				// ���� v�� �ļ��ڰ� ������ �ļ��ڸ� successor�� �����մϴ�.
				else break; // ������ while(true) �ݺ����� �����մϴ�.
			}
		} // end while
		System.out.println("Topological Order is : "); // "" ���� ������ ����մϴ�.
		
		while(!sortedList.isEmpty()) // soretedList�� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			System.out.print(sortedList.remove() + " "); // sortedList�� ���Ҹ� �����ϰ� ����մϴ�.
		System.out.println(); // �ٹٲ� �Դϴ�.
		System.out.println("End."); // "" ���� ������ ����մϴ�.
	} // end topologicalSort()
	
	public void insertEdge(int i, int j) // ���� �޼����Դϴ�. ������ ���� i�� j�� �޽��ϴ�.
	{
		Q[i].offer(j); // ���� i�� j�� �����մϴ�.
		indegree[j]++; //indegree j��° �迭�� 1 ������ŵ�ϴ�.
	}
}
