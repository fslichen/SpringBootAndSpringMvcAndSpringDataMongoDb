package evolution;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnyRepository extends MongoRepository<AnyEntity, String>{

}
