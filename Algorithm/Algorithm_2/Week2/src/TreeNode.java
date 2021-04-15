public class TreeNode //TreeNode Ŭ���� �Դϴ�.
{
	private Object data; //TreeNode Ŭ���� �������� ��밡���� ���� data�� �����մϴ�. 
	private TreeNode left; //TreeNode Ŭ���� �������� ��밡���� TreeNode�� ���� left�� �����մϴ�.
	private TreeNode right; //TreeNode Ŭ���� �������� ��밡���� TreeNode�� ���� right�� �����մϴ�.
	
	public TreeNode(Object data){ //���� Ʈ������ ����� TreeNode �޼���� data���� �޽��ϴ�.
		this.data = data; // TreeNode�� ���Ե� data���� �ֽ��ϴ�.
		left = null; //left�� null���� �ֽ��ϴ�.
		right = null; //right�� null���� �ֽ��ϴ�.
	}
	public TreeNode getLeft() { return left; } 
	//TreeNode�� getter�޼��� getLeft()�̰� left�� ��ȯ�մϴ�.
	
	public Object getData() { return this.data; }
	//getter�޼���  getData()�̰� this.data�� ��ȯ�մϴ�.
	
	public TreeNode getRight() { return right; } 
	//TreeNode�� getter �޼��� getRight()�̰� right�� ��ȯ�մϴ�.
	
	public void setLeft(TreeNode left) { this.left = left; } 
	// setter�޼��� setLeft()�̰� ���Ե� TreeNode�� left�� this.left�� �־��ݴϴ�.
	
	public void setData(Object data) { this.data = data; }
	// setter�޼��� setData()�̰� ���Ե� data�� this.data�� �־��ݴϴ�.
	
	public void setRight(TreeNode right) { this.right = right; }
	// setter�޼��� setRight()�̰� ���Ե� TreeNode�� right�� this.right�� �־��ݴϴ�.
	
}