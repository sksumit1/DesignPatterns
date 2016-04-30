package proxy_design_pattern;

import proxy_design_pattern.impl.CacheProxy;

public class MainClass {

	public static void main(String[] args) {
		IResource resource = new CacheProxy();
		System.out.println(resource.execute());
		System.out.println(resource.execute());
	}

}
