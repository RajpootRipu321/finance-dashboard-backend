package finance_dashboard.service;

import finance_dashboard.model.Transaction;
import finance_dashboard.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public Transaction create(Transaction t) {
        return repository.save(t);
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction update(Long id, Transaction newData) {
        Transaction t = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        t.setAmount(newData.getAmount());
        t.setType(newData.getType());
        t.setCategory(newData.getCategory());
        t.setDate(newData.getDate());
        t.setNote(newData.getNote());

        return repository.save(t);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Double totalIncome() {
        return repository.getTotalIncome() == null ? 0 : repository.getTotalIncome();
    }

    public Double totalExpense() {
        return repository.getTotalExpense() == null ? 0 : repository.getTotalExpense();
    }
}