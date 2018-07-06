package com.bjsxt.bridge;

public interface Computer {
	void sale();
}
class Desktop implements Computer {

	@Override
	public void sale() {
		System.out.println("����̨ʽ��");
	}
	
}

class Laptop implements Computer {

	@Override
	public void sale() {
		System.out.println("���۱ʼǱ�");
	}
	
}
class Padtop implements Computer {

	@Override
	public void sale() {
		System.out.println("����Pad");
	}
	
}
class LenovoDesktop extends Desktop {
	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}
class LenovoLaptop extends Laptop {
	@Override
	public void sale() {
		System.out.println("��������ʼǱ�");
	}
}
class LenovoPadtop extends Padtop {
	@Override
	public void sale() {
		System.out.println("��������pad");
	}
}



class ShenzhouDesktop extends Desktop {
	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}
class ShenzhouLaptop extends Laptop {
	@Override
	public void sale() {
		System.out.println("�������ݱʼǱ�");
	}
}
class ShenzhouPadtop extends Padtop {
	@Override
	public void sale() {
		System.out.println("��������pad");
	}
}


class DellDesktop extends Desktop {
	@Override
	public void sale() {
		System.out.println("���۴���̨ʽ��");
	}
}
class DellLaptop extends Laptop {
	@Override
	public void sale() {
		System.out.println("���۴����ʼǱ�");
	}
}
class DellPadtop extends Padtop {
	@Override
	public void sale() {
		System.out.println("���۴���pad");
	}
}
