public class TreeNode //TreeNode 클래스 입니다.
{
	private Object data; //TreeNode 클래스 내에서만 사용가능한 변수 data를 선언합니다. 
	private TreeNode left; //TreeNode 클래스 내에서만 사용가능한 TreeNode형 변수 left를 선언합니다.
	private TreeNode right; //TreeNode 클래스 내에서만 사용가능한 TreeNode형 변수 right를 선언합니다.
	
	public TreeNode(Object data){ //이진 트리에서 사용할 TreeNode 메서드로 data값만 받습니다.
		this.data = data; // TreeNode에 삽입된 data값을 넣습니다.
		left = null; //left에 null값을 넣습니다.
		right = null; //right에 null값을 넣습니다.
	}
	public TreeNode getLeft() { return left; } 
	//TreeNode형 getter메서드 getLeft()이고 left를 반환합니다.
	
	public Object getData() { return this.data; }
	//getter메서드  getData()이고 this.data를 반환합니다.
	
	public TreeNode getRight() { return right; } 
	//TreeNode형 getter 메서드 getRight()이고 right를 반환합니다.
	
	public void setLeft(TreeNode left) { this.left = left; } 
	// setter메서드 setLeft()이고 삽입된 TreeNode형 left를 this.left에 넣어줍니다.
	
	public void setData(Object data) { this.data = data; }
	// setter메서드 setData()이고 삽입된 data를 this.data에 넣어줍니다.
	
	public void setRight(TreeNode right) { this.right = right; }
	// setter메서드 setRight()이고 삽입된 TreeNode형 right를 this.right에 넣어줍니다.
	
}
