/**
 * 
 */
package com.ab.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Abhinav
 * @Date Jan 6, 2019
 * @Time 12:55:44 AM
 */
@Configuration
@Import(value = { PersistenceConfig.class })
public class RootConfig {

}
