package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;


public class MeuVO {
	private final ObjectMapper objectMapper = new ObjectMapper();
	private Map<Integer, MeuVO3> map;

	public MeuVO() {
		MeuVO3 meuVO3 = new MeuVO3();
		map = new HashMap<>();
		map.put(1, meuVO3);
		String str = convertVo(map);
		Map<Integer, MeuVO3> result = convertString(str);
		System.out.println(result.get(1).getMeuVo2().getClass());
	}
	
	private String convertVo(Map<Integer, MeuVO3> map){
		try {
			return this.objectMapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
    }

	private Map<Integer, MeuVO3> convertString(String str){
		try {
			return objectMapper.readValue(str, new TypeReference<Map<Integer, MeuVO3>>(){});
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
    }

	public Map<Integer, MeuVO3> getMap() {
		return map;
	}

	public void setMap(Map<Integer, MeuVO3> map) {
		this.map = map;
	}

}
