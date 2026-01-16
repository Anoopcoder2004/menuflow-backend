package com.example.MenuFlow.controller;

import com.example.MenuFlow.entity.Menu;
import com.example.MenuFlow.service.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menus")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<Menu> getMenus() {
        return menuService.getAllMenus();
    }
}
