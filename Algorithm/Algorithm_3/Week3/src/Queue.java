public class Queue //���� ��ȸ���� ����� Queue Ŭ���� �Դϴ�.
{
	private Node front; //QueueŬ������������ ��밡���� Node�� front�� �����մϴ�. 
	private Node rear; //QueueŬ������������ ��밡���� Node�� rear�� �����մϴ�.
	private int count; //QueueŬ������������ ��밡���� int�� count�� �����մϴ�.
	
	public Queue() //������ �Դϴ�.
	{
		front = null; //front�� null���� �־��ݴϴ�.
		rear  = null; //rear�� null���� �־��ݴϴ�.
		count = 0; //count�� 0�� �־��ݴϴ�.
	}
	public boolean isEmpty() //boolean�� isEmpty()�޼��� �Դϴ�. ť�� ����ִ��� Ȯ���ϱ� ���� �޼����Դϴ�.
	{
		return count == 0; //count�� 0�� �������� ��ȯ���ݴϴ�.
	}
	public void enqueue(TreeNode data) //ť�� ���Ҹ� �����ϴ� enqueue �޼����Դϴ�. TreeNode�� data�� ���Ե˴ϴ�.
	{
		Node node = new Node(data); //data���� ���� Node�� node��ü�� �����մϴ�.
		if(count == 0) //count�� 0�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			front = rear = node; //������ ���� ��� front �� rear�� rear�� node���� �־��ݴϴ�.
		else //���ǰ� �ٸ� ���
		{
			rear.setLink(node); //rear.setLink�� node�� �ֽ��ϴ�.
			rear = node; //rear�� node�� �ֽ��ϴ�.
		}
		count++; //count�� 1 ���������ݴϴ�.
	}
	public TreeNode dequeue() //TreeNode�� �޼��� dequeue�� ť�� ���Ҹ� �� ó�� �� ���� �����ϴ�.
	{
		if(count == 0) //count���� 0�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			return null; //������ ������� null�� ��ȯ���ݴϴ�.
		TreeNode data = front.getNode(); //TreeNode�� ��ü data�� ������ front.getNode���� �־��ݴϴ�.
		front = front.getLink(); //front�� front.getLink�� ����� ���� ���Ҹ������մϴ�.
		if(front == null) //front�� null���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			rear = null; //rear �� null�� �־��ݴϴ�.
		count--; //count�� ���� 1 ���ҽ�ŵ�ϴ�.
		return data; //data�� ��ȯ�մϴ�.
	}
}