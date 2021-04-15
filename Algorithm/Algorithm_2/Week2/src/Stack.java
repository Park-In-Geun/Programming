public class Stack //����Ʈ�� ���ȯ���� ����� Stack������ �Դϴ�.
{	
	private Node top; //StackŬ���� �������� ����� Node�� ���� top�Դϴ�.
	
	public Stack() //������ �Դϴ�.
	{
		this.top = null; // this.top�� null���� �־��ݴϴ�
	}	
	public boolean isEmpty() //boolean�� isEmpty()�� ������ ����ִ��� Ȯ���ϴ� �޼����Դϴ�.
	{
		return top == null; // top�� null���� �������� ��ȯ�մϴ�.
	}	
	public void push(TreeNode node) //���Ե� TreeNode�� node�� ���ÿ� �ִ� push�޼��� �Դϴ�.
	{
		Node sn = new Node(node, top); //node�� top���� ���ԵǴ� Node�� sn�� �����մϴ�.
		top = sn;		// top�� sn�� �־��ݴϴ�.
	}
	public TreeNode pop() //���ÿ� �ִ� ���� ������ �Լ��Դϴ�.
	{
		if(this.isEmpty()) //���ǹ��ȿ� isEmpty()�޼��带 ����� ������ ����ִ��� Ȯ���մϴ�.
		{
			System.out.println("Stack is empty."); //����ִ°�� ��µǴ� �����Դϴ�.
			return null; //null���� ��ȯ���ݴϴ�.
		}
		Node node = top; //������� ���� ��� Node�� node�� top�� �־��ݴϴ�.(���ÿ� ���������� ���Ե� ���� node�� �־��ݴϴ�.)
		top = node.getLink(); //top�� node.getLink()���� �־��ݴϴ�. (������ ������ ���� ���Ե� ���Ҹ� top�� �־��ݴϴ�.)
		return node.getNode(); //node.getNode()�� ��ȯ�մϴ�.
	}
	public TreeNode peek() //������ ������ ���Ҹ� Ȯ���ϴ� �޼����Դϴ�.
	{
		if(this.isEmpty()) //���ǹ��ȿ� isEmpty()�޼��带 ����� ������ ����ִ��� Ȯ���մϴ�.
		{
			System.out.println("Stack is empty."); //���������� ��µǴ� �����Դϴ�.
			return null; //null���� ��ȯ���ݴϴ�.
		}
		return top.getNode(); //top.getNode()�� ��ȯ�մϴ�.(������ ���������� ���Ե� ���Ҹ� ��ȯ)
	}	
}