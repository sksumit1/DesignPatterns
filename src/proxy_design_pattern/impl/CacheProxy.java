package proxy_design_pattern.impl;

import proxy_design_pattern.IResource;

public class CacheProxy implements IResource {
	
	String response = null;

	@Override
	public String execute() {
		System.out.println("Calling cache proxy");
		if(response == null) {
			response = new DatabaseResource().execute();
		} else {
			System.out.println("Response from cache");
		}
		return response;
	}

}
