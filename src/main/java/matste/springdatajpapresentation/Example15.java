package matste.springdatajpapresentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

@EnableSpringDataWebSupport
@RestController
public class Example15 {
	@Autowired Example14Repository repository;

	@RequestMapping(method = RequestMethod.GET, path = "/warehouses/{warehouseCode}")
	@ResponseBody List<Item>
	itemsByWarehouseCode(@PathVariable String warehouseCode, Pageable pageable) {
		return repository.findByWarehouseCodeOrderByCode(warehouseCode, pageable)
				.getContent();
	}

	public static void main(String[] args) {
		getBean(Example15.class);
	}
}
