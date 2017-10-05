package hu.elte.alkfejl.issuetracker.repository;

import hu.elte.alkfejl.issuetracker.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, String> {
}
