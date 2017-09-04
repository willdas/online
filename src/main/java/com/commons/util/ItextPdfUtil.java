package com.commons.util;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;

/**
 * ItextPDF工具类
 * 
 * @author willdas
 *
 */
public class ItextPdfUtil {

	// 合并行和列
	public static PdfPCell mergeRowCol(String str, Font font, int rowNum, int colNum) {
		// 创建单元格对象，将内容及字体传入
		PdfPCell cell = new PdfPCell(new Paragraph(str, font));
		// 设置单元格内容居中
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在列包括该单元格在内的i行单元格合并为一个单元格
		cell.setRowspan(rowNum);
		cell.setColspan(colNum);
		return cell;
	}

	// 合并行和列添加图片
	public static PdfPCell mergeRowCol(Image image, int rowNum, int colNum) {
		// 创建单元格对象，将内容及字体传入
		PdfPCell cell = new PdfPCell(image);
		// 设置单元格内容居中
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在列包括该单元格在内的i行单元格合并为一个单元格
		cell.setRowspan(rowNum);
		cell.setColspan(colNum);
		return cell;
	}

	// 合并行和列,并设定背景色
	public static PdfPCell mergeRowCol(String str, Font font, int rowNum, int colNum, BaseColor backColor) {
		// 创建单元格对象，将内容及字体传入
		PdfPCell cell = new PdfPCell(new Paragraph(str, font));
		// 设置单元格内容居中
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在列包括该单元格在内的i行单元格合并为一个单元格
		cell.setRowspan(rowNum);
		cell.setColspan(colNum);
		cell.setBackgroundColor(backColor);
		return cell;
	}

	// 合并行
	public static PdfPCell mergeRow(String str, Font font, int i) {
		// 创建单元格对象，将内容及字体传入
		PdfPCell cell = new PdfPCell(new Paragraph(str, font));
		// 设置单元格内容居中
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在列包括该单元格在内的i行单元格合并为一个单元格
		cell.setRowspan(i);
		return cell;
	}

	// 合并行,并设定背景色
	public static PdfPCell mergeRow(String str, Font font, int i, BaseColor backColor) {
		// 创建单元格对象，将内容及字体传入
		PdfPCell cell = new PdfPCell(new Paragraph(str, font));
		// 设置单元格内容居中
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在列包括该单元格在内的i行单元格合并为一个单元格
		cell.setRowspan(i);
		cell.setBackgroundColor(backColor);

		return cell;
	}

	// 合并列
	public static PdfPCell mergeCol(String str, Font font, int i) {
		PdfPCell cell = new PdfPCell(new Paragraph(str, font));
		cell.setMinimumHeight(30);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在行包括该单元格在内的i列单元格合并为一个单元格
		cell.setColspan(i);
		return cell;
	}

	// 合并列
	public static PdfPCell mergeCol2(String str, Font font, int i) {
		PdfPCell cell = new PdfPCell(new Paragraph(str, font));
		cell.setMinimumHeight(30);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在行包括该单元格在内的i列单元格合并为一个单元格
		cell.setColspan(i);
		return cell;
	}

	// 合并列并设置背景颜色
	public static PdfPCell mergeCol(String str, Font font, int i, BaseColor backColor) {
		PdfPCell cell = new PdfPCell(new Paragraph(str, font));
		cell.setMinimumHeight(30);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 将该单元格所在行包括该单元格在内的i列单元格合并为一个单元格
		cell.setColspan(i);
		cell.setBackgroundColor(backColor);
		return cell;
	}

	// 获取指定内容与字体的单元格
	public static PdfPCell getPDFCell(String string, Font font) {
		// 创建单元格对象，将内容与字体放入段落中作为单元格内容
		PdfPCell cell = new PdfPCell(new Paragraph(string, font));
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 设置最小单元格高度
		cell.setMinimumHeight(30);
		return cell;
	}

	// 获取指定内容与字体的单元格，并设置背景颜色
	public static PdfPCell getPDFCell(String string, Font font, BaseColor backColor) {
		// 创建单元格对象，将内容与字体放入段落中作为单元格内容
		PdfPCell cell = new PdfPCell(new Paragraph(string, font));
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		// 设置最小单元格高度
		cell.setMinimumHeight(30);
		cell.setBackgroundColor(backColor);
		return cell;
	}
}
