package com.b510.hongten.xdocreport.report;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Logger;

import com.b510.hongten.xdocreport.entity.School;

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;

/**
 * @author hongten
 * @created Mar 4, 2017
 */
public class SchoolDocxReport {

	final static Logger logger = Logger.getLogger(SchoolDocxReport.class);

	public static void main(String[] args) {
		try {
			InputStream in = SchoolDocxReport.class.getResourceAsStream("/in/SchoolDocxReport.docx");
			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);

			IContext context = report.createContext();
			School school = new School();
			school.setNo("S342342G");
			school.setName("Hongten School");
			school.setAddress("Singapore Blk XXX");
			school.setContactNo("12345678");
			school.setEmail("hongtenzone@foxmail.com");
			school.setFax("23456789");
			school.setWebsite("http://www.cnblogs.com/hongten");

			context.put("school", school);

			OutputStream out = new FileOutputStream(new File("out/SchoolDocxReport_out.docx"));
			report.process(context, out);

			logger.info("File 'out/SchoolDocxReport_out.docx' is generated already. Please refersh project to find it.");
		} catch (IOException e) {
			logger.error("error : " + e.getMessage(), e);
		} catch (XDocReportException e) {
			logger.error("error : " + e.getMessage(), e);
		}
	}
}
