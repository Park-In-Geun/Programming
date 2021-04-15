
public class Week4 { //결과를 출력할 클래스입니다.
	public static void main(String[] args){
		
		BSTree bst = new BSTree(); //BSTree형 객체 bst를 생성합니다. 
		bst.insert(18); bst.insert(7); bst.insert(26); 
		bst.insert(3); bst.insert(12); bst.insert(21);
		bst.insert(31); bst.insert(23); bst.insert(10);
		//insert 함수를 사용하여 트리에 정수값 18,7,26,3,12,21,31,23,10 을 넣어줍니다.
		
		bst.print(); //print함수를 사용하여 트리에 저장된 값을 출력합니다.
		
		bst.delete(10); //delete 함수를 사용하여 트리에서 10 을 삭제합니다.
		bst.print(); //print함수를 사용하여 트리에 저장된 값을 출력합니다.
		
		bst.delete(21); //delete 함수를 사용하여 트리에서 21 을 삭제합니다.
		bst.print(); //print함수를 사용하여 트리에 저장된 값을 출력합니다.
		
		bst.delete(26); //delete 함수를 사용하여 트리에서 26 을 삭제합니다.
		bst.print(); //print함수를 사용하여 트리에 저장된 값을 출력합니다.
		
		bst.delete(18); //delete 함수를 사용하여 트리에서 18 을 삭제합니다.
		bst.print(); //print함수를 사용하여 트리에 저장된 값을 출력합니다.
		
		bst.delete(23); //delete 함수를 사용하여 트리에서 23 을 삭제합니다.
		bst.print(); //print함수를 사용하여 트리에 저장된 값을 출력합니다.
		
		bst.delete(7); //delete 함수를 사용하여 트리에서 7 을 삭제합니다.
		bst.print(); //print함수를 사용하여 트리에 저장된 값을 출력합니다.
		
		BSTNode searchNode_1 = bst.search(31); //BSTNode형 searchNode_1 객체를 생성하고 search함수에 31을 넣어 나온 값을 searchNode_1에 넣어줍니다.
		if(searchNode_1 == null) //searchNode_1 의 값이 null과 같은지 확인합니다.
			System.out.println("search fail..."); //조건이 맞을 경우의 출력문입니다.
		else //조건과 다를 경우에 실행합니다.
			System.out.println("search success : " + searchNode_1.getKey()); //searchNode_1의 getkey()값을 출력해줍니다.
		
		BSTNode searchNode_2 = bst.search(40); //BSTNode형 searchNode_2 객체를 생성하고 search함수에 40을 넣어 나온 값을 searchNode_2에 넣어줍니다.
		if(searchNode_2 == null) //searchNode_2 의 값이 null과 같은지 확인합니다.
			System.out.println("search fail..."); //조건이 맞을 경우의 출력문입니다.
		else //조건과 다를 경우에 실행합니다.
			System.out.println("search success : " + searchNode_2.getKey()); //searchNode_2의 getkey()값을 출력해줍니다.
	}
}
