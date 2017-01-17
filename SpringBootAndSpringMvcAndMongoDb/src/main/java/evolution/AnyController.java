package evolution;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {
	@Autowired
	AnyRepository anyRepository;
	
	@RequestMapping(value = "/anyMethod", method = RequestMethod.GET)
	public void anyMethod() {
		AnyEntity anyEntity = new AnyEntity();
		anyEntity.setName("Chen");
		anyRepository.save(anyEntity);
		List<AnyEntity> anyEntities = anyRepository.findAll();
		System.out.println(anyEntities);
	}
}
