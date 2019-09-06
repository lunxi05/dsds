package com.blackswan.web.controller.qna;

import java.io.File;
import java.sql.SQLException;
import java.util.Enumeration;

import com.blackswan.web.entity.Qna;

public class RegFileInputController {
	Qna qna = new Qna();
	String uploadPath = request.getRealPath("/upl0oadFile");out.println("절대경로 : "+uploadPath+"<br/>");

	int maxSize = 1024 * 1024 * 10; 
	
	String name = "";
	String subject = "";

	String fileName1 = ""; 
	String originalName1 = ""; 
	long fileSize = 0; 
	String fileType = ""; 

	QnapartRequest mult = null;

	try
	{

		qna = new QnapartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());

		name = qna.getParameter("name");

		subject = qna.getParameter("subject");

		Enumeration files = qna.getFileNames();

		while (files.hasMoreElements()) {
			File file = new File();
			String file1 = (String) files.nextElement();
			String file1 = (String) files.nextElement();
			originalName1 = qna.getOriginalFileName(file1);

			fileName1 = qna.getFilesystemName(file1);

			fileType = qna.getContentType(file1);

			File file = qna.getFile(file1);

			fileSize = file.length();
		}

		catch (SQLException e) {
		e.printStackTrace();
	}

}
}