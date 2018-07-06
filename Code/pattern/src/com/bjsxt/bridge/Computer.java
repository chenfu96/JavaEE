package com.bjsxt.bridge;

public interface Computer {
	void sale();
}
class Desktop implements Computer {

	@Override
	public void sale() {
		System.out.println("销售台式机");
	}
	
}

class Laptop implements Computer {

	@Override
	public void sale() {
		System.out.println("销售笔记本");
	}
	
}
class Padtop implements Computer {

	@Override
	public void sale() {
		System.out.println("销售Pad");
	}
	
}
class LenovoDesktop extends Desktop {
	@Override
	public void sale() {
		System.out.println("销售联想台式机");
	}
}
class LenovoLaptop extends Laptop {
	@Override
	public void sale() {
		System.out.println("销售联想笔记本");
	}
}
class LenovoPadtop extends Padtop {
	@Override
	public void sale() {
		System.out.println("销售联想pad");
	}
}



class ShenzhouDesktop extends Desktop {
	@Override
	public void sale() {
		System.out.println("销售神州台式机");
	}
}
class ShenzhouLaptop extends Laptop {
	@Override
	public void sale() {
		System.out.println("销售神州笔记本");
	}
}
class ShenzhouPadtop extends Padtop {
	@Override
	public void sale() {
		System.out.println("销售神州pad");
	}
}


class DellDesktop extends Desktop {
	@Override
	public void sale() {
		System.out.println("销售戴尔台式机");
	}
}
class DellLaptop extends Laptop {
	@Override
	public void sale() {
		System.out.println("销售戴尔笔记本");
	}
}
class DellPadtop extends Padtop {
	@Override
	public void sale() {
		System.out.println("销售戴尔pad");
	}
}
