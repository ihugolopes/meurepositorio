package controll;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

 
@WebFilter(asyncSupported=true,urlPatterns= {"/*"})
public class CorsFilter implements Filter {

	public CorsFilter() {
    }
	public void destroy() {
	}

	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
       HttpServletResponse response = (HttpServletResponse) resp;
         response.addHeader("Access-Control-Allow-Origin", "*");
         response.addHeader("Access-Controll-Allow-Methods",
        		                    "POST,GET,PUT,DELETE,OPTIONS");
         response.addHeader("Access-Controll-Allow-Headers", "Content-type");
         response.addHeader("allow", "POST,GET,PUT,DELETE,OPTIONS");
		chain.doFilter(req, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
