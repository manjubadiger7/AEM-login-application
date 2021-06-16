package com.adobe.aem.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class)
@SlingServletPaths(value = { "/bin/aemLoginServlet" })
public class Login extends SlingAllMethodsServlet {
	private static final long serialVersionUID = 1L;

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		LOG.info("Comming inside doPost");

		String data = request.getParameter("data");
		LOG.info(data);
		System.out.println(data);

	}

}
