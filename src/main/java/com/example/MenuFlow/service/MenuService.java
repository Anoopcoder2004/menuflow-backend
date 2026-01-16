package com.example.MenuFlow.service;

import com.example.MenuFlow.entity.Menu;
import com.example.MenuFlow.repository.MenuRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
}
