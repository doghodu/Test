package org.example.study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface AnserRepository extends JpaRepository<Answer, Integer> {
}
