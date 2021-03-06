
public class Week_1_2 {
	
	public static void main(String[] args){
		
		LinkedList list = new LinkedList();
		//ListNode 타입의 list을 생성하고 하고 하나의 새로운 ListNode로 초기화 해 줍니다.
		
		list.print(); //list의 노드를 print()함수를 이용하여 출력합니다.
		
		list.addLastNode("AAAA"); 
		//"AAAA"란 data를 가진 노드를 addLastNode()함수를 이용하여 list의 마지막에 노드를 추가합니다.
		
		list.addLastNode("BBBB"); 
		//"BBBB"란 data를 가진 노드를 addLastNode()함수를 이용하여 list의 마지막에 노드를 추가합니다.
		
		list.addLastNode("CCCC"); 
		//"CCCC"란 data를 가진 노드를 addLastNode()함수를 이용하여 list의 마지막에 노드를 추가합니다.
		
		list.print(); //list의 노드를 print()함수를 이용하여 출력합니다.
		list.deleteLastNode(); //deleteLastNode()를 이용하여 list의 마지막 노드를 삭제합니다.
		list.print(); //list의 노드를 print()함수를 이용하여 출력합니다.
		System.out.println("AAAA search result : " + list.nodeSearch("AAAA"));
		//nodeSearch함수를 사용하여 list에 AAAA라는 data를 가진 노드가 있는지 확인하고 참인지 거짓인지 출력합니다.
		
		System.out.println("CCCC search result : " + list.nodeSearch("CCCC"));
		//nodeSearch함수를 사용하여 list에 CCCC라는 data를 가진 노드가 있는지 확인하고 참인지 거짓인지 출력합니다.
		
		list.deleteLastNode(); //deleteLastNode()를 이용하여 list의 마지막 노드를 삭제합니다.
		list.deleteLastNode(); //deleteLastNode()를 이용하여 list의 마지막 노드를 삭제합니다.
		
		list.print(); //list의 노드를 print()함수를 이용하여 출력합니다.
	}
}
