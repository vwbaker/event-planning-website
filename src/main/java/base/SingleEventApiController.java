package base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // so framework can recognize this as a controller class
@RequestMapping("/viewevent")
public class SingleEventApiController {
  
  @GetMapping
  public String index(@RequestParam(value="id") Long id) { return "eventPage.html"; }

}
