
public class Week4 { //����� ����� Ŭ�����Դϴ�.
	public static void main(String[] args){
		
		BSTree bst = new BSTree(); //BSTree�� ��ü bst�� �����մϴ�. 
		bst.insert(18); bst.insert(7); bst.insert(26); 
		bst.insert(3); bst.insert(12); bst.insert(21);
		bst.insert(31); bst.insert(23); bst.insert(10);
		//insert �Լ��� ����Ͽ� Ʈ���� ������ 18,7,26,3,12,21,31,23,10 �� �־��ݴϴ�.
		
		bst.print(); //print�Լ��� ����Ͽ� Ʈ���� ����� ���� ����մϴ�.
		
		bst.delete(10); //delete �Լ��� ����Ͽ� Ʈ������ 10 �� �����մϴ�.
		bst.print(); //print�Լ��� ����Ͽ� Ʈ���� ����� ���� ����մϴ�.
		
		bst.delete(21); //delete �Լ��� ����Ͽ� Ʈ������ 21 �� �����մϴ�.
		bst.print(); //print�Լ��� ����Ͽ� Ʈ���� ����� ���� ����մϴ�.
		
		bst.delete(26); //delete �Լ��� ����Ͽ� Ʈ������ 26 �� �����մϴ�.
		bst.print(); //print�Լ��� ����Ͽ� Ʈ���� ����� ���� ����մϴ�.
		
		bst.delete(18); //delete �Լ��� ����Ͽ� Ʈ������ 18 �� �����մϴ�.
		bst.print(); //print�Լ��� ����Ͽ� Ʈ���� ����� ���� ����մϴ�.
		
		bst.delete(23); //delete �Լ��� ����Ͽ� Ʈ������ 23 �� �����մϴ�.
		bst.print(); //print�Լ��� ����Ͽ� Ʈ���� ����� ���� ����մϴ�.
		
		bst.delete(7); //delete �Լ��� ����Ͽ� Ʈ������ 7 �� �����մϴ�.
		bst.print(); //print�Լ��� ����Ͽ� Ʈ���� ����� ���� ����մϴ�.
		
		BSTNode searchNode_1 = bst.search(31); //BSTNode�� searchNode_1 ��ü�� �����ϰ� search�Լ��� 31�� �־� ���� ���� searchNode_1�� �־��ݴϴ�.
		if(searchNode_1 == null) //searchNode_1 �� ���� null�� ������ Ȯ���մϴ�.
			System.out.println("search fail..."); //������ ���� ����� ��¹��Դϴ�.
		else //���ǰ� �ٸ� ��쿡 �����մϴ�.
			System.out.println("search success : " + searchNode_1.getKey()); //searchNode_1�� getkey()���� ������ݴϴ�.
		
		BSTNode searchNode_2 = bst.search(40); //BSTNode�� searchNode_2 ��ü�� �����ϰ� search�Լ��� 40�� �־� ���� ���� searchNode_2�� �־��ݴϴ�.
		if(searchNode_2 == null) //searchNode_2 �� ���� null�� ������ Ȯ���մϴ�.
			System.out.println("search fail..."); //������ ���� ����� ��¹��Դϴ�.
		else //���ǰ� �ٸ� ��쿡 �����մϴ�.
			System.out.println("search success : " + searchNode_2.getKey()); //searchNode_2�� getkey()���� ������ݴϴ�.
	}
}
