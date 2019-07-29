package com.wwj.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownloadController {

@RequestMapping("/downloadone")
	public ResponseEntity<byte[]> download(HttpServletRequest req) throws IOException {
		// 这个路径由数据库中取出
		String resourceName = "计划.txt";
		// 指定全路径位置
		File file = new File(req.getServletContext().getRealPath("/upload/")+resourceName);
		HttpHeaders headers = new HttpHeaders();
		// 避免出现文件名乱码
		String filename = new String(resourceName.getBytes("utf-8"),"iso-8859-1");
		//设置响应的内容   attachment 附件
		headers.setContentDispositionFormData("attachment", filename);
		// 设置响应的内容为流的方式
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}

	
	@RequestMapping("/downloadmore")
	public ResponseEntity<byte[]> download1s(HttpServletRequest req) throws IOException {

		//数据库中提取
		List<String> list = new ArrayList<String>();
		list.add("计划.txt");
		list.add("进度.txt");
		
		//压缩后的文件名
		String resourcesName = "test.zip";
		//压缩后的全路径
		String  pathName = req.getServletContext().getRealPath("/upload/");
		File  zipFile = new File(pathName+resourcesName);
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		//读取并写入到压缩包里面
		InputStream input = null;
		for (String str : list) {
			String name = pathName+str;
			input = new FileInputStream(new File(name));  
            zipOut.putNextEntry(new ZipEntry(str));  
            int temp = 0;  
            while((temp = input.read()) != -1){  
                zipOut.write(temp);  
            }  
            input.close();
		}
		zipOut.close();
		File file = new File(pathName+resourcesName);
		HttpHeaders headers = new HttpHeaders();
		String filename = new String(resourcesName.getBytes("utf-8"),"iso-8859-1");
		headers.setContentDispositionFormData("attachment", filename);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);

	}
	

}
