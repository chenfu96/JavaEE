package com.bjsxt.chainOfResp;

/**
 * ���ܾ���
 * @author Administrator
 *
 */
public class ViceGeneralManager extends Leader {

	
	
	public ViceGeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 20){
			System.out.println("Ա��"+request.getEmpName()+"��� ����"+request.getLeaveDays()+"���ɣ�"+request.getReason());
			System.out.println("���ܾ���:"+this.name+"����ͨ��");
		}else{
			this.nextLeader.handleRequest(request);
		}
	}
}
