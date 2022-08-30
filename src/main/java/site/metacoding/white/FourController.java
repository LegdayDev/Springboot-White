package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourController {
	
	@GetMapping("/four")
	public Four getData() { //데이터를 return 자동으로 json으로 변환(Dispatcher Servlet 이 해준다)
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; //DS가 Four 오브젝트를 받아, 해당 오브젝트를 MessageConverter에게 전달
	} // body값을 읽음(통신의 표준이 안생김)
	
	@GetMapping("/four/data")
	public ResponseEntity<?> getData2() { 
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		ResponseEntity<Four> response = new ResponseEntity<>(four, HttpStatus.INTERNAL_SERVER_ERROR);
		return response; 
	}
	
	@GetMapping("four/dto")
	public RespDto<Four> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		
		return new RespDto<>(1,"성공",four);
		
	}
}
