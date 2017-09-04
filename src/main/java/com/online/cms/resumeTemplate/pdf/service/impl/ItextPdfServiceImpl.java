package com.online.cms.resumeTemplate.pdf.service.impl;

import org.springframework.stereotype.Service;
import com.commons.util.ItextPdfUtil;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.online.cms.resumeTemplate.pdf.service.ItextPdfService;

@Service
public class ItextPdfServiceImpl implements ItextPdfService {

	@Override
	public void createResumeTemplate(PdfPTable table, Font font,String imgFile) throws Exception{
		Image image = Image.getInstance(imgFile);
		image.scaleAbsolute(240, 45);
		table.addCell(ItextPdfUtil.mergeCol("测试", font, 8));
		table.addCell(ItextPdfUtil.mergeCol2("测试xxx", font, 8));
		table.addCell(ItextPdfUtil.getPDFCell("测试1", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试2", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试3", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试4", font));
		table.addCell(ItextPdfUtil.mergeRowCol(image, 3,4));
		table.addCell(ItextPdfUtil.getPDFCell("测试5", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试6", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试7", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试8", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试9", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试10", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试11", font));
		table.addCell(ItextPdfUtil.getPDFCell("测试12", font));
	}

}
