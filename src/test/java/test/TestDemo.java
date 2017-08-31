package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.online.cms.cms.readBook.domain.ElectronBook;
import com.online.cms.cms.readBook.service.ElectronBookService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-servlet.xml"}) 
public class TestDemo {
	
	@Autowired
	private ElectronBookService electronBookService;
	
	@Test
	public void update(){
		ElectronBook entity = new ElectronBook();
		entity.setId("434437");
		entity.setBookName("测试");
		electronBookService.updateByPrimaryKey(entity);
	}
}
