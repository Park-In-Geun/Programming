
public class ListNode { //ListNode 클래스 입니다.

	private Object data; //ListNode 클래스에서만 사용가능한 변수 data 를 선언합니다.
	private ListNode link; //ListNode 클래스에서만 사용가능한 ListNode형 변수 link를 선언합니다.
	
	public ListNode(){ //ListNode의 data와 link가 모두 null값인 메서드 입니다.
		data = null; //data에 null값을 넣어줍니다.
		link = null; //link에 null값을 넣어줍니다.
	}

	public ListNode(Object data){ //ListNode의 data값이 존재하는 메서드 입니다.
		data = data; //data에 삽입된 data값을 넣어줍니다.
		link = null; //link에 null값을 넣어줍니다.
	}

	public Object getData() { //data의 getter메서드 입니다.
		return data; // data에 대한 매개변수를 반환해 줍니다.
	}

	public void setData(Object data) { //data의 setter메서드 입니다.
		this.data = data; //data에 대한 매개변수 입니다.
	}

	public ListNode getLink() { //link의 getter메서드 입니다.
		return link; //link에 대한 매개변수를 반환해 줍니다.
	}

	public void setLink(ListNode link) { //link의 setter메서드 입니다.
		this.link = link; //link에 대한 매개변수 입니다.
	}
	
}
