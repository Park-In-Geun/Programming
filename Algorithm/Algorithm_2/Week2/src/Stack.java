public class Stack //이진트리 비순환에서 사용할 Stack를래스 입니다.
{	
	private Node top; //Stack클래스 내에서만 사용할 Node형 변수 top입니다.
	
	public Stack() //생성자 입니다.
	{
		this.top = null; // this.top에 null값을 넣어줍니다
	}	
	public boolean isEmpty() //boolean형 isEmpty()로 스택이 비어있는지 확인하는 메서드입니다.
	{
		return top == null; // top이 null값과 같은지를 반환합니다.
	}	
	public void push(TreeNode node) //삽입된 TreeNode형 node를 스택에 넣는 push메서드 입니다.
	{
		Node sn = new Node(node, top); //node와 top값이 삽입되는 Node형 sn을 생성합니다.
		top = sn;		// top에 sn을 넣어줍니다.
	}
	public TreeNode pop() //스택에 있는 값을 빼내는 함수입니다.
	{
		if(this.isEmpty()) //조건문안에 isEmpty()메서드를 사용해 스택이 비어있는지 확인합니다.
		{
			System.out.println("Stack is empty."); //비어있는경우 출력되는 문장입니다.
			return null; //null값을 반환해줍니다.
		}
		Node node = top; //비어있지 않을 경우 Node형 node에 top을 넣어줍니다.(스택에 마지막으로 삽입된 값을 node에 넣어줍니다.)
		top = node.getLink(); //top에 node.getLink()값을 넣어줍니다. (스택의 마지막 전에 삽입된 원소를 top에 넣어줍니다.)
		return node.getNode(); //node.getNode()를 반환합니다.
	}
	public TreeNode peek() //스택의 마지막 원소를 확인하는 메서드입니다.
	{
		if(this.isEmpty()) //조건문안에 isEmpty()메서드를 사용해 스택이 비어있는지 확인합니다.
		{
			System.out.println("Stack is empty."); //비어있을경우 출력되는 문장입니다.
			return null; //null값을 반환해줍니다.
		}
		return top.getNode(); //top.getNode()를 반환합니다.(스택의 마지막으로 삽입된 원소를 반환)
	}	
}