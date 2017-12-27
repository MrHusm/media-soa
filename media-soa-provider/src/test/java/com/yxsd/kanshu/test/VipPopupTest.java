package com.yxsd.kanshu.test;

/**
 * Description:
 * Created  2016/7/8 15:29  by xinghaifang
 */
public class VipPopupTest {
//    private static IChannelApi channelApi;
//    private static ICacheApi cacheApi;
//    @SuppressWarnings("resource")
//    @BeforeClass
//    public static void setUpBeforeClass() throws Exception {
//        ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]{"config/spring_common.xml"});
//        channelApi = (IChannelApi)cxt.getBean("channelApi");
//        cacheApi = (ICacheApi)cxt.getBean("cacheApi");
//    }
//
//    @Test
//    public void popupManagertest() {
//        MessageBkVo<PopupManager> messageBkVo = channelApi.vipPopup(50098037l);
//        System.out.println("返回---" + messageBkVo.isResult() + messageBkVo.getDesc());
//    }
//
//    @Test
//    public void emptyPopupTest(){
//        Long custId = 50098037l;
//
//        Boolean flagPopup = channelApi.emptyPopupContainer(custId);
//        System.out.println("清空计数器返回--" + flagPopup);
//    }
//    @Test
//    public void isInByColumnCodeAndProductIdTest(){
//        // 在判断是否参与该活动.
//        TupleUtils.ResultTwoTuple<List<Long>, ColumnResultMsg> reuslt = cacheApi
//                .getMediaIdListByColumnCode(0, 0, "all_manjian");
//        List<Long> productIds = reuslt.total;
//
//        String columnCode ="all_manjian";
//        Long startTime = new Date().getTime();
//        System.out.println("开始时间戳" + new Date().getTime());
//        for(int i=0;i<productIds.size();i++){
//            try {
//                boolean flag = cacheApi.isInByColumnCodeAndProductId(productIds.get(i),columnCode);
//                System.out.println("书籍productId--" + productIds.get(i) +"---是否在满减池子中--" + flag);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("结束时间戳" + new Date().getTime());
//        System.out.println("运行"+productIds.size()+"本书籍需要的时间" + (new Date().getTime()-startTime));
//
//    }
}
