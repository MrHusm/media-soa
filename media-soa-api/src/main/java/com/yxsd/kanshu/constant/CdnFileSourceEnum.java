package com.yxsd.kanshu.constant;


public enum CdnFileSourceEnum {
	ARTICLE("article"),
	COLUMN("column"),//cms后台栏目上传图片
	BAR("bar"),
	CHANNEL("channel"),
	APPJAR("appjar"),//应用产品jar文件
	BOOKLIST("booklist"),
	CATEGORY("category"),
	READPLAN("readplan"),
	MEDIAWIDGET("mediaWidget");//cms静态化控件缩略图
	
	private String type;
		
	public String getType() {
		return type;
	}
	private CdnFileSourceEnum(String type){
		this.type = type;
	}
	public static boolean isExist(String type){
		for(CdnFileSourceEnum cdnFileSource : CdnFileSourceEnum.values()){
			if(cdnFileSource.getType().equals(type)){
				return true;
			}
		}
		return false;
	}
}
