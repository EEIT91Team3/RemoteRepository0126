package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RegisterDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
<<<<<<< HEAD

=======
<<<<<<< HEAD
	int aaa;
=======
>>>>>>> branch 'master' of https://github.com/EEIT91Team3/RemoteRepository0126
>>>>>>> branch 'master' of https://github.com/EEIT91Team3/RemoteRepository0126
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcJavaConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.controller"};
	}
}

