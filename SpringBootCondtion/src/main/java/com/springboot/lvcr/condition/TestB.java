 
  
package com.springboot.lvcr.condition;  

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**  
 *  
 * @TODO  ADD REASON 
 * @Date  2017年4月19日 下午4:53:13   
 * @author   Edison_lv  
 * @version            
 */
@Component
//@ConditionalOnProperty(prefix = "user.name", value = "enabled", matchIfMissing = true)
@ConditionalOnProperty(prefix = "user",value = "namessss")
public class TestB {
	
	public TestB(){
		System.out.println("=====================new  TestB");
	}

}
  
