/**
 * 
 */
package taotao;

import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.dao.ItemMapper;
import com.taotao.model.Item;

/**
 * @author HuangQinJian 下午2:32:20 2017年4月2日
 */
public class TestPageHelper {
	@Test
	public void testPageHelper() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml", "spring-mybatis.xml",
						"SqlMapConfig.xml" });
		ItemMapper mapper = ac.getBean(ItemMapper.class);
		PageHelper.startPage(2, 10);
		List<Item> list = mapper.getAllItems();
		for (Item item : list) {
			System.out.println(item.getTitle());
		}
		PageInfo<Item> pageInfo = new PageInfo<Item>(list);
		long total = pageInfo.getTotal();
		System.out.println(total);
	}
}
