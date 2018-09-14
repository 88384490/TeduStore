package cn.tedu.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller //实例化控制器
@RequestMapping("/upload")
public class UploadController {
    @RequestMapping("/showUpload.do")
    //1 显示上传的表单
    public String showUpload(){
        return "upload";
    }
    @RequestMapping("/uploadFile.do")
    //2 实现上传文件的功能
    public String uploadFile(MultipartFile file) throws Exception {
        //1 实现上传功能
        //把文件放到制定文件夹下的路径中
        file.transferTo(new File("/Users/zhouyi/Desktop/www",file.getOriginalFilename()));
        //2 响应页面
        return "redirect:../main/showIndex.do";
    }
}
