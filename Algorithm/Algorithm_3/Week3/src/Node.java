public class Node { //Node Ŭ���� �Դϴ�.

	private TreeNode node; //Node Ŭ������������ ��밡���� TreeNode�� ���� node�� �����մϴ�.
	private Node link; //Node Ŭ������������ ��밡���� Node�� link�� �����մϴ�.
	
	public Node(TreeNode node) // TreeNode�� node�� ���ԵǴ� Node�޼��� �Դϴ�.
 	{
		this.node = node; //���Ե� node�� this.node�� �ֽ��ϴ�.
		this.link = null; //link�� null���� �־��ݴϴ�.
	}
	public Node(TreeNode node, Node top) // TreeNode�� node�� Node�� top�� ���ԵǴ� Node�޼��� �Դϴ�. 
	{
		this.node = node; //���Ե� node�� this.node�� �ֽ��ϴ�.
		this.link = top; //���Ե� top�� this.link�� �ֽ��ϴ�.
	}
	
	public TreeNode getNode() { return this.node; }
	//TreeNode�� getter�޼����� getNode()�� this.node�� ��ȯ�մϴ�.
	
	public Node getLink() { return this.link; }
	//Node�� getter�޼����� getLink()�� this.link�� ��ȯ�մϴ�.
	
	public void setNode(TreeNode node) { this.node = node; }
	//setter�޼����� setNode()�̰� ���Ե� TreeNode�� node�� this.node�� �ֽ��ϴ�.
	
	public void setLink(Node link) { this.link = link; } 
	//setter�޼����� setLink()�̰� ���Ե� Node�� link�� this.link�� �ֽ��ϴ�.
	
}