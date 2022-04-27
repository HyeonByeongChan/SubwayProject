class Station {
	String name; // 역이름
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
			System.out.println(x + "역에서 잠실역을 가기 위한 최소역 " + ((NodeCount() - cnt) + 1));
		} else {
			System.out.println(x + "역에서 잠실역을 가기 위한 최소역 " + (cnt - 1));
		}
		return "";
	}

	public void addLast(String x) {
		Station newNode = new Station(x);
		Station p = head;
		if (head == null) { // 기존에 원소 없음
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
		if (head == null) { // 기존 원소 없음
			return "삭제 할 원소 없음";
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
		if (head == null) { // 기존 원소 없음
			return "삭제 할 원소 없음";
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
				System.out.println("오버랩 되는 역 : " + p.name + " , " + q.name);
				break;
			}
			if(cnt == cnt2) {
				System.out.println("도착 역 : " + p.name);
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
		cl1.addLast("잠실");
		cl1.addLast("신천");
		cl1.addLast("종합운동장");
		cl1.addLast("삼성");
		cl1.addLast("선릉");
		cl1.addLast("역삼");
		cl1.addLast("강남");
		cl1.addLast("교대");
		cl1.addLast("서초");
		cl1.addLast("방배");
		cl1.addLast("사당");
		cl1.addLast("낙성대");
		cl1.addLast("서울대입구");
		cl1.addLast("봉천");
		cl1.addLast("신림");
		cl1.addLast("신대방");
		cl1.addLast("구로디지털단지");
		cl1.addLast("대림");
		cl1.addLast("신도림");
		cl1.addLast("문래");
		cl1.addLast("영등포구청");
		cl1.addLast("당산");
		cl1.addLast("합정");
		cl1.addLast("홍대입구");
		cl1.addLast("신촌");
		cl1.addLast("이대");
		cl1.addLast("아현");
		cl1.addLast("충정로");
		cl1.addLast("시청");
		cl1.addLast("을지로입구");
		cl1.addLast("을지로 3가");
		cl1.addLast("을지로 4가");
		cl1.addLast("동대문 역사문화 공원");
		cl1.addLast("신당");
		cl1.addLast("상왕십리");
		cl1.addLast("왕십리");
		cl1.addLast("한양대");
		cl1.addLast("뚝섬");
		cl1.addLast("성수");
		cl1.addLast("건대입구");
		cl1.addLast("구의");
		cl1.addLast("강변");
		cl1.addLast("잠실나루");
		cl1.print();
		System.out.println();
		System.out.println("강변역 폐쇄");
//		cl1.deleteNode("강변");
		cl1.print();
		cl1.distance("왕십리");
		System.out.println("역의 갯수는 :" + cl1.NodeCount());
		System.out.println();
		System.out.println("별당역 추가");
	//	cl1.addNode("방배","별당");
		cl1.print();
		cl1.overLap();

	}
}
