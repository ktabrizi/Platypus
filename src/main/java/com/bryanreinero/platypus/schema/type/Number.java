package com.bryanreinero.platypus.schema.type;

public interface Number {
	
	public static enum Type {
		Counting, Odd, Even, Natural;
	};
	
	public boolean validate( Double d );
}
