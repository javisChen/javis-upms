package javis.app.persistent;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ShiroTest {



	@Test
	public void contextLoads() {
	}

	@Before
	public void before() {

	}

	@Test
	public void testHelloworld() {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		Object principal = subject.getPrincipal();
		System.out.println(principal);
		Assert.assertEquals(true, subject.isAuthenticated());

		subject.logout();
	}

	@Test
	public void testCustomRealm() {
		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory =
				new IniSecurityManagerFactory("classpath:shiro-realm.ini");

		//2、得到SecurityManager实例 并绑定给SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);

		//3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

		try {
			//4、登录，即身份验证
			subject.login(token);
		} catch (AuthenticationException e) {
			//5、身份验证失败
			e.printStackTrace();
		}

		Assert.assertEquals(true, subject.isAuthenticated());

		//6、退出
		subject.logout();
	}


	@Test
	public void testCustomMultiRealm() {
		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory =
				new IniSecurityManagerFactory("classpath:shiro-multi-realm.ini");

		//2、得到SecurityManager实例 并绑定给SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);

		//3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("wang", "123");

		try {
			//4、登录，即身份验证
			subject.login(token);
		} catch (AuthenticationException e) {
			//5、身份验证失败
			e.printStackTrace();
		}

		Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录

		//6、退出
		subject.logout();
	}

	@Test
	public void testJDBCRealm() {
		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory =
				new IniSecurityManagerFactory("classpath:shiro-jdbc-realm.ini");

		//2、得到SecurityManager实例 并绑定给SecurityUtilso
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);

		//3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

		try {
			//4、登录，即身份验证
			subject.login(token);
		} catch (AuthenticationException e) {
			//5、身份验证失败
			e.printStackTrace();
		}

		Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录

		//6、退出
		subject.logout();
	}

}
