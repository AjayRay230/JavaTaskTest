package com.JavaTask.Test.controller;
import com.JavaTask.Test.model.Item;
import com.JavaTask.Test.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    // Add a new item
    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@RequestBody @Valid Item item) {
        return new ResponseEntity<>(service.addItem(item), HttpStatus.CREATED);
    }

    // Get item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable int id) {
        return service.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
