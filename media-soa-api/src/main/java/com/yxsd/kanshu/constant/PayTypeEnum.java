package com.yxsd.kanshu.constant;

public enum PayTypeEnum {

	APP_WX("APP_WX","APP微信支付"),//APP 微信支付
	APP_ALIPAY("APP_ALIPAY","APP支付宝支付"),
	PC_WX("PC_WX","pc微信扫码支付"),//pc微信扫码支付
	H5_WX_WAP("H5_WX_WAP","微信H5wap支付"),//微信H5wap支付
	H5_WX_PA("H5_WX_PA","微信H5公众号支付"),//微信H5公众号支付
	H5_ALIPAY("H5_ALIPAY","H5支付宝支付");
	private String source;
	private String name;

	
	private PayTypeEnum(String source,String name){
		this.source = source;
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
