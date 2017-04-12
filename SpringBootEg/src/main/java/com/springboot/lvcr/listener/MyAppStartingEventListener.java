 
  
package com.springboot.lvcr.listener;  

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**  
 *  
 * @TODO  ADD REASON 
 * @Date  2017年4月11日 下午2:34:16   
 * @author   Edison_lv  
 * @version            
 */
public class MyAppStartingEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent>{

	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent   event) {
		  
		System.out.println("ApplicationEnvironmentPreparedEvent：spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建"); 
		
	}

}
  
