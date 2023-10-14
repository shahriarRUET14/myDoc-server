package com.mahmud.mydoc.seeders;

import com.mahmud.mydoc.user.entity.Role;
import com.mahmud.mydoc.user.enums.RoleName;
import com.mahmud.mydoc.user.repository.RoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RoleSeeder {

    private final RoleRepository roleRepository;

    public RoleSeeder(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void seedRoles() {
        List<String> roleNames = Arrays.asList("ADMIN", "DOCTOR", "ATTENDANT", "GENERAL");

        for (String roleName : roleNames) {
            Role role = new Role();
            role.setName(RoleName.valueOf(roleName));
            roleRepository.save(role);
        }
    }
}
