package com.wwj.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping("/uploadUrl")
	public String   handleFormUpload(@RequestParam("filename") MultipartFile[] files,HttpServletRequest  req){
		//判断文件是否存在
		if(files.length>0){
			for (MultipartFile multipartFile : files) {
				//获取上传文件的原始名字
				String originalFilename = multipartFile.getOriginalFilename();
				//一般决定于项目设计的时候所规范的路径
				String dirPath = req.getServletContext().getRealPath("/upload/");
				File filePath = new File(dirPath);
				 //如果保存文件的地址不存在，就先创建目录
                if(!filePath.exists()) {
                    filePath.mkdirs();
                }
               // String newFilename = UUID.randomUUID()+"_"+originalFilename;
                String newFilename = originalFilename;
                try {
					multipartFile.transferTo(new File(dirPath + newFilename));
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
	
	@RequestMapping("/uploadUrl1")
	public void   handleFormUpload1(@RequestParam("filename") MultipartFile[] files,HttpServletRequest  req,HttpServletResponse resp){
		//判断文件是否存在
		if(files.length>0){
			for (MultipartFile multipartFile : files) {
				//获取上传文件的原始名字
				String originalFilename = multipartFile.getOriginalFilename();
				//一般决定于项目设计的时候所规范的路径
				String dirPath = req.getServletContext().getRealPath("/upload/");
				File filePath = new File(dirPath);
				 //如果保存文件的地址不存在，就先创建目录
                if(!filePath.exists()) {
                    filePath.mkdirs();
                }
                String newFilename = UUID.randomUUID()+"_"+originalFilename;
                try {
					multipartFile.transferTo(new File(dirPath + newFilename));
					

				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    
			}
    		try {
					resp.getWriter().write("ok");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		

	
		
		
	}
}
