public class Node { //Node 클래스 입니다.

	private TreeNode node; //Node 클래스내에서만 사용가능한 TreeNode형 변수 node를 생성합니다.
	private Node link; //Node 클래스내에서만 사용가능한 Node형 link를 생성합니다.
	
	public Node(TreeNode node) // TreeNode형 node가 삽입되는 Node메서드 입니다.
 	{
		this.node = node; //삽입된 node를 this.node에 넣습니다.
		this.link = null; //link는 null값을 넣어줍니다.
	}
	public Node(TreeNode node, Node top) // TreeNode형 node와 Node형 top을 삽입되는 Node메서드 입니다. 
	{
		this.node = node; //삽입된 node를 this.node에 넣습니다.
		this.link = top; //삽입된 top을 this.link에 넣습니다.
	}
	
	public TreeNode getNode() { return this.node; }
	//TreeNode형 getter메서드인 getNode()로 this.node를 반환합니다.
	
	public Node getLink() { return this.link; }
	//Node형 getter메서드인 getLink()로 this.link를 반환합니다.
	
	public void setNode(TreeNode node) { this.node = node; }
	//setter메서드인 setNode()이고 삽입된 TreeNode형 node를 this.node에 넣습니다.
	
	public void setLink(Node link) { this.link = link; } 
	//setter메서드인 setLink()이고 삽입된 Node형 link를 this.link에 넣습니다.
	
}