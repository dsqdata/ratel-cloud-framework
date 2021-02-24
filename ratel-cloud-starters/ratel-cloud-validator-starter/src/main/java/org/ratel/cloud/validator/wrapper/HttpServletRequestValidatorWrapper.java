package org.ratel.cloud.validator.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 验证请求包装器
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@SuppressWarnings("ALL")
public class HttpServletRequestValidatorWrapper extends HttpServletRequestWrapper {

    private String formPath;

    public HttpServletRequestValidatorWrapper(HttpServletRequest request, String uri) {
        super(request);
        this.formPath = uri;
    }

    @Override
    public String getRequestURI() {
        return this.formPath;
    }

    @Override
    public String getServletPath() {
        return this.formPath;
    }
}
