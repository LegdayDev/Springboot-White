package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기
// GET -> http body가 없다->PK는 PathVariable방법, PK가 아닌것 QueryString방식(Protocol이다) -> <form>태그에 get -> 브라우저(주소뒤?붙이기)
// POST , PUT -> HTTP body 에 담아준다 -> <form>태그에 post -> JS
// DELETE ->http body가없다->PK는 PathVariable방법, PK가 아닌것 QueryString방식(Protocol이다)

@RestController
public class SecondController {

	//PathVariable 방식
	@GetMapping("/second/{id}")
	public String getData(@PathVariable Integer id) {
		return "ID : "+id;
	}
	
	//QueryString은 x-www-form-urlencoded 타입이다.
	@GetMapping("/second")
	public String getData2(String title, String content) {
		return "제목 : "+title+"\n"+"내용 : "+content;
	}
	
	//BufferedReader에는 (title=제목&content=내용)이 들어가는데 header에 type을 보고 파싱한다.
	//Spring 파싱 기본전략 : x-www-form-urlencoded이다.
	@PostMapping("/second")
	public String getData3(String title, String content) {
		return "제목 : "+title+"\n"+"내용 : "+content;
	}
	
	@PutMapping("/second")
	public String getData4(String title, String content) {
		return "제목 : "+title+"\n"+"내용 : "+content;
	}
	
	@DeleteMapping("/second/{id}")
	public String getData5(@PathVariable Integer id) {
		return id + "delete ok";
	}
}
