package com.ict.common;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Summer_Controller {
	@Autowired
	private FileReName fileReName;
	

	@PostMapping(value = "/saveImage.do")
	@ResponseBody
	public Map<String, String> saveImag(ImgVO vo, HttpServletRequest request){
		Map<String, String> map = new HashMap<String, String>();
		
		// �Ѿ�� ���� ����
		MultipartFile f = vo.getS_file();
		String fname = null;
		if(f.getSize()>0) {
			
			// ÷������ ��ġ
			String path = request.getSession().getServletContext().getRealPath("/resources/upload");
			
			
			UUID uuid = UUID.randomUUID();
			// ���� ���� �̸��� ������ ���ε带 ���ϹǷ� �̸��� ���� ���Ѿ� �Ѵ�.
			// ��, �ѹ� �̻��� �ȵȴ�.(���߿� ��ġ�� �ʰ� �������Ѵ�.)
			fname = uuid.toString()+"_"+f.getOriginalFilename();
			
			try {
				// ���ε�
				f.transferTo(new File(path, fname));
			} catch (IllegalStateException e) {	
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}			
			// �񵿱�� ��û�̹Ƿ� ����� ������ ��ο� ���ϸ��� ������ �Ѵ�.
			map.put("fname", fname);
			map.put("path", "/resources/upload");
			
			//pom.xml�� json ��ȯ ���ִ� ���̺귯�� �߰�
			return map;
		}
		return null;
	}
}