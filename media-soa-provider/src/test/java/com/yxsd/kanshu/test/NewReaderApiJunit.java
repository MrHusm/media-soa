//package com.dangdang.digital.test;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import INewReaderMediaIdApi;
//import NewReaderMediaIds;
//
//public class NewReaderApiJunit {
//	private static INewReaderMediaIdApi newReaderMediaIdApi;
//
//	@SuppressWarnings("resource")
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[] { "config/spring_common.xml" });
//		newReaderMediaIdApi = (INewReaderMediaIdApi) cxt.getBean("newReaderMediaIdApi");
//	}
//
//	@Test
//	public void test() throws Exception {
//		NewReaderMediaIds newReaderMediaIds = newReaderMediaIdApi.getNewReaderMediaIdByMediaId(1900012649l);
//		System.out.println("设置缓存过期时间"+newReaderMediaIds.getMediaId());
//
//	}
//}