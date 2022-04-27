class Station {
	String name; // ���̸�
	Station rlink;
	Station llink;

	public Station(String x) {
		name = x;
		llink = null;
		rlink = null;
	}
}

class CLinkedList {

	Station head;

	public String distance(String x) {
		Station p;
		p = head;
		int cnt = 0;
		int cnt2 = NodeCount();
		while (p != null) {
			cnt++;
			if (p.name.equals(x)) {
				break;
			}
			p = p.rlink;
		}
		if (cnt > (NodeCount() - cnt) + 1) {
			System.out.println(x + "������ ��ǿ��� ���� ���� �ּҿ� " + ((NodeCount() - cnt) + 1));
		} else {
			System.out.println(x + "������ ��ǿ��� ���� ���� �ּҿ� " + (cnt - 1));
		}
		return "";
	}

	public void addLast(String x) {
		Station newNode = new Station(x);
		Station p = head;
		if (head == null) { // ������ ���� ����
			head = newNode;
		} else {
			while (p.rlink != null) {
				p = p.rlink;
			}
			p.rlink = newNode;
			newNode.llink = p;
		}
		return;
	}

	public String deleteNode(String x) {
		Station p;
		Station q;
		if (head == null) { // ���� ���� ����
			return "���� �� ���� ����";
		} else { // 100 a 200 200 b 300 300 c 4000
			p = head;
			q = null;
			while (p.rlink != null) {
				if (p.name.equals(x)) {
					q.rlink = p.rlink;
					p.name = null;

				}
				q = p;
				p = p.rlink;

			}

		}
		return x;
	}

	public String addNode(String x, String y) {
		Station p;
		Station q;
		Station newNode = new Station(y);
		if (head == null) { // ���� ���� ����
			return "���� �� ���� ����";
		} else {
			p = head;
			q = null;
			while (p.rlink != null) {
				if (p.name.equals(x)) {
					newNode.llink = q.rlink;
					newNode.rlink = p.rlink;
					p.rlink = newNode;

				}
				q = p;
				p = p.rlink;

			}

		}
		return x;
	}

	public void print() {
		Station p;
		p = head;
		int cnt = 0;
		while (p != null) {
			cnt++;
			System.out.print(cnt + "." + p.name + "\n");
			p = p.rlink;
		}
		System.out.println();
	}

	public int NodeCount() {
		Station p;
		p = head;
		int cnt = 0;
		while (p != null) {
			cnt++;
			p = p.rlink;
		}
		return cnt;
	}

	public void overLap() {
		Station p;
		Station q;
		p = head;
		q = null;
		int cnt = 0;
		int cnt2 = NodeCount();
		while (p != null) {
			if (cnt > cnt2) {
				System.out.println("������ �Ǵ� �� : " + p.name + " , " + q.name);
				break;
			}
			if(cnt == cnt2) {
				System.out.println("���� �� : " + p.name);
				break;
				
			}

			cnt++;
			cnt2--;

			q = p;
			p = p.rlink;

		}

	}

}

public class Subway2 {
	public static void main(String[] args) {

		CLinkedList cl1 = new CLinkedList();
		cl1.addLast("���");
		cl1.addLast("��õ");
		cl1.addLast("���տ��");
		cl1.addLast("�Ｚ");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("���");
		cl1.addLast("���");
		cl1.addLast("������");
		cl1.addLast("������Ա�");
		cl1.addLast("��õ");
		cl1.addLast("�Ÿ�");
		cl1.addLast("�Ŵ��");
		cl1.addLast("���ε����д���");
		cl1.addLast("�븲");
		cl1.addLast("�ŵ���");
		cl1.addLast("����");
		cl1.addLast("��������û");
		cl1.addLast("���");
		cl1.addLast("����");
		cl1.addLast("ȫ���Ա�");
		cl1.addLast("����");
		cl1.addLast("�̴�");
		cl1.addLast("����");
		cl1.addLast("������");
		cl1.addLast("��û");
		cl1.addLast("�������Ա�");
		cl1.addLast("������ 3��");
		cl1.addLast("������ 4��");
		cl1.addLast("���빮 ���繮ȭ ����");
		cl1.addLast("�Ŵ�");
		cl1.addLast("��սʸ�");
		cl1.addLast("�սʸ�");
		cl1.addLast("�Ѿ��");
		cl1.addLast("�Ҽ�");
		cl1.addLast("����");
		cl1.addLast("�Ǵ��Ա�");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("��ǳ���");
		cl1.print();
		System.out.println();
		System.out.println("������ ���");
//		cl1.deleteNode("����");
		cl1.print();
		cl1.distance("�սʸ�");
		System.out.println("���� ������ :" + cl1.NodeCount());
		System.out.println();
		System.out.println("���翪 �߰�");
	//	cl1.addNode("���","����");
		cl1.print();
		cl1.overLap();

	}
}
