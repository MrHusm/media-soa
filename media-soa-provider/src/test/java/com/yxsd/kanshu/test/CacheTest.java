//package com.dangdang.digital.test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.annotation.Resource;
//import javax.print.attribute.standard.Media;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import com.alibaba.dubbo.common.json.JSON;
//import ICacheApi;
//import IConsumeApi;
//import IOrderApi;
//import IActivitySaleDao;
//import com.dangdang.kanshu.jssdb.pool.JssdbClient;
//import ICacheService;
//import ChapterCacheWholeVo;
//import ContentsVo;
//import MediaCacheWholeVo;
//
//public class CacheTest {
//
//	@Resource(name = "jssdbClient")
//	private JssdbClient ssdbClient;
//	
//	private static IOrderApi orderApi;
//	private static ICacheApi cacheApi;
//	private static ICacheService cacheService;
//	private static IConsumeApi consumeApi;
//
//	private static RabbitTemplate rabbitTemplate;
//
//	private static ThreadPoolTaskExecutor taskExecutor;
//
//	private static RedisTemplate<String, String> slaveRedisTemplateForWholeVo;
//
//	private static IActivitySaleDao activitySaleDao;
//
//	
//	@SuppressWarnings("resource")
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[] { "config/spring_common.xml" });
//		orderApi = (IOrderApi) cxt.getBean("orderApi");
//		cacheService = (ICacheService) cxt.getBean("cacheServiceImpl");
//		cacheApi = (ICacheApi) cxt.getBean("cacheApi");
//		consumeApi = (IConsumeApi) cxt.getBean("consumeApi");
//
//		rabbitTemplate = (RabbitTemplate) cxt.getBean("rabbitTemplate");
//		taskExecutor = (ThreadPoolTaskExecutor) cxt.getBean("taskExecutor");
//		slaveRedisTemplateForWholeVo = (RedisTemplate<String, String>) cxt.getBean("slaveRedisTemplate");
//		activitySaleDao = (IActivitySaleDao) cxt.getBean("activitySaleDaoImpl");
//		
//	}
//
//	public void test() throws Exception {
//		 ChapterCacheWholeVo vo = cacheApi.getChapterFromCache(1960249499l, 237);
//		
//		System.out.println(vo.getTitle());
//	}
//	
//	public void testContents() {
//		 try {
//			Map<Long, ContentsVo> vo = cacheApi.getContentsFromCache(1960251341l, 100009, null);
//			System.out.println(vo.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	public void testSsdb(){
//		ssdbClient.set("zhou","123123123");
//		System.out.println(ssdbClient.get("zhou"));
//		cacheApi.deleteSsdbString("");
//		System.out.println(ssdbClient.get("zhou"));
//	}
//	
//	public void testContent(){
//		try {
//			Map<Long, ContentsVo>  map = cacheApi.getContentsFromCache(1960262887L, 1, 5); 
//			System.out.println(map.size());
//			System.out.println(map.get(null).getChapterList().size());
//			System.out.println(JSON.json(map.get(null)));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void testMediaWholeCache(){
//		try {
//			MediaCacheWholeVo vo  = cacheApi.getMediaWholeFromCache(1900411216L); 
//			System.out.println(JSON.json(vo));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//}
