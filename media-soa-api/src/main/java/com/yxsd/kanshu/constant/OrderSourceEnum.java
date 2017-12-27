package com.yxsd.kanshu.constant;

/**
 * 
 * Description: 订单来源枚举 
 * All Rights Reserved.
 * @version 1.0  2015年10月30日 上午10:10:33  by 许文轩（xuwenxuan@dangdang.com）创建
 */
public enum OrderSourceEnum {
	
	TOPIC("topic", "专题"),
	COLUMN("column", "栏目"),
	PUSH("push", "推送"),
	CATEGORY("category", "分类"),
	LIST("list", "榜单"),
	BAR("bar", "书吧"),
	SEARCH("search", "搜索"),
	/**
	 * （包含频道书单、文章及翻篇文章关联）
	 */
	BOOK_LIST("bookList", "书单");
	
	private String key;

	private String name;

	private OrderSourceEnum(String key, String name) {
		this.key = key;
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static OrderSourceEnum getDigestTypeEnumByKey(String key) {
		for (OrderSourceEnum item : OrderSourceEnum.values()) {
			if (item.getKey() == key) {
				return item;
			}
		}
		return null;
	}

}
