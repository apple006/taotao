/**
 * 
 */
package taotao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taotao.model.User;
import com.taotao.service.UserServiceI;

/**
 * @author HuangQinJian 下午3:13:07 2017年3月28日
 */
public class TestMybatis {
	private ApplicationContext ac;
	private UserServiceI userService;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml",
				"spring-mybatis.xml" });
		userService = (UserServiceI) ac.getBean("userService");
	}

	@Test
	public void test1() {
		Long l = (long) 7;
		User u = userService.getUserById(l);
		System.out.println(l);
		System.out.println(u);
		System.out.println(u.getPassword());
		System.out.println(u.getPhone());
	}
}
