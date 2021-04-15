
public class Week5 { //���� Ŭ���� �Դϴ�.
	public static void main(String args[])
	{
		Heap heap = new Heap(3); //Heap �� ��ü heap�� �����ϰ� ���� �� 3�� �־��ݴϴ�.
		
		heap.insert(18);  heap.insert(13);  heap.insert(5); 
		heap.insert(12);  heap.insert(8);
		// insert �Լ��� ����Ͽ� ������ ���� �� 18,13,5,12,8 �� �����մϴ�.
		heap.print(); // print �Լ��� ����� ������ ����մϴ�.
		heap.insert(3); // insert �Լ��� ����Ͽ� ������ ���� �� 3 �� �����մϴ�.
		heap.print(); // print �Լ��� ����� ������ ����մϴ�.
		heap.insert(19); // insert �Լ��� ����Ͽ� ������ ���� �� 19 �� �����մϴ�.
		heap.print(); // print �Լ��� ����� ������ ����մϴ�.
		heap.insert(9); // insert �Լ��� ����Ͽ� ������ ���� �� 9 �� �����մϴ�.
		heap.print(); // print �Լ��� ����� ������ ����մϴ�.
	
		System.out.println("Delete Data : " + heap.delete());
		// delete �Լ��� ����� heap�� ���� ���� ���� ���� ���Ҹ� �����մϴ�.
		heap.print(); // print �Լ��� ����� ������ ����մϴ�.
		System.out.println("Delete Data : " + heap.delete());
		// delete �Լ��� ����� heap�� ���� ���� ���� ���� ���Ҹ� �����մϴ�.
		heap.print(); // print �Լ��� ����� ������ ����մϴ�.
		System.out.println("Delete Data : " + heap.delete());
		// delete �Լ��� ����� heap�� ���� ���� ���� ���� ���Ҹ� �����մϴ�.
		heap.print(); // print �Լ��� ����� ������ Ǯ���մϴ�.
		
		Heap test = new Heap(3); // Heap�� ��ü test�� �����ϰ� ���� �� 3�� �־��ݴϴ�.
		test.testInsert(20); test.testInsert(90);  test.testInsert(100);
		test.testInsert(70); test.testInsert(60);  test.testInsert(50);
		test.testInsert(80); test.testInsert(10);  test.testInsert(40);
		test.testInsert(30);
		// testInsert �Լ��� ����� ������ ���� �� 20,90,100,70,60,50,80,10,40,30 �� �����մϴ�.
		System.out.println("Test Heap Data"); // " " ���� ������ ����մϴ�.
		test.print(); //print �Լ��� ����� ������ ����մϴ�.
		test.makeTreeHeap(); //makeTreeHeap �Լ��� ����� ������ �ִ������� ����ϴ�.
		test.print(); //print �Լ��� ����� ������ ����մϴ�.
	
	}
}
