public class BTree { //��ȯ,���ȯ ����Ʈ���� ������ Ŭ�����Դϴ�.
	
	private TreeNode root; //TreeNode�� ���� root�� �����մϴ�.
	
	public BTree(){ //�������Դϴ�.
		this.root = null; //this.root�� null���� �־��ݴϴ�.
	}
	public BTree(BTree left, Object data, BTree right)
	//����Ʈ������ Btree�� left,right ��, �׸��� data���� ���Ե� ����� Btree() �޼����Դϴ�.
	{
		root = new TreeNode(data); //TreeNode�޼��忡 data���� ������ ���ѵ� ���� root(�θ�)�� �ֽ��ϴ�.
		root.setLeft(left.root); //setleft()�޼��忡 left.root�� �ֽ��ϴ�.
		root.setRight(right.root);//setRight()�޼��忡 right.root�� �ֽ��ϴ�.
	}
	public void setRoot(TreeNode root){ this.root = root; }
	//TreeNode�� root�� ���Ե� setter�޼��� setRoot()�� this.root�� ���Ե� root�� �ֽ��ϴ�.
	
	public TreeNode getRoot(){ return this.root; }
	//getter�޼��� getRoot()�� this.root�� ��ȯ�մϴ�.
	
	public boolean isEmpty(){ return root == null; }
	//boolean�� isEmpty()�� root �� null���� �������� ��ȯ�մϴ�.
	
	
	public Object getRootData(){ //getRootData()�޼����Դϴ�.(�θ�)
		return this.root.getData(); //this.root�� getData()���� ��ȯ�մϴ�.
	}
	
	public void inorder(){ //���� ��ȸ �޼����Դϴ�.
		B_inorder(root); // B_inorder()�޼��忡 root�� �����մϴ�.
	}
	private void B_inorder(TreeNode T){ //BTreeŬ���� �������� ��밡���� B_inorder()�޼���� TreeNode�� T�� ���Ե˴ϴ�.
		if(T != null){ // T�� ���� null�� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			B_inorder(T.getLeft()); //������ ���� ��� B_inorder()�޼��忡 T.getLeft()���� �ֽ��ϴ�.(���� �ڽ� �湮)
			System.out.print(T.getData() + " "); //T.getData()���� ����մϴ�.(�θ� �湮)
			B_inorder(T.getRight()); //B_inorder()�޼��忡 T.getRight()���� �ֽ��ϴ�.(������ �ڽ� �湮)
		}
	}
	public void preorder(){ //���� ��ȸ �޼����Դϴ�.
		B_preorder(root); //B_preorder()�޼��忡 root�� �����մϴ�.
	}
	private void B_preorder(TreeNode T){ //BTreeŬ���� �������� ��밡���� B_preorder�޼���� TreeNode�� T�� ���Ե˴ϴ�.
		if(T != null){ //T�� ���� null�� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			System.out.print(T.getData() + " "); //������ ���� ��� T.getData()���� ����մϴ�.(�θ� �湮)
			B_preorder(T.getLeft()); //B_preorder()�޼��忡 T.getLeft()���� �ֽ��ϴ�.(���� �ڽ� �湮)
			B_preorder(T.getRight()); //B_preorder()�޼��忡 T.getRight()���� �ֽ��ϴ�.(������ �ڽ� �湮)
		}
	}
	public void postorder(){ //���� ��ȸ �޼����Դϴ�.
		B_postorder(root); //B_postorder()�޼��忡 root���� �����մϴ�.
	}
	private void B_postorder(TreeNode T){ //BTreeŬ���� �������� ��밡���� B_preorder�޼���� TreeNode�� T�� ���Ե˴ϴ�.
		if(T != null){ //T�� ���� null�� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			B_postorder(T.getLeft()); //������ ���� ��� B_postorder()�޼��忡 T.getLeft()���� �ֽ��ϴ�.(���� �ڽ� �湮)
			B_postorder(T.getRight()); //B_postorder()�޼��忡 T.getRight()���� �ֽ��ϴ�.(������ �ڽ� �湮)
			System.out.print(T.getData() + " "); //T.getData()���� ����մϴ�.(�θ� �湮)
		}
	}
	
