package abc.core.module.session.service.impl;

import org.springframework.stereotype.Service;
import abc.core.module.session.entity.Session;
import abc.core.module.session.service.SessionService;

import javax.servlet.http.HttpServletRequest;

/**
 * Session Service实现
 *
 * @author IBIT程序猿
 */
@Service
public class SessionServiceImpl implements SessionService {


    /**
     * 获取session
     *
     * @param request 请求
     * @return session
     */
    @Override
    public tech.ibit.web.springboot.session.Session getSession(HttpServletRequest request) {
        return new Session(request);
    }

    /**
     * 获取session
     *
     * @param request 请求
     * @param create  不存在则创建
     * @return session
     */
    @Override
    public tech.ibit.web.springboot.session.Session getSession(HttpServletRequest request, boolean create) {
        return new Session(request, create);
    }
}
