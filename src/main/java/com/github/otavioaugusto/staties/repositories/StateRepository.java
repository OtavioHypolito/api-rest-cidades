package com.github.otavioaugusto.staties.repositories;

import com.github.otavioaugusto.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
