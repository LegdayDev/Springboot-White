package site.metacoding.white;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;


//고급데이터 받기 (JSON , x-www-form-urlencoded , text)
@RestController
public class ThirdController {
	
	@PostMapping("/third")
	public String postData(Third third) {
		return "id : "+third.getId()+"\n"+"title : "+third.getTitle()+"\n"+"content : "+third.getContent();
	}
	
	
	// UPDATE third set title=?,content=? WHERE id=?
	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id,Third third) {
		return third.toString();
	}
	

	//json으로 받을려면 클래스앞에 @RequestBody를 붙히면댐(gson라이브러리작동)
	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id,@RequestBody Third third) {
		return third.toString();
	}
}
