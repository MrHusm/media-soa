//package com.dangdang.digital.test;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import javax.annotation.Resource;
//
//import org.apache.commons.lang.StringUtils;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import IMessageApi;
//import IOrderApi;
//import IUserApi;
//import Message;
//import SafeConvert;
//
//public class MApiJunit {
//	private static IMessageApi messageApi;
//
//	@SuppressWarnings("resource")
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[] { "config/spring_common.xml" });
//		messageApi = (IMessageApi) cxt.getBean("messageApi");
//	}
//
//	@Test
//	public void test() throws Exception {
//		
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = df.parse("2015-08-01 00:00:00");
//		long timeVal = SafeConvert.convertStringToLong(null, date.getTime());
//		
//		Date earlierThan = new Date(timeVal);
//		
//		List<Message> messages = messageApi.getLetterBoxMsgList(50098037l, "DDDS-P", "iphone", earlierThan, 50);
//		System.out.println(messages.size());
//	}
//}