package com.online.api.resumeTemplate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.online.cms.resumeTemplate.pdf.service.ItextPdfService;

@RequestMapping("/pdfTemplate")
@Controller
public class ItextPdfController {
	@Autowired
	private ItextPdfService itextPdfService;

	/**
	 * 下载
	 * @return
	 */
	@RequestMapping("/createPdfTemplate")  //@RequestParam(value="file",required=false) MultipartFile file
	public ResponseEntity<byte[]> createPdfTemplate(){
		try {
			 String fileName = "F:/test.pdf";
			 String imgFile  = "F:/test.jpg";
			 String downloadFileName = "xx.pdf";
			 //创建文档
			 createDocument(fileName,imgFile);
			 File downFile = new File(fileName);
			 //下面开始设置HttpHeaders,使得浏览器响应下载
			 HttpHeaders headers = new HttpHeaders(); 
			 //设置响应方式
			 headers.setContentType(MediaType.APPLICATION_OCTET_STREAM); 
			 //设置响应文件
			 headers.setContentDispositionFormData("attachment", downloadFileName);  
			 //把文件以二进制形式写回
	         return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(downFile), headers, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 创建文档
	 * @param fileName
	 * @return
	 */
	public void createDocument(String fileName,String imgFile) {
		Document document = new Document(PageSize.A4,0,0,10,0);
		try {
			PdfWriter.getInstance(document, new FileOutputStream(fileName));
			document.addTitle("ID.NET");
			document.addAuthor("test");
			document.addSubject("This is the subject of the PDF file.");
			document.addKeywords("This is the subject of the PDF file.");
			document.open();
			PdfPTable table = createTable(imgFile);
			document.add(table);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			document.close();
		}
	}

	/**
	 * 创建表格
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	private PdfPTable createTable(String imgFile) throws Exception {
		BaseFont bf = BaseFont.createFont("C:\\Windows\\Fonts\\simkai.ttf", BaseFont.IDENTITY_H, false);
		// 创建Font对象，将基础字体对象，字体大小，字体风格
		Font font = new Font(bf, 16, Font.NORMAL);
		PdfPTable table = new PdfPTable(8);
		table.setTotalWidth(new float[] {60, 60, 60, 60, 60, 60, 60, 60});
		table.setLockedWidth(true);
		table.setPaddingTop(0);
		itextPdfService.createResumeTemplate(table,font,imgFile);
		return table;
	}
}
