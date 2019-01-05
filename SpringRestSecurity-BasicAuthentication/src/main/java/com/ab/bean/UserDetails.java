/**
 * 
 */
package com.ab.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Abhinav
 * @Date Jan 6, 2019
 * @Time 12:38:00 AM
 */
@Getter
@Setter
@ToString
public class UserDetails {

	private long id;
	private String name;
	private int age;
	private double salary;

}
