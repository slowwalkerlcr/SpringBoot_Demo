 
  
package com.springboot.lvcr.listener;  

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**  
 *  
 * @TODO  ADD REASON 
 * @Date  2017年4月12日 下午1:46:45   
 * @author   Edison_lv  
 * @version            
 */
public class MyAppStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{

	public void onApplicationEvent(ApplicationStartedEvent event) {
		  
		System.out.println("ApplicationStartedEvent：spring boot启动开始时执行的事件"); 
		
	}

}
  
