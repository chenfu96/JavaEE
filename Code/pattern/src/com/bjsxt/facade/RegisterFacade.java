package com.bjsxt.facade;

/**
 * ����ע�ṫ˾���̵��������
 * @author Administrator
 *
 */
public class RegisterFacade {
	public void register() {
		���̾� a = new ���������̾�();
		a.chckName();
		�ʼ�� b = new �������ʼ��();
		b.orgCodeCertificate();
		˰��� c = new ������˰���();
		c.taxCertificate();
		���� d = new ����������();
		d.openAccout();
	}
}
