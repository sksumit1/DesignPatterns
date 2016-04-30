package proxy_design_pattern.impl;

import java.sql.Timestamp;

import proxy_design_pattern.IResource;

public class DatabaseResource implements IResource {

	@Override
	public String execute() {
		return "Calling the database at --> "+new Timestamp(System.currentTimeMillis());
	}

}
