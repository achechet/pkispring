package ru.chechetkin.pkispring.repo;

import org.springframework.data.repository.CrudRepository;
import ru.chechetkin.pkispring.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
