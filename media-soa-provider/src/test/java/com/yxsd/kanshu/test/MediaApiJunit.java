/*package com.dangdang.digital.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import IRewardApi;

public class MediaApiJunit {
	private static IRewardApi rewardApi;

	@SuppressWarnings("resource")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[] { "config/spring_common.xml" });
		rewardApi = (IRewardApi) cxt.getBean("rewardApi");
	}

	@Test
	public void test() throws Exception {
		
		List<Long> mediaIdList = new ArrayList<Long>();
		mediaIdList.add(1900907179L);
		rewardApi.getRewardByMediaIds(mediaIdList);
		
	}
}*/