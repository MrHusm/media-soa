package com.yxsd.kanshu.test;

/**
 * Description:
 * Created  2015/12/28 16:35  by xinghaifang
 */
public class GetEBook {
//    private  static IAuditionVoteApi auditionVoteApi;
//	@SuppressWarnings("resource")
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[] { "config/spring_common.xml" });
//        auditionVoteApi = (IAuditionVoteApi) cxt.getBean("auditionVoteApi");
//	}
//
//	@Test
//	public void test() throws Exception {
//		Long custId = 10l;
//		String code = "1";//0 为放弃,1 为领取.
//		String sign = "lottery";
//		String deviceSerialNo = "efaasdfasdgag";
//		String timestamp = String.valueOf(System.currentTimeMillis());
//		String projectId = "1900411217";//领取书籍的id.
//		String deviceType = "android";
//		String ip = "127.0.0.1";
//        Map<String,Object> resultMap = auditionVoteApi.getEBookAuthority(custId,code,sign,deviceSerialNo,timestamp,projectId,deviceType,ip);
//		System.out.println(resultMap);
//	}
//	public static void main(String[] args){
//		Map<String,Object> mapOrderInfo = null;
//		Map<String,Object> orderRelative = null;
//		Map<String,Object> orders = null;
//		Map<String,Object> orderDeliveryInfo = null;
//		String orderInfo = "{\"errorcode\":0,\"message\":\"success\",\"orderRelative\":{\"orderDeliveryInfo\":{},\"orders\":{\"cust_email\":\"8e1a375962907a3f@qq_user.com\",\"cust_id\":239038347,\"from_platform\":2,\"order_creation_date\":\"2017-04-27 15:01:00\",\"order_id\":35041688847,\"order_source\":\"537-100380\",\"order_status\":1000,\"order_type\":98,\"payment_method_type\":1,\"payment_provider_id\":79}},\"statusCode\":0}";
//		try {
//		mapOrderInfo = (Map<String,Object>) JSON.parse(orderInfo);
//		mapOrderInfo = (Map<String,Object>)JSON.parse(orderInfo);
//		if(mapOrderInfo != null){
//			orderRelative = (Map<String,Object>)JSON.parse(mapOrderInfo.get("orderRelative").toString());
//		}
//		if(orderRelative != null){
//			orders = (Map<String,Object>)JSON.parse(orderRelative.get("orders").toString());
//			orderDeliveryInfo = (Map<String,Object>)JSON.parse(orderRelative.get("orderDeliveryInfo").toString());
//		}
//		} catch (Exception e) {
//			System.err.println("【解绑绑定调度】 操作失败---recordInfo 格式不正确");
//		}
//
//	}
}