	public void levelOrder() //���� ���� ��ȸ �޼��� �Դϴ�.
	{
		B_levelOrder(); //B_levelOrder()�Ӽ��带 �����ŵ�ϴ�.
	}
	private void B_levelOrder(){ //BTreeŬ���� �������� ��� ������ B_levelOrder()�޼���� ť�� ����մϴ�.
		Queue q = new Queue(); //ť �� ��ü q�� �����մϴ�.
		TreeNode p = root; //TreeNode�� p�� root�� �ֽ��ϴ�.
		
		q.enqueue(root); //q�� root�� �ֽ��ϴ�.
		while(!(q.isEmpty())){ //q�� �������� �����ϴ� �ݺ����Դϴ�.
			p = q.dequeue(); //q�� ��ó�� ���� p�� �ֽ��ϴ�.
			if(p != null){ //p�� null�� ���� ���� ��츦 Ȯ���ϴ� ���ǹ��Դϴ�.
				System.out.print(p.getData() + " "); //������ ������� p�� data�� ������ݴϴ�.
			if(p.getLeft() != null){ //p�� getLeft(���� �ڽ�)�� null�� ���� ���� ��츦 Ȯ���ϴ� ���ǹ��Դϴ�.
				q.enqueue(p.getLeft()); //p�� getLeft(�����ڽ�)�� q�� �ֽ��ϴ�.
			}
			if(p.getRight() != null ){ //p�� getRight(������ �ڽ�)�� null�� ���� ���� ��츦 Ȯ���ϴ� ���ǹ��Դϴ�.
				q.enqueue(p.getRight()); //p�� getRight(������ �ڽ�)�� q�� �ֽ��ϴ�.
			}
			}
		}
	}
	
	public BTree copy(){ //Ʈ���� �����ϴ� �޼����Դϴ�.
		BTree newTree = new BTree(); //BTree�� ��ü newTree�� �����մϴ�.
		newTree.setRoot(treeCopy(this.root)); //treeCopy�޼��忡 this.root�� �־ ���� ���� newTree.setRoot�� �޽��ϴ�.
		return newTree; //newTree�� ��ȯ���ݴϴ�.
	}
	
	private TreeNode treeCopy(TreeNode T){ //BtreeŬ���� �������� ����� �� �ִ� TreeNode�� treeCopy�޼���� TreeNode�� T�� �޽��ϴ�.
		 TreeNode newNode = null; //TreeNode�� newNode�� �����ϰ� null ���� �־��ݴϴ�.
		 if(T != null){ //T�� null�� ���� ���� ��츦 Ȯ���ϴ� ���ǹ��Դϴ�.
			 TreeNode l = treeCopy(T.getLeft()); //������ ���� ��� TreeNode l �� �����ϰ� treeCopy�޼��忡 T.getLeft()���� �־� ���� ���� �ֽ��ϴ�.
			 TreeNode r = treeCopy(T.getRight()); //TreeNode r �� �����ϰ� treeCopy�޼��忡 T.getRight()���� �־� ���� ���� �ֽ��ϴ�.
			 newNode = T; //newNode�� �Ű����� T�� �޽��ϴ�.
			 newNode.setLeft(T.getLeft()); //newNode.setLeft�� T.getLeft()���� �޽��ϴ�. (���� �ڽ� ����)
			 newNode.setRight(T.getRight()); //newNode.setRight�� T.getRight()���� �޽��ϴ�. (������ �ڽ� ����)
			 newNode.setData(T.getData()); //newNode.setData�� T.getData()���� �޽��ϴ�. (�θ� ����)
		 }
		 return newNode; //������ newNode�� ��ȯ�մϴ�.
	}
	
	public boolean Equal(BTree A){ //boolean�� Equal�޼���� Btree�� A�� �޽��ϴ�. ���� ������ Ȯ���մϴ�.
		return treeEqual(this.root, A.getRoot()); //treeEqual�޼��忡 this.root�� A.getRoot()���� �־� ���� ���� ��ȯ�մϴ�.
	}
	
	private boolean treeEqual(TreeNode root, TreeNode A){ //BtreeŬ���� �������� ��밡���� boolean�� treeEqual�޼���� TreeNode�� root�� A���� �޽��ϴ�.
		if(root == null && A == null) return true; //root���� A���� �Ѵ� null�� ������츦 Ȯ���ϰ� ������ ������ true�� ��ȯ�մϴ�.
		else if(root != null && A != null){ //root���� A���� �Ѵ� null�� ���� ������츦 Ȯ���մϴ�.
			if(root.getData() == A.getData()){ //root.getData()���� A.getData()���� ������ Ȯ���մϴ�.
				if(treeEqual(root.getLeft(),A.getLeft())){ //treeEqual�޼��忡 root.getData()�� A.getData()�� �־� ������ Ȯ���մϴ�.
					return treeEqual(root.getRight(),A.getRight()); //treeEqual�޼��忡 root.getRight�� A.getRight���� �־� ��ȯ�մϴ�.
				}
			}
			else return false; //root.getData()���� A.getData()���� �ٸ� ��� false�� ��ȯ�մϴ�.
		}
		return false; //root���� A�� �� �� �ϳ��� null���� ��� false�� ��ȯ�մϴ�.
	}
}