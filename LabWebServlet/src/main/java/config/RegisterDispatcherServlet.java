package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RegisterDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	int aaa;
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcJavaConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.controller"};
	}
}

