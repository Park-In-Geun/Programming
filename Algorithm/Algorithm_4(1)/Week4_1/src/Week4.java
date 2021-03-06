public class Week4 { //결과를 출력할 클래스입니다.
	public static void main(String[] args){
		
		BSTree bst = new BSTree(); //BSTree형 객체 bst를 생성합니다.
		BSTree bst2 = new BSTree(); //BSTree형 객체 bst2를 생성합니다.
		
		bst.insert(18); bst.insert(7); bst.insert(26); 
		bst.insert(3); bst.insert(12); bst.insert(21);
		bst.insert(31); bst.insert(23); bst.insert(10);
		//insert 함수를 사용하여 bst 트리에 정수값 18,7,26,3,12,21,31,23,10 을 넣어줍니다.
		
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
		
		bst2.insert(30); bst2.insert(20); bst2.insert(40); 
		bst2.insert(15); bst2.insert(25); bst2.insert(35);
		bst2.insert(80); bst2.insert(23); bst2.insert(27);
		//insert 함수를 사용하여 bst2 트리에 정수값 30,20,40,15,25,35,80,23,27 을 넣어줍니다.
		
		System.out.print("\nbase tree : "); // ""안이 내용을 출력합니다.
		bst2.print(); //print함수를 사용하여 bst2 트리에 저장된 값을 출력합니다.
		
		BSTree bBST = new BSTree(); //BSTree형 객체 bBST를 생성합니다.
		BSTree cBST = new BSTree(); //BSTree형 객체 cBST를 생성합니다.
		
		if(bst2.split(25, bBST, cBST)) // split 함수에 25, bBST, cBST 를 삽입하여 반환값이 TRUE 인지 확인합니다. (트리에 찾는 key 값이 존재)
			System.out.println("\n25 is in the tree"); // 조건을 만족하면 "" 안의 내용을 출력합니다.
		else //반화값이 FLASE 인 경우입니다.
			System.out.println("\n25 is not in the tree"); // "" 안의 내용을 출력합니다. 
		bBST.print(); //print함수를 사용하여 bBST 트리에 저장된 값을 출력합니다.
		cBST.print(); //print함수를 사용하여 cBST 트리에 저장된 값을 출력합니다.
		
		if(bst2.split(28, bBST, cBST)) // split 함수에 28, bBST, cBST 를 삽입하여 반환값이 TRUE 인지 확인합니다. (트리에 찾는 key 값이 존재)
			System.out.println("\n28 is in the tree"); // 조건을 만족하면 "" 안의 내용을 출력합니다.
		else
			System.out.println("\n28 is not in the tree"); // "" 안의 내용을 출력합니다. 
		bBST.print(); //print함수를 사용하여 bBST 트리에 저장된 값을 출력합니다.
		cBST.print(); //print함수를 사용하여 cBST 트리에 저장된 값을 출력합니다.
		
		if(bst2.split(33, bBST, cBST)) // split 함수에 33, bBST, cBST 를 삽입하여 반환값이 TRUE 인지 확인합니다. (트리에 찾는 key 값이 존재)
			System.out.println("\n33 is in the tree"); // 조건을 만족하면 "" 안의 내용을 출력합니다.
		else
			System.out.println("\n33 is not in the tree"); // "" 안의 내용을 출력합니다. 
		bBST.print(); //print함수를 사용하여 bBST 트리에 저장된 값을 출력합니다.
		cBST.print(); //print함수를 사용하여 cBST 트리에 저장된 값을 출력합니다.

		if(bst2.split(40, bBST, cBST)) // split 함수에 40, bBST, cBST 를 삽입하여 반환값이 TRUE 인지 확인합니다. (트리에 찾는 key 값이 존재)
			System.out.println("\n40 is in the tree"); // 조건을 만족하면 "" 안의 내용을 출력합니다.
		else 
			System.out.println("\n40 is not in the tree"); // "" 안의 내용을 출력합니다. 
		bBST.print(); //print함수를 사용하여 bBST 트리에 저장된 값을 출력합니다.
		cBST.print(); //print함수를 사용하여 cBST 트리에 저장된 값을 출력합니다.
		
		if(bst2.split(15, bBST, cBST)) // split 함수에 15, bBST, cBST 를 삽입하여 반환값이 TRUE 인지 확인합니다. (트리에 찾는 key 값이 존재)
			System.out.println("\n15 is in the tree"); // 조건을 만족하면 "" 안의 내용을 출력합니다.
		else
			System.out.println("\n15 is not in the tree"); // "" 안의 내용을 출력합니다. 
		bBST.print(); //print함수를 사용하여 bBST 트리에 저장된 값을 출력합니다.
		cBST.print(); //print함수를 사용하여 cBST 트리에 저장된 값을 출력합니다.
		
		System.out.print("\nbase tree : "); // ""안이 내용을 출력합니다.
		bst2.print(); //print함수를 사용하여 bst2 트리에 저장된 값을 출력합니다.
		
	}
}
