package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ExceptionHandleFilter implements Filter{

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		try {
			chain.doFilter(request, response);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/pages/common/systemError.jsp");
			dispatcher.forward(request, response);
		}

	}

	@Override
	public void init(FilterConfig paramFilterConfig) throws ServletException {

	}

}
