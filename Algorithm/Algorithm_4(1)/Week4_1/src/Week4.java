public class Week4 { //����� ����� Ŭ�����Դϴ�.
	public static void main(String[] args){
		
		BSTree bst = new BSTree(); //BSTree�� ��ü bst�� �����մϴ�.
		BSTree bst2 = new BSTree(); //BSTree�� ��ü bst2�� �����մϴ�.
		
		bst.insert(18); bst.insert(7); bst.insert(26); 
		bst.insert(3); bst.insert(12); bst.insert(21);
		bst.insert(31); bst.insert(23); bst.insert(10);
		//insert �Լ��� ����Ͽ� bst Ʈ���� ������ 18,7,26,3,12,21,31,23,10 �� �־��ݴϴ�.
		
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
		
		bst2.insert(30); bst2.insert(20); bst2.insert(40); 
		bst2.insert(15); bst2.insert(25); bst2.insert(35);
		bst2.insert(80); bst2.insert(23); bst2.insert(27);
		//insert �Լ��� ����Ͽ� bst2 Ʈ���� ������ 30,20,40,15,25,35,80,23,27 �� �־��ݴϴ�.
		
		System.out.print("\nbase tree : "); // ""���� ������ ����մϴ�.
		bst2.print(); //print�Լ��� ����Ͽ� bst2 Ʈ���� ����� ���� ����մϴ�.
		
		BSTree bBST = new BSTree(); //BSTree�� ��ü bBST�� �����մϴ�.
		BSTree cBST = new BSTree(); //BSTree�� ��ü cBST�� �����մϴ�.
		
		if(bst2.split(25, bBST, cBST)) // split �Լ��� 25, bBST, cBST �� �����Ͽ� ��ȯ���� TRUE ���� Ȯ���մϴ�. (Ʈ���� ã�� key ���� ����)
			System.out.println("\n25 is in the tree"); // ������ �����ϸ� "" ���� ������ ����մϴ�.
		else //��ȭ���� FLASE �� ����Դϴ�.
			System.out.println("\n25 is not in the tree"); // "" ���� ������ ����մϴ�. 
		bBST.print(); //print�Լ��� ����Ͽ� bBST Ʈ���� ����� ���� ����մϴ�.
		cBST.print(); //print�Լ��� ����Ͽ� cBST Ʈ���� ����� ���� ����մϴ�.
		
		if(bst2.split(28, bBST, cBST)) // split �Լ��� 28, bBST, cBST �� �����Ͽ� ��ȯ���� TRUE ���� Ȯ���մϴ�. (Ʈ���� ã�� key ���� ����)
			System.out.println("\n28 is in the tree"); // ������ �����ϸ� "" ���� ������ ����մϴ�.
		else
			System.out.println("\n28 is not in the tree"); // "" ���� ������ ����մϴ�. 
		bBST.print(); //print�Լ��� ����Ͽ� bBST Ʈ���� ����� ���� ����մϴ�.
		cBST.print(); //print�Լ��� ����Ͽ� cBST Ʈ���� ����� ���� ����մϴ�.
		
		if(bst2.split(33, bBST, cBST)) // split �Լ��� 33, bBST, cBST �� �����Ͽ� ��ȯ���� TRUE ���� Ȯ���մϴ�. (Ʈ���� ã�� key ���� ����)
			System.out.println("\n33 is in the tree"); // ������ �����ϸ� "" ���� ������ ����մϴ�.
		else
			System.out.println("\n33 is not in the tree"); // "" ���� ������ ����մϴ�. 
		bBST.print(); //print�Լ��� ����Ͽ� bBST Ʈ���� ����� ���� ����մϴ�.
		cBST.print(); //print�Լ��� ����Ͽ� cBST Ʈ���� ����� ���� ����մϴ�.

		if(bst2.split(40, bBST, cBST)) // split �Լ��� 40, bBST, cBST �� �����Ͽ� ��ȯ���� TRUE ���� Ȯ���մϴ�. (Ʈ���� ã�� key ���� ����)
			System.out.println("\n40 is in the tree"); // ������ �����ϸ� "" ���� ������ ����մϴ�.
		else 
			System.out.println("\n40 is not in the tree"); // "" ���� ������ ����մϴ�. 
		bBST.print(); //print�Լ��� ����Ͽ� bBST Ʈ���� ����� ���� ����մϴ�.
		cBST.print(); //print�Լ��� ����Ͽ� cBST Ʈ���� ����� ���� ����մϴ�.
		
		if(bst2.split(15, bBST, cBST)) // split �Լ��� 15, bBST, cBST �� �����Ͽ� ��ȯ���� TRUE ���� Ȯ���մϴ�. (Ʈ���� ã�� key ���� ����)
			System.out.println("\n15 is in the tree"); // ������ �����ϸ� "" ���� ������ ����մϴ�.
		else
			System.out.println("\n15 is not in the tree"); // "" ���� ������ ����մϴ�. 
		bBST.print(); //print�Լ��� ����Ͽ� bBST Ʈ���� ����� ���� ����մϴ�.
		cBST.print(); //print�Լ��� ����Ͽ� cBST Ʈ���� ����� ���� ����մϴ�.
		
		System.out.print("\nbase tree : "); // ""���� ������ ����մϴ�.
		bst2.print(); //print�Լ��� ����Ͽ� bst2 Ʈ���� ����� ���� ����մϴ�.
		
	}
}