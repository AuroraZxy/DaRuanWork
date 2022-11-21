/**
 * @Title UserVO.java
 * @author 张翔宇
 * @description 
 * @date 2022年9月15日下午3:37:18
 */
package com.sx.oesb.vo;

import com.sx.oesb.entity.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** 
* @ClassName UserVO 
* @Description 补充用户信息实体，没有数据表，只用于展示
* @author 张翔宇
* @date 2022年9月15日 下午3:37:18 
*  
*/
@ApiModel(value = "UserVO对象", description = "")
public class UserVO extends User{

	private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("用户登最近录次数")
    private int times;

	/**
	 * @return times
	 */
	public int getTimes() {
		return times;
	}

	/**
	 * @param times 要设置的 times
	 */
	public void setTimes(int times) {
		this.times = times;
	}
    
    
}
