package hu.elte.alkfejl.issuetracker.repository;

import hu.elte.alkfejl.issuetracker.model.Issues;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IssuesRepository extends CrudRepository<Issues, String> {
}
