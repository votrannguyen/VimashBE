package com.example.vimash.bean.jpa.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouteReponse {
	
    @JsonProperty(value="routeCode")
    private String routeCode;
    
    @JsonProperty(value="routeName")
    private String routeName;

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	/**
	 * @param routeCode
	 * @param routeName
	 */
	public RouteReponse(String routeCode, String routeName) {
		this.routeCode = routeCode;
		this.routeName = routeName;
	}
    
    
}
