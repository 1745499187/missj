package org.weibin.wbj.web.extend;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by weibin on 2016/02/05.
 */
public class WbExceptionResolver extends SimpleMappingExceptionResolver {

    public static final String DEFAULT_EXCEPTION_STACK_ATTRIBUTE = "exceptionStack";
    public static final String DEFAULT_ERROR_CODE_ATTRIBUTE = "errorCode";

    protected String exceptionStackAttribute = DEFAULT_EXCEPTION_STACK_ATTRIBUTE;

    protected String errorCodeAttribute = DEFAULT_ERROR_CODE_ATTRIBUTE;

    public void setExceptionStackAttribute(String attr) {
        this.exceptionStackAttribute = attr;
    }

    public void setErrorCodeAttribute(String errorCodeAttribute) {
        this.errorCodeAttribute = errorCodeAttribute;
    }

    @Override
    protected ModelAndView getModelAndView(String viewName, Exception ex) {
        ModelAndView mv = super.getModelAndView(viewName, ex);

        mv.addObject(exceptionStackAttribute, getExceptionStackTrace(ex));
        mv.addObject(errorCodeAttribute, getErrorCode(ex));
        return mv;
    }

    protected String getErrorCode(Exception ex) {
        String errorCode = null;
        try {
            errorCode = BeanUtils.getProperty(ex, "errorCode");
            if(StringUtils.isBlank(errorCode)) {
                errorCode = "SYSTEM_ERROR";
            }
        } catch (Exception e) {
            errorCode = "SYSTEM_ERROR";
        }
        return errorCode;
    }

    protected String getExceptionStackTrace(Exception ex) {
        StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw));
        return sw.getBuffer().toString();
    }
}
