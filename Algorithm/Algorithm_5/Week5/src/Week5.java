
public class Week5 { //메인 클래스 입니다.
	public static void main(String args[])
	{
		Heap heap = new Heap(3); //Heap 형 객체 heap를 생성하고 정수 값 3을 넣어줍니다.
		
		heap.insert(18);  heap.insert(13);  heap.insert(5); 
		heap.insert(12);  heap.insert(8);
		// insert 함수를 사용하여 히프에 정수 값 18,13,5,12,8 을 삽입합니다.
		heap.print(); // print 함수를 사용해 히프를 출력합니다.
		heap.insert(3); // insert 함수를 사용하여 히프에 정수 값 3 을 삽입합니다.
		heap.print(); // print 함수를 사용해 히프를 출력합니다.
		heap.insert(19); // insert 함수를 사용하여 히프에 정수 값 19 을 삽입합니다.
		heap.print(); // print 함수를 사용해 히프를 출력합니다.
		heap.insert(9); // insert 함수를 사용하여 히프에 정수 값 9 을 삽입합니다.
		heap.print(); // print 함수를 사용해 히프를 출력합니다.
	
		System.out.println("Delete Data : " + heap.delete());
		// delete 함수를 사용해 heap의 가장 높은 값을 가진 원소를 삭제합니다.
		heap.print(); // print 함수를 사용해 히프를 출력합니다.
		System.out.println("Delete Data : " + heap.delete());
		// delete 함수를 사용해 heap의 가장 높은 값을 가진 원소를 삭제합니다.
		heap.print(); // print 함수를 사용해 히프를 출력합니다.
		System.out.println("Delete Data : " + heap.delete());
		// delete 함수를 사용해 heap의 가장 높은 값을 가진 원소를 삭제합니다.
		heap.print(); // print 함수를 사용해 히프를 풀력합니다.
		
		Heap test = new Heap(3); // Heap형 객체 test를 생성하고 정수 값 3을 넣어줍니다.
		test.testInsert(20); test.testInsert(90);  test.testInsert(100);
		test.testInsert(70); test.testInsert(60);  test.testInsert(50);
		test.testInsert(80); test.testInsert(10);  test.testInsert(40);
		test.testInsert(30);
		// testInsert 함수를 사용해 히프에 정수 값 20,90,100,70,60,50,80,10,40,30 을 삽입합니다.
		System.out.println("Test Heap Data"); // " " 안의 내용을 출력합니다.
		test.print(); //print 함수를 사용해 히프를 출력합니다.
		test.makeTreeHeap(); //makeTreeHeap 함수를 사용해 히프를 최대히프로 만듭니다.
		test.print(); //print 함수를 사용해 히프를 출력합니다.
	
	}
}
