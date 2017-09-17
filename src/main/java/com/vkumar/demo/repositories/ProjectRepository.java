package com.vkumar.demo.repositories;

import com.vkumar.demo.models.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

    Page<Project> findAll(Pageable pageable);


   // Project findById(Long id);

}
