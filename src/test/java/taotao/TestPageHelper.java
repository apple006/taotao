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
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.Items;
import com.taotao.pojo.ItemExample;

/**
 * @author HuangQinJian 下午2:32:20 2017年4月2日
 */
public class TestPageHelper {
	/*@Test
	public void testPageHelper() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml", "spring-mybatis.xml" });
		TbItemMapper mapper = ac.getBean(TbItemMapper.class);
		ItemExample example = new ItemExample();
		PageHelper.startPage(1, 10);
		List<Items> list = mapper.selectByExample(example);
		for (Items item : list) {
			System.out.println(item.getTitle());
		}
		PageInfo<Items> pageInfo = new PageInfo<Items>(list);
		long total = pageInfo.getTotal();
		System.out.println(total);
	}*/
}
