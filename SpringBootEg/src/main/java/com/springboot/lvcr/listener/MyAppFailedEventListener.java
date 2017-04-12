 
  
package com.springboot.lvcr.listener;  

import org.springframework.boot.context.event.ApplicationFailedEvent;
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
public class MyAppFailedEventListener implements ApplicationListener<ApplicationFailedEvent>{

	public void onApplicationEvent(ApplicationFailedEvent event) {
		  
		System.out.println("ApplicationFailedEvent：spring boot启动异常时执行事件"); 
		
	}


	

}
  
