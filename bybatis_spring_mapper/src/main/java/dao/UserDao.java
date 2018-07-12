package dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.entity.User;

/**
 * @author Administrator
 *
 */
public class UserDao extends SqlSessionDaoSupport{

	public User selectById(int id){
		SqlSession session =super.getSqlSession();
		User user=session.selectOne("selectById");
		return user;
	}
	
	
	
}
