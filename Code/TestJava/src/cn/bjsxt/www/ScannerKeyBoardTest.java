package cn.bjsxt.www;

import java.util.*;
public class ScannerKeyBoardTest
{
	public static void main(String[] args)
	{
		// System.in������׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		// ��������һ�н�ֻ�ѻس���Ϊ�ָ���
		// sc.useDelimiter("\n");
		// �ж��Ƿ�����һ��������
		while(sc.hasNext())
		{
			// ���������
			System.out.println("��������������ǣ�"
				+ sc.next());
		}
		System.out.println("ִ����");//����䲻��ִ�У�����
	}
}
