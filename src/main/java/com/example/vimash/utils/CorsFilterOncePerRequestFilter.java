/////////////////////////////////////////////////////////////////////////////
//
// © 2022 API. All right reserved.
//
/////////////////////////////////////////////////////////////////////////////

package com.example.vimash.utils;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * [OVERVIEW] CorsFilterOncePerRequestFilter.
 *
  * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/01     	(TanDX)      	 Create new
*/
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilterOncePerRequestFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization, Access-Control-Expose-Headers");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
        if (request.getMethod().equals(HttpMethod.OPTIONS.name())) {
            response.addHeader("Access-Control-Allow-Headers",
                    "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization, Access-Control-Expose-Headers, lang");
            response.setStatus(HttpStatus.NO_CONTENT.value());
        } else {
            filterChain.doFilter(request, response);
        }
    }
}
