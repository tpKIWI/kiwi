package my.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*스프링 2.x 버전*/
public class HelloController implements Controller{
	
	//@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res)
	throws Exception{
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "반가워요~스프링");
		
		//req.setAttribute("msg","어쩌구")와 동일
		
		//뷰네임 지정하면 우리가 등록한 
		//InternalResourceViewResolver는 뷰 네임 앞에
		//접두어로 "WEB-INF/view"를 붙이고
		//접미어로 ".jsp"를 붙인다.
		
		mv.setViewName("index");
		//WEB-INF/view/index.jsp 를 찾아간다.
		return mv;
		
	}

}
