package matste.springdatajpapresentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static matste.springdatajpapresentation.Application.getBean;

public interface Example11Repository extends JpaRepository<Item, Long>, Example11RepositoryCustom {

    static void main(String[] args) {
        Example11Repository repository = getBean(Example11Repository.class);
        System.out.println(repository.myItems());
    }
}

