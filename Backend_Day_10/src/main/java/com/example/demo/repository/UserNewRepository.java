package com.example.demo.repository;



	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.example.demo.model.UserNew;

	public interface UserNewRepository extends JpaRepository<UserNew, Long> {

	    Optional<UserNew> findByEmail(String username);

	    UserNew findByUid(Long uid);

	    void deleteByUid(Long uid);



	}


