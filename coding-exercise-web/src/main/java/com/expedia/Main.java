package com.expedia;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.Globals;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class Main {
	private static final String WEB_DIR_LOCACTION = "src/main/webapp";
	private static final String PORT_ENV_KEY = "PORT";
	private static final String DEFAULT_PORT = "8080";

	public static void main(String[] args) throws ServletException, LifecycleException {
		Tomcat tomcat = new Tomcat();

		String webPort = System.getenv(PORT_ENV_KEY);
		
		if (webPort == null || webPort.isEmpty()) {
			webPort = DEFAULT_PORT;
		}
		
		tomcat.setPort(Integer.valueOf(webPort));

		StandardContext ctx = (StandardContext) tomcat.addWebapp("", new File(WEB_DIR_LOCACTION).getAbsolutePath());

		ctx.getServletContext().setAttribute(Globals.ALT_DD_ATTR,
				new File("./" + WEB_DIR_LOCACTION).getAbsolutePath() + "/WEB-INF/web.xml");
		File additionWebInfClasses = new File("target/classes");
		WebResourceRoot resources = new StandardRoot(ctx);
				new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/");
		ctx.setResources(resources);

		tomcat.start();
		tomcat.getServer().await();
	}
}
