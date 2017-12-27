package com.yxsd.kanshu.test;

/**
 * Created by liyue on 2017/7/15.
 */
public class SigninTest {

//    private static ISigninApi signinApi;
//    private static ISigninNoticeService signinNoticeService;
//    @BeforeClass
//    public static void setUpBeforeClass() throws Exception {
//        ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]{"config/spring_common.xml"});
//        signinApi = (ISigninApi) cxt.getBean(ISigninApi.class);
//        signinNoticeService = (ISigninNoticeService) cxt.getBean(ISigninNoticeService.class);
//    }
//
//    @Test
//    public void testGetSigninNoticeList()throws Exception{
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        List<SigninNotice> list = signinNoticeService.getSigninNoticeInCalendar(sdf.parse("20170701"),sdf.parse("20170715"));
//        System.out.println(list.size());
//    }
//
//    @Test
//    public void testCheckSigninStat() throws Exception{
//        SigninResultVO vo = signinApi.todayIsSingin(1644442101L);
//
//        System.out.println(JSON.toJSONString(vo));
//
//    }
//
//    @Test
//    public void testSigninV2() throws Exception{
//        Long custId = 1644442102L;
//        String platformNo = "1002";
//        String deviceType ="Android";
//        String deviceSerialNo = "666662sadfassdvdfsd66";
//        SigninResultVO signinResultVO = signinApi.signinV2(custId,platformNo,deviceType,deviceSerialNo);
//
//        System.out.println(JSON.toJSONString(signinResultVO));
//        Assert.assertTrue(signinResultVO.isSucc());
//        Assert.assertTrue(signinResultVO.getIsSignin());
//    }
//
//
//    @Test
//    public void testSigninAndCheck() throws Exception{
//        Long custId = 1644442101L;
//        String platformNo = "1002";
//        String deviceType ="Android";
//        String deviceSerialNo = "666662ergsdfsd667";
//        SigninResultVO signinResultVO = signinApi.signinV2(custId,platformNo,deviceType,deviceSerialNo);
//
//        System.out.println(JSON.toJSONString(signinResultVO));
//        SigninResultVO vo = signinApi.todayIsSingin(custId);
//
//        System.out.println(JSON.toJSONString(vo));
//        Assert.assertTrue(signinResultVO.isSucc());
//        Assert.assertTrue(signinResultVO.getIsSignin());
//    }
}
