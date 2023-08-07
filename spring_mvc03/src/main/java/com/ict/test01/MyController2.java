package com.ict.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
public class MyController2 {
	
	// ���� ���ε�� post ����̾�� �ϰ�
	// pom.xml�� cos ���̺귯���� �־���� �Ѵ�.
	@PostMapping(value="f_up.do")
	public ModelAndView getFileUp(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("test01/result3");
		String path = request.getSession().getServletContext().getRealPath("/resources/images");
		try {
			MultipartRequest mr = 
					new MultipartRequest(request, path, 500*1024*1024,
							"utf-8", new DefaultFileRenamePolicy());
			String name = mr.getParameter("name"); // �ø���� �̸�
			String f_name = mr.getOriginalFileName("f_name"); 	//�ø��� ���� �̸�
			String f_name2 = mr.getFilesystemName("f_name");	//�����Ҷ� ���� �̸�
			String file_type = mr.getContentType("f_name");
			
			File file = mr.getFile("f_name");
			long size = file.length()/1024; // KB
			SimpleDateFormat day = new SimpleDateFormat("yy.MM.DD hh:mm:ss E");
			String lastday = day.format(file.lastModified());
			
			mv.addObject("name", name);
			mv.addObject("f_name", f_name);
			mv.addObject("f_name2", f_name2);
			mv.addObject("file_type", file_type);
			mv.addObject("size", size);
			mv.addObject("lastday", lastday);
			return mv;
		} catch (Exception e) {


		}
		return null;
	}
	// spring ���� �����ϴ� ���� ���ε�
	// servlit-context.xml�� ���� ���ε�� Ŭ���� ���
	// ���ε� �� ���� �뷮 ���� ����
	// ���ε��Ҷ��� �̸��� ����Ѵ�.
	// @RequestParam => �Ķ���͸� ���� �� ����� �� �ִ�.
	@PostMapping(value ="/f_up2.do")
	public ModelAndView getFileUp2(
			@RequestParam("f_name")MultipartFile file,
			@RequestParam("name") String name,
			HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mv = new ModelAndView("test01/result4");
		String path = request.getSession().getServletContext().getRealPath("/resources/images");
		try {
			// �����̸��� �����ϸ� �ȵ�(���߿��� �����̸� �˻� �� ���� �̸� ������ ����)
			String f_name = file.getOriginalFilename();
			String f_type = file.getContentType();
			long size = file.getSize()/1024;
			
			// �Ǥ� �̹����� �ø��� �۾�
			byte[] in = file.getBytes();
			
			// �ø� ��ҿ� �̸� ����
			File out = new File(path,f_name);
			
			// ���� ����(upload)
			FileCopyUtils.copy(in, out);
			
			mv.addObject("name", name);
			mv.addObject("f_name", f_name);
			mv.addObject("f_type", f_type);
			mv.addObject("size", size);
			
			return mv;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	@GetMapping("/down.do")
	public void getFileDown(HttpServletRequest request, HttpServletResponse response) {
		String f_name =request.getParameter("f_name");
		String path = request.getSession().getServletContext().getRealPath("/resources/images/"+ f_name);
		try {
			String realpath = URLEncoder.encode(path, "utf-8");
			// ������ ����
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename="+realpath);
			
			// ���� ����
			File file = new File(new String(path.getBytes()));
			FileInputStream in = new FileInputStream(file);
			OutputStream out = response.getOutputStream();
			
			
			// ���� ����(upload)
			FileCopyUtils.copy(in, out);
		} catch (Exception e) {
		
		}
	}
}