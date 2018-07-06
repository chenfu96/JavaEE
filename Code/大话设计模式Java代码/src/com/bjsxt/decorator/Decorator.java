package com.bjsxt.decorator;

abstract class Decorator extends Component {

	protected Component component = null;

	public Decorator(Component component) {
		this.component = component;
	}

	public void operation() {
		if(component != null){
			component.operation();
		}
	}
}
