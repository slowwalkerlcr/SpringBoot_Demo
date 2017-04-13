 
  
package com.springboot.lvcr.filter;  

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**  
 *  
 * @TODO  ADD REASON 
 * @Date  2017年4月12日 下午2:53:10   
 * @author   Edison_lv  
 * @version            
 */

public class TestFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {

		// TODO Auto-generated method stub  

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		request.getServletContext();
		
		HttpServletRequest hreq = (HttpServletRequest) request;  
        String url = hreq.getServletPath();
        System.out.println("url:======>"+url);

	}

	public void destroy() {

		// TODO Auto-generated method stub  

	}

}
  
