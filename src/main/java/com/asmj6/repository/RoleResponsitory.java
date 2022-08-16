package com.asmj6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asmj6.bean.Roles;

public interface RoleResponsitory extends JpaRepository<Roles, Integer> {
}
