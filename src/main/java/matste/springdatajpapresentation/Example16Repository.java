package matste.springdatajpapresentation;

import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example16Repository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {

	static void main(String[] args) {
		var repository = getBean(Example16Repository.class);

		var item = QItem.item;
		BooleanExpression stocked = item.stockLevel.gt(0);
		BooleanExpression nonVirtual = item.warehouse.virtual.isFalse();

		System.out.println(repository.findAll(stocked.and(nonVirtual)));
	}
}
