class TestDLinkedList {
  public static void main(String[] args) {
    DLinkedList l = new DLinkedList();
		l.print();
		l.insert(3);
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(3);
		l.insert(9);
		l.insert(8);
		l.print();
		l.revrPrint();
		l.remove();
		l.remove();
		l.print();
		l.remove(2);
		l.remove(3);
		l.print();
		l.remove(6);
		l.remove();
		l.print();
    }
}