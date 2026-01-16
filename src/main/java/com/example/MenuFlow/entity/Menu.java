package com.example.MenuFlow.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "menu_code", nullable = false, unique = true)
    private String menuCode;

    @Column(name = "menu_name", nullable = false)
    private String menuName;

    @Column(name = "parent_code")
    private String parentCode;

    @ElementCollection
    @CollectionTable(name = "menu_roles", joinColumns = @JoinColumn(name = "menu_id"))
    @Column(name = "role")
    private List<String> roles;

    public Menu() {}

    public Menu(String menuCode, String menuName, String parentCode, List<String> roles) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.parentCode = parentCode;
        this.roles = roles;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMenuCode() { return menuCode; }
    public void setMenuCode(String menuCode) { this.menuCode = menuCode; }

    public String getMenuName() { return menuName; }
    public void setMenuName(String menuName) { this.menuName = menuName; }

    public String getParentCode() { return parentCode; }
    public void setParentCode(String parentCode) { this.parentCode = parentCode; }

    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
}
