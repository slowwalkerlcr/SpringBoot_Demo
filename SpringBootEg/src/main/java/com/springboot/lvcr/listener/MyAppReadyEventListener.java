 
  
package com.springboot.lvcr.listener;  

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**  
 *  
 * @TODO  ADD REASON 
 * @Date  2017年4月12日 下午1:46:45   
 * @author   Edison_lv  
 * @version            
 */
public class MyAppReadyEventListener implements ApplicationListener<ApplicationReadyEvent>{


	public void onApplicationEvent(ApplicationReadyEvent event) {
		  
		System.out.println("ApplicationReadyEvent：spring 加载完毕执行事件"); 
		
	}


	

}
  
