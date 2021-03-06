public class Queue //레벨 순회에서 사용할 Queue 클래스 입니다.
{
	private Node front; //Queue클래스내에서만 사용가능한 Node형 front를 선언합니다. 
	private Node rear; //Queue클래스내에서만 사용가능한 Node형 rear를 선언합니다.
	private int count; //Queue클래스내에서만 사용가능한 int형 count를 선언합니다.
	
	public Queue() //생성자 입니다.
	{
		front = null; //front에 null값을 넣어줍니다.
		rear  = null; //rear에 null값을 넣어줍니다.
		count = 0; //count에 0을 넣어줍니다.
	}
	public boolean isEmpty() //boolean형 isEmpty()메서드 입니다. 큐가 비어있는지 확인하기 위한 메서드입니다.
	{
		return count == 0; //count가 0과 같은지를 반환해줍니다.
	}
	public void enqueue(TreeNode data) //큐에 원소를 삽입하는 enqueue 메서드입니다. TreeNode형 data가 삽입됩니다.
	{
		Node node = new Node(data); //data값이 들어가는 Node형 node객체를 생성합니다.
		if(count == 0) //count가 0과 같은지 확인하는 조건문입니다.
			front = rear = node; //조건이 맞을 경우 front 엔 rear를 rear엔 node값을 넣어줍니다.
		else //조건과 다를 경우
		{
			rear.setLink(node); //rear.setLink에 node를 넣습니다.
			rear = node; //rear에 node를 넣습니다.
		}
		count++; //count를 1 증가시켜줍니다.
	}
	public TreeNode dequeue() //TreeNode형 메서드 dequeue로 큐의 원소를 맨 처음 것 부터 빼냅니다.
	{
		if(count == 0) //count값이 0과 같은지 확인하는 조건문입니다.
			return null; //조건이 맞을경우 null을 반환해줍니다.
		TreeNode data = front.getNode(); //TreeNode형 객체 data를 생성학 front.getNode값을 넣어줍니다.
		front = front.getLink(); //front에 front.getLink를 사용해 다음 원소를연결합니다.
		if(front == null) //front가 null값가 같은지 확인하는 조건문입니다.
			rear = null; //rear 에 null을 넣어줍니다.
		count--; //count의 값을 1 감소시킵니다.
		return data; //data를 반환합니다.
	}
}