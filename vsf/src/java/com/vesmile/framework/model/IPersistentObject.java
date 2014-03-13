package com.vesmile.framework.model;

import java.io.Serializable;

public interface IPersistentObject extends Serializable{
	public Serializable getKey();
}
