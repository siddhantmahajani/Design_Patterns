package com.design.pattern.factory;

public class GetPlan {
	
	public static Plan getPlan(final String type) {
		if (type == null) {
			return null;
		} else {
			Plan p = null;
			switch (type) {
				case "domestic":
					p = new Domestic();
					break;
				case "commercial":
					p = new Commercial();
					break;
				case "institutional":
					p = new Institutional();
					break;
			}
			p.getRate();
			return p;
		}
	}
}
