package com.stefancipe.dpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BanditFactory {
	
	Map<String,BanditType> banditTypes;
	
	public BanditFactory() {
		this.banditTypes = new HashMap<>();
	}
	
	public BanditType getBanditType(String type, double [] params) {
		BanditType banditType = banditTypes.get(type);
		if(banditType == null) {
			banditType = new BanditType(type,params[0],params[1],params[2]);
			this.banditTypes.put(type, banditType);
		}
		return banditType;
	}
}
