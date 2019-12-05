package tags;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SysDateImpl extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		// Called when starting of tag is encountered
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		// Called when ending of tag is encountered
		JspWriter out = pageContext.getOut();
		LocalDate sysDate = LocalDate.now();
		try {
			out.println("<h2>Today's Date : " + sysDate + "</h2>");
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
}
