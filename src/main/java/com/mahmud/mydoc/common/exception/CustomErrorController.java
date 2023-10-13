package com.mahmud.mydoc.common.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomErrorController {

  @RequestMapping(value = "/error", method = {RequestMethod.GET, RequestMethod.POST})
  public ModelAndView handleError(HttpServletRequest request) {
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

    if (statusCode != null && statusCode == 401) {
      // Unauthorized, you may customize the error handling here
      return new ModelAndView("unauthorizedErrorView");
    } else {
      // Handle other errors or exceptions (e.g., PathNotFoundException)
      return new ModelAndView("pathNotFoundErrorView");
    }
  }
}
