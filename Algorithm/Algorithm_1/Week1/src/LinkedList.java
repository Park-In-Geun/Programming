
public class LinkedList {
	
	private ListNode head; 
	//LinkedList클래스 내에서 사용하도록 head를 ListNode타입의 변수로 선언합니다.
	private ListNode p;
	//LinkedList클래스 내에서 사용하도록 p를 ListNode타입의 변수로 선언합니다.
	
	public void addLastNode(Object data){ //ListNode의 마지막부분에 data를 삽입하기 위한 함수입니다.
		ListNode newNode = new ListNode();
		//ListNode 타입의 newNode를 생성하고 하고 하나의 새로운 ListNode로 초기화 해 줍니다.
		
		newNode.setData(data); //newNode의 매개변수 data부분에 입력된 data를 넣어줍니다.
		newNode.setLink(null); //newNode의 link부분에 null값을 넣어줍니다.
		
		if(head == null){ //head의 값이 null값과 같은지 확인하는 조건문입니다.
			head = newNode; //head에 newNode의 값(data,link)을 넣어줍니다.
			return; //void형 이므로 아무것도 반환하지 않습니다.
		}
		
		p = head; //p에다가 head값을 넣어줍니다.
		
		while(p.getLink() != null){ //p의 link의 값이 null일 때 까지 반복하는 반복문입니다.
			p = p.getLink(); //p에다가 p의 link(다음 주소)를 넣어줍니다.
		}
		p.setLink(newNode); //p의 link부분에 newNode를 넣어줍니다(노드의 연결).
	}

	public void deleteLastNode(){ //ListNode의 마지막 노드를 삭제하기 위한 함수입니다.
		
		ListNode del = new ListNode();
		//ListNode 타입의 del을 생성하고 하고 하나의 새로운 ListNode로 초기화 해 줍니다.
		ListNode last = new ListNode();
		//ListNode 타입의 last를 생성하고 하고 하나의 새로운 ListNode로 초기화 해 줍니다.
		
		del = head; //del에 head값을 넣어줍니다.
		last = del.getLink(); //last에 head값이 들어있는 del의 link부분에 연결해 줍니다.
		if(head.getLink() == null){
		//head의 link부분이 null과 같은지 즉, 다음 노드가 존재하는지 확인하는 조건문 입니다.

			head = null; //head에 null값을 넣어줍니다(노드를 삭제).
			return; //void형 이므로 아무것도 반환하지 않습니다.
		}
		else //head의 link부분이 null값이 아닌 경우
		{
			while(last.getLink() != null) //last의 link부분(다음 노드)가 null값이 될 때 까지 반복하는 반복문입니다.
			{
				del = last; //del에다가 last값(다음노드의 data)을 넣어줍니다.
				last  = last.getLink(); //last에 last의 link(last의 다음 노드)를 연결 해 줍니다.
				
			}
		}
		del.setLink(null); //반복문 종료 후 del의 link부분에 null값을 넣어줍니다.
	
	}
	
	public boolean nodeSearch(Object data){ //node값을 찾고 찾은 노드 값이 일치하는지 확인하는 함수입니다.
		ListNode search = new ListNode(); //
		//ListNode 타입의 search를 생성하고 하고 하나의 새로운 ListNode로 초기화 해 줍니다.
		search = head; //search에 head값을 넣어줍니다.
		
		while(search != null){ //search의 값이 null이 될 때 까지(값을 찾을 때 까지) 반복하는 반복문입니다.
			if(search.getData() == data) //search의 data부분이 찾는 data와 일치하는지 확인하는 조건문입니다. 
				return true;  //true를 반환 해 줍니다.
			search = search.getLink(); //search를 search다음 노드에 연결 해 줍니다.
		}
		return false; //위의 반복문에서 결과가 나오지 않았을 경우 false를 반환 해 줍니다.
	}
	
	public void print(){ //노드에 들어 있는 값을 출력하는 함수입니다.
		
		if(head == null){ //head의 값이 null과 같을 경우(노드가 비었을 경우)를 확인하는 조건문입니다.
			System.out.println("===List is Empty==="); //ListNode가 비어있다고 출력 해 줍니다.
		}
		else{ //head의 값이 null이 아닐경우(노드가 있을 경우)
			p = head; //p에 head값을 넣어줍니다.
			
			System.out.println("====List Data===="); //ListNode의 data들을 출력합니다.
			
			while(p != null){ //p의 값이 null과 같을 때 까지 반복하는 반복문 입니다.
			System.out.println("| data : " + p.getData() + "|"); //p의 data부분을 출력합니다.
			p = p.getLink(); //p의 다음 노드를 연결 해 줍니다.
			
			if(p == null){ //p의 값이 null과 같은지(노드를 다 출력 했는지) 확인하는 조건문 입니다.
				System.out.println("================="); //data의 나열을 끝내겠다는 출력문입니다.
			}
			}
			}
	}
}
