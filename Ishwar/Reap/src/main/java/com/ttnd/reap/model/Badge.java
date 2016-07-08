package com.ttnd.reap.model;

public enum Badge {

	GOLD(3), SiLVER(2), BRONZE(3);

	private Integer value;

	private Badge(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
