package com.github.tadukoo.junit;

import com.github.tadukoo.util.pojo.MappedPojo;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used for tests involving a private empty (no parameters) constructor for a {@link MappedPojo}.
 *
 * @author Logan Ferree (Tadukoo)
 * @version Alpha v.0.1
 */
public class BadMappedPojoB implements MappedPojo{
	private final Map<String, Object> map;
	
	private BadMappedPojoB(){
		map = new HashMap<>();
	}
	
	private BadMappedPojoB(MappedPojo pojo){
		map = pojo.getMap();
	}
	
	@Override
	public Map<String, Object> getMap(){
		return map;
	}
}
