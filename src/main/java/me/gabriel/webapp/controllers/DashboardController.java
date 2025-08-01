package me.gabriel.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    //rota da página dashboard do módulo admin
    @GetMapping("/admin/dashboard")
    public String getDashboardPage() {
        return "admin/dashboard";
    }

    //rota da página pedidos do módulo admin
    @GetMapping("/admin/orders")
    public String getOrdersPage() {
        return "admin/orders";
    }

    //rota da página produtos do módulo admin
    @GetMapping("/admin/products")
    public String getProductsPage() {
        return "admin/products";
    }
}
