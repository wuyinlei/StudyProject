package com.online.service;

import java.io.File;
import java.net.URI;

import com.online.common.storage.QiniuStorage;
import com.online.common.storage.ThumbModel;
import com.online.common.util.CommonUtil;

import junit.framework.TestCase;

public class QINiuTest extends TestCase{

	public void testImage(){
		
		//测试上传图片
//			byte[] buff = CommonUtil.getFileBytes(new File("/Users/wuyinlei/Desktop/test.png"));
//			String key = QiniuStorage.uploadImage(buff);
//			System.out.println("上传得到的key: " + key);
			
			///default/all/0/062bcd9e03c44ba7a4c2a3c7463c23c2.jpeg
			
			//测试下载图片
			String key = "/default/all/0/062bcd9e03c44ba7a4c2a3c7463c23c2.jpeg";
//			String url = QiniuStorage.getUrl(key);
//			System.out.println("下载得到的图片地址 url: " + url);
			
			//测试下载不同大小的图片
			String url = QiniuStorage.getUrl(key,ThumbModel.THUMB_128);
			System.out.println("下载得到的128*128的图片的地址 url : " + url);
			
		
	}
	
}
