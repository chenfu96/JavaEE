package com.bjsxt.chainOfResp;

public class Client {

	public static void main(String[] args) {
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader b2 = new ViceGeneralManager("��С��");
		Leader c = new GeneralManager("����");
		
		
		//��֯�����������ϵ
		a.setNextLeader(b);
		b.setNextLeader(b2);
		b2.setNextLeader(c);
		
		//��ʼ��ٲ���
		LeaveRequest req1 = new LeaveRequest("Tom", 10, "��Ӣ���ϼ�");
		a.handleRequest(req1);
	}
}
