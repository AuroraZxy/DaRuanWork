/**
 * @Title UserService.java
 * @author 张翔宇
 * @description 
 * @date 2022年9月2日下午2:15:52
 */
package com.sx.oesb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sx.oesb.entity.Answer;
import com.sx.oesb.entity.Article;
import com.sx.oesb.entity.Comment;
import com.sx.oesb.entity.Course;
import com.sx.oesb.entity.Question;
import com.sx.oesb.entity.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/** 
* @ClassName UserService 
* @Description 用户表相关的服务
* @author 张翔宇
* @date 2022年9月2日 下午2:15:52 
*  
*/
public interface UserService {
	

	  /**
		 * @Title checkAllUseres
	     * @author 张翔宇
	     * @description 所有用户列表，页面形式。参数有页面信息。
	     * @createdate 2022年9月2日 下午2:34:06
	     * @param pageSize
	     * @param pageNum
	     * @return IPage<User>
	     **/
	public IPage<User> checkAllUsers(int pageSize, int pageNum);
	
	  /**
		 * @Title searchUserByID
	     * @author 张翔宇
	     * @description 根据id找到用户
	     * @createdate 2022年9月2日 下午2:34:33
	     * @param id
	     * @return User
	     **/
	public User searchUserByID(int id);

	
	  /**
		 * @Title deleteUser
	     * @author 张翔宇
	     * @description 删除id用户，返回是否成功
	     * @createdate 2022年9月2日 下午2:55:49
	     * @param id
	     * @return boolean
	     **/
	public boolean deleteUser(int id);
	
	 

	  /**
		 * @Title modifyUser
	     * @author 张翔宇
	     * @description 更改id用户，返回是否成功，u需要写入id
	     * @createdate 2022年9月4日 下午4:02:16
	     * @param u
	     * @return boolean
	     **/
	public boolean modifyUser(User u);
	
	  /**
		 * @Title checkArticleOfUser
	     * @author 张翔宇
	     * @description 查找id用户所有文章，参数有页面信息。
	     * @createdate 2022年9月2日 下午2:35:29
	     * @param userId
	     * @param pageSize
	     * @param pageNum
	     * @return IPage<Article>
	     **/
	public IPage<Article> checkArticleOfUser(int  userId,int pageSize,int pageNum);

	  /**
		 * @Title checkQuestionOfUser
	     * @author 张翔宇
	     * @description 查找id用户的所有提问，参数有页面信息。
	     * @createdate 2022年9月2日 下午2:36:15
	     * @param userId
	     * @param pageSize
	     * @param pageNum
	     * @return IPage<Question>
	     **/
	public IPage<Question> checkQuestionOfUser(int  userId,int pageSize,int pageNum);

	  /**
		 * @Title checkAnswerOfUser
	     * @author 张翔宇
	     * @description 查找id用户的所有回答，参数有页面信息。
	     * @createdate 2022年9月2日 下午2:36:46
	     * @param userId
	     * @param pageSize
	     * @param pageNum
	     * @return IPage<Answer>
	     **/
	public IPage<Answer> checkAnswerOfUser(int  userId,int pageSize,int pageNum);

	  /**
		 * @Title checkCommentOfUser
	     * @author 张翔宇
	     * @description 查找id用户的所有评论，参数有页面信息。
	     * @createdate 2022年9月2日 下午2:37:16
	     * @param userId
	     * @param pageSize
	     * @param pageNum
	     * @return IPage<Comment>
	     **/
	public IPage<Comment> checkCommentOfUser(int  userId,int pageSize,int pageNum);

	  /**
		 * @Title checkPurchaseCourse
	     * @author 张翔宇
	     * @description 查找id用户的购买课程，参数有页面信息。
	     * @createdate 2022年9月2日 下午2:37:26
	     * @param userId
	     * @param pageSize
	     * @param pageNum
	     * @return IPage<Course>
	     **/
	public IPage<Course> checkPurchaseCourse(int userId, int pageSize,int pageNum);
	
	  /**
		 * @Title checkStarCourse
	     * @author 张翔宇
	     * @description 查找id用户的收藏课程，参数有页面信息。
	     * @createdate 2022年9月2日 下午2:37:40
	     * @param userId
	     * @param pageSize
	     * @param pageNum
	     * @return IPage<Course>
	     **/
	public IPage<Course> checkStarCourse(int  userId,int pageSize,int pageNum);
	
	  /**
		 * @Title isArticleOfUser
	     * @author 张翔宇
	     * @description 判断是否是用户的文章
	     * @createdate 2022年9月9日 上午10:53:27
	     * @param userId
	     * @param aId
	     * @return boolean
	     **/
	public boolean isArticleOfUser(int  userId,int aId);
	
	  /**
		 * @Title isQuestionOfUser
	     * @author 张翔宇
	     * @description 判断是否是用户的问题
	     * @createdate 2022年9月9日 上午10:53:59
	     * @param userId
	     * @param qId
	     * @return boolean
	     **/
	public boolean isQuestionOfUser(int  userId,int qId);
	
	  /**
		 * @Title isAnswerOfUser
	     * @author 张翔宇
	     * @description 判断是否是用户的回答
	     * @createdate 2022年9月9日 上午10:55:22
	     * @param userId
	     * @param aId
	     * @return boolean
	     **/
	public boolean isAnswerOfUser(int  userId,int aId);

	  /**
		 * @Title isCoursePurchsed
	     * @author 张翔宇
	     * @description 用户是否购买课程
	     * @createdate 2022年9月5日 下午4:41:10
	     * @param userId
	     * @param CourseId
	     * @return boolean
	     **/
	public boolean isCoursePurchsed(int userId,int courseId);
	
	  /**
		 * @Title isCourseStared
	     * @author 张翔宇
	     * @description 用户是否收藏课程
	     * @createdate 2022年9月5日 下午4:41:13
	     * @param userId
	     * @param courseId
	     * @return boolean
	     **/
	public boolean isCourseStared(int userId,int courseId);
	
	  /**
		 * @Title deleteUserStar
	     * @author 张翔宇
	     * @description 删除用户的收藏
	     * @createdate 2022年9月12日 上午10:24:45
	     * @param userId
	     * @param courseId
	     * @return boolean
	     **/
	public boolean deleteUserStar(int userId,int courseId);
	
	public User login(String username, String password);

	public void register(String username, String password);

	User searchUserByUsername(String username) throws UsernameNotFoundException;
}
