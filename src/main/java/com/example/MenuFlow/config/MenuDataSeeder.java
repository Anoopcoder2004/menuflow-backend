package com.example.MenuFlow.config;

import com.example.MenuFlow.entity.Menu;
import com.example.MenuFlow.repository.MenuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MenuDataSeeder implements CommandLineRunner {

    private final MenuRepository menuRepository;

    public MenuDataSeeder(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (menuRepository.count() == 0) {
            menuRepository.saveAll(Arrays.asList(
                    new Menu("DASH", "Dashboard", null, Arrays.asList("Admin", "Manager", "User")),
                    new Menu("MEMB", "Members", null, Arrays.asList("Admin", "Manager")),
                    new Menu("MEMB_ACT", "Active Members", "MEMB", Arrays.asList("Admin", "Manager")),
                    new Menu("MEMB_INA", "Inactive Members", "MEMB", Arrays.asList("Admin", "Manager")),
                    new Menu("PAY", "Payments", null, Arrays.asList("Admin", "Manager")),
                    new Menu("PAY_PEND", "Pending Payments", "PAY", Arrays.asList("Admin", "Manager")),
                    new Menu("PAY_DONE", "Completed Payments", "PAY", Arrays.asList("Admin", "Manager")),
                    new Menu("SETT", "Settings", null, Arrays.asList("Admin")),
                    new Menu("SETT_USER", "User Management", "SETT", Arrays.asList("Admin")),
                    new Menu("SETT_ROLE", "Roles & Permissions", "SETT", Arrays.asList("Admin")),
                    new Menu("REP", "Reports", null, Arrays.asList("Admin")),
                    new Menu("HELP", "Help", null, Arrays.asList("Admin", "Manager", "User"))
            ));
            System.out.println("Menus seeded successfully!");
        }
    }
}
