package finance_dashboard.controller;

import finance_dashboard.model.Transaction;
import finance_dashboard.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction create(@RequestBody Transaction t) {
        return service.create(t);
    }

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Transaction update(@PathVariable Long id, @RequestBody Transaction t) {
        return service.update(id, t);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted";
    }

    @GetMapping("/summary")
    public Map<String, Double> summary() {

        double income = service.totalIncome();
        double expense = service.totalExpense();

        Map<String, Double> result = new HashMap<>();
        result.put("totalIncome", income);
        result.put("totalExpense", expense);
        result.put("balance", income - expense);

        return result;
    }
}