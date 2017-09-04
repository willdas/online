package com.online.cms.resumeTemplate.pdf.service;

import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPTable;

public interface ItextPdfService {
	void createResumeTemplate(PdfPTable table, Font font,String imgFile) throws Exception;
}
