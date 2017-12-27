package com.yxsd.kanshu.constant;

/**
 * 订单常量类
 * Description: 
 * All Rights Reserved.
 * @version 1.0  2015年7月10日 下午3:39:51  by 张宪斌（zhangxianbin@dangdang.com）创建
 */
public class OrderConstant {

	/**
	 * 
	 * Description: 订单查询标志枚举类
	 * All Rights Reserved.
	 * @version 1.0  2015年7月10日 下午3:40:51  by 张宪斌（zhangxianbin@dangdang.com）创建
	 */
	public enum QueryFlagEnum{
		QUERY_0(0,"包含订单明细"),
		QUERY_1(1,"包含全部信息"),
		QUERY_2(2,"包含订单明细和章节明细"),
		QUERY_3(3,"包含订单扩展信息"),
		QUERY_4(4,"包含订单明细和扩展信息");
		
		private int key;
		private String desc;
		
		private QueryFlagEnum(int key,String desc){
			this.key = key;
			this.desc = desc;
		}

		public int getKey() {
			return key;
		}

		public String getDesc() {
			return desc;
		}
		
		public static QueryFlagEnum getByKey(Integer key){
			if(key == null){
				return null;
			}
			for(QueryFlagEnum queryFlagEnum : QueryFlagEnum.values()){
				if(queryFlagEnum.getKey() == key){
					return queryFlagEnum;
				}
			}
			return null;
		}
		
	}
	
}
