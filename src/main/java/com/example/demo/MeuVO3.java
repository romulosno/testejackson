package com.example.demo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class MeuVO3 {
	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
	private Object meuVo2 = new MeuVO2();

	public Object getMeuVo2() {
		return meuVo2;
	}

}
