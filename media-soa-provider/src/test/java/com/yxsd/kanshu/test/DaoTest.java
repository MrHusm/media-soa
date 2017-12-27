//package com.dangdang.digital.test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import IBookListDetailExtDao;
//import BookListDetailExt;
//import IBookListDetailService;
//
//public class DaoTest {
//	
//	private static IBookListDetailExtDao bookListDetailExtDao;
//	
//	private static IBookListDetailService bookListDetailService;
//	
//	@SuppressWarnings("resource")
//	@BeforeClass
//	public static void setUpBeforeClass() {
//		try {
//			ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]{"config/spring_common.xml"});
//			bookListDetailExtDao = (IBookListDetailExtDao)cxt.getBean("bookListDetailExtDao");
//			bookListDetailService = (IBookListDetailService)cxt.getBean("bookListDetailService");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void test(){
//		Assert.assertNotNull(bookListDetailExtDao);
//		Assert.assertNotNull(bookListDetailService);
//		List<Long> mediaIds = new ArrayList<Long>();
//		mediaIds.add(1960251659L);
//		List<BookListDetailExt> list = bookListDetailExtDao.selectChannelIdsByMediaIds(mediaIds);
//		Assert.assertNotNull(list);
//		
//		Map<Long, List<Long>> retMap = bookListDetailService.selectChannelIdsByMediaIds(mediaIds);
//		Assert.assertNotNull(retMap);
//		System.out.println("123");
//	}
//
//}
