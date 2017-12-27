package com.yxsd.kanshu.test;

import com.yxsd.kanshu.api.IBookApi;
import com.yxsd.kanshu.product.model.Book;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApiJunit {
	private static IBookApi bookApi;

	@SuppressWarnings("resource")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[] { "config/spring_common.xml" });
		bookApi = (IBookApi) cxt.getBean("bookApi");
	}

	@Test
	public void test() throws Exception {

        Book book = bookApi.getBookById(43257L);

		System.out.println(book);
	}
}