 
  
package com.springboot.lvcr.listener;  

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**  
 *  
 * @TODO  ADD REASON 
 * @Date  2017年4月12日 下午1:46:45   
 * @author   Edison_lv  
 * @version            
 */
public class MyAppPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent>{

	public void onApplicationEvent(ApplicationPreparedEvent event) {
		  
		System.out.println("ApplicationPreparedEvent：spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的。"); 
		
	}

	

}
  
