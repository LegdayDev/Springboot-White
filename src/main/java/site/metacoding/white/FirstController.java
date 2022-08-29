package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//HTTP Method -> Mapping 기술(GET , POST , PUT , DELETE )
// GET -> 주소창,하이퍼링크
// POST -> <form> 태그만 가능
// PUT,DELETE(GET,POST) -> JS(Java Script)

//포스트맨 -> GET,POST,PUT,DELETE 요청을 쉽게 테스트 가능

@RestController //Data를 응답(JSP를 쓰지않기 때문에 Controller쓸 필요 없음)
public class FirstController {
	//GET
	@GetMapping("/first")
	public String getData() {
		return "<h1>data</h1>";
	}
	
	//POST
	@PostMapping("/first")
	public String postData() {
		return "<h1>insert data</h1>";
	}
	
	//PUT : 업데이트할게?
	@PutMapping("/first")
	public String putData() {
		return "<h1>update data</h1>";
	}
	
	//DELETE
	@DeleteMapping("/first")
	public String deleteData() {
		return "<h1>delete data</h1>";
	}
}
